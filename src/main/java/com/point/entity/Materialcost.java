package com.point.entity;

import java.math.BigDecimal;

public class Materialcost {
    private Integer id;

    private String materiatype;

    private String materianame;

    private BigDecimal unitprice;

    private String unitname;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMateriatype() {
        return materiatype;
    }

    public void setMateriatype(String materiatype) {
        this.materiatype = materiatype;
    }

    public String getMaterianame() {
        return materianame;
    }

    public void setMaterianame(String materianame) {
        this.materianame = materianame;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}