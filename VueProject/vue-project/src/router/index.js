import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
/*   {
    path: '/',
    name: 'home',
    component: HomeView
  }, */
  {
    path: '/emp',
    name: 'emp',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    // component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
    component: () => import('../views/myView/EmpView.vue')
  },
  {
    path: '/test',
    name: 'test',
    component: () => import('../views/element/MyButton.vue')
  },
  
  {
    path:'/emps',
    name:'emps',
    component:()=>import('../views/myView/EmpViewTest.vue')
  },
  {
    path:'/',
    redirect:'/emp'
  }
]

const router = new VueRouter({
  routes
})

export default router
