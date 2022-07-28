<template>
  <form v-on:submit.prevent>
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Hovedtittel</label>
      <input
        v-model="title"
        type="text"
        class="form-control"
        aria-describedby="emailHelp"
      />
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Komponist</label>
      <input
        v-model="searchedName"
        @input="updateComposerList"
        type="text"
        class="form-control"
        id="exampleInputPassword1"
      />
      <select
        v-model="chosenComposer"
        class="form-select"
        aria-label="Default select example"
      >
        <option
          v-for="composer in composers"
          :key="composer.composerId"
          :value="composer.composerId"
        >
          {{ composer.name }}
        </option>
      </select>
    </div>
    <button class="btn btn-primary" @click="postMusicalWork">
      Opprett verk
    </button>
  </form>
</template>

<script>
import { getComposerByName } from "@/utils/composerUtil";
import { postNewMusicalWork } from "@/utils/MusicalWorkUtil";
export default {
  name: "NewMusicalWork",

  data() {
    return {
      title: "",
      searchedName: "",
      composers: [],
      chosenComposer: null,
    };
  },
  methods: {
    async updateComposerList() {
      if (this.searchedName.length > 0) {
        this.composers = await getComposerByName(this.searchedName);
      } else {
        this.composers = null;
      }
    },

    selectComposer(event) {
      this.chosenComposer = event.target.value;
      console.log(this.chosenComposer.composerId);
    },

    async postMusicalWork() {
      const musicalWork = {
        title: this.title,
        composerId: this.chosenComposer,
      };
      const musicalWorkId = await postNewMusicalWork(musicalWork);
      this.$emit("musicalWorkMade", musicalWorkId);
      this.$emit("closeComp", false);
    },
  },
};
</script>

<style>
label {
  text-align: center;
}
</style>
