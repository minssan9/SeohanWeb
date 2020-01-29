import Vue from 'vue'
import Router from 'vue-router'
// import store from '@/vuex/store'
import authHeader from '@/services/auth/auth-header'

import Login from '@/components/auth/Login.vue'
import Profile from '@/components/auth/Profile.vue'

import general from '@/components/general/general'

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
  if (authHeader ()) return next()
  next('/')
}

const router = new Router({
  mode: 'history', // Use browser history
  routes: [{
    path: '/general', component: general,
    children: [
      {
        path: 'itDamage', component: itDamage,
        children: [
          { path: 'list', component: itDamageList },
          { path: 'new', component: itDamageNew,beforeEnter: requireAuth() },
        ]
      },
      {
        path: 'report', component: report,
        children: [
          { path: 'list', component: reportList },
          // {path: 'new', component: reportNew,beforeEnter: requireAuth},
        ]
      },
      { path: 'foodTable', component: foodTable },
      { path: 'qrReader', component: qrReader },
    ]
  },
  { path: '/', component: Home },
  { path: '*', component: NotFound },
  { path: '/login', component: Login },
  { path: '/Profile', component: Profile , beforeEnter: requireAuth() }

  ]
});

export default router;
