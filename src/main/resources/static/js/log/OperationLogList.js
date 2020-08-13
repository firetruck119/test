var getData=function(user, operation){
    var params = new URLSearchParams();
    params.append('user',user) ;
    params.append('operation', operation);
    axios
        .post("/OperationLog/queryOperationLog", params)
        .then(
            function (data) {
                vm.main.tableColumnList = data.data.data;
                vm.main.really = true
            }
        )

};


(function() {
    vm.main={
        tableColumnList:[],
        really:false
    };
    var user= '';
    var operation = ''
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == 'user'){user = pair[1];}
        if(pair[0] == 'operation'){operation = pair[1];}
    }
    getData(user,operation);
})();
var  operationloglist=Vue.component('operation_log_list',{
    template:`
        <div>
            <el-col :span="24" >
                <h1 style="line-height: 70px">
                    <el-alert
                        style="display: inline"
                        title="日志"
                        type="success"
                        :closable="false">
                    </el-alert>
                </h1>
            </el-col>
            <el-col :span="24" >
            用户 : <input type = "text" id = "user">
            操作内容 : <input type = "text" id = "operation">
            <button @click="jump" class="el-button el-button--default">查询</button>
            </el-col>
            <el-col :span="24">
                <el-table
                    :data="data"
                    border
                    max-height="665px"
                    width="500px"
                    >
                    <el-table-column
                        prop="userrealname"
                        label="用户">
                    </el-table-column>
                    <el-table-column
                        prop="operation"
                        label="操作内容">
                    </el-table-column>
                    <el-table-column
                        prop="changelasttime"
                        :formatter="formatDate"
                        label="操作时间">
                    </el-table-column>
                </el-table>
            </el-col>
        </div>
    `,
    props:['data'],
    data:()=>{
    return {
    }
},
    methods:{
    //方法区
    formatDate(row, column){
        // 获取单元格数据
        let data = row[column.property]
        if (data == null) {
            return null
        }
        let dt = new Date(data)
        return dt.getFullYear() + '-' + (dt.getMonth() + 1) + '-' + dt.getDate() + ' ' + dt.getHours() + ':' + dt.getMinutes() + ':' + dt.getSeconds()
    },
    jump(){
        window.location.href="/OperationLog/List?user="+document.getElementById('user').value
            +"&operation="+document.getElementById('operation').value

    }
  }
})

