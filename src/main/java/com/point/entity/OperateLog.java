package com.point.entity;

import java.util.Date;

public class OperateLog {
    private Integer operatelog;

    private String userrealname;

    private String operation;

    private Date changelasttime;

    public Integer getOperatelog() {
        return operatelog;
    }

    public void setOperatelog(Integer operatelog) {
        this.operatelog = operatelog;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getChangelasttime() {
        return changelasttime;
    }

    public void setChangelasttime(Date changelasttime) {
        this.changelasttime = changelasttime;
    }
}