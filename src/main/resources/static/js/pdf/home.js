
new Vue({
        el:'#asideMune',
    template: '                            <el-menu\n' +
        '                                    class="el-menu-demo"\n' +
        '                                    @open="openHandle"\n' +
        '                                    @close="closeHandle"\n' +
        '                                    background-color=\'#545c64\'\n' +
        '                                    text-color="#fff"\n' +
        '                                    active-text-color="#ffd04b">\n' +
        '                                <template v-for="e in asideData">\n' +
        '                                    <el-submenu :index="e.title" v-if="e.children">\n' +
        '                                        <template slot="title">{{e.title}}</template>\n' +
        '                                        <template v-for="index in e.children">\n' +
        '                                            <el-submenu :index="index.title" v-if="index.children">\n' +
        '                                                <template slot="title">{{index.title}}</template>\n' +
        '                                                <template v-for="subindex in index.children">\n' +
        '                                                    <el-menu-item :index="subindex.title">{{subindex.title}}\n' +
        '                                                    </el-menu-item>\n' +
        '                                                </template>\n' +
        '                                            </el-submenu>\n' +
        '                                            <el-menu-item v-else>\n' +
        '                                                <span slot="title" :index="index.title">{{index.title}}</span>\n' +
        '                                            </el-menu-item>\n' +
        '                                        </template>\n' +
        '                                    </el-submenu>\n' +
        '                                    <el-menu-item v-else>\n' +
        '                                        <span slot="title" :index="e.title">{{e.title}}</span>\n' +
        '                                    </el-menu-item>\n' +
        '                                </template>\n' +
        '                            </el-menu>',
    data: function () {
        return {
            asideData: [
                {
                    title: '整机计算书',
                    children: [
                        {
                            title: '稳定性校核及轮压计算书',
                            children: [
                                {
                                    title: '下回转固定臂'
                                },
                                {
                                    title: '下回转伸缩臂'
                                },
                                {
                                    title: '上回转固定臂'
                                },
                                {
                                    title: '双臂机'
                                },
                                {
                                    title: '附墙机'
                                }
                            ]
                        },
                        {
                            title: '清洗周期'
                        },
                        {
                            title: '操作说明书'
                        },
                        {
                            title: '吊装方案'
                        },
                    ]
                },
                {
                    title: '轨道埋件',
                    children: [
                        {
                            title: '轨道校核计算书',
                            children: [
                                {
                                    title: '水平轨道校核计算书'
                                },
                                {
                                    title: '悬挂H/工字钢轨道校核计算书'
                                },
                                {
                                    title: '菱形轨道校核计算书'
                                },
                                {
                                    title: '铝合金、钢制C型轨道计算书'
                                },
                            ]
                        },
                        {
                            title: '抗拉埋件计算书',
                        },
                        {
                            title: '抗压埋件计算书',
                        },
                        {
                            title: '膨胀螺栓校核计算书',
                        },
                        {
                            title: '化学锚栓校核计算书',
                        },
                    ]
                },
                {
                    title: '防风销座校核计算书',
                    children: [
                        {
                            title: 'T型防风销座',
                        },
                        {
                            title: '平板型防风销座',
                        },
                        {
                            title: '螺栓头型防风销座',
                        },
                    ]
                },
                {
                    title: '结构强度计算',
                    children: [
                        {
                            title: '大臂强度校核计算书',
                            children: [
                                {
                                    title: '固定臂',
                                },
                                {
                                    title: '伸缩臂1+1',
                                },
                                {
                                    title: '伸缩臂2+1',
                                },
                                {
                                    title: '伸缩臂3+1',
                                },
                                {
                                    title: '伸缩臂4+1',
                                },
                            ]
                        },
                        {
                            title: '立柱强度校核计算书',
                            children: [
                                {title: '固定立柱'},
                                {title: '顶升立柱1+1'},
                                {title: '顶升立柱2+1'},
                            ]
                        },
                        {
                            title: '结构疲劳寿命计算书',
                        },
                        {
                            title: '结构腐蚀寿命计算书',
                        },
                        {
                            title: '吊杆强度计算书'
                        },
                    ]
                },
                {
                    title: '液压系统计算书',
                    children: [
                        {title: '顶升立柱液压系统计算及顶轮接触应力计算书'},
                        {title: '液压系统电机功率、油箱容积等计算'},
                        {title: '仰臂液压缸计算书'},
                        {title: '仰柱液压缸计算书'},
                    ]
                },
                {
                    title: '擦窗机配套件计算书',
                    children: [
                        {title: '钢丝绳安全系数校核计算书',},
                        {title: '回转电机校核计算书',},
                        {title: '回转支承校核计算书',},
                    ]
                },
                {
                    title: '成本计算书',
                    children: [
                        {title: '固定臂机'},
                        {title: '伸缩臂机'},
                        {title: '双臂机'},
                        {title: '附墙机'},
                    ]
                },
                {
                    title: '设计图纸',
                    children: [
                        {title: '底架',},
                        {title: '立柱',},
                        {title: '大臂',},
                        {title: '配重',},
                        {title: '爬梯',},
                        {title: '吊杆',},
                        {title: 'CDD吊篮',},
                        {title: '滑车',},
                    ]
                },
            ]
        }
    },
    methods: {
        openHandle: function () {
            console.log('open');
        },
        closeHandle: function () {
            console.log('close');
        }
    }
})


new Vue({
    el:'#head',
    template:' <el-row :gutter="20">\n' +
        '                <el-col :span="19"><h1>{{title}}</h1></el-col>\n' +
        '                <el-col :span="5" style="text-align: center">\n' +
        '                    <el-row>\n' +
        // '                        <el-button type="info" plain round>用户管理</el-button>\n' +
        // '                        <el-button type="info" plain round>用户退出</el-button>\n' +
        '                    </el-row>\n' +
        '                </el-col>\n' +
        '            </el-row>\n',
    // el:'#headerBox',
    data: function(){return {
        title: 'this is home',
        userBox: {}
    }}
})