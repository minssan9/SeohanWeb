import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import itDamage from '@/components/itDamage'

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
    ]
});

export default router;
