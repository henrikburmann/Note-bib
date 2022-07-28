import axios from "axios";

const API_URL = process.env.VUE_APP_BASEURL;

export function postSheetMusic(sheetMusic) {
  return axios
    .post(API_URL + "sheet", sheetMusic)
    .then((response) => {
      console.log(response);
      return response.data;
    })
    .catch((error) => {
      console.error(error.response);
      return error;
    });
}
