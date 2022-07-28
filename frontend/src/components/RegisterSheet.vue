<template>
  <div v-if="newMusicalWork">
    <NewMusicalWork
      @musicalWorkMade="musicalWorkIdRetrieved"
      @closeComp="closeComponent"
    ></NewMusicalWork>
  </div>

  <form v-on:submit.prevent>
    <div class="mb-3 input">
      <label for="musicalWorkTitle" class="form-label"
        >Musikalt verk</label
      >

      <input @input="updateMusicalWorkList" v-model="searchedMusicalWork" id="musicalWorkTitle" autocomplete=0 />
      <ul
        class=""
        aria-label="Default select example"
      >
        <li
          v-for="m in musicalWorks"
          :key="m.musicalWorksId"
          :value="m.musicalWorksId"
        >
          {{ m.title }}
        </li>
      </ul>
    </div>
    <div>
      <button @click="openNewMusicalWork">Opprett ny</button>
    </div>
    <div class="mb-3 input">
      <label class="form-label">Arrangment title</label>
      <input
        v-model="arrTitle"
        type="text"
        class="form-control"
      />
    </div>
    <div class="mb-3 input">
      <label class="form-label">Musikkform</label>
      <input
        v-model="musicalForm"
        type="text"
        class="form-control"
      />
    </div>
    <div class="mb-3 input">
      <label class="form-label"
        >Intrumentbeskrivelse</label
      >
      <input
        v-model="voicesDescription"
        type="text"
        class="form-control"
        id="exampleInputPassword1"
      />
    </div>
    <div class="mb-3 input">
      <label for="exampleInputPassword1" class="form-label">Toneart</label>
      <input
        v-model="mainKey"
        type="text"
        class="form-control"
        id="exampleInputPassword1"
      />
    </div>
    <div v-for="format in formats" :key="format.formatId" class="form-check">
      <input
        v-model="formatId"
        :value="format.formatId"
        class="form-check-input"
        type="radio"
        name="flexRadioDefault"
        id="flexRadioDefault1"
      />
      <label class="form-check-label" for="flexRadioDefault1">
        {{ format.name }}
      </label>
    </div>
    <div class="mb-3 input">
      <label for="exampleInputPassword1" class="form-label"
        >Arrangetdato (YYYY-MM-DD)</label
      >
      <input
        v-model="arrangedDate"
        type="text"
        class="form-control"
        id="exampleInputPassword1"
      />
    </div>
    <div class="mb-3 input">
      <label for="exampleInputPassword1" class="form-label"
        >Publisert dato (YYYY-MM-DD)</label
      >
      <input
        v-model="pubDate"
        type="text"
        class="form-control"
        id="exampleInputPassword1"
      />
    </div>

    <div class="mb-3 input">
      <label for="exampleInputPassword1" class="form-label">Forlag?</label>
      <input
        v-model="publisher"
        type="text"
        class="form-control"
        id="exampleInputPassword1"
      />
    </div>
    <button @click="submit" type="submit" class="btn btn-primary">
      Submit
    </button>
    <div>
      <button @click="openUploadModal">Upload files</button>
    </div>
  </form>
</template>

<script>
import NewMusicalWork from "./basecomponents/NewMusicalWork.vue";
import { getAllFormats } from "@/utils/formatUtil";
import { postSheetMusic } from "@/utils/SheetMusicUtil";
import { getMusicalWorksByTitle } from "@/utils/MusicalWorkUtil";

document.addEventListener('click', ev => {
  alert(ev.target.tagName);
})
export default {
  name: "RegisterSheet",

  components: {
    NewMusicalWork,
  },

  data() {
    return {
      arrTitle: "",
      description: "",
      musicalForm: "",
      voicesDescription: "",
      originalArr: false,
      arrangedDate: null,
      pubDate: null,
      mainKey: "",
      publisher: "",
      musicalWorkId: null,
      formatId: null,
      newMusicalWork: false,
      formats: [],
      musicalWorks: [],
      searchedMusicalWork: "",
      pictures: []
    };
  },
  methods: {
    openUploadModal() {
      window.cloudinary
        .openUploadWidget(
          { cloudName: "dxjiqwj0x", uploadPreset: "notebib" },
          (error, result) => {
            if (!error && result && result.event === "success") {
              console.log("Done uploading..: ", result.info); 
              console.log("URL:   " + result.info.url);
              this.pictures.push(result.info.url);
            }
          }
        )
        .open();
    },
    async submit() {
      const musicalSheet = {
        arrTitle: this.arrTitle,
        description: this.description,
        musicalForm: this.musicalForm,
        voicesDescription: this.voicesDescription,
        originalArr: this.originalArr,
        arrangedDate: new Date(this.arrangedDate),
        pubDate: new Date(this.pubDate),
        mainKey: this.mainKey,
        publisher: this.publisher,
        musicalWorkId: this.musicalWorkId,
        formatId: this.formatId,
        pictures: this.pictures
      };
      await postSheetMusic(musicalSheet);
    },
    async updateMusicalWorkList() {
      if (this.searchedMusicalWork.length > 0) {
        this.musicalWorks = await getMusicalWorksByTitle(
          this.searchedMusicalWork
        );
      } else {
        this.musicalWorks = null;
      }
    },
    openNewMusicalWork() {
      this.newMusicalWork = true;
    },
    closeComponent(bool) {
      this.newMusicalWork = bool;
    },
    musicalWorkIdRetrieved(id) {
      this.musicalWorkId = id;
    },
    async getFormats() {
      this.formats = await getAllFormats();
    },
    
  },
  async beforeMount() {
    await this.getFormats();
  },
};
</script>

<style scoped>
.input {
  text-align: center;
}

input {
  margin: auto;
  max-width: 50%;
}

.btn {
  display: block;
  margin: auto;
}
</style>
