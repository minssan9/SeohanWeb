import Vue from 'vue'
import Router from 'vue-router'

import itDamage  from '@/components/general/itDamage/list'
import itDamageNew  from '@/components/general/itDamage/new'
import foodTable from '@/components/general/foodTable'
import qrReader  from '@/components/general/qrReader'

const Home = { template: '<div>Home</div>'}
const NotFound = { template: '<div>Not Found</div>'}

Vue.use(Router)

const router = new Router({
    mode: 'history', // Use browser history
    routes: [
      //general
      {path: '/general/itDamage', component: itDamage} ,
      {path: '/general/itDamage/new', component: itDamageNew} ,
      {path: '/general/foodTable',component: foodTable} ,
      {path: '/general/qrReader',component: qrReader} ,
      //
      { path: '/', component: Home },
      { path: '*', component: NotFound },
    ]
});

export default router;
