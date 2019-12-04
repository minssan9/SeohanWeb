import Vue from 'vue'
import Router from 'vue-router'
import {Auth} from '../api'
import Login from '@/components/Auth/Login.vue'

import itDamageList  from '@/components/general/itDamage/list'
import itDamageNew  from '@/components/general/itDamage/new'
import report  from '@/components/general/report/list'
import reportNew  from '@/components/general/report/new'
import foodTable from '@/components/general/foodTable'
import foodTableKamtec from '@/components/general/foodTableKamtec'
import qrReader  from '@/components/general/qrReader'

const Home = { template: '<div>Home</div>'}
const NotFound = { template: '<div>Not Found</div>'}

Vue.use(Router)

const requireAuth = (to, from, next) => {
  if (Auth.loggedIn()) return next()
  next({
    path: '/login',
    query: { redirect: to.fullPath }
  })
}

const router = new Router({
    mode: 'history', // Use browser history
    routes: [
      //general
      {
        path: '/general/itDamage',
        component:{ template: '<div>Posts <br/><router-view></router-view></div>' },
        children:[
          { path: 'list', component: itDamageList} ,
          { path: 'new', component: itDamageNew, 
            beforeEnter:requireAuth
          } ,    
        ]
      },
      // {path: '/general/itDamage/list', component: itDamageList} ,
      // {path: '/general/itDamage/new', component: itDamageNew, beforeEnter:requireAuth} ,
      {path: '/general/report', component: report} ,
      {path: '/general/report/new', component: reportNew} ,
      {path: '/general/foodTable',component: foodTable} ,
      {path: '/general/foodTableKamtec',component: foodTableKamtec} ,
      {path: '/general/qrReader',component: qrReader} ,
      { path: '/', component: Home },
      { path: '*', component: NotFound },
      { path: '/login', component: Login },
      { path: '/logout',
        beforeEnter(to, from, next) {
          Auth.logout()
          next('/')
        }
      },
    ]
});

export default router;
