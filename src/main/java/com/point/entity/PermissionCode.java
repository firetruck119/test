package com.point.entity;

import java.util.Date;

public class PermissionCode {
    private Integer permissioncodeid;

    private Integer userid;

    private String code;

    private Integer checkflag;

    private Date createtime;

    private Date changelasttime;

    public Integer getPermissioncodeid() {
        return permissioncodeid;
    }

    public void setPermissioncodeid(Integer permissioncodeid) {
        this.permissioncodeid = permissioncodeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(Integer checkflag) {
        this.checkflag = checkflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getChangelasttime() {
        return changelasttime;
    }

    public void setChangelasttime(Date changelasttime) {
        this.changelasttime = changelasttime;
    }
}