package com.point.entity;

import java.math.BigDecimal;

public class Componentpost {
    private Integer id;

    private String type;

    private BigDecimal weightpermeter;

    private BigDecimal structurehours;

    private BigDecimal multiplehours;

    private BigDecimal fitterhours;

    private String remark;

    private String tipsforselect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getWeightpermeter() {
        return weightpermeter;
    }

    public void setWeightpermeter(BigDecimal weightpermeter) {
        this.weightpermeter = weightpermeter;
    }

    public BigDecimal getStructurehours() {
        return structurehours;
    }

    public void setStructurehours(BigDecimal structurehours) {
        this.structurehours = structurehours;
    }

    public BigDecimal getMultiplehours() {
        return multiplehours;
    }

    public void setMultiplehours(BigDecimal multiplehours) {
        this.multiplehours = multiplehours;
    }

    public BigDecimal getFitterhours() {
        return fitterhours;
    }

    public void setFitterhours(BigDecimal fitterhours) {
        this.fitterhours = fitterhours;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTipsforselect() {
        return tipsforselect;
    }

    public void setTipsforselect(String tipsforselect) {
        this.tipsforselect = tipsforselect;
    }
}