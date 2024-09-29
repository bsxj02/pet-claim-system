import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import jiuzhuzheList from '../pages/jiuzhuzhe/list'
import jiuzhuzheDetail from '../pages/jiuzhuzhe/detail'
import jiuzhuzheAdd from '../pages/jiuzhuzhe/add'
import chongwuzhongleiList from '../pages/chongwuzhonglei/list'
import chongwuzhongleiDetail from '../pages/chongwuzhonglei/detail'
import chongwuzhongleiAdd from '../pages/chongwuzhonglei/add'
import liulangdongwuList from '../pages/liulangdongwu/list'
import liulangdongwuDetail from '../pages/liulangdongwu/detail'
import liulangdongwuAdd from '../pages/liulangdongwu/add'
import lingyangxinxiList from '../pages/lingyangxinxi/list'
import lingyangxinxiDetail from '../pages/lingyangxinxi/detail'
import lingyangxinxiAdd from '../pages/lingyangxinxi/add'
import jiuzhuxinxiList from '../pages/jiuzhuxinxi/list'
import jiuzhuxinxiDetail from '../pages/jiuzhuxinxi/detail'
import jiuzhuxinxiAdd from '../pages/jiuzhuxinxi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import discussliulangdongwuList from '../pages/discussliulangdongwu/list'
import discussliulangdongwuDetail from '../pages/discussliulangdongwu/detail'
import discussliulangdongwuAdd from '../pages/discussliulangdongwu/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'jiuzhuzhe',
					component: jiuzhuzheList
				},
				{
					path: 'jiuzhuzheDetail',
					component: jiuzhuzheDetail
				},
				{
					path: 'jiuzhuzheAdd',
					component: jiuzhuzheAdd
				},
				{
					path: 'chongwuzhonglei',
					component: chongwuzhongleiList
				},
				{
					path: 'chongwuzhongleiDetail',
					component: chongwuzhongleiDetail
				},
				{
					path: 'chongwuzhongleiAdd',
					component: chongwuzhongleiAdd
				},
				{
					path: 'liulangdongwu',
					component: liulangdongwuList
				},
				{
					path: 'liulangdongwuDetail',
					component: liulangdongwuDetail
				},
				{
					path: 'liulangdongwuAdd',
					component: liulangdongwuAdd
				},
				{
					path: 'lingyangxinxi',
					component: lingyangxinxiList
				},
				{
					path: 'lingyangxinxiDetail',
					component: lingyangxinxiDetail
				},
				{
					path: 'lingyangxinxiAdd',
					component: lingyangxinxiAdd
				},
				{
					path: 'jiuzhuxinxi',
					component: jiuzhuxinxiList
				},
				{
					path: 'jiuzhuxinxiDetail',
					component: jiuzhuxinxiDetail
				},
				{
					path: 'jiuzhuxinxiAdd',
					component: jiuzhuxinxiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'discussliulangdongwu',
					component: discussliulangdongwuList
				},
				{
					path: 'discussliulangdongwuDetail',
					component: discussliulangdongwuDetail
				},
				{
					path: 'discussliulangdongwuAdd',
					component: discussliulangdongwuAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
