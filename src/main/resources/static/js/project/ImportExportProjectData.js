
var importexportprojectdata=Vue.component('import_export_project_data',{
    template:`<div id="ImportExportProjectData" >
        <el-col :span="24">
            <el-card class="box-card"  style="position:relative;left:50%; margin-left:-300px;top:200px;width:600px;height:500px">
                <div slot="header" >
                    <h1><el-alert
                            style="display: inline;background-color: transparent"
                            title="项目数据导入导出"
                            type="info"
                            :closable="false">
                    </el-alert></h1>
                </div>
                <el-button type="info" style="display: block;margin: 20px auto;width: 200px;font-size: 18px" round plain>项目导出</el-button>
                <el-upload
                    ref="upload"
                    action="/ImportProjectData"
                    :file-list="getFileList"
                    :auto-upload="false">
                    <el-button slot="trigger" size="small" type="primary">选取文件</el-button>
                </el-upload>
                <el-button type="info" style="display: block;margin: 20px auto;width: 200px;font-size: 18px" round plain>项目倒入</el-button>
            </el-card>
        </el-col>
    </div>`,
    data:function(){
        return {
            fileList:[{name: 'food.jpeg', url: 'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100'},
                {name: 'food2.jpeg', url: 'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100'}]
        }
    },
    computed:{
        getFileList:{
            get(){
                return  this.fileList;
            },
            set(e){
                this.fileList[0]=e;
            }
        }
    }
})