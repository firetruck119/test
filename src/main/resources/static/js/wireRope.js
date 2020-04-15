tableData = {
    title: '钢丝绳安全系数校核计算书',
    tables: [
        {
            title: '1.封面内容',
            data: [
                {
                    id: 'no',
                    name: '本机计算书编号',
                    type: 'String',
                }, {
                    id: 'ver',
                    name: '本机版本',
                    type: 'String',
                }, {
                    id: 'xmmc',
                    name: '项目名称',
                    type: 'String',
                }, {
                    id: 'zjxh',
                    name: '主机型号',
                    type: 'String',
                }, {
                    id: 'jsr',
                    name: '计算人',
                    type: 'String',
                }, {
                    id: 'shr',
                    name: '审核人',
                    type: 'String',
                }, {
                    id: 'pzr',
                    name: '批准人',
                    type: 'String',
                }, {
                    id: 'date',
                    name: '计算日期',
                    type: 'String',
                }
            ]
        }, {
            title: '2.封面内容',
            data: [
                {
                    name: '起升高度',
                    id: 'h',
                    no: 'h',
                    unit: 'm',
                    type: 'number'
                },
                {
                    name: '吊船自重',
                    id: 'swp',
                    no: 'S<sub>wp</sub>',
                    unit: 'kg',
                    type: 'number'
                },
                {
                    name: '吊船额定载荷',
                    id: 'r1',
                    no: 'R<sub>1</sub>',
                    unit: 'kg',
                    type: 'number'
                },
                {
                    name: '吊船钢丝绳自重',
                    id: 'mwr',
                    no: 'M<sub>wr</sub>',
                    unit: 'kg',
                    type: 'number'
                },
                {
                    name: '总悬挂载荷',
                    id: 'tsl',
                    no: 'T<sub>sl</sub>',
                    unit: 'kg',
                    type: 'number'
                },
                {
                    name: '物料起升机构额定载重量',
                    id: 'hwll',
                    no: 'H<sub>wll</sub>',
                    unit: 'kg',
                    type: 'number'
                },
                {
                    name: '物料起升机构钢丝绳自重',
                    id: 'hsw',
                    no: 'H<sub>sw</sub>',
                    unit: 'kg',
                    type: 'number'
                },
                {
                    name: '物料起升机构总悬挂载荷',
                    id: 'tshl',
                    no: 'T<sub>shl</sub>',
                    unit: 'kg',
                    type: 'number'
                },
            ]
        }, {
            title: '3.封面内容',
            select: [
                {
                    name: '吊船钢丝绳型号选择',
                    id: 'dcgssxhSelect',
                    type: 'select',
                    options:[1,2,3,4,5,7],
                },
                {
                    name: '物料起升机构钢丝绳型号选择',
                    id: 'grugssxhSelect',
                    type: 'select',
                    options:[1,2,3,4,5,7],
                },
            ],
            data: [
                {
                    name: '吊船钢丝绳型号',
                    id: 'dcgssxh',
                    no: '',
                    unit: '',
                    type: 'String'
                },
                {
                    name: '吊船钢丝绳直径',
                    id: 'dcgssd',
                    no: 'd<sub>1</sub>',
                    unit: 'mm',
                    type: 'number'
                },
                {
                    name: '吊船钢丝绳数量',
                    id: 'dcgssn',
                    no: 'N<sub>1</sub>',
                    unit: '根',
                    type: 'number'
                },
                {
                    name: '单根吊船钢丝绳最小破断拉力',
                    id: 'dcgssf',
                    no: 'F<sub>1</sub>',
                    unit: 'kN',
                    type: 'number'
                },
                {
                    name: '单根吊船钢丝绳每米重量',
                    id: 'dcgssp',
                    no: 'ρ<sub>1</sub>',
                    unit: 'kg/m',
                    type: 'number'
                },
                {
                    name: '物料起升机构钢丝绳型号',
                    id: 'grugssxh',
                    no: '',
                    unit: '',
                    type: 'String'
                },
                {
                    name: '物料起升机构钢丝绳直径',
                    id: 'grugssd',
                    no: 'd<sub>2</sub>',
                    unit: 'mm',
                    type: 'number'
                },
                {
                    name: '物料起升机构钢丝绳数量',
                    id: 'grugssn',
                    no: 'N<sub>2</sub>',
                    unit: '根',
                    type: 'number'
                },
                {
                    name: '单根物料起升机构钢丝绳最小破断拉力',
                    id: 'grugssf',
                    no: 'F<sub>2</sub>',
                    unit: 'kN',
                    type: 'number'
                },
                {
                    name: '单根物料起升机构钢丝绳每米重量',
                    id: 'grugssp',
                    no: 'ρ<sub>2</sub>',
                    unit: 'kg/m',
                    type: 'number'
                }

            ]
        },
    ]
};

computedList = {
    'mwr': function () {
        return data.h * data.dcgssp * data.dcgssn;
    },
    'tsl': function () {
        return data.swp + data.r1 + data.mwr;
    },

    'hsw': function () {
        return data.h * data.grugssp * data.grugssn;
    },
    'tshl': function () {
        return data.hwll + data.hsw;
    },
};

buttons={
    checkButtons:{
        "check":{
            name:"检查",
        }
    },
    submitButtons:{
        "input":{
            name:"输出pdf",
            url:'/getpdf/ch'
        }
    }
};

(function () {
    if (!window.htmlData) {
        window.htmlData = {};
    }
    Object.assign(htmlData, {tableData: tableData});
    (function (tables) {
        var l = {};
        var i = {};
        var watch = {};
        for (var index in tables) {
            var tableColumns = tables[index].data;

            if(tables[index].select)
            tableColumns=tableColumns.concat(tables[index].select);
            for (var column in tableColumns) {
                var id = tableColumns[column].id;
                var value = tableColumns[column].value;
                var type = tableColumns[column].type;
                if (value) {
                    l[id] = value;
                } else {
                    l[id] = undefined;
                }
                i[id] = {};
                i[id]['type'] = type;
                i[id]['color'] = "white";
                i[id]['disabled'] = false;
            }
        }
        window.watch = watch;
        window.data = l;
        window.dataInForm = i;
    })(tableData.tables);


    (function () {
        template = '<div>';
        for (var a in computedList) {
            template += "<input type='hidden' v-model='" + a + "$'>\n";
        }
        template += '</div>';
        new Vue({
            el: '#calculatBox',
            template: '<div id="pdf"><span v-html="template"></span></div>',
            data: {template: template},
        });
    })();
    Object.assign(htmlData, {form: window.data});
    Object.assign(htmlData, {cssInForm: window.dataInForm});
})();

(function () {
    if (!window.computed) {
        window.computed = {};
    }
    for (var key in computedList) {
        window.computed[key + "$"] = (function () {
            var temp = key;
            var fun = computedList[key];
            return function () {
                var value = fun();
                if (["NaN", 'undefined', 'null'].indexOf(String(value))) {
                    if (typeof value == dataInForm[temp]['type']) {
                        data[temp] = value;
                        dataInForm[temp]['color'] = "grey";
                    }
                }
            }
        })();
    }
})();

(function(){
    Object.assign(htmlData, {buttons: buttons});
})();