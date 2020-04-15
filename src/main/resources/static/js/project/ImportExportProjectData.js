
var importexportprojectdata=Vue.component('import_export_project_data',{
    template:`<div id="ImportExportProjectData" >
        <el-col :span="24">
            <el-card class="box-card"  style=" margin-left:30%;margin-top:10%;width:600px;height=700px">
                <div slot="header" >
                    <h1><el-alert
                            style="display: inline;background-color: transparent"
                            title="项目数据导入导出"
                            type="info"
                            :closable="false">
                    </el-alert></h1>
                </div>
                <el-button type="info" style="display: block;margin: 20px auto;width: 200px;font-size: 18px" @click="download" round plain>项目导出</el-button>
                <el-upload
                    ref="upload"
                    action="/ImportProjectData"
                    :file-list="fileList"
                    name="excelData"
                    :limit="1"
                    accept=".xls"
                    :on-success="afterUp"
                    :on-exceed="exceed"
                    style="margin: 20px auto;width: 200px;height: 100px">
                    <el-button size="small" type="info" style="display: block;margin: 20px auto;width: 200px;font-size: 18px;height: 40px" round plain>选取文件并上传</el-button>
                </el-upload>
            </el-card>
        </el-col>
    </div>`,
    data:function(){
        return {
            fileList:[]
        }
    },
    methods:{
        exceed(f,fl){
           this.fileList.pop();
           this.fileList.push(f[0])
        },
        afterUp(result){
            this.fileList.pop();
            const h = this.$createElement;
            this.$notify({
                title: '上传成功',
                message: h('a', { style: 'color: teal'}, result.message)
            });
        },
        download(){{
                var a = document.createElement('a')
                var event = new MouseEvent('click')
                a.download = '下载图片名称'
                a.href = '/ExportProjectData'
                a.dispatchEvent(event)
            }
        }
    }
})