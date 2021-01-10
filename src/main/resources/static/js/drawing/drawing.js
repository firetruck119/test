var data = {
    tableData: {},
    rows: [],
    tableInfo: {
        drawingname: null,
        id: null,
        drawinno: null
    },
    columnData: {}
};

async function getList() {
    await axios.get('/drawingTable/getList').then(
        function (e) {
            window.data.tableData = e.data;
        }
    );
}

getList();

var newTableDialog = {
    data() {
        return {
            visible: false,
            info: {
                drawingname: null,
                id: null,
                drawinno: null
            },
        }
    },
    methods: {
        openDialog(e) {
            if (e) {
                this.info.drawingname = e.drawingname;
                this.info.id = e.id;
                this.info.drawinno = e.drawinno;
            } else {
                this.info.drawingname = '';
                this.info.id = '';
                this.info.drawinno = '';
            }
            this.visible = true;
        },
        getTable() {
            this.$emit("getTable")
        },
        handleClose() {
            this.visible = false;
        },
        createNewTable() {
            var data = new FormData();
            data.append('drawingname', this.info.drawingname);
            data.append('drawinno', this.info.drawinno);
            axios.post('/drawingTable/addDrawing', data).then(
                async () => {
                    await getList();
                    this.visible = false;
                    var tableData = window.data.tableData;
                    this.$emit("getTable", tableData[tableData.length - 1])
                }
            ).catch(
                (e) => {
                    if (e.response.status === 403)
                        message = "没有权限";
                    else
                        message = e.response.data.message;
                    this.$message.error(message);
                }
            )
        },
        updataTable() {
            var data = new FormData();
            data.append('drawingname', this.info.drawingname);
            data.append('drawinno', this.info.drawinno);
            data.append('id', this.info.id);
            axios.post('/drawingTable/upDrawing', data).then(
                (e) => {
                    getList();
                    window.data.tableInfo.drawingname = this.info.drawingname;
                    window.data.tableInfo.id = this.info.id;
                    window.data.tableInfo.drawinno = this.info.drawinno;
                    this.visible = false;
                }
            ).catch(
                (e) => {
                    if (e.response.status === 403)
                        message = "没有权限";
                    else
                        message = e.response.data.message;
                    this.$message.error(message);
                }
            )
        }
    },
    template: `
    <el-dialog
        title="新建表格"
        :visible.sync="visible"
        width="500px"
        :modal="false"
        :append-to-body="true"
        :close-on-click-modal="false"
        :modal-append-to-body="true"
        :destroy-on-close="true "
        :before-close="handleClose">
        <el-form ref="form" id="createTableForm"   label-width="80px">
            <el-form-item label="表格名称">
                <el-input name='drawingname' v-model="info.drawingname"></el-input>
            </el-form-item>
            <el-form-item label="表格符号">
                <el-input name='drawinno' v-model="info.drawinno"></el-input>
            </el-form-item>
        </el-form>
        <span slot="footer" class="dialog-footer">
            <el-button @click="visible = false">取 消</el-button>
            <el-button type="primary" @click="info.id?updataTable():createNewTable()">确 定</el-button>
        </span>
    </el-dialog>
`,
}

