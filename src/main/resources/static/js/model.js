var cardHeader = Vue.component('card_header', {
    props: ["title"],
    template: `
        <h4>{{title}}</h4>
    `
})

var sjht = Vue.component("sjht", {
    data: function () {
        return {
            data:[{sjht: '',name:'批令号',list:[1,2,3,4]}],
        }
    },
    methods:{
        sjhtSelect:function(){
        }
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
                <el-select v-model="scope.row.sjht"  placeholder="请选择" @change="sjhtSelect">
                    <el-option
                      v-for="item in scope.row.list"
                      :key="item"
                      :label="item"
                      :value="item">
                    </el-option>
                </el-select>
            </template>
        </el-table-column>
    </el-table>
        
       `
})

var formInput = Vue.component("forminput", {
    props: ["type", "id", "form", 'css'],
    methods: {
        valueChanged: function () {
            dataInForm[this.id].color = 'white'
        }
    },
    template: `
    <div>
        <template v-if="String(type)=='number'">
            <el-input :name="id" type="number"  v-model.number="form[id]" :style="{background:css.color}" @input="valueChanged" :disabled="css.disabled"></el-input>
        </template>
        <template v-else>
            <el-input :name="id" v-model="form[id]" :style="{background:css.color}" @input="valueChanged" :disabled="css.disabled" ></el-input>
        </template>
     </div>
`
})

var formSelect=Vue.component("form_select",{
    props:['id','form','css','options'],
    template:`
        <el-select v-model="form[id]" :style="{background:css.color}" :disabled="css.disabled" placeholder="请选择">
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
    props: ["data", "form", 'css'],
    template: `
          <el-table :data="data" border style="width: 100%">
               <el-table-column prop="name" label="名称" >
               </el-table-column>
               <el-table-column label="内容" width="225">
                    <template slot-scope="scope">
                        <forminput :type="scope.row.type"  :form="form" :css="css[scope.row.id]" :id="scope.row.id"></forminput>
                    </template>
               </el-table-column>
          </el-table>
    `,
})

var formTable4Col = Vue.component('form_table_4col', {
    props: ["data", "form", 'css'],
    template: `
          <el-table :data="data" border style="width: 100%">
               <el-table-column prop="name" label="名称">
               </el-table-column>
               <el-table-column label="符号" width="50">
                    <template slot-scope="scope">
                         <i><span v-html='scope.row.no'></span></i>
                    </template>
               </el-table-column>
               <el-table-column label="数值" width="180">
                    <template slot-scope="scope" >
                        <template>
                            <forminput :type="scope.row.type" :form="form" :css="css[scope.row.id]" :id="scope.row.id"></forminput>
                        </template>
                    </template>
               </el-table-column>
               <el-table-column prop="unit" label="单位" width="50">
               </el-table-column>
          </el-table>
    `,
})

var homePage = Vue.component('home_page', {
    props: ["tabledata", "form", 'css', 'sjht'],
    template: `
        <el-card>
          <div slot="header" class="clearfix">
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <sjht></sjht>
            <form_table_2col :data="tabledata.data" :css="css" :form="form"></form_table_2col>
          </div>
        </el-card>
    `,
})

var tableCard4col = Vue.component('table_card_4col', {
    props: ["tabledata", "form", 'css'],
    template: `
        <el-card>
          <div slot="header" class="clearfix">
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <form_table_4col :data="tabledata.data" :css="css" :form="form"></form_table_4col>
          </div>
        </el-card>
    `,
})

var tableCardSelect4col = Vue.component('table_card_select_4col', {
    props: ["tabledata", "form", 'css'],
    template: `
        <el-card>
          <div slot="header" class="clearfix" >
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <form_select_table :selectdata="tabledata.select" :css="css" :form="form"></form_select_table>
            <form_table_4col :data="tabledata.data" :css="css" :form="form"></form_table_4col>
          </div>
        </el-card>
    `,
})

var tableCard4colImg = Vue.component('table_card_4col_img', {
    props: ["tabledata", "form", 'css'],
    template: `
        <el-card>
          <div slot="header" class="clearfix">
            <card_header :title="tabledata.title" ></card_header>
          </div>
          <div class="text item">
            <form_table_4col :data="tabledata.data" :css="css" :form="form"></form_table_4col>
          </div>
        </el-card>
    `,
});



var checkBox=Vue.component('checkbox',{
    props:["buttons"],
    template:`
        <div>{{buttons}}</div>
    `,
});


var submitButton=Vue.component("submit_button",{
    props:['buttonname','url'],
    methods:{
        getPDF:function(){
            var form = document.getElementById("form1");
            // 用表单来初始化
            var formData = new FormData(form);
            axios.post(window.location.href+this.url,formData,
                {
                    responseType:'blob'    // 设置响应数据类型
                })
                .then(res=>{
                    if (res.status == 200) {
                        let url = window.URL.createObjectURL(new Blob([res.data]))
                        let link= document.createElement('a')
                        link.style.display='none'
                        link.href=url
                        link.setAttribute('download', "fileName")    // 自定义下载文件名（如exemple.txt）
                        document.body.appendChild(link)
                        link.click()
                    }
                })
        }
    },
    template:` <el-button  type="primary" plain round @click="getPDF">{{buttonname}}</el-button>`,
})

var submitBox=Vue.component('submitbox',{
    props:["buttons"],
    template:`
        <div>
            <template v-for="button in buttons">
                <submit_button :buttonname="button.name" :url="button.url"></submit_button>
            </template>
        </div>
    `,
});