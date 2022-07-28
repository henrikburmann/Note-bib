import axios from "axios";

const API_URL = process.env.VUE_APP_BASEURL;

export function getComposers() {
  return axios
    .get(API_URL + "composer")
    .then((response) => {
      return response.data;
    })
    .catch((error) => console.error(error.response));
}

export function getComposerByName(name) {
  return axios
    .get(API_URL + "composer/" + name)
    .then((response) => {
      return response.data;
    })
    .catch((error) => console.error(error.response));
}
