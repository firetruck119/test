var mainhead = Vue.component('main_head', {
    template: `<h1 style="line-height: 55px">
                <el-alert
                    style="display: inline"
                    :title="title"
                    type="success"
                    :closable="false">
                </el-alert>
            </h1>`,
    props: ['title']
})


var cardHeader = Vue.component('card_header', {
    props: ["title"],
    template: `
        <h4>{{title}}</h4>
    `
})

var sjht = Vue.component("sjht", {
    data: function () {
        window.sjht = {value: ''};
        window.sjhtList = [];
        axios.post('/getBatchIdList').then(
            function success(ref) {
                for (index in ref.data) {
                    sjhtList.push({value: ref.data[index]})
                }
            }
        )
        return {
            data: [{
                sjht: sjht,
                name: '批令号'
            }],
            list: sjhtList,
        }
    },
    methods: {
        getData() {
            axios.get(window.location.href + '/getData?batchId=' + window.sjht.value).then(
                function success(data) {
                    var a = data.data.datalist;
                    sjht.isPushData=true;
                    for (i in window.css) {
                        window.css[i].value=undefined;
                        window.css[i].color='white'
                    }
                    for(i in imagelist[i]){
                        imagelist[i].filename='';
                    }
                    for(i in imagelist){
                        var name=a[i];
                        if(name){
                            imagelist[i].filename=name;
                        }
                    }
                    for(var j=0;j<3;j++) {
                        for (i in a) {
                            if (a[i] != null && window.css[i] && (window.css[i].value != a[i] || window.css[i].color != 'yellow')) {
                                window.css[i].value = a[i];
                                window.css[i].color = 'yellow';
                            }
                        }
                    }
                })
        },
        querySearch(queryString, cb) {
            var restaurants = this.list;
            var results = queryString ? restaurants.filter(this.createFilter(queryString)) : restaurants;
            // 调用 callback 返回建议列表的数据
            cb(results);
        },
        createFilter(queryString) {
            return (restaurant) => {
                return (String(restaurant.value).indexOf(queryString) >= 0);
            };
        },
    },
    template: ` 
    <el-table
        :data="data"
        style="width: 100%;" 
        :header-row-style="{display:'none'}">
        <el-table-column prop="name">
        </el-table-column>
        <el-table-column width="180" prop="">
            <template slot-scope="scope">
                <el-autocomplete
                  class="inline-input"
                  v-model="scope.row.sjht.value"
                  :fetch-suggestions="querySearch"
                  placeholder="请输入内容"
                ></el-autocomplete>
            </template>
        </el-table-column>
         <el-table-column width="100" prop="">
            <template slot-scope="scope">
                <el-button size="small" @click="getData">
                    读取
                </el-button>
            </template>
        </el-table-column>
    </el-table>
    `,
});

var formInput = Vue.component("forminput", {
    props: ["id"],
    data: (function () {
        return window.css[this.id];
    }),
    methods: {
        select(){
            sjht.isPushData=false;
        },
        valueChanged: function (e) {
            sjht.isPushData=false;
            if(String(e)=='')
                this.value=undefined
            this.color = 'white'
        }
    },
    template: `
    <div>
        <template v-if="String(type)=='number'">
            <el-input :name="id" type="number" :step="0.00001" v-model.number="value" :style="{background:color}" @input="valueChanged" :disabled="disabled"></el-input>
        </template>
        <template v-else-if="String(type)=='string'">
            <el-input :name="id" v-model="value" :style="{background:color}" @input="valueChanged" :disabled="disabled" ></el-input>
        </template>
        <template v-else-if="String(type)=='select'">
            <el-select v-model="value" @change="select" :disabled="disabled" placeholder="请选择"  >
                <el-option
                    v-for="item in option"
                    :key="item"
                    :label="item"
                    :value="item">
                </el-option>
            </el-select>
        </template>
     </div>
`
})

var imageInput = Vue.component("image_input", {
    props: ["imageObj"],
    data: function () {
        return {
            action: '/savePicture',
            dialogVisible: false,
            image: window.imagelist[this.imageObj.name],
        };
    },
    methods: {
        getData() {
            return {
                sjht: window.sjht,
                name: image.name,
            }
        },
        UrlSearch(str) {
            var name, value,obj={};var num = str.indexOf("?")
            str = str.substr(num + 1); //取得所有参数   stringvar.substr(start [, length ]
            var arr = str.split("&"); //各个参数放到数组里
            for (var i = 0; i < arr.length; i++) {
                num = arr[i].indexOf("=");
                if (num > 0) {
                    name = arr[i].substring(0, num);
                    value = arr[i].substr(num + 1);
                    obj[name] = value;
                }
            }
            return obj;
        },
        handleAvatarSuccess(res, file) {
            console.log(res)
            this.image.filename=res;
        },
        beforeAvatarUpload(file) {
            const isJPG = file.type === 'image/jpeg';
            const isLt2M = file.size / 1024 / 1024 < 2;
            if (!isJPG) {
                this.$message.error('上传头像图片只能是 JPG 格式!');
            }
            if (!isLt2M) {
                this.$message.error('上传头像图片大小不能超过 2MB!');
            }
            if (isJPG && isLt2M) {
                this.image.src = URL.createObjectURL(file);
            }
            return isJPG && isLt2M;
        }
    },
    computed: {
        src:{
            get() {
                return '/pdf/getImg?filename='
                    + this.image.filename
                    + '&id='
                    + Math.random();
            },
            set(e){
                this.image.filename=this.UrlSearch(e)[0]
            }
        }
    },
    template: `
    <div style="">
    <div style="
    width: 155px;
    height:155px;
    margin: 0 auto;
    ">
        <el-upload
            class="avatar-uploader"
            :action="action"
            :show-file-list="false"
            :on-success="handleAvatarSuccess"
            :before-upload="beforeAvatarUpload">
                <el-image fit="contain" v-if="image.filename" :src="src" class="avatar">
                </el-image>
                <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
        </div>
    </div>
`
})

