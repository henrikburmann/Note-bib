<template>
  <div>
    <Nav-Bar />
    <router-view></router-view>
  </div>
</template>

<script>
import NavBar from "./components/basecomponents/NavBar.vue";
export default {
  components: {
    NavBar,
  },
};
</script>
<style global></style>
