import {createRouter, createWebHashHistory} from "vue-router";

const routes: any = [
    {
        path: '/login',
        component: () => import('../views/login.vue')
    }
]

export default createRouter({
    history: createWebHashHistory(),
    routes
})