var formSelect = Vue.component("form_select", {
    props: ['id', 'form', 'css', 'options'],
    methods:{
      select(){
          sjht.isPushData=false;
      }
    },
    template: `
        <el-select v-model="form[id]" :style="{background:css.color}" @change="select" :disabled="css.disabled" placeholder="请选择">
            <el-option
                v-for="item in options"
                :key="id+item"
                :label="item"
                :value="item">
            </el-option>
        </el-select>
    `
})

var form_select_table = Vue.component("form_select_table", {
    props: ['selectdata', 'form', 'css'],
    template: ` 
    <el-table
        :data="selectdata"
        style="width: 100%;" 
        :header-row-style="{display:'none'}">
        <el-table-column
            prop="name">
        </el-table-column>
        <el-table-column width="180" prop="">
            <template slot-scope="scope">
                <form_select :id="scope.row.id" :form="form" :css="css[scope.row.id]" :options="scope.row.options"></form_select>
            </template>
        </el-table-column>
    </el-table>
`,
})

var formTable2Col = Vue.component('form_table_2col', {
    props: ["data"],
    template: `
          <el-table :data="data" border style="width: 100%">
               <el-table-column prop="name" label="名称" >
               </el-table-column>
               <el-table-column label="内容" width="225">
                    <template slot-scope="scope">
                        <forminput  :id="scope.row.id"></forminput>
                    </template>
               </el-table-column>
          </el-table>
    `,
})

var formTable4Col = Vue.component('form_table_4col', {
    props: ["data"],
    methods: {
        arraySpanMethod({row, column, rowIndex, columnIndex}) {
            if (row.type == 'select') {
                if (columnIndex == 0) {
                    return [1, 1];
                } else if (columnIndex == 2) {
                    return [1, 6];
                } else {
                    return [0, 0]
                }
            }
        }
    },
    template: `
          <el-table :data="data"  :span-method="arraySpanMethod" border style="width: 100%">
               <el-table-column prop="name" label="名称">
               </el-table-column>
               <el-table-column label="符号" width="50">
                    <template slot-scope="scope">
                         <i><span v-html='scope.row.no'></span></i>
                    </template>
               </el-table-column>
               <el-table-column label="数值" width="180">
                    <template slot-scope="scope">
                        <template>
                            <forminput :id="scope.row.id"  ></forminput>
                        </template>
                    </template>
               </el-table-column>
               <el-table-column prop="unit" label="单位" width="50">
               </el-table-column>
          </el-table>
    `,
})

var homePage = Vue.component('home_page', {
    props: ["tabledata"],
    template: `
        <el-card>
          <div slot="header" class="clearfix">
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <sjht></sjht>
            <form_table_2col :data="tabledata.datas" ></form_table_2col>
          </div>
        </el-card>
    `,
})

var tableCard4col = Vue.component('table_card_4col', {
    props: ["tabledata"],
    template: `
        <el-card>
          <div slot="header" class="clearfix">
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <form_table_4col :data="tabledata.datas" ></form_table_4col>
          </div>
        </el-card>
    `,
})

var tableCard4colImg = Vue.component('table_card_4col_img', {
    props: ["tabledata"],
    template: `
        <el-card>
          <div slot="header" class="clearfix">
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <image_input :imageObj="tabledata.image[0]"></image_input>
            <form_table_4col :data="tabledata.datas" ></form_table_4col>
          </div>
        </el-card>
    `,
});

var checkBox = Vue.component('checkbox', {
    props: ["buttons"],
    template: `
        <div>{{buttons}}</div>
    `,
});


var submitButton = Vue.component("submit_button", {
    props: ['buttonname', 'url'],
    methods: {
        getPDF: function () {
            var form = document.getElementById("form1");
            // 用表单来初始化
            var formData = new FormData(form);
            axios.post(window.location.href + this.url, formData,
                {
                    responseType: 'blob'    // 设置响应数据类型
                })
                .then(res => {
                    if (res.status == 200) {
                        let url = window.URL.createObjectURL(new Blob([res.data]))
                        let link = document.createElement('a')
                        link.style.display = 'none'
                        link.href = url
                        link.setAttribute('download', "fileName")    // 自定义下载文件名（如exemple.txt）
                        document.body.appendChild(link)
                        link.click()
                    }
                })
        }
    },
    template: ` <el-button  type="primary" plain round @click="getPDF">{{buttonname}}</el-button>`,
})

var submitBox = Vue.component('submitbox', {
    props: ["buttons"],
    template: `
        <div>
            <template v-for="button in buttons">
                <submit_button :buttonname="button.name" :url="button.url"></submit_button>
            </template>
        </div>
    `,
});


function getOptionValue(SelectName, AttributeName) {
    var option = options[SelectName][css[SelectName].value];
    if (option)
        return option[AttributeName];
    else
        return undefined;
}