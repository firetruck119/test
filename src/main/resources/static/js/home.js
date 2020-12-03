asideDatas = {
    asideData: [
        {
            title:'临时功能',
            url:"",
            children:[
                {
                    title:'跳转旧模块(临时)',
                    url:"CleaningCycle",
                },
                {
                    title:'申请临时权限',
                    url:"TempPermission"
                }
            ]
        },

        {
            title: '整机计算书',
            url: "pdf",
            children: [
                {
                    title: '稳定性校核及轮压计算书',
                    url: "pdf",
                    children: [
                        {
                            title: '下回转固定臂',

                        },
                        {
                            title: '下回转伸缩臂',

                        },
                        {
                            title: '上回转固定臂',

                        },
                        {
                            title: '双臂机',

                        },
                        {
                            title: '附墙机',

                        }
                    ]
                },
                {
                    title: '清洗周期',
                    url:'WireRope'
                },
                {
                    title: '操作说明书',

                },
                {
                    title: '吊装方案',

                },
            ]
        },
        {
            title: '轨道埋件',
            url: "pdf",
            children: [
                {
                    title: '轨道校核计算书',
                    url: "pdf",
                    children: [
                        {
                            title: '水平轨道校核计算书',

                        },
                        {
                            title: '悬挂H/工字钢轨道校核计算书',

                        },
                        {
                            title: '菱形轨道校核计算书',

                        },
                        {
                            title: '铝合金、钢制C型轨道计算书',

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
            url: "pdf",
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
            url: "pdf",
            children: [
                {
                    title: '大臂强度校核计算书',
                    url: "pdf",
                    children: [
                        {
                            title: '固定臂',

                        },
                        {
                            title: '伸缩臂1+1',
                            url:'OneJib'
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
                    url: "pdf",
                    children: [
                        {
                            title: '固定立柱',

                        },
                        {
                            title: '顶升立柱1+1',

                        },
                        {
                            title: '顶升立柱2+1',

                        },
                    ]
                },
                {
                    title: '结构疲劳寿命计算书',

                },
                {
                    title: '结构腐蚀寿命计算书',

                },
                {
                    title: '吊杆强度计算书',

                },
            ]
        },
        {
            title: '液压系统计算书',
            url: "pdf",
            children: [
                {
                    title: '顶升立柱液压系统计算及顶轮接触应力计算书',

                },
                {
                    title: '液压系统电机功率、油箱容积等计算',

                },
                {
                    title: '仰臂液压缸计算书',

                },
                {
                    title: '仰柱液压缸计算书',

                },
            ]
        },
        {
            title: '擦窗机配套件计算书',
            url: "pdf",
            children: [
                {
                    title: '钢丝绳安全系数校核计算书',

                },
                {
                    title: '回转电机校核计算书',

                },
                {
                    title: '回转支承校核计算书',

                },
            ]
        },
        {
            title: '成本计算书',
            url: "pdf",
            children: [
                {
                    title: '固定臂机',
                    url:'Cost'
                },
                {
                    title: '伸缩臂机',

                },
                {
                    title: '双臂机',

                },
                {
                    title: '附墙机',

                },
            ]
        },
        {
            title: '设计图纸',
            url: "pdf",
            children: [
                {
                    title: '底架',

                },
                {
                    title: '立柱',

                },
                {
                    title: '大臂',

                },
                {
                    title: '配重',

                },
                {
                    title: '爬梯',

                },
                {
                    title: '吊杆',

                },
                {
                    title: 'CDD吊篮',

                },
                {
                    title: '滑车',

                },
            ]
        },
        {
            title:'项目查询',
            url:'projectData',
            children:[
                {
                    title:'项目查询',
                    url:'project',

                },{
                    title:'项目导入导出',
                    url:'ImportExportProjectData',
                },{
                    title:'列定义',
                    url:'ProjectColumnDefinitionList'
                }
            ]
        },
        {
            title:'计算书日志',
            url:'OperationLog',
            children:[
                {
                    title:'日志搜索',
                    url:'List'
                }
            ]
        },{
            title:'图纸查询',
            url:'drawingTable',
        },
        {
            title:'模块编辑',
            url:'dataTable'
        }
    ]
};
asideMethods = {
    openHandle: function () {
        console.log('open');
    },
    closeHandle: function () {
        console.log('close');
    }
};
headerData = {
    headerTitle: 'this is home'
};

(function () {
    vm.asideData=asideDatas.asideData
    vm.header=headerData;
})()