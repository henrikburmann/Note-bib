import axios from "axios";

const API_URL = process.env.VUE_APP_BASEURL;

export function getAllFormats() {
  return axios
    .get(API_URL + "format")
    .then((response) => {
      return response.data;
    })
    .catch((error) => console.error(error.response));
}
