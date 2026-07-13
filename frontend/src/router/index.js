import Vue from 'vue'
import VueRouter from 'vue-router'
import store from "@/store";

Vue.use(VueRouter)

const routes = [
  {
    path: '/prepare',
    name: 'Prepare',
    component: () => import('../views/Prepare.vue')
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '/404',
    name: '404',
    component: () => import('../views/404.vue')
  },
  {
    path: '/front',
    name: 'Front',
    component: () => import('../views/front/Front'),
    children: [
      {
        path: 'home',
        name: 'FrontHome',
        component: () => import('../views/front/Home.vue')
      },
      {
        path: 'huapianMain',
        name: 'huapianMain',
        component: () => import('../views/front/huapianMain.vue')
      },
      {
        path: 'feiyiMain',
        name: 'feiyiMain',
        component: () => import('../views/front/feiyiMain.vue')
      },
      {
        path: 'feiyiItem',
        name: 'feiyiItem',
        component: () => import('../views/front/feiyiItem.vue')
      },
      {
        path: 'nongItem',
        name: 'nongItem',
        component: () => import('../views/front/nongItem.vue')
      },
      {
        path: 'nongMain',
        name: 'nongInongMaintem',
        component: () => import('../views/front/nongMain.vue')
      },
      // {
      //   path: 'feiyiItem/:name',
      //   name: 'feiyiItem',
      //   component: () => import('../views/front/feiyiItem.vue')
      // },
      {
        path: 'nongItem/:name',
        name: 'nongItem',
        component: () => import('../views/front/nongItem.vue')
      },
      {
        path: 'feiyiItem/:name/:location/:intro/:image',
        name: 'feiyiItem',
        component: () => import('../views/front/feiyiItem.vue')
      },
      {
        path: 'nongItem/:name/:location/:intro/:image',
        name: 'nongItem',
        component: () => import('../views/front/nongItem.vue')
      },
      {
        path: 'huapianProvince',
        name: 'huapianProvince',
        component: () => import('../views/front/huapianProvince.vue')
      },
      {
        path: 'test',
        name: 'test',
        component: () => import('../views/front/test.vue')
      }
    ]
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

// 提供一个重置路由的方法
export const resetRouter = () => {
  router.matcher = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
  })
}

router.beforeEach((to, from, next) => {
  localStorage.setItem("currentPathName", to.name)  // 设置当前的路由名称
  store.commit("setPath")

  // 未找到路由的情况
  if (!to.matched.length) {
    const storeMenus = localStorage.getItem("menus")
    if (storeMenus) {
      next("/404")
    } else {
      // 跳回登录页面
      next("/login")
    }
  }
  // 其他的情况都放行
  next()

})

export default router