var editbuttons = {
    props: ['data'],
    data() {
        return {
            visible: false,
            datainfo: window.data.tableInfo
        }
    },
    methods: {
        upInfo() {
            this.$refs.uptableform.openDialog(data.tableInfo);
        },
        success(e) {
            this.datainfo.drawingname = this.drawingname;
            this.datainfo.id = this.id;
            this.datainfo.drawinno = this.drawinno;
        },
        deleteTable() {
            var data = new FormData();
            data.append('id', this.data.id);
            data.append('tablename', this.data.drawingname);
            axios.post('/drawingTable/deleteDrawing', data).then(
            axios.post('/drawingTable/deleteDrawing', data).then(
                () => {
                    window.location.href = "http://" + window.location.host + "/drawingTable"
                }
            ).catch(e => {
                if (e.response.status === 403)
                    message = "没有权限";
                else
                    message = e.response.data.message;
                this.$message.error(message);
            }))
        },
        before() {
            this.drawingname = this.datainfo.drawingname;
            this.id = this.datainfo.id;
            this.drawinno = this.datainfo.drawinno;
            this.datainfo.id = '';
        },
        getTable() {
            this.$emit("getTable");
        },
        uperror(result) {
            var massage = "";
            if (result.status === 403) {
                massage = "没有权限";
            }
            this.$notify.error({
                title: '上传失败',
                message: massage,
            });
        },
        download() {
            axios.post('/drawingTable/getExcel', {
                    drawingname: window.data.tableInfo.drawingname,
                    id: window.data.tableInfo.id,
                    drawinno: window.data.tableInfo.drawinno
                },
                {
                    responseType: 'blob'    // 设置响应数据类型
                })
                .then(res => {
                    console.log(res.data);
                    const content = res
                    const blob = new Blob([content.data])
                    const fileName = window.data.tableInfo.drawingname + '.xls'
                    const elink = document.createElement('a')
                    elink.download = fileName
                    elink.style.display = 'none'
                    elink.href = URL.createObjectURL(blob)
                    document.body.appendChild(elink)
                    elink.click()
                    URL.revokeObjectURL(elink.href) // 释放URL 对象
                    document.body.removeChild(elink)
                }).catch(e => {
                if (e.response.status === 403)
                    message = "没有权限";
                else
                    message = e.response.data.message;
                this.$message.error(message);
            })
        }
    },
    components: {
        newTableDialog: newTableDialog,
    },
    template: `
    <div style="float: left;width: 100%;margin-top: 10px">
          <el-button  style="width: 60%;margin: 10px 20%" @click="download">下载表</el-button>
          <el-upload
                    ref="upload"
                    action="/drawingTable/insertOrUpdateDrawing"
                    :data="{drawingname:datainfo.drawingname,id:datainfo.id,drawinno:datainfo.drawinno}"
                    name="excelData"
                    :on-success="success"
                    :on-error="uperror"
                    :before-upload="before"
                    :show-file-list="false"
                    accept=".xls">
                    <el-button style="width: 60%;margin: 10px 20%" >上传表</el-button>
                </el-upload>
          <newTableDialog key="update" :userlevel="" :info="data" ref="uptableform" @getTable="getTable"></newTableDialog>
          <el-button style="width: 60%;margin: 10px 20%" @click="upInfo">编辑表名</el-button>
          <el-popover
                placement="left"
                width="160"
                v-model="visible">
                <p>确定删除{{data.drawingname}}表格</p>
                <div style="text-align: right; margin: 0">
                  <el-button size="mini" type="text" @click="visible = false">取消</el-button>
                  <el-button type="primary" size="mini" @click="deleteTable">确定</el-button>
                </div>
                <el-button slot="reference" style="width: 60%;margin: 10px 20%">删除表</el-button>
           </el-popover>
    </div>
    `
}
var dataTable = Vue.component('datatable', {
    template: '#dataTable',
    data() {
        return data
    },
    methods: {
        getTable(e) {
            this.tableInfo.drawingname = e.drawingname;
            this.tableInfo.id = e.id;
            this.tableInfo.drawinno = e.drawinno;
        },
    },
    components: {
        tablelist: {
            props: ['tables'],
            methods: {
                getTable(e) {
                    this.$emit('get-data', e);
                },
                createNewTable() {
                    this.$refs.dialog.openDialog();
                },
            },
            components: {
                newTableDialog: newTableDialog,
            },
            template: `
                <ul style="width:150px;list-style:none;padding-left: 5px;overflow: auto">
                    <li v-for="i in tables"  style="margin-bottom: 5px;width: 100%">
                        <el-link type="primary" @click="getTable(i)" :underline="false" style="width: 100%">
                            <el-tag style="width: 100%;display:block;text-align: center">
                                {{i.drawingname}}
                            </el-tag>
                        </el-link>
                    </li>
                    <li>
                        <el-button size="small" style="width: 100%" @click="createNewTable" type="primary">新建表格</el-button>
                        <newTableDialog key="create" info="" ref="dialog" @getTable="getTable"></newTableDialog>
                    </li>
                </ul>
            `
        },
        tablec: {
            template: `
                <el-row>
                    <el-col :span="24">
                        <input type="hidden" v-model="getHeader"/>
                        <input type="hidden" v-model="getTable"/>
                        <main_head :title="info.drawingname"></main_head>
                    </el-col>
                    <el-col :span="24" v-if="hackReset">
                        <el-table
                            border
                            :key="key"
                            :data="rows"
                            style="width: 100%">
                            <el-table-column
                                align="center"
                                prop="drawingtype"
                                label="名称"
                                width="300">
                            </el-table-column>
                            <el-table-column 
                                align="center"
                                v-for="index in columns.length"
                                :label="columns[index-1].columnname+' ('+columns[index-1].columnno+')'"
                                :render-header="renderHeader"
                                :width="width">
                                <template slot-scope="scope">
                                {{scope.row['column'+index]}}
                                </template>
                            </el-table-column>
                        </el-table>
                    </el-col>
                </el-row>
            `,
            data() {
                return {
                    key: 0,
                    title: null,
                    rows: [],
                    columns: [],
                    data: [],
                    width: 200,
                    hackReset: true,
                }
            },
            props: ['info'],
            computed: {
                getHeader() {
                    axios.get('/drawingTable/getColumns?name=' + this.info.id).then(
                        (e) => {
                            var columnData = e.data;
                            console.log(e.data)
                            this.width = (1000 - 300) / (Object.getOwnPropertyNames(columnData).length + 1);
                            this.width = this.width < 182 ? 182 : this.width;
                            this.reSetList(this.columns, columnData);
                            this.delete()
                        }
                    ).catch(
                        (e) => {
                            this.reSetList(this.columns, []);
                            this.$message.error(e.response.data.message);
                        }
                    )
                },
                getTable() {
                    axios.get('/drawingTable/getTable?name=' + this.info.id).then(
                        (e) => {
                            var rowData = e.data;
                            this.reSetList(this.rows, rowData);
                            this.delete()
                        }
                    ).catch(
                        (e) => {
                            this.reSetList(this.rows, []);
                            this.$message.error(e.response.data.message);
                        }
                    )
                }
            },
            methods: {
                delete() {
                    this.hackReset = false
                    this.$nextTick(() => {
                        this.hackReset = true
                    })
                },
                renderHeader(h, {column}) {
                    let header = column.label.split(' ');
                    return [h('p', [
                        h('p', {}, header[0]),
                        h('span', {}, header[1])
                    ])];
                },
                console(e) {
                    console.log(e);
                },
                reSetList(oldL, newL) {
                    for (; oldL.length > 0;) {
                        oldL.pop();
                    }
                    for (i in newL) {
                        newL['tableid'] = this.info.id;
                        oldL.push(newL[i]);
                    }
                },
            }
        },

        editbuttons: editbuttons,
    }
})