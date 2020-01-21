import Vue from 'vue'
import Router from 'vue-router'
import { Auth } from '../api'           // 로그인 성공시, actions에서 store에 isAuth값을 true로 바꿔줬다. 그걸 이용한다.
import store from '@/vuex/store'

import Login from '@/components/auth/Login.vue'
// import Me from '@/components/auth/me.vue'
const Me = { template: '<div>Me</div>' }
import general  from '@/components/general/general'

import itDamage from '@/components/general/itDamage/itDamage'
import itDamageList from '@/components/general/itDamage/list'
import itDamageNew from '@/components/general/itDamage/new'

import report from '@/components/general/report/report'
import reportList from '@/components/general/report/list'
// import reportNew from '@/components/general/report/new'

import foodTable from '@/components/general/foodTable'
import qrReader from '@/components/general/qrReader'

const Home = { template: '<div>Home</div>' }
const NotFound = { template: '<div>Not Found</div>' }

Vue.use(Router)

const requireAuth = () => (from, to, next) => {
  if (store.getters.isAuthenticated) return next()
  next('/login?returnPath=general')
}

const router = new Router({
  mode: 'history', // Use browser history
  routes: [{
    path: '/general', component: general,
    children: [
      {
        path: 'itDamage', component: itDamage,
        children: [
          {path: 'list', component: itDamageList },
          {path: 'new', component: itDamageNew,beforeEnter: requireAuth() },
        ]
      },
      {
        path: 'report', component: report,
        children: [
          {path: 'list', component: reportList },
          // {path: 'new', component: reportNew,beforeEnter: requireAuth},
        ]
      },
      { path: 'foodTable', component: foodTable },
      { path: 'qrReader', component: qrReader },
    ]
  },
  { path: '/', component: Home },
  { path: '*', component: NotFound },
  { path: '/login', component: Login  },
  // { path: '/logout',
  //   beforeEnter(to, from, next) {
  //     // Auth.logout()
  //     next('/')
  //   }
  // },
  { path: '/me', component: Me, beforeEnter: requireAuth()  }
  ]
});

export default router;
