var app=new Vue({
    el:"#app",
    data:{
        jzlist:{
            jid:'',
            jname:'',
            sex:'',
            time:''
        },
        oneCity:[],
        twoCity:[],
        thereCity:[],
        selected:{oneCity:'北京',twoCity:'北京市',thereCity:'朝阳区'}
    },
    mounted(){
        this.findCity();
        this.findCity1();
        this.findCity2();
        var url=new URL(location.href);
        var jid=url.searchParams.get("jid");
        this.findOne(jid);
    },
    methods:{
        findOne(jid){
            axios.get('http://localhost:8080/list/findOne',{
                params:{
                    jid:jid
                }
            })
            .then(function(response){
                console.log(response);
                app.jzlist=response.data;
            })
            .catch(function(error){
                console.log(error);
            });
        },
        findCity(){
            axios.get('http://localhost:8080/city/queryCity?partId=0')
            .then(function(response){
                console.log(response);
                app.oneCity=response.data;
            })
            .catch(function(error){
                console.log(error);
            });
        },
        findCity1(){
            axios.get('http://localhost:8080/city/queryCity?partId=2')
            .then(function(response){
                console.log(response);
                app.twoCity=response.data;
            })
            .catch(function(error){
                console.log(error);
            });
        },
        findCity2(){
            axios.get('http://localhost:8080/city/queryCity?partId=6')
            .then(function(response){
                console.log(response);
                app.thereCity=response.data;
            })
            .catch(function(error){
                console.log(error);
            });
        },
        onSubmit(){
            axios.post('http://localhost:8080/list/update',this.jzlist)
            .then(function(response){
                console.log(response);
                location.href="index.html";
            })
            .catch(function(error){
                console.log(error);
            });
        },
        quick(){
            location.href="index.html";
        }
    }
});