package com.point.entity;
import java.io.Serializable;
import java.math.BigDecimal;

public class ComponentArmEntity implements Serializable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArmType() {
        return armType;
    }

    public void setArmType(String armType) {
        this.armType = armType;
    }

    public BigDecimal getWeightPerMeter() {
        return weightPerMeter;
    }

    public void setWeightPerMeter(BigDecimal weightPerMeter) {
        this.weightPerMeter = weightPerMeter;
    }

    public BigDecimal getBaryCenter() {
        return baryCenter;
    }

    public void setBaryCenter(BigDecimal baryCenter) {
        this.baryCenter = baryCenter;
    }

    public BigDecimal getStructureHours() {
        return structureHours;
    }

    public void setStructureHours(BigDecimal structureHours) {
        this.structureHours = structureHours;
    }

    public BigDecimal getFitterHours() {
        return fitterHours;
    }

    public void setFitterHours(BigDecimal fitterHours) {
        this.fitterHours = fitterHours;
    }

    public BigDecimal getMultipleHours() {
        return multipleHours;
    }

    public void setMultipleHours(BigDecimal multipleHours) {
        this.multipleHours = multipleHours;
    }

    public BigDecimal getEffortCost() {
        return effortCost;
    }

    public void setEffortCost(BigDecimal effortCost) {
        this.effortCost = effortCost;
    }

    public BigDecimal getSteelsCost() {
        return steelsCost;
    }

    public void setSteelsCost(BigDecimal steelsCost) {
        this.steelsCost = steelsCost;
    }

    public BigDecimal getCooperationPartCost() {
        return cooperationPartCost;
    }

    public void setCooperationPartCost(BigDecimal cooperationPartCost) {
        this.cooperationPartCost = cooperationPartCost;
    }

    public BigDecimal getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(BigDecimal otherCost) {
        this.otherCost = otherCost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTipsForSelect() {
        return tipsForSelect;
    }

    public void setTipsForSelect(String tipsForSelect) {
        this.tipsForSelect = tipsForSelect;
    }

    private int id;
    private String armType;
    private BigDecimal armLength;
    private BigDecimal weightPerMeter;
    private BigDecimal baryCenter;
    private BigDecimal structureHours;
    private BigDecimal fitterHours;
    private BigDecimal multipleHours;
    private BigDecimal effortCost;
    private BigDecimal steelsCost;
    private BigDecimal cooperationPartCost;
    private BigDecimal otherCost;
    private String remark;
    private String tipsForSelect;

    public BigDecimal getArmLength() {
        return armLength;
    }

    public void setArmLength(BigDecimal armLength) {
        this.armLength = armLength;
    }


}
