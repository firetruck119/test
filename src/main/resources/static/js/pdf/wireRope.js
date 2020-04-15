tableData = {
    title: '钢丝绳安全系数校核计算书',
    tables: [
        {
            tableTitle: '1.封面内容',
            data: [
                {
                    id: 'no',
                    name: '本机计算书编号',
                    type: 'text',
                }, {
                    id: 'ver',
                    name: '本机版本',
                    type: 'text',
                }, {
                    id: 'xmmc',
                    name: '项目名称',
                    type: 'text',
                }, {
                    id: 'zjxh',
                    name: '主机型号',
                    type: 'text',
                }, {
                    id: 'jsr',
                    name: '计算人',
                    type: 'text',
                }, {
                    id: 'shr',
                    name: '审核人',
                    type: 'text',
                }, {
                    id: 'pzr',
                    name: '批准人',
                    type: 'text',
                }, {
                    id: 'date',
                    name: '计算日期',
                    type: 'text',
                }
            ]
        }, {
            tableTitle: '2.封面内容',
            data: [
                {
                    name: '起升高度',
                    id: 'h',
                    no: 'h',
                    unit: 'm',
                    type: 'text'
                },
                {
                    name: '吊船自重',
                    id: 'swp',
                    no: 'S<sub>wp</sub>',
                    unit: 'kg',
                    type: 'text'
                },
                {
                    name: '吊船额定载荷',
                    id: 'r1',
                    no: 'R<sub>1</sub>',
                    unit: 'kg',
                    type: 'text'
                },
                {
                    name: '吊船钢丝绳自重',
                    id: 'mwr',
                    no: 'M<sub>wr</sub>',
                    unit: 'kg',
                    type: 'text'
                },
                {
                    name: '总悬挂载荷',
                    id: 'tsl',
                    no: 'T<sub>sl</sub>',
                    unit: 'kg',
                    type: 'text'
                },
                {
                    name: '物料起升机构额定载重量',
                    id: 'hwll',
                    no: 'H<sub>wll</sub>',
                    unit: 'kg',
                    type: 'text'
                },
                {
                    name: '物料起升机构钢丝绳自重',
                    id: 'hsw',
                    no: 'H<sub>sw</sub>',
                    unit: 'kg',
                    type: 'text'
                },
                {
                    name: '物料起升机构总悬挂载荷',
                    id: 'tshl',
                    no: 'T<sub>shl</sub>',
                    unit: 'kg',
                    type: 'text'
                },
            ]
        }, {
            tableTitle: '3.封面内容',
            data: [
                {
                    name: '吊船钢丝绳型号',
                    id: 'dcgssxh',
                    no: '',
                    unit: '',
                    type: 'text'
                },
                {
                    name: '吊船钢丝绳直径',
                    id: 'dcgssd',
                    no: 'd<sub>1</sub>',
                    unit: 'mm',
                    type: 'text'
                },
                {
                    name: '吊船钢丝绳数量',
                    id: 'dcgssn',
                    no: 'N<sub>1</sub>',
                    unit: '根',
                    type: 'text'
                },
                {
                    name: '单根吊船钢丝绳最小破断拉力',
                    id: 'dcgssf',
                    no: 'F<sub>1</sub>',
                    unit: 'kN',
                    type: 'text'
                },
                {
                    name: '单根吊船钢丝绳每米重量',
                    id: 'dcgssp',
                    no: 'ρ<sub>1</sub>',
                    unit: 'kg/m',
                    type: 'text'
                },
                {
                    name: '物料起升机构钢丝绳型号',
                    id: 'grugssxh',
                    no: '',
                    unit: '',
                    type: 'text'
                },
                {
                    name: '物料起升机构钢丝绳直径',
                    id: 'grugssd',
                    no: 'd<sub>2</sub>',
                    unit: 'mm',
                    type: 'text'
                },
                {
                    name: '物料起升机构钢丝绳数量',
                    id: 'grugssn',
                    no: 'N<sub>2</sub>',
                    unit: '根',
                    type: 'text'
                },
                {
                    name: '单根物料起升机构钢丝绳最小破断拉力',
                    id: 'grugssf',
                    no: 'F<sub>2</sub>',
                    unit: 'kN',
                    type: 'text'
                },
                {
                    name: '单根物料起升机构钢丝绳每米重量',
                    id: 'grugssp',
                    no: 'ρ<sub>2</sub>',
                    unit: 'kg/m',
                    type: 'text'
                }

            ]
        }, {
            tableTitle: '4.封面内容',
        },
    ]
}
computed = {
    in1: function () {
        data.ver = data.no;
    }
}
