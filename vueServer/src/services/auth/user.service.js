import axios from 'axios';
import authHeader from './auth-header';

const API_URL = 'http://localhost:8090/api/auth/';

class UserService {
  getUserContent() {
    return axios.get(API_URL + 'userinfo', { headers: authHeader() })
  }
}

export default new UserService();