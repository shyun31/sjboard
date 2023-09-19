import Vue from 'vue';
import Router from 'vue-router';
import SelectBoard from "@/components/SelectBoard";
import InsertBoard from "@/components/InsertBoard";

//vue 라우터 사용
Vue.use(Router);

//라우터 연결
export default new Router({
    routes:[
        {
            path:'/'
            ,name:SelectBoard
            ,component:SelectBoard
        }
        ,{
            path:'/insert'
            ,name:InsertBoard
            ,component:InsertBoard
        }

    ]
})