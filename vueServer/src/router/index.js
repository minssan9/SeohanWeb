import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

import itDamage  from '@/components/itDamage'
import foodTable from '@/components/foodTable'
import qrReader  from '@/components/qrReader'

Vue.use(Router)

const router = new Router({
    mode: 'history', // Use browser history
    routes: [
      {
        path: '/',
        name: 'HelloWorld',
        component: HelloWorld
      },
      {
        path: '/general/itDamage',
        name: 'itDamage',
        component: itDamage
      } ,
      {
        path: '/general/foodTable',
        name: 'foodTable',
        component: foodTable
      } ,
      {
        path: '/general/qrReader',
        name: 'qrReader',
        component: qrReader
      } ,
    ]
});

export default router;
