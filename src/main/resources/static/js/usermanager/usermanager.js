var newTableDialog = Vue.component('new_table_dialog', {
    data() {
        return {
            visible: false,
            isedit: false,
            title: '',
            userdata: {
                id: "",
                username: "",
                userrealname: "",
                password: "",
                ipaddress: "",
                emailaddress: "",
                level: "",
                ipCheck:false,
                role: "",
            },
            rolelist: [],
        }
    },
    props: ["userlevel"],
    computed:{
        ipChechComputed:{
            get:function(){
                return this.userdata.ipCheck;
            },
            // setter
            set: function (newValue){
                if(newValue) this.userdata.ipaddress="0:0:0:0:0:0:0:1";else this.userdata.ipaddress="";
                this.userdata.ipCheck=newValue;
            }
        }
    },
    mounted() {
        axios.get("/usermanager/getRoleList").then(
            (e) => {
                if (e.data instanceof Array) {
                    e.data.splice(e.data.length - 1)
                    this.reSetList(this.rolelist, e.data);
                }
            }
        )
    },
    methods: {
        openEditDialog(e) {
            this.userdata.ipCheck=e.ipaddress=="0:0:0:0:0:0:0:1";
            this.title = "编辑用户" + e.username
            this.userdata.id = e.id;
            this.userdata.username = e.username;
            this.userdata.userrealname = e.userrealname;
            this.userdata.password = e.password;
            this.userdata.ipaddress = e.ipaddress;
            this.userdata.emailaddress = e.emailaddress;
            this.userdata.level = e.level;
            this.userdata.role = e.role;
            this.visible = true;
            this.isedit = true;
        },
        openInsertDialog() {
            this.title = "新建用户"
            this.userdata.id = "";
            this.userdata.username = "";
            this.userdata.userrealname = "";
            this.userdata.password = "";
            this.userdata.ipaddress = "";
            this.userdata.emailaddress = "";
            this.userdata.level = "";
            this.userdata.role = "";
            this.visible = true;
            this.isedit = false;
        },

        handleClose() {
            this.visible = false;
        },
        createNewTable() {
            var data = new FormData();
            axios.post('/usermanager/insertUser', this.userdata).then(
                () => {
                    this.$emit("getuseruist");
                    this.$message("成功")
                }
            ).catch(
                (e) => {
                    this.$message.error(e.response.data.message);
                }
            )
        },
        updataTable() {
            axios.post('/usermanager/updataUser', this.userdata).then(
                (e) => {
                    this.$emit("getuseruist");
                    this.$message("成功")
                }
            ).catch(
                (e) => {
                    this.$message.error(e.response.data.message);
                }
            )
        },
        reSetList(oldL, newL) {
            for (; oldL.length > 0;) {
                oldL.pop();
            }
            for (i in newL) {
                oldL.push(newL[i]);
            }
        },
    },
    template:
        `
    <el-dialog
        :title="title"
        :visible.sync="visible"
        width="500px"
        :modal="false"
        :append-to-body="true"
        :close-on-click-modal="false"
        :modal-append-to-body="true"
        :destroy-on-close="true "
        :before-close="handleClose">
        <el-form  ref="form" :model="userdata" label-width="80px">
            <el-form-item label="用户名">
                <el-input v-model="userdata.username"></el-input>
            </el-form-item>
            <el-form-item label="密码">
                <el-input v-model="userdata.password" ></el-input>
            </el-form-item>
            <el-form-item label="姓名">
                <el-input v-model="userdata.userrealname"></el-input>
            </el-form-item>
            <el-form-item v-if="!isedit" label="邮箱">
                <el-input type="email" v-model="userdata.emailaddress"></el-input>
            </el-form-item>
           <el-form-item v-if="userlevel==4 && !userdata.ipCheck" label="ip地址">
                <el-input v-model="userdata.ipaddress"></el-input>
            </el-form-item>
            <el-form-item label="身份">
                <el-select v-model="userdata.role" placeholder="请选择身份">
                    <el-option v-for="i in rolelist" :label="i" :value="i"></el-option>
                </el-select>
            </el-form-item>
             <el-checkbox v-model="ipChechComputed">是否需要ip验证</el-checkbox>
        </el-form>
        <span slot="footer" class="dialog-footer">
            <el-button @click="visible = false">取 消</el-button>
            <el-button type="primary" @click="isedit?updataTable():createNewTable()">确 定</el-button>
        </span>
    </el-dialog>
`,
});

