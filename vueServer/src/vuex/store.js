// src/vuex/store.js
import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios";

Vue.use(Vuex)

const resourceHost = '/api'

const enhanceAccessToeken = () => {
  const {accessToken} = localStorage
  if (!accessToken) return
  axios.defaults.headers.common['Authorization'] = `Bearer ${accessToken}`;
}
enhanceAccessToeken()

export default new Vuex.Store({
  state : {
    accessToken:null,
    authorization:null
  },
  getters : {
    isAuthenticated (state) {
      state.accessToken = state.accessToken || localStorage.accessToken
      return state.accessToken
    }
  },
  mutations: {
    LOGIN (state, {authorization}) {
      state.accessToken = authorization
      // 토큰을 로컬 스토리지에 저장
      localStorage.accessToken = authorization
    },
    LOGOUT (state) {
      state.accessToken = null
      delete localStorage.accessToken
    }
  },
  actions : {
    LOGIN ({commit}, {companyCode, asabn, pass}) {
      return axios.post(`${resourceHost}/auth/signin`, {companyCode, asabn, pass})
        .then(res=>{
          commit('LOGIN', res.headers)
          // 모든 HTTP 요청 헤더에 Authorization 을 추가한다.
          axios.defaults.headers.common['Authorization'] = `Bearer ${res.headers.authorization}`;
          // isAuthenticated =true;
        })
    },
    LOGOUT ({commit}) {
      axios.defaults.headers.common['Authorization'] = undefined
      // isAuthenticated =false;
      commit('LOGOUT')
    },
  },
})
