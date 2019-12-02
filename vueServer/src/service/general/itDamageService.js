import axios from "axios";

const route = 'general/itdamage';

class itDamageService {
    retrieveList () {
      return axios.get('/api/general/itdamage');
    }
    retrieve(id) {
      return axios.get('/api/general/itdamage/'+ id);
    }
    update(data) {
      return axios.post('/api/general/itdamage/post', data );
    }
    save(data) {
      return axios.post('/api/general/itdamage/post', data );
    }
    fileUpload(data) {
      return axios.put('/api/file/upload/' + data);
    }
    fileDown(data) {
      return axios.get('/api/file/' + data);
    }
}

export default new itDamageService();
