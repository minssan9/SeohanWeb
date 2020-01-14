// src/vuex/store.js
import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios";

Vue.use(Vuex)

const resourceHost = '/api'

export default new Vuex.Store({
  state : {
    accessToken:null,
    authorization:null
  },
  getters : {

  },
  actions : {
    LOGIN ({commit}, {companyCode, asabn, pass}) {
      return axios.post(`${resourceHost}/auth/signin`, {companyCode, asabn, pass})
        .then(res=>{
        // .then(({data}) => {
        //   commit('LOGIN', data)
          commit('LOGIN', res.headers)
          // 모든 HTTP 요청 헤더에 Authorization 을 추가한다.
          axios.defaults.headers.common['Authorization'] = res.headers.authorization;
        })
    },
    LOGOUT ({commit}) {
      axios.defaults.headers.common['Authorization'] = undefined
      commit('LOGOUT')
    },
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
})
