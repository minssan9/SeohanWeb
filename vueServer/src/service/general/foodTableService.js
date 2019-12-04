import axios from "axios";


class foodTableService {
    retrieveFoodTable (querydate) {
      return axios.get('/api/general/foodTable?gdate=' + querydate);
    }
    retrieveFoodTableKamtec (querydate) {
      return axios.get('/api/general/foodTableKamtec?gdate=' + querydate);
    } 

    fileDown(data) {
      // var attach = encodeURI(data.attach);
      return axios.get('/api/file/' + data.attach );
    }
}

export default new foodTableService();
