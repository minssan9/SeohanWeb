import axios from "axios";


class foodTableService {
    retrieveFoodTable (querydate) {
      return axios.get('/api/general/food?gdate=' + querydate);
    }

    // updateFoodTable(data) {
    //   return axios.post('${COURSE_API_URL}/general/itdamage/post', data );
    // }

    fileDown(data) {
      // var attach = encodeURI(data.attach);
      return axios.get('/api/file/' + data.attach );
    }
}

export default new foodTableService();
