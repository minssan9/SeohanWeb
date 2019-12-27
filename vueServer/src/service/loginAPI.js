// src/service/loginAPI.js
import axios from 'axios'

const getUserInfo = (uid, password) => {
  return axios.get('/auth/signin', {
    params: {
      'id': id,
      'password': password
    }
  })
}

const isFinished = uid => {
  return axios.get('/auth/userinfo', {
    params: {
      'id': id
    }
  })
}

export default {
  async login (uid, password) {
    try {
      const getUserInfoPromise = await getUserInfo(uid, password)
      const isFinishedPromise = await isFinished(uid) // Promise.all의 예시를 위해 집어넣음

      const [userInfoResponse, isFinishedResponse] = await Promise.all([getUserInfoPromise, isFinishedPromise])
      if (userInfoResponse.data.length === 0) return 'noAuth' // 로그인 결과에 따른 분기 처리를 해준다
      if (isFinishedResponse.data[0].CNT > 0) return 'done'
      axios.defaults.headers.common['Authorization'] = userInfoResponse.jwt // Json Web Token을 request header에 넣는다

      return userInfoResponse
    } catch (err) {
      console.error(err)
    }
  }
}
