var projectTable = Vue.component('project_table', {
    props: ['data', 'fliter'],
    data: function () {
        return {
            page: 1,
            onePageSize: 20,
            drawer: true,
            filterData:this.data,
            sortObj:{
                name:"projectdataid",
                type:1,
                sortType:3
            }
        }
    },
    methods: {
        handleSizeChange: function (e) {
            this.page = 1
            this.onePageSize = e;
        },
        handleCurrentChange: function (e) {
            this.page = e
        },
        showFliter: function () {
            this.$refs.fliter.show();
        },
        width: function (i) {
            return (i.id == 1 ? 75 : (i.id == 2 || i.id == 3) ? 180 : 130)
        },
        filtByNumber(value, number) {
            return !number || parseFloat(value) === number
        },
        filtByString(value, number) {
            return !number || (String(value).indexOf(number) > -1)
        },
        filtByRate(value,number) {
            value = parseFloat(value)
            return !number ||
                (!number.max && !number.min) ||
                (number.max >= value && !number.min) ||
                (!number.max && number.min <= value) ||
                (value <= number.max && value >= number.min);
        },
        sortByNumber(o,t){
            var a=parseFloat(o[this.sortObj.name])-parseFloat(t[this.sortObj.name]);
            return a*this.sortObj.type;
        },
        sortByString(o,t){
            var a=String(o[this.sortObj.name]).localeCompare(t[this.sortObj.name],"co",{sensitivity:'variant'});
            return a*this.sortObj.type;
        },
        changeFliter: function () {
            this.page=1
            var data = [];
            var i=0;
            for (row in this.data) {
                var t=true;
                for (col in this.data[row]) {
                    i++;
                    if (col == 'createtime' || col == 'changelasttime'||this.data[row][col]==null)
                        continue;
                    var fliter = this.fliter[col];
                    switch (fliter.type) {
                        case 1:
                        case 2:
                        case 3:
                            t=t&&this.filtByString(this.data[row][col], fliter.string);break;
                        case 4:
                            t=t&&this.filtByRate(this.data[row][col], {max:parseFloat(fliter.maxNumber),min:parseFloat(fliter.minNumber)});
                    }
                }
                if(t) {
                    data.push(this.data[row])
                }
            }
            this.sortData(data);
            this.filterData= data;
        },
        sortData(data){
            if(this.sortObj.name&&this.sortObj.type){
                var sortf;
                switch (this.sortObj.sortType) {
                    case 1:
                    case 2:sortf=this.sortByString;break;
                    case 3:
                    case 4:sortf=this.sortByNumber;break;
                }
                data.sort(sortf)
            }
        },
        sortFun(name,sortType){
            if(this.sortObj.name!=name){
                this.sortObj.type=1;
            }else{
                this.sortObj.type=this.sortObj.type*-1;
            }
            this.sortObj.name=name;
            this.sortObj.sortType=sortType;
            console.log(this.sortObj)
            this.sortData(this.filterData);
        }
    },
    computed: {
        showData: function () {
            return this.filterData.slice((this.page - 1) * this.onePageSize, this.page * this.onePageSize);
        },
        showLength: function () {
            return this.filterData.length;
        },
    },
    template: `
    <div>
        <el-col :span="24" >
            <h1 style="line-height: 55px">
                <el-alert
                    style="display: inline"
                    title="项目查询"
                    type="success"
                    :closable="false">
                </el-alert>
                <el-button @click="showFliter" style="position: absolute;right: 10px;top:10px">筛选</el-button>
            </h1>
        </el-col>
        <el-col :span="24">
              <project_fliter_box :fliter="fliter" @changeFliter="changeFliter" ref="fliter"></project_fliter_box>
        </el-col>
        <el-col :span="24">
    <el-table
            :fit="false"
            max-height="455px"
            :data="showData"
            style="font-size: 12px"
            border>
        <template v-for="i,v in fliter">
            <el-table-column
                    :key="Math.random()"
                    align="center"
                    :width="width(i)">
                <template slot="header" slot-scope="scope">
                    <table_col_head :head="i" :name="v" ref="v" @sortClick="sortFun"></table_col_head>
                </template>
                <template slot-scope="scope">
                    <template v-if="i.type != 0" >
                        {{scope.row[v]}}
                    </template>
                    <template v-else >
                        <el-link type="primary" :href="scope.row[v]"><i style="font-size: 20px" class="el-icon-attract"></i></el-link>
                    </template>
                </template>
            </el-table-column>
        </template>
    </el-table>
           <div class="block">
               <el-pagination
                       :small="true"
                       @size-change="handleSizeChange"
                       @current-change="handleCurrentChange"
                       :current-page="page"
                       :page-sizes="[10, 20, 30, 40]"
                       :page-size="onePageSize"
                       layout="total, sizes, prev, pager, next, jumper"
                       :total="showLength">
               </el-pagination>
           </div>
        </el-col>
    </div>
    `,
});

vm.main = {
    really: false,
    data: {},
    head: {},
    fliter: {},
};
(function () {
    var tableData;
    var fliter = {
        projectdataid: {
            string: null,
            name: '序号',
            id: 1,
            type: 3
        },
        projectname: {
            string: null,
            name: '项目名称',
            id: 2,
            type: 1
        }
    }
    axios
        .get("/projectData/getData")
        .then(
            function (data) {
                for (i in data.data.head) {
                    fliter['datacolumn' + (parseInt(i) + 1)] = {
                        name: data.data.head[i].columnname,
                        id: data.data.head[i].projectcolumndefinitionid + 2,
                        stringValues: data.data.head[i].stringValues,
                        maxNumber: null,
                        minNumber: null,
                        string: null,
                        number: null,
                        minValue: data.data.head[i].minValue,
                        maxValue: data.data.head[i].maxValue,
                        type: data.data.head[i].queryconditionorder
                    }
                }
                vm.main.fliter = fliter;
                vm.main.data = data.data.data;
                vm.main.head = data.data.head;
                vm.main.really = true;
            }
        )
    return tableData;
})()

