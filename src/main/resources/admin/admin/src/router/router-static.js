import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import liulangdongwu from '@/views/modules/liulangdongwu/list'
    import lingyangxinxi from '@/views/modules/lingyangxinxi/list'
    import jiuzhuzhe from '@/views/modules/jiuzhuzhe/list'
    import chongwuzhonglei from '@/views/modules/chongwuzhonglei/list'
    import forum from '@/views/modules/forum/list'
    import discussliulangdongwu from '@/views/modules/discussliulangdongwu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import jiuzhuxinxi from '@/views/modules/jiuzhuxinxi/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '通知公告',
        component: news
      }
      ,{
	path: '/liulangdongwu',
        name: '流浪动物',
        component: liulangdongwu
      }
      ,{
	path: '/lingyangxinxi',
        name: '领养信息',
        component: lingyangxinxi
      }
      ,{
	path: '/jiuzhuzhe',
        name: '救助者',
        component: jiuzhuzhe
      }
      ,{
	path: '/chongwuzhonglei',
        name: '宠物种类',
        component: chongwuzhonglei
      }
      ,{
	path: '/forum',
        name: '论坛',
        component: forum
      }
      ,{
	path: '/discussliulangdongwu',
        name: '流浪动物评论',
        component: discussliulangdongwu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线咨询',
        component: chat
      }
      ,{
	path: '/messages',
        name: '求助信息',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiuzhuxinxi',
        name: '救助信息',
        component: jiuzhuxinxi
      }
      ,{
	path: '/newstype',
        name: '通知公告分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
