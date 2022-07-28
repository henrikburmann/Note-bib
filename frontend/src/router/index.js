import { createRouter, createWebHashHistory } from "vue-router";

const routes = [
  {
    path: "/",
    name: "RegisterSheet",
    component: () => import("../views/RegisterSheetView.vue"),
  },

  {
    path: "/sheetSearch",
    name: "SheetSearch",
    component: () => import("../views/SheetSearchView.vue"),
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