var tablecolhead=Vue.component('table_col_head',{
    template:`
        <div @click="sorClick">{{head.id}}.{{head.name}}<i :class="sortIcon"></i></div>
    `,
    props:['head','name'],
    data:function(){
        return{
            sortIcon:'el-icon-sort-down',
        }
    },
    methods:{
        sorClick(){
            this.$emit('sortClick',this.name,this.head.type)
        }
    }
})

var flitertag=Vue.component('fliter_tag',{
    template:`
        <div>
            <template v-for="i in fliter">
                <template v-if="i.type ==0" ></template>
                <string_tag v-else-if="i.type !=4 && i.string" @changeFliter="close" :fliter="i"></string_tag>
                <rate_number_tag v-else-if="i.type ==4 && (i.minNumber || i.maxNumber)" @changeFliter="close" :fliter="i"></rate_number_tag>
            </template>
        </div>
    `,
    props:['fliter'],
    methods:{
        close(){
            this.$emit('changeFliter')
        }
    }
})
var stringtag=Vue.component('string_tag',{
    template:`
        <el-tag
               style="margin:2px"
               :key="fliter.name"
                @close="handleClose"
               :closable='true'>
           {{fliter.id}}.{{fliter.name}}:{{fliter.string}}
        </el-tag>
    `,
    props:['fliter'],
    methods:{
        handleClose(){
            this.fliter.minNumber=null;
            this.fliter.maxNumber=null;
            this.fliter.string=null;
            this.fliter.number=null;
            this.$emit('changeFliter')
        }
    }
})
var ratenumbertag=Vue.component('rate_number_tag',{
    template:`
        <el-tag
                style="margin:2px"
                :key="fliter.name"
                 @close="handleClose"
                :closable='true'>
            {{fliter.id}}.{{fliter.name}}:{{fliter.minNumber?fliter.minNumber:fliter.minValue}}~{{fliter.maxNumber?fliter.maxNumber:fliter.maxValue}}
        </el-tag>
    `,
    props:['fliter'],
    methods:{
        handleClose(){
            this.fliter.minNumber=null;
            this.fliter.maxNumber=null;
            this.fliter.string=null;
            this.fliter.number=null;
            this.$emit('changeFliter')
        }
    }
})
var projectfliterbox = Vue.component('project_fliter_box', {
    template: `
        <table  cellpadding="0" cellspacing="0"  style="border:2px solid gray;padding:4px;margin-bottom: 5px; border-collapse: collapse;">
            <tr v-if="tableData[(row-1)*5]" v-for="row in 20">
                <template v-if="tableData[(row-1)*5+col-1]" v-for="col in 5">
                    <td width='9%'  style="font-size:12px;border: 1px solid black;padding: 2px!important;">{{tableData[(row-1)*5+col-1].name}}</td>
                    <td width="11%" style="font-size:12px;border: 1px solid black;padding: 2px!important;" >
                        <fliter-input 
                        :fliter="fliter[tableData[(row-1)*5+col-1].id]"
                        @changeFliter="changeFliter">
                        </fliter-input>
                    </td>
                </template>
            </tr>
        </table>
    `
    ,
    props: ['fliter'],
    data: function () {
        var tableData = [];
        var index = 0;
        for (i in this.fliter) {
            tableData[index++] = {
                name: this.fliter[i].id + '.' + this.fliter[i].name,
                id: i
            }
        }
        console.log(tableData)
        return {
            tableData: tableData,
            drawer: true,
        }
    },
    methods: {
        changeFliter:function(){
            console.log(123)
            this.$emit("changeFliter")
        },
        show: function () {
            this.drawer = true;
        },
        unShowRow: function ({row, rowIndex}) {
            if (row.type == 0)
                return 'hidden'
        }
    }
})

var fliterinput = Vue.component('fliter-input', {
    template: `<div>
        <template v-if="(fliter.type==1||fliter.type==2||fliter.type==3) && fliter.stringValues==null">
            <el-input  @change="change" v-model.lazy="fliter.string"></el-input>
        </template>
        <template v-else-if="fliter.type==1||fliter.type==2||fliter.type==3">
           <el-autocomplete
               class="inline-input"
               v-model.lazy="fliter.string"
               :fetch-suggestions="querySearch"
               @change.native="change"
               @select="change"
           ></el-autocomplete>
        </template>
        <template v-if="fliter.type==4">
            <el-input 
                v-model.lazy="fliter.minNumber" 
                style='width:43%' 
                @change="change" 
                :placeholder="fliter.minValue"></el-input>
            <i style="display: inline-block;font-size: 13px">~</i>
            <el-input 
                v-model.lazy="fliter.maxNumber" 
                style='width:43%' @change="change" 
                :placeholder="fliter.maxValue"></el-input>
        </template>
</div>`,
    props: ['fliter'],
    data: function () {
        if (this.fliter.stringValues) {
            var list = [];
            for (i in this.fliter.stringValues) {
                list.push({
                    value: this.fliter.stringValues[i]
                })
            }
            return {datalist: list};
        } else {
            return {}
        }
    },
    methods: {
        querySearch(queryString, cb) {
            var restaurants = this.datalist;
            var results = queryString ? restaurants.filter(this.createFilter(queryString)) : restaurants;
            cb(results);
        },
        createFilter(queryString) {
            return (restaurant) => {
                return (restaurant.value.indexOf(queryString) >= 0);
            };
        },
        change(){
            console.log(this.fliter.name)
            this.$emit('changeFliter')
        }
    }
})

