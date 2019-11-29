import axios from "axios";


class itDamageService {
    retrieveItDamage () {
      return axios.get('${COURSE_API_URL}/general/itdamage');
    }

    updateItDamage(data) {
      return axios.post('${COURSE_API_URL}/general/itdamage/post', data );
    }

    fileDown(data) {
      // var attach = encodeURI(data.attach);
      return axios.get('${COURSE_API_URL}/file/' + data.attach );
    }
}

export default new itDamageService();