var user_manager_table = {
    template: `
        <div>
            <new_table_dialog ref="editdialog" key="editdialog"  @getuseruist="getuseruist"></new_table_dialog>
            <el-table :data="tableData" borderstyle="width: 100%" border> 
                <el-table-column type="expand">
                    <template slot-scope="props">
                        <el-form label-position="left" inline class="demo-table-expand">
                            <el-form-item label="id">
                                <span>{{ props.row.id }}</span>
                            </el-form-item>
                            <el-form-item label="用户名">
                                <span>{{ props.row.username }}</span>
                            </el-form-item>
                            <el-form-item label="姓名">
                                <span>{{ props.row.userrealname}}</span>
                            </el-form-item>
                            <el-form-item label="邮箱地址">
                                <span>{{ props.row.emailaddress }}</span>
                            </el-form-item>
                            <el-form-item label="ip地址">
                                <span>{{ props.row.ipaddress }}</span>
                            </el-form-item>
                            <el-form-item label="用户身份">
                                <span>{{ props.row.role }}</span>
                            </el-form-item>
                        </el-form>
                    </template>
                </el-table-column>
                <el-table-column
                  prop="id"
                  label="id"
                  width="100"
                  align="center">
                </el-table-column>
                <el-table-column
                  prop="username"
                  label="用户名"
                  width="200"
                  align="center">
                </el-table-column>
                <el-table-column
                  prop="userrealname"
                  label="姓名"
                  width="200"
                  align="center">
                </el-table-column>
                <el-table-column
                  prop="role"
                  label="身份"
                  width="200"
                  align="center">
                 </el-table-column>
                </el-table-column>
                <el-table-column
                    label="操作"
                    align="center">
                    <template slot-scope="scope">
                         <el-button @click="upData(scope.row)"type="primary" size="small">编辑</el-button>
                         <delete-button :scope="scope.row" @getuseruist="getuseruist"></delete-button>
                    </template>
                </el-table-column>
            </el-table>
        </div>`,
    data() {
        return {
            tableData: [],
            visible: true,
        };
    },
    props: ["userlevel"],
    mounted() {
        this.getuseruist();
    },
    methods: {
        upData(e) {
            this.$refs.editdialog.openEditDialog(e);
        },
        getuseruist() {
            var data = [];
            axios.get("/usermanager/getUserList").then(
                e => {
                    this.reSetList(this.tableData, JSON.parse(e.request.response))
                })
        },
        getuserlist() {
            this.$emit("getuseruist");
        },
        reSetList(oldL, newL) {
            for (; oldL.length > 0;) {
                oldL.pop();
            }
            for (i in newL) {
                oldL.push(newL[i]);
            }
        },
    },
    components: {
        "delete-button": {
            template:
                `
                    <el-popover
                        placement="top"
                        trigger="click"
                        v-model="visible">
                        <p>确定删除吗？</p>
                        <div style="text-align: right; margin: 0">
                            <el-button size="mini" type="text" @click="visible=false">取消</el-button>
                            <el-button type="primary" @click="deleteData(scope)" size="mini"> 确定</el-button>
                        </div>
                        <el-button size="small" slot="reference">删除</el-button>
                    </el-popover>
            `,
            props: ["scope"],
            data() {
                return {
                    visible: false,
                }
            },
            methods: {
                deleteData(e) {
                    console.log(e)
                    axios.post("/usermanager/deleteUser", e).then(
                        e => {
                            this.visible = false;
                            this.$emit("getuseruist");
                            this.$message.success("chenggong")
                        }).catch(
                        (e) => {
                            this.$message.error(e.response.data.message);
                        }
                    )
                },
            }
        }
    }
}

var userManagerTable = Vue.component('user_manager_sys', {
    template: '#user_manager_sys',
    data() {
        return {
            userlevel: 0,
        }
    },
    methods: {
        createUser() {
            this.$refs.create.openInsertDialog();
        },
        getuseruist() {
            this.$refs.userTable.getuseruist();
        }
    },
    mounted() {
        axios.get("/getCurrentUserLevel").then(
            (e) => {
                if (typeof e.data === 'number' && !isNaN(e.data)) {
                    this.userlevel = e.data;
                }
            }
        )
    },
    components: {
        user_manager_table: user_manager_table,
    }
})