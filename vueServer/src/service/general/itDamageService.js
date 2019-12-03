import axios from "axios";

const route = 'general/itdamage';

class itDamageService {
    retrieveList () {
      return axios.get('/api/' + route);
    }
    retrieve(id) {
      return axios.get('/api/' + route + '/'+ id);
    }
    update(data) {
      return axios.put('/api/' + route , data );
    }
    save(data) {
      return axios.post('/api/' + route + '/save/'+data.rtime, data );
    }
    fileUpload(data) {
      return axios.put('/api/file/upload/' + data);
    }
    fileDown(data) {
      return axios.get('/api/file/' + data);
    }
}

export default new itDamageService();
