import axios from "axios";


class itDamageService {
    retrieveItDamage () {
      return axios.get('/api/general/itdamage');
    }

    updateItDamage(data) {
      return axios.post('/api/general/itdamage/post', data );
    }

    fileDown(data) {
      // var attach = encodeURI(data.attach);
      return axios.get('/api/file/' + data);
    }
}

export default new itDamageService();
