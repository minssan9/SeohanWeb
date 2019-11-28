import axios from "axios";

const COURSE_API_URL = "http://minssan9.seohan.com:8090";

class itDamageService {
    retrieveItDamage () {
      return axios.get('http://minssan9.seohan.com:8090/general/itdamage');
    }

    updateItDamage(data) {
      return axios.post('http://minssan9.seohan.com:8090/general/itdamage/post', data );
    }

    fileDown(data) {
      // var attach = encodeURI(data.attach);
      return axios.get('http://minssan9.seohan.com:8090/file/' + data.attach );
    }
}

export default new itDamageService();
