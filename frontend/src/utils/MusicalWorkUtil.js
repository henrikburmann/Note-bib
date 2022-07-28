import axios from "axios";

const API_URL = process.env.VUE_APP_BASEURL;

export function postNewMusicalWork(musicalWork) {
  return axios
    .post(API_URL + "musicalWork", musicalWork)
    .then((response) => {
      return response.data;
    })
    .catch((error) => {
      console.error(error.response);
      return error;
    });
}

export function getMusicalWorksByTitle(title) {
  return axios
    .get(API_URL + "musicalWork/" + title)
    .then((response) => {
      return response.data;
    })
    .catch((error) => console.error(error.response));
}
