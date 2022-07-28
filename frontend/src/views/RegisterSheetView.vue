<template>
  <RegisterSheet></RegisterSheet>
  <router-view />
</template>

<script>
import RegisterSheet from "@/components/RegisterSheet.vue";
export default {
  name: "RegisterSheetView",
  components: {
    RegisterSheet,
  },
};
</script>

<style></style>
