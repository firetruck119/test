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
            "/ImportProjectData",
            "/projectData/ProjectColumnDefinitionList",
            "/dataTable/updataTable",
            "/dataTable/createNewTable",
            "/dataTable/deleteTable",
            "/dataTable/upExcel",
            "/OperationLog/List",
            "/dataTable/downLoadExcel",
            "/ExportProjectData",
            "/projectData/ImportExportProjectData",
            "/ProjectColumnDefinitionList",
            "/ProjectData",
            "/ImportExportProjectData"
    };

    //管理员默认就有权限的页面
    public static final String[] ADMIN_PERMITS = new String[]{
//            "/ExportProjectData",
//            "/dataTable/downLoadExcel"
    };

    //超级用户及以上有权限的页面
    public static final String[] SUPERUSER_PERMITS = new String[]{
//            "/OperationLog/List",
//            "/WireRope"
    };


}
