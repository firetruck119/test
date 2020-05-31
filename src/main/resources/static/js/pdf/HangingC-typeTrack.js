window.tabledata = {
    title: '单臂机大臂校核',
    tables: [{
        title: '1.封面内容',
        datas: [
            {
                id: 'no',
                name: '本机计算书编号',
                type: 'string',
            }, {
                id: 'ver',
                name: '本机版本',
                type: 'string',
            }, {
                id: 'xmmc',
                name: '项目名称',
                type: 'string',
            }, {
                id: 'zjxh',
                name: '主机型号',
                type: 'string',
            }, {
                id: 'jsr',
                name: '计算人',
                type: 'string',
            }, {
                id: 'shr',
                name: '审核人',
                type: 'string',
            }, {
                id: 'pzr',
                name: '批准人',
                type: 'string',
            }, {
                id: 'date',
                name: '计算日期',
                type: 'string',
            }
        ]
    },
        {
            title: '2.起升高度',
            datas: [
                {
                    id: 'h',
                    name: '起升高度',
                    no: 'H',
                    unit: 'm',
                    type: 'number'
                },
            ]
        },
        {
            title: '3.工作臂长',
            datas: [
                {
                    id: 'lbd',
                    name: '最大臂长',
                    no: '',
                    unit: 'm',
                    type: 'number'
                },
            ]
        },
        {
            title: '4.基臂相关参数',
            image: [
                {
                    name: 'jbtu',
                }
            ],
            datas: [
                {
                    name: '单臂机基臂选择',
                    id: 'singleBaseArm',
                    type: 'select',
                    option: {
                        "DB(200*300)": {
                            value: 'DB(200*300)',
                            jbh: 310,
                            h: 310,
                            jbb: 200,
                            jbwx: 895225,
                            jbwy: 689846,
                            jbix: 157338444,
                            jbiix: 117.3,
                            jbll: 550,
                        },
                        "DB(250*400)": {
                            value: 'DB(250*400)',
                            jbh: 410,
                            h: 410,
                            jbb: 250,
                            jbwx: 1534845,
                            jbwy: 1121961,
                            jbix: 348381883,
                            jbiix: 155.35,
                            jbll: 650,
                        },
                        "DB(300*500)": {
                            value: 'DB(300*500)',
                            jbh: 510,
                            h: 510,
                            jbb: 300,
                            jbwx: 2367438,
                            jbwy: 1726472,
                            jbix: 681913706,
                            jbiix: 194.1,
                            jbll: 800,
                        },
                        "DB(400*600)": {
                            value: 'DB(400*600)',
                            jbh: 610,
                            h: 610,
                            jbb: 400,
                            jbwx: 3706834,
                            jbwy: 2911313,
                            jbix: 1293139600,
                            jbiix: 236.6,
                            jbll: 1000,
                        },
                    }
                },
                {
                    name: "臂头选择",
                    id: "armHead",
                    type: 'select',
                    option: {
                        'YJBT1800D(1.8米羊角臂头-低臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 297,
                            acx1: 0.73,
                        },
                        'YJBT1800Z(1.8米羊角臂头-中臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 305,
                            acx1: 0.77,
                        },
                        'YJBT1800G(1.8米羊角臂头-高臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 330,
                            acx1: 0.95,
                        },
                        'YJBT2300D(2.3米羊角臂头-低臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 302,
                            acx1: 0.73,
                        },
                        'YJBT2300Z(2.3米羊角臂头-中臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 312,
                            acx1: 0.77,
                        },
                        'YJBT2300G(2.3米羊角臂头-高臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 339,
                            acx1: 0.95,
                        },
                        'YJBT2800D(2.8米羊角臂头-低臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 309,
                            acx1: 0.73,
                        },
                        'YJBT2800Z(2.8米羊角臂头-中臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 317,
                            acx1: 0.77,
                        },
                        'YJBT2800G(2.8米羊角臂头-高臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.35 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 344,
                            acx1: 0.95,
                        },
                        'HDBT2300(2.3米蝴蝶臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 1.8 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 554,
                            acx1: 0.72,
                        },
                        'XDBT2300(2.3米下挂臂头)': {
                            jblm: function () {
                                return (css.lbd.value - css.jbll.value / 2000) * 1000;
                            },
                            m1: 208,
                            acx1: 0.41,
                        },
                        'XDBT2500Ф13(2.5米下挂臂头)': {
                            jblm: function () {
                                return (css.lbd.value - css.jbll.value / 2000) * 1000;
                            },
                            m1: 312,
                            acx1: 0.74,
                        },
                        'XDBT3000Ф13(3.0米下挂臂头)': {
                            jblm: function () {
                                return (css.lbd.value - css.jbll.value / 2000) * 1000;
                            },
                            m1: 346,
                            acx1: 0.86,
                        },
                        'DJBT1800(1.8米单角臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 2 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 280,
                            acx1: 0.9,
                        },
                        'DJBT2300(2.3米单角臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 2 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 308,
                            acx1: 1.08,
                        },
                        'DJBT2500Ф13(2.5米单角臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 2.2 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 403,
                            acx1: 1.13,
                        },
                        'DJBT3300(3.3米单角臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 2.5 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 359,
                            acx1: 1.3,
                        },
                        'PBT800(0.8米一字臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 0.4 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 207,
                            acx1: 0.54,
                        },
                        'MHEBT1944(MHE1944臂头)': {
                            jblm: function () {
                                return (css.lbd.value - 0.4 - css.jbll.value / 2000) * 1000;
                            },
                            m1: 235,
                            acx1: 0.7,
                        },
                        '无': {
                            jblm: function () {
                                return (css.lbd.value - css.jbll.value / 2000) * 1000;
                            },
                            m1: 0,
                            acx1: 0,
                        },
                    }
                },
                {
                    id: 'jbgcph',
                    name: '基臂钢材牌号',
                    no: '',
                    unit: '',
                    type: 'string',
                    value: 'Q345B'
                },
                {
                    id: 'jbss',
                    name: '基臂材料屈服强度',
                    no: 'σs',
                    unit: 'N/mm2',
                    type: 'number',
                    value: 345
                },
                {
                    id: 'jbh',
                    name: '基臂前支撑点处截面高度',
                    no: 'h',
                    unit: 'mm',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbh');
                    }
                },
                {
                    id: 'jbb',
                    name: '基臂前支撑点处截面宽度',
                    no: 'b',
                    unit: 'mm',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbb');
                    }
                },
                {
                    id: 'jbe',
                    name: '基臂前支撑点处截面板厚度',
                    no: 'e',
                    unit: 'mm',
                    type: 'number',
                    value: 10
                },
                {
                    id: 'jbwx',
                    name: '基臂前支撑点处截面X向抗弯模量',
                    no: 'Wx',
                    unit: 'mm3',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbwx');
                    }
                },
                {
                    id: 'jbwy',
                    name: '基臂前支撑点处截面Y向抗弯模量',
                    no: 'Wy',
                    unit: 'mm3',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbwy');
                    }
                },
                {
                    id: 'jbix',
                    name: '基臂前支撑点处截面X向惯性矩',
                    no: 'Ix',
                    unit: 'mm4',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbix');
                    }
                },
                {
                    id: 'jbiix',
                    name: '基臂前支撑点处截面X向惯性半径',
                    no: 'ix',
                    unit: 'mm',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbiix');
                    }
                },
                {
                    id: 'jblm',
                    name: '基臂前支撑点前部长度',
                    no: 'Lm',
                    unit: 'mm',
                    type: 'number',
                    computed() {
                        return getOptionValue("armHead", 'jblm');
                    }
                },
                {
                    id: 'jbll',
                    name: '基臂前后支撑点间距',
                    no: 'Ll',
                    unit: 'mm',
                    type: 'number',
                    computed() {
                        return getOptionValue("singleBaseArm", 'jbll');
                    }
                },

            ]
        },
        {
            title: '5.根据λ查表得',
            datas: [
                {
                    id: 'jbw',
                    name: 'ω值',
                    no: 'ω',
                    unit: '',
                    type: 'string'
                }, {
                    id: 'k',
                    name: '长细比λ',
                    no: 'λ',
                    unit: '',
                    type: 'string',
                    computed() {
                        return css.jblm.value / css.jbiix.value;
                    }
                },
            ]
        },
        {
            title: '6.基臂前支撑点前部载荷',
            datas: [
                {
                    name: '吊船选择',
                    id: 'ship',
                    type: 'select',
                    option: {
                        '2.0米铝吊船': {
                            swp: 96, aslcx: 3.02,
                        },
                        '2.5米铝吊船': {
                            swp: 105, aslcx: 3.6,
                        },
                        '3.0米铝吊船': {
                            swp: 115, aslcx: 4.18,
                        },
                        '4.0米铝吊船': {
                            swp: 135, aslcx: 5.34,
                        },
                        '1.5米卫星吊船': {
                            swp: 577, aslcx: 3.94,
                        },
                        '2.0米卫星吊船': {
                            swp: 650, aslcx: 3.94,
                        },
                        '1.5米手动丝杠伸展吊船': {
                            swp: 585, aslcx: 3.15,
                        },
                        '2.0米手动丝杠伸展吊船': {
                            swp: 619, aslcx: 3.73,
                        },
                        '2.5米手动丝杠伸展吊船': {
                            swp: 634, aslcx: 4.31,
                        },
                        '3.0米手动丝杠伸展吊船': {
                            swp: 683, aslcx: 4.89,
                        },
                        '2.0米液压伸展吊船': {
                            swp: 624, aslcx: 3.78,
                        },
                        '2.0米液压伸展吊船(2.0 - 2.3)': {
                            swp: 651, aslcx: 4.36,
                        },
                        '2.5米液压伸展吊船': {
                            swp: 675, aslcx: 3.91,
                        },
                        '3.0米液压伸展吊船': {
                            swp: 696, aslcx: 4.03,
                        },
                        '3.5米液压伸展吊船': {
                            swp: 720, aslcx: 4.15,
                        },
                        '2.0米折叠吊船': {
                            swp: 116, aslcx: 3.02,
                        },
                        '2.5米折叠吊船': {
                            swp: 124, aslcx: 3.6,
                        },
                        '2.0米折弯吊船': {
                            swp: 120, aslcx: 3.02,
                        },
                        '2.5米折弯吊船': {
                            swp: 133, aslcx: 3.6,
                        },
                        '3.0米折弯吊船': {
                            swp: 155, aslcx: 4.18,
                        },
                        '2.5米伸缩子吊船': {
                            swp: 1140, aslcx: 6.18,
                        },
                        '2.0米CDD吊船': {
                            swp: 350, aslcx: 2.79,
                        },
                        '2.5米CDD吊船': {
                            swp: 375, aslcx: 3,
                        },
                        '3.0米CDD吊船': {
                            swp: 400, aslcx: 3.2,
                        },
                        '4.0米CDD吊船': {
                            swp: 450, aslcx: 3.6,
                        },
                        '无': {
                            swp: 0, aslcx: 0,
                        },
                    }
                },
                {
                    name: '是否有防风背包',
                    id: 'windproofBackpack',
                    type: 'select',
                    option: {
                        '有': {},
                        '无': {},
                    },
                    computed() {
                        if (css.ship.value == '无')
                            return {
                                value: '无',
                                disabled: true,
                            };
                        else {
                            return {
                                value: '',
                                disabled: false,
                            };
                        }
                    }
                },
                {
                    name: '起升机构选择',
                    id: 'liftingMechanism',
                    type: 'select',
                    option: {
                        '105起升机构': {
                            mwr() {
                                return 0.179 * css.h.value * 4;
                            }
                        },
                        '145起升机构': {
                            mwr() {
                                return 0.179 * css.h.value * 4;
                            }
                        },
                        '175起升机构': {
                            mwr() {
                                return 0.179 * css.h.value * 4;
                            }
                        },
                        '275起升机构': {
                            mwr() {
                                return 0.179 * css.h.value * 4;
                            }
                        },
                        '185起升机构': {
                            mwr() {
                                return 0.244 * css.h.value * 4;
                            }
                        },
                        '285起升机构': {
                            mwr() {
                                return 0.244 * css.h.value * 4;
                            }
                        },
                        '385起升机构': {
                            mwr() {
                                return 0.244 * css.h.value * 4;
                            }
                        },
                        '295起升机构': {
                            mwr() {
                                return 0.391 * css.h.value * 4;
                            }
                        },
                        '495起升机构': {
                            mwr() {
                                return 0.391 * css.h.value * 4;
                            }
                        },
                        '313起升机构': {
                            mwr() {
                                return 0.65 * css.h.value * 4;
                            }
                        },
                        '无': {
                            mwr() {
                                return 0;
                            }
                        },

                    }
                }, {
                    name: 'gru选择',
                    id: 'gru',
                    type: 'select',
                    option: {
                        'gru 285': {},
                        'gru 295': {},
                        'gru 313': {},
                        '无': {},
                    }
                }, {
                    name: 'gru装置在基臂前支撑前或后',
                    id: 'gruFrontOrAfter',
                    type: 'select',
                    option: {
                        'gru装置在基臂前支撑前': {},
                        'gru装置在基臂前支撑后': {},
                    },
                    computed() {
                        if (css.gru.value == '无') {
                            return {
                                disabled: true
                            }
                        } else {
                            return {
                                disabled: false
                            }
                        }
                    }
                },
                {
                    name: '吊船自重',
                    id: 'swp',
                    no: 'Swp',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return getOptionValue('ship', 'swp');
                    },
                },
                {
                    name: '吊船额定载重量',
                    id: 'r1',
                    no: 'R1',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        if (css.ship.value) {
                            if (css.ship.value == '无')
                                return 0;
                            else (css.ship.value != '无')
                            return 250;
                        }
                    },
                },
                {
                    name: '吊船钢丝绳自重',
                    id: 'mwr',
                    no: 'Mwr',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return getOptionValue('liftingMechanism', 'mwr');
                    },
                },
                {
                    name: '防风背包自重',
                    id: 'mffbb',
                    no: 'mffbb',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return css.windproofBackpack.value ?
                            (css.windproofBackpack.value == '有' ? 100 : 0)
                            : '';
                    }
                },
                {
                    name: '总悬挂载荷',
                    id: 'tsl',
                    no: 'Tsl',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return css.swp.value + css.r1.value + css.mwr.value + css.mffbb.value;
                    }
                },
                {
                    name: '物料起升机构额定载重量',
                    id: 'hwll',
                    no: 'Hwll',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return css.gru.value ? (css.gru.value == '无' ? 0 : '') : '';
                    }
                },
                {
                    name: '物料起升机构钢丝绳自重',
                    id: 'hsw',
                    no: 'Hsw',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        switch (css.gru.value) {
                            case'gru 285':
                                return 0.252 * css.h.value;
                            case'gru 295':
                                return 0.391 * css.h.value;
                            case'gru 313':
                                return 0.65 * css.h.value;
                            case'无':
                                return 0;
                        }
                    }
                },
                {
                    name: '物料起升机构总悬挂载荷',
                    id: 'tshl',
                    no: 'Tshl',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return css.hwll.value + css.hsw.value;
                    }
                },
                {
                    name: '臂头自重',
                    id: 'm1',
                    no: 'm1',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return getOptionValue('armHead', 'm1');
                    },
                },
                {
                    name: '物料起升机构导绳架自重',
                    id: 'm2',
                    no: 'm2',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return css.gru.value ? (css.gru.value == '无' ? 0 : 50) : '';
                    }
                },
                {
                    name: '安全绳',
                    id: 'm3',
                    no: 'm3',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        return 0.203 * css.h.value;
                    }
                },
                {
                    name: '基臂前支撑点前部自重',
                    id: 'm4jbcq',
                    no: 'm4',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        switch (css.singleBaseArm.value) {
                            case 'DB(200*300)':
                                return css.jblm.value / 1000 * 93.85;
                            case 'DB(250*400)':
                                return css.jblm.value / 1000 * 115.65;
                            case 'DB(300*500)':
                                return 698 + (css.jblm.value / 1000 - 6.5) * 156.64;
                            case 'DB(400*600)':
                                return 811 + (css.jblm.value / 1000 - 6.5) * 206.96;
                        }
                    }
                },
                {
                    name: '物料起升机构装置自重',
                    id: 'm5',
                    no: 'm5',
                    unit: 'kg',
                    type: 'number',
                    computed() {
                        if (css.gruFrontOrAfter.value == 'gru装置在基臂前支撑后') {
                            return 0;
                        } else if (css.gruFrontOrAfter.value == 'gru装置在基臂前支撑前') {
                            switch (css.gru.value) {
                                case 'gru 285':
                                    return 235;
                                case 'gru 295':
                                    return 285;
                                case 'gru 313':
                                    return 385;
                            }
                        }
                    }
                },
            ]
        },
        {
            title: '7.基臂前支撑点前部载荷重心至基臂前支撑点距离',
            datas: [
                {
                    name: '总悬挂载荷重心至基臂前支撑点距离',
                    no: 'Lslc',
                    id: 'lslc',
                    unit: 'm',
                    type: "number",
                    computed() {
                        return css.lbd.value - (css.jbll.value / 2000);
                    }
                },
                {
                    name: '物料起升机构总悬挂载荷重心至基臂前支撑点距离',
                    no: 'Lshlc',
                    id: 'lshlc',
                    unit: 'm',
                    type: "number",
                    computed() {
                        switch (css.armHead.value) {
                            case 'YJBT1800D(1.8米羊角臂头-低臂头)':
                            case 'YJBT1800Z(1.8米羊角臂头-中臂头)':
                            case 'YJBT1800G(1.8米羊角臂头-高臂头)':
                            case 'YJBT2300D(2.3米羊角臂头-低臂头)':
                            case 'YJBT2300Z(2.3米羊角臂头-中臂头)':
                            case 'YJBT2300G(2.3米羊角臂头-高臂头)':
                            case 'YJBT2800D(2.8米羊角臂头-低臂头)':
                            case 'YJBT2800Z(2.8米羊角臂头-中臂头)':
                            case 'YJBT2800G(2.8米羊角臂头-高臂头)':
                                return css.jblm.value / 1000 + 0.55;
                            case 'HDBT2300(2.3米蝴蝶臂头)':
                                return css.jblm.value / 1000 + 0.8;
                            case 'XDBT2300(2.3米下挂臂头)':
                            case 'XDBT2500Ф13(2.5米下挂臂头)':
                            case 'XDBT3000Ф13(3.0米下挂臂头)':
                            case '无':
                                return css.jblm.value / 1000;
                            case 'DJBT1800(1.8米单角臂头)':
                                return css.jblm.value / 1000 + 0.8;
                            case 'DJBT2300(2.3米单角臂头)':
                                return css.jblm.value / 1000 + 0.9;
                            case 'DJBT2500(2.5米单角臂头)':
                                return css.jblm.value / 1000 + 1.6;
                            case 'DJBT3300(3.3米单角臂头)':
                                return css.jblm.value / 1000 + 1.2;
                            case 'PBT800(0.8米一字臂头)' :
                            case 'MHEBT1944(MHE1944臂头)':
                                return css.jblm.value / 1000 +0.4;
                        }

                    }
                },
                {
                    name: '臂头重心至基臂前支撑点距离',
                    no: 'Lc1',
                    id: 'lc1',
                    unit: 'm',
                    type: "number",
                    computed() {
                        return css.lshlc.value;
                    }
                },
                {
                    name: '物料起升机构导绳架重心至基臂前支撑点距离',
                    no: 'Lc2',
                    id: 'lc2',
                    unit: '',
                    type: "number",
                    computed() {
                        if (String(css.m2.value) == '0') {
                            return 0;
                        } else {
                            switch (css.armHead.value) {
                                case 'YJBT1800D(1.8米羊角臂头-低臂头)':
                                case 'YJBT1800Z(1.8米羊角臂头-中臂头)':
                                case 'YJBT1800G(1.8米羊角臂头-高臂头)':
                                case 'YJBT2300D(2.3米羊角臂头-低臂头)':
                                case 'YJBT2300Z(2.3米羊角臂头-中臂头)':
                                case 'YJBT2300G(2.3米羊角臂头-高臂头)':
                                case 'YJBT2800D(2.8米羊角臂头-低臂头)':
                                case 'YJBT2800Z(2.8米羊角臂头-中臂头)':
                                case 'YJBT2800G(2.8米羊角臂头-高臂头)':
                                    return css.jblm.value / 1000 + 0.35;
                                case 'HDBT2300(2.3米蝴蝶臂头)':
                                    return css.jblm.value / 1000 + 0.8;
                                case 'XDBT2300(2.3米下挂臂头)':
                                case 'XDBT2500Ф13(2.5米下挂臂头)':
                                case 'XDBT3000Ф13(3.0米下挂臂头)':
                                case '无':
                                    return css.jblm.value / 1000;
                                case 'DJBT1800(1.8米单角臂头)':
                                case 'DJBT2300(2.3米单角臂头)':
                                    return css.jblm.value / 1000 + 2;
                                case 'DJBT2500(2.5米单角臂头)':
                                    return css.jblm.value / 1000 + 2.2;
                                case 'DJBT3300(3.3米单角臂头)':
                                    return css.jblm.value / 1000 + 2.5;
                                case 'PBT800(0.8米一字臂头)' :
                                case 'MHEBT1944(MHE1944臂头)':
                                    return css.jblm.value / 1000;
                            }
                        }
                    }
                },
                {
                    name: '安全绳重心至基臂前支撑点距离',
                    no: 'Lc3',
                    id: 'lc3',
                    unit: 'm',
                    type: "number",
                    computed() {
                        return css.lshlc.value;
                    }
                },
                {
                    name: '基臂前支撑点前部自重重心至基臂前支撑点距离',
                    no: 'Lc4',
                    id: 'lc4',
                    unit: 'm',
                    type: "number",
                    computed() {
                        switch (css.singleBaseArm.value) {
                            case 'DB(200*300)':
                            case 'DB(250*400)':
                                return css.jblm.value / 2000;
                            case 'DB(300*500)':
                                return (698 * (css.jblm.value - 3457) / 1000 + (css.jblm.value - 6500) * 156.64 * (css.jblm.value - 6500) / 2000000) / css.m4jbcq.value
                            case 'DB(400*600)':
                                return (811 * (css.jblm.value - 3575) / 1000 + (css.jblm.value - 6500) * 206.96 * (css.jblm.value - 6500) / 2000000) / css.m4jbcq.value;
                        }
                    }
                },
                {
                    name: '物料起升机构装置自重重心至基臂前支撑点距离',
                    no: 'Lc5',
                    id: 'lc5',
                    unit: 'm',
                    type: "number",
                    computed() {
                        return css.m5.value == 0 ? 0 : '';
                    }
                },

            ]
        },
        {
            title: '8.基臂前支撑点前部迎风面积',
            datas: [
                {
                    name: '总悬挂载荷迎风面积',
                    id: 'aslcx',
                    no: 'Asl',
                    unit: 'm2',
                    type: 'number',
                    computed() {
                        return getOptionValue('ship', 'aslcx');
                    }
                },
                {
                    name: '物料起升机构总悬挂载荷迎风面积',
                    id: 'ashlcx',
                    no: 'Ashl',
                    unit: 'm2',
                    type: 'number'
                },
                {
                    name: '臂头迎风面积',
                    id: 'acx1',
                    no: 'A1',
                    unit: 'm2',
                    type: 'number',
                    computed() {
                        return getOptionValue('armHead', 'acx1');
                    }
                },
                {
                    name: '物料起升机构导绳架迎风面积',
                    id: 'acx2',
                    no: 'A2',
                    unit: '',
                    type: 'number',
                    computed() {
                        return String(css.m2.value) == "0" ? 0 : (css.m2.value ? 0.1 : undefined);
                    }
                },
                {
                    name: '安全绳迎风面积',
                    id: 'acx3',
                    no: 'A3',
                    unit: 'm2',
                    type: 'number'
                },
                {
                    name: '基臂前支撑点前部自重迎风面积',
                    id: 'acx4cq',
                    no: 'A4',
                    unit: 'm2',
                    type: 'number',
                    computed() {
                        switch (css.singleBaseArm.value) {
                            case 'DB(200*300)':
                                return 0.31 * css.jblm.value / 1000;
                            case 'DB(250*400)':
                                return 0.41 * css.jblm.value / 1000;
                            case 'DB(300*500)':
                                return 2.49 + 0.51 * (css.jblm.value / 1000 - 6.5);
                            case 'DB(400*600)':
                                return 2.84 + 0.61 * (css.jblm.value / 1000 - 6.5);
                        }
                    }
                },
                {
                    name: '物料起升机构装置迎风面积',
                    id: 'acx5',
                    no: 'A5',
                    unit: 'm2',
                    type: 'number',
                    computed() {
                        if (css.m5.value == 0) {
                            return 0;
                        } else if (css.m5.value) {
                            switch (css.gru.value) {
                                case 'gru 285':
                                    return 0.42;
                                case 'gru 295':
                                    return 0.5;
                                case 'gru 313':
                                    return 0.62;
                            }
                        }
                    }
                },
            ]
        },
        {
            title: '9.基臂前支撑点前部载荷面心至基臂前支撑点距离',
            datas: [
                {
                    name: '总悬挂载荷面心至基臂前支撑点距离',
                    id: 'lslx',
                    no: 'Lslx',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lslc.value;
                    }

                },
                {
                    name: '物料起升机构总悬挂载荷面心至基臂前支撑点距离',
                    id: 'lshlx',
                    no: 'Lshlx',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lshlc.value;
                    }

                },
                {
                    name: '臂头面心至基臂前支撑点距离',
                    id: 'lx1',
                    no: 'Lx1',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc1.value;
                    }

                },
                {
                    name: '物料起升机构导绳架面心至基臂前支撑点距离',
                    id: 'lx2',
                    no: 'Lx2',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc2.value;
                    }

                },
                {
                    name: '安全绳面心至基臂前支撑点距离',
                    id: 'lx3',
                    no: 'Lx3',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc3.value;
                    }

                },
                {
                    name: '基臂前支撑点前部自重面心至基臂前支撑点距离',
                    id: 'lx4',
                    no: 'Lx4',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc4.value;
                    }
                },
                {
                    name: '物料起升机构装置面心至基臂前支撑点距离',
                    id: 'lx5',
                    no: 'Lx5',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc5.value;
                    }
                },
            ]
        },
        {
            title: '10.基臂外部载荷重心至基臂前端距离',
            datas: [
                {
                    name: '总悬挂载荷重心至基臂前端距离',
                    id: 'lslwq',
                    no: 'Lslwq',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lslc.value - css.jblm.value / 1000;
                    }
                },
                {
                    name: '物料起升机构总悬挂载荷重心至基臂前端距离',
                    id: 'lshlwq',
                    no: 'Lshlwq',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lshlc.value - css.jblm.value / 1000;
                    }
                },
                {
                    name: '臂头重心至基臂前端距离',
                    id: 'lwq1',
                    no: 'Lwq1',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc1.value - css.jblm.value / 1000;
                    }
                },
                {
                    name: '物料起升机构导绳架重心基臂前端距离',
                    id: 'lwq2',
                    no: 'Lwq2',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc2.value - css.jblm.value / 1000;
                    }
                },
                {
                    name: '安全绳重心至基臂前端距离',
                    id: 'lwq3',
                    no: 'Lwq3',
                    unit: 'm',
                    type: 'number',
                    computed() {
                        return css.lc3.value - css.jblm.value / 1000;
                    }
                },

            ]
        },
    ]
};

