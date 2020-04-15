var getData=function(){
    axios
        .post("/getProjectColumnDefinitionList")
        .then(
            function (data) {
                var d=data.data.data;
                for(i in d){
                    d[i].id=parseInt(i)+1;
                }
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
    getData();
})();
var  projectcolumndefinitiontable=Vue.component('project_column_definition_table',{
    template:`
        <div>
            <el-dialog
                title="添加列"
                :visible.sync="dialogVisible"
                width="30%"
                :append-to-body="true"
                style="z-index: 1000">
               <form_add_column_list @closeDialog="closeDialog"></form_add_column_list>
            </el-dialog>
            <el-col :span="24" >
                <h1 style="line-height: 70px">
                    <el-alert
                        style="display: inline"
                        title="列定义"
                        type="success"
                        :closable="false">
                    </el-alert>
                    <el-button @click="addData" style="position: absolute;right: 10px;top:10px">新增</el-button>
                </h1>
            </el-col>
            <el-col :span="24">
                <el-table
                    :data="data"
                    border
                    max-height="665px"
                    width="500px"
                    >
                    <el-table-column
                        prop="id"
                        label="序号">
                    </el-table-column>
                    <el-table-column
                        prop="columnname"
                        label="列名">
                    </el-table-column>
                    <el-table-column
                        label="列数据类型">
                        <template slot-scope="scope">{{getStringForColumndatatype(scope.row.columndatatype)}}</template>
                    </el-table-column>
                    <el-table-column
                        label="查询条件排序">
                        <template slot-scope="scope">{{getStringForQueryconditionorder(scope.row.queryconditionorder)}}</template>
                    </el-table-column>
                </el-table>
            </el-col>
        </div>
    `,
    props:['data'],
    data:()=>{
      return {
          dialogVisible:false,
      }
    },
    methods:{
        getStringForColumndatatype(columndatatype){
            if(columndatatype==1){
                return "文本";
            }else if(columndatatype==2){
                return "数值";
            }else if(columndatatype==3){
                return "网络链接"
            }
            return "";
        },
        getStringForQueryconditionorder(queryconditionorder){
            if(queryconditionorder==1){
                return "字母顺序";
            }else if(queryconditionorder==2){
                return "频率顺序";
            }else if(queryconditionorder==3){
                return "数值大小";
            }else if(queryconditionorder==4){
                return "范围筛选";
            }else if(queryconditionorder==0){
                return "不参加筛选";
            }
            return "";
        },
        closeDialog(){
            this.dialogVisible=false;
        },
        addData(){
            this.dialogVisible=true;
        },

    }
})


var form_add_column_list=Vue.component('form_add_column_list',{
    template:`<el-form :model="newColumn" ref="form" label-width="100px" label-position="left" enctype="multipart/form-data">
                  <el-form-item label="列名" prop="name">
                        <el-input v-model="newColumn.columnname"></el-input>
                  </el-form-item>
                  <el-form-item label="列数据类型" prop="columndatatype">
                        <el-radio-group  v-model="newColumn.columndatatype">
                              <el-radio value="1" label="1">文本</el-radio>
                              <el-radio value="2" label="2">数值</el-radio>
                              <el-radio value="3" label="3">网络链接</el-radio>
                        </el-radio-group>
                  </el-form-item>
                  <el-form-item label="列数据类型" prop="columndatatype">
                        <el-radio-group  v-model="newColumn.queryconditionorder">
                              <el-radio v-if="newColumn.columndatatype==1" value="1" label="1">字母顺序</el-radio>
                              <el-radio v-if="newColumn.columndatatype==1" value="2" label="2">频率顺序</el-radio>
                              <el-radio v-if="newColumn.columndatatype==2" value="3" label="3">数值大小</el-radio>
                              <el-radio v-if="newColumn.columndatatype==2" value="4" label="4">范围筛选</el-radio>
                              <el-radio v-if="newColumn.columndatatype==3" value="0" label="0">不参加筛选</el-radio>
                        </el-radio-group>
                  </el-form-item>
                  <el-button @click="closeDialog">取消</el-button>
                  <el-button type="primary" @click="updata">上传</el-button>
                </el-form>`,

    data:()=>{
        return{
            newColumn:{
                columnname:'',
                columndatatype:'1',
                queryconditionorder:'1'
            }
        }
    },
    methods:{
        closeDialog(){
            this.newColumn={
                columnname:'',
                columndatatype:'1',
                queryconditionorder:'1'
            }
            this.$emit("closeDialog")
        },
        updata(){
            var formData = new FormData();
            for(i in this.newColumn){
                formData.append(i,this.newColumn[i])
            }
            axios
                .post("/ProjectColumnDefinitionAdd",formData)
                .then(
                    function(data){
                        this.newColumn={
                            columnname:'',
                            columndatatype:'1',
                            queryconditionorder:'1'
                        }
                        // this.$emit("closeDialog")
                    }
                )
        }
    }
})