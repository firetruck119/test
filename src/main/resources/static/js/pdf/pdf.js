(function () {
    template =
        '<div id=\'row\'>\n' +
        '    <template>\n' +
        '<el-row :gutter="5">\n' +
        '<h1 class="titltForForm"><el-col :span="24"><el-alert\n' +
        '    :title="tableData.title"\n'+
        '      center'+
        '   :closable="false"'+
        '    type="success"\n' +
        '    effect="light" class="font-size-24">\n' +
        '  </el-alert></el-col></h1>\n'+
        '</el-row >\n'+
        '      <el-row :gutter="5">\n' +
        '        <el-col class=\'marginTop20\' :span="8" v-for=\'table,index in tableData.tables\'>\n' +
        '          <el-card id=\'card\' style=\'padding: 10px\'>\n' +
        '            <div slot="header">\n' +
        '              <h4>{{table.tableTitle}}</h4>\n' +
        '            </div>\n' +
        '            <template v-if=\'index==0\'>\n' +
        '              <el-table :data="table.data" border style="width: 100%" > \n' +
        '                <el-table-column prop="name" label="内容" width=""></el-table-column>\n' +
        '                <el-table-column label=\'123\' width="300">\n' +
        '                  <template slot-scope="scope">\n' +
        '                    <el-input v-model="data[scope.row.id]"></el-input>\n' +
        '                  </template>\n' +
        '                </el-table-column>\n' +
        '              </el-table>\n' +
        '            </template>\n' +
        '            <template v-else>\n' +
        '              <el-table :data="table.data" border style="width: 100%" :span-method="arraySpanMethod">\n' +
        '                <el-table-column prop="name" label="内容" ></el-table-column>\n' +
        '                <el-table-column label="符号" width=45px" align="center">\n' +
        '                  <template slot-scope="scope">\n' +
        '                    <i><span v-html=\'scope.row.no\'></span></i>\n' +
        '                  </template>\n' +
        '                </el-table-column>\n' +
        '                <el-table-column label=\'123\' width="150px">\n' +
        '                  <template slot-scope="scope">\n' +
        '                    <el-input v-model="data[scope.row.id]"></el-input>\n' +
        '                  </template>\n' +
        '                </el-table-column>\n' +
        '                <el-table-column prop=\'unit\' label=\'单位\' width="55px" align="center"></el-table-column>\n' +
        '              </el-table>\n' +
        '            </template>\n' +
        '          </el-card>\n' +
        '        </el-col>\n' +
        '      </el-row>\n' +
        '    </template>\n' +
        '    <div id=\'computer\'></div>\n' +
        '  </div>'
    new Vue({
        el: '#box',
        template: '<div id="pdf"><span v-html="box"></span></div>',
        data: {
            box: template
        },

    })
})();


window.data = (function () {
    var l = {};
    for (var index in tableData.tables) {
        var tableColumns = tableData.tables[index].data;
        for (var column in tableColumns) {
            var id = tableColumns[column].id;
            var value = tableColumns[column].value;
            if (value)
                l[id] = value;
            else
                l[id] = undefined;
        }
    }
    return l;
})();

(function () {
    template = '<div>';
    for (var a in computed) {
        template += "<input type='hidden' v-model='" + a + "'>\n";
        computed[a] = (function () {
            return computed[a];
        })()
    }
    template += '</div>';
    new Vue({
        el: '#computer',
        template: '<div id="pdf"><span v-html="template"></span></div>',
        data: {template: template},
        computed: computed
    });
})();

new Vue({
    el: '#pdf',
    data: {
        tableData: tableData,
        data: data,
        widthOfTable: {
            c2: ['50%', '50%'],
            c4: ['40%', '10%', '40%', '10%'],
        }
    },
    computed: computed,
    methods: {
        getTable: function (row, col) {
            return this.tableData.tables[(row - 1) * 3 + col - 1];
        }
    }
});
