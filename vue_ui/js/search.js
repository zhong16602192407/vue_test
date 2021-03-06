var app=new Vue({
    el:"#app",
    data:{
        pageInfo:'',
        pageNum:1,
        jname:'',
        jid:''
    },
    mounted(){
        console.log('helow');
        this.queryList();
    },
    methods:{
        pageChange(val){
            this.pageNum=val;
            this.queryList();
        },
        queryList(){
            axios.get('http://localhost:8080/wzlist/queryListWz',{
                params:{
                    pageNum:this.pageNum,
                    jname:this.jname,
                    jid:this.jid
                }
            })
            .then(function(response){
                console.log(response);
                app.pageInfo=response.data;
            })
            .catch(function(error){
                console.log(error);
            });
        },
        sou(){
            this.queryList();
        }
    }
});