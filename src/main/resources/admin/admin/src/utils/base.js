const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootj6afl312/",
            name: "springbootj6afl312",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootj6afl312/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于JavaWeb的宠物救助及领养平台的设计与实现"
        } 
    }
}
export default base
