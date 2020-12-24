package com.point.common;

public class Consts {
    public static final int COLUMNDATATYPE_STRING = 1;

    public static final int COLUMNDATATYPE_NUMBERIC = 2;

    public static final int COLUMNDATATYPE_URL = 3;

    public static final int QUERYCONDITIONORDER_LETTER = 1;

    public static final int QUERYCONDITIONORDER_RATE = 2;

    public static final int QUERYCONDITIONORDER_NUMBER_VALUE = 3;

    public static final int QUERYCONDITIONORDER_NUMBER_RANGE_ = 4;

    public static final int QUERYCONDITIONORDER_NONE = 0;

    public static final String NULL = "null";

    public static final long PERMISSION_MINUTES = 60;

    public static final String TEMP_OWERN = "TEMP_OWERN";

    //超级管理员有权限的页面和管理员申请后有权限的页面
    public static final String[] OWERN_PERMITS = new String[]{
            "/projectData/ProjectColumnDefinitionList",//项目查询-列定义
            "/projectData/ImportExportProjectData",//项目查询-项目导入导出
//            "/dataTable",//模块编辑-界面
            "/dataTable/updataTable",//模块编辑-编辑表名
            "/dataTable/createNewTable",//模块编辑-新建表格
            "/dataTable/deleteTable",//模块编辑-删除表
            "/dataTable/upExcel",//模块编辑-上传表
            "/dataTable/downLoadExcel",//模块编辑-下载表
            "/OperationLog",//计算书日志-界面
            "/OperationLog/List",//计算书日志-日志搜索
//            "/drawingTable",//图纸查询-数据库-界面
            "/drawingTable/upDrawing",//图纸查询-数据库-编辑表名
            "/drawingTable/addDrawing",//图纸查询-数据库-新建表格
            "/drawingTable/deleteDrawing",//图纸查询-数据库-删除表
            "/drawingTable/insertOrUpdateDrawing",//图纸查询-数据库-上传表
            "/drawingTable/getExcel",//图纸查询-数据库-下载表

            "/ProjectColumnDefinitionList",//旧-项目查询-列定义
            "/ImportExportProjectData",//旧-项目查询-项目导入导出
            "/ProjectData",//旧-项目查询-数据维护
            "/ExportProjectData",//旧-项目查询-下载图片名称
            "/ImportProjectData",//旧-项目查询-选取文件并上传
    };

    //管理员默认就有权限的页面
    public static final String[] ADMIN_PERMITS = new String[]{
//            "/ExportProjectData",
//            "/dataTable/downLoadExcel"
    };

    //超级用户及以上有权限的页面
    public static final String[] SUPERUSER_PERMITS = new String[]{
            "/pdf/RotaryStructure",//大回转机构
            "/pdf/PlatformUnconstrained",//非普通吊船无约束系统
            "/pdf/PtPlatformUnconstrained",//普通吊船无约束系统
            "/pdf/YygglYxrj",//液压系统电机功率及油箱容积
            "/pdf/YbHydraulicCylinder",//仰臂液压缸
            "/pdf/DsHydraulicCylinder",//顶升液压缸
            "/pdf/Tensile",//抗拉埋件
            "/pdf/Resistant",//抗压埋件
            "/pdf/SuspensionCtrack",//悬挂C型轨
            "/pdf/YbAxis",//仰臂大轴
            "/pdf/SingleJib",//单臂机吊臂
            "/pdf/OneJib",//1+1伸缩臂吊臂
            "/pdf/TwoJib",//2+1伸缩臂吊臂
            "/pdf/ThreeJib",//3+1伸缩臂吊臂
            "/pdf/FourJib",//4+1伸缩臂吊臂
            "/pdf/OneJibWheel",//1+1滚轮及伸缩机构
            "/pdf/TwoJibWheel",//2+1滚轮、链条及伸缩机构
            "/pdf/ThreeJibWheel",//3+1滚轮、链条及伸缩机构
            "/pdf/FourJibWheel",//4+1滚轮、链条及伸缩机构
            "/pdf/JibFrontButtFlange",//吊臂前对接法兰
            "/pdf/UprightMechanism",//仰柱机构
            "/pdf/IdlerWheel",//1+1立柱顶轮
            "/pdf/DijiaDrawing",//底架图纸
            "/pdf/CDDDrawing",//CDD图纸
            "/dataTable",//模块编辑-界面
            "/drawingTable",//图纸查询-数据库-界面
    };


}