function handleValue(v) {
    switch (typeof v) {
        case "string":
            return v;
        case "number":
            var t=Math.ceil(v*10000);
            t=t.toString();
            t=t.split('');

    }
}

function getComputed(id, computed) {
    return function () {
        var value = computed();
        if (typeof value == 'object') {
            if (value.disabled != null) {
                css[id].disabled = value.disabled;
            }
            if (!sjht.isPushData) {
                if (value.value) {
                    css[id].value = value.value;
                }
                if (value.color) {
                    css[id].color = value.color;
                } else {
                    css[id].color = 'grey';
                }
            }
        } else {
            if (sjht.isPushData)
                return;
            if (typeof value == 'function')
                value = value();
            if (String(value) == 'NaN' || String(value) == 'null')
                return;
            value = handleValue(value)
            if (value || typeof value == 'number') {
                css[id].value = value;
                css[id].color = "gray";
            } else if (value == "") {
                css[id].color = "white";
            }
        }
    }
}

vm.main.table = tabledata;
(() => {
    window.options = {};
    window.imagelist = {};
    var form = {}, i = {}, l = {}, fun = {}, computedlist = [];
    for (var index in window.tabledata.tables) {
        var tableColumns = window.tabledata.tables[index].datas;
        if (window.tabledata.tables[index].image) {
            var image = window.tabledata.tables[index].image;
            for (j in image) {
                window.imagelist[image[j].name] = {
                    name: image[j].name,
                    filename: image[j].filename
                }
            }
        }
        if (window.tabledata.tables[index].select)
            tableColumns = tableColumns.concat(window.tabledata.tables[index].select);
        for (var column in tableColumns) {
            var id = tableColumns[column].id;
            var value = tableColumns[column].value;
            var type = tableColumns[column].type;
            var computed = tableColumns[column].computed;
            var option = tableColumns[column].option;
            if (value) {
                value = value;
            } else {
                value = undefined;
            }
            l[i] = value;
            i[id] = {
                value: value
            };
            i[id]['type'] = type;
            i[id]['color'] = "white";
            i[id]['disabled'] = false;
            option ? i[id]['option'] = ((o) => {
                var l = [];
                for (index in o) {
                    l.push(index);
                }
                window.options[id] = option;
                return l;
            })(option) : '';
            if (computed) {
                computedlist.push(id);
                fun[id] = getComputed(id, computed);
            }
        }
    }
    window.computedlist = computedlist;
    vm.css = window.css = i;
    window.fun = fun;
})();

(() => {
    var mytemplate = '<div style="display: none">';
    for (i in computedlist) {
        mytemplate += '<input id="' + computedlist[i] + '" v-model="' + computedlist[i] + '"/>';
    }
    mytemplate += '</div>';
    var pdf = Vue.component('pdf', {
        template: '#pdf',
        props: ['main'],
        methods: {
            getPDF(type) {
                var data = new FormData();
                data.append('sjht', sjht.value)
                for (i in css) {
                    value = css[i].value;
                    if (value == undefined)
                        continue;
                    data.append(i, value)
                }
                for (i in imagelist) {
                    value = imagelist[i].filename;
                    if (value == undefined)
                        continue;
                    data.append(i, value)
                }
                axios.post(window.location.href + '/getPDF/' + type, data)
                    .then()
            }
        },
        components: {
            'computedbox': {
                data: (function () {
                    return {
                        data: css,
                    }
                }),
                computed: fun,
                template: mytemplate,
            }
        }
    })
})();