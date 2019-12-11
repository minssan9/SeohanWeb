import axios from "axios";

var route = '';
class crudService {
  setRoute(sourceRoute) {
    route = sourceRoute;
  }

  getAllList(stat) {
    return axios.get('/api/' + route);
  }
  retrieve(id) {
    return axios.get('/api/' + route + '/' + id);
  }
  update(data) {
    return axios.put('/api/' + route + '/', data);
  }
  save(data) {
    return axios.post('/api/' + route / save / + data.rtime, data);
  }
  fileUpload(data) {
    return axios.put('/api/file/upload/' + data);
  }
  fileDown(data) {
    return axios.get('/api/file/' + data);
  }


  retrieveList(stat) {
    return axios.get('/api/' + route + '?stat=' + stat);
  }
  getListByAdgub(adgub) {
    return axios.get('/api/' + route + '?adgub=' + adgub);
  }
  getLineListByFact(factory) {
    return axios.get('/api/' + route + '?factory=' + factory);
  }
}

export default new crudService();
