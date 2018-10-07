package com.point.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Component {
    private Integer id;

    private Integer componenttype;

    public String getComponentname() {
        return componentname;
    }

    public void setComponentname(String componentname) {
        this.componentname = componentname;
    }

    private String componentname;

    private BigDecimal xxinertiamoment;

    private BigDecimal xxcrosssection;

    private BigDecimal yyinertiamoment;

    private BigDecimal yycrosssection;

    private BigDecimal ropediameter;

    private BigDecimal hight;

    private BigDecimal trackgap;

    private BigDecimal angularvelocity;

    private BigDecimal width;

    private BigDecimal wheelgap;

    private BigDecimal weightpermeter;

    private BigDecimal armlength;

    private BigDecimal outlinesize;

    private BigDecimal frontalarea;

    private BigDecimal hydrocylinderpower;

    private BigDecimal weight;

    private BigDecimal barycenter;

    private BigDecimal maxdistance;

    private BigDecimal maxloading;

    private BigDecimal minbreakageforce;

    private String remark;

    private String material;

    private String electricmectype;

    private String rotationsustainmodel;

    private String apapttype;

    private String hoistertype;

    private String modeltype;

    private String tips;

    private String mechanism;

    private BigDecimal costcoeffcient = new BigDecimal(1);

    private BigDecimal electricmecprice = new BigDecimal(0);

    private BigDecimal rotationsustainprice = new BigDecimal(0);

    private BigDecimal pricepermeter = new BigDecimal(0);

    private BigDecimal othercost = new BigDecimal(0);

    private BigDecimal hoisterprice = new BigDecimal(0);

    private BigDecimal cooperationpartcost = new BigDecimal(0);

    private BigDecimal fieldinstallcost = new BigDecimal(0);

    private BigDecimal multiplehours = new BigDecimal(0);

    private BigDecimal fitterhours= new BigDecimal(0);

    private BigDecimal weldinghours= new BigDecimal(0);

    private BigDecimal standardpartshours= new BigDecimal(0);

    private BigDecimal bigstructurehours= new BigDecimal(0);

    private BigDecimal smallstructurehours= new BigDecimal(0);

    private BigDecimal electricalhours= new BigDecimal(0);

    public BigDecimal getPlatetons() {
        return platetons;
    }

    public void setPlatetons(BigDecimal platetons) {
        this.platetons = platetons;
    }

    public BigDecimal getIbeamtons() {
        return ibeamtons;
    }

    public void setIbeamtons(BigDecimal ibeamtons) {
        this.ibeamtons = ibeamtons;
    }

    public BigDecimal getHsteeltons() {
        return hsteeltons;
    }

    public void setHsteeltons(BigDecimal hsteeltons) {
        this.hsteeltons = hsteeltons;
    }

    public BigDecimal getAluminiumtons() {
        return aluminiumtons;
    }

    public void setAluminiumtons(BigDecimal aluminiumtons) {
        this.aluminiumtons = aluminiumtons;
    }

    public BigDecimal getEightsidetubetons() {
        return eightsidetubetons;
    }

    public void setEightsidetubetons(BigDecimal eightsidetubetons) {
        this.eightsidetubetons = eightsidetubetons;
    }

    public BigDecimal getHotdipgalvanizingtons() {
        return hotdipgalvanizingtons;
    }

    public void setHotdipgalvanizingtons(BigDecimal hotdipgalvanizingtons) {
        this.hotdipgalvanizingtons = hotdipgalvanizingtons;
    }

    private BigDecimal platetons= new BigDecimal(0);

    private BigDecimal ibeamtons= new BigDecimal(0);

    private BigDecimal hsteeltons= new BigDecimal(0);

    private BigDecimal aluminiumtons= new BigDecimal(0);

    private BigDecimal eightsidetubetons= new BigDecimal(0);

    private BigDecimal hotdipgalvanizingtons= new BigDecimal(0);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComponenttype() {
        return componenttype;
    }

    public void setComponenttype(Integer componenttype) {
        this.componenttype = componenttype;
    }

    public BigDecimal getXxinertiamoment() {
        return xxinertiamoment;
    }

    public void setXxinertiamoment(BigDecimal xxinertiamoment) {
        this.xxinertiamoment = xxinertiamoment;
    }

    public BigDecimal getXxcrosssection() {
        return xxcrosssection;
    }

    public void setXxcrosssection(BigDecimal xxcrosssection) {
        this.xxcrosssection = xxcrosssection;
    }

    public BigDecimal getYyinertiamoment() {
        return yyinertiamoment;
    }

    public void setYyinertiamoment(BigDecimal yyinertiamoment) {
        this.yyinertiamoment = yyinertiamoment;
    }

    public BigDecimal getYycrosssection() {
        return yycrosssection;
    }

    public void setYycrosssection(BigDecimal yycrosssection) {
        this.yycrosssection = yycrosssection;
    }

    public BigDecimal getRopediameter() {
        return ropediameter;
    }

    public void setRopediameter(BigDecimal ropediameter) {
        this.ropediameter = ropediameter;
    }

    public BigDecimal getHight() {
        return hight;
    }

    public void setHight(BigDecimal hight) {
        this.hight = hight;
    }

    public BigDecimal getTrackgap() {
        return trackgap;
    }

    public void setTrackgap(BigDecimal trackgap) {
        this.trackgap = trackgap;
    }

    public BigDecimal getAngularvelocity() {
        return angularvelocity;
    }

    public void setAngularvelocity(BigDecimal angularvelocity) {
        this.angularvelocity = angularvelocity;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getWheelgap() {
        return wheelgap;
    }

    public void setWheelgap(BigDecimal wheelgap) {
        this.wheelgap = wheelgap;
    }

    public BigDecimal getWeightpermeter() {
        return weightpermeter;
    }

    public void setWeightpermeter(BigDecimal weightpermeter) {
        this.weightpermeter = weightpermeter;
    }

    public BigDecimal getArmlength() {
        return armlength;
    }

    public void setArmlength(BigDecimal armlength) {
        this.armlength = armlength;
    }

    public BigDecimal getOutlinesize() {
        return outlinesize;
    }

    public void setOutlinesize(BigDecimal outlinesize) {
        this.outlinesize = outlinesize;
    }

    public BigDecimal getFrontalarea() {
        return frontalarea;
    }

    public void setFrontalarea(BigDecimal frontalarea) {
        this.frontalarea = frontalarea;
    }

    public BigDecimal getHydrocylinderpower() {
        return hydrocylinderpower;
    }

    public void setHydrocylinderpower(BigDecimal hydrocylinderpower) {
        this.hydrocylinderpower = hydrocylinderpower;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getBarycenter() {
        return barycenter;
    }

    public void setBarycenter(BigDecimal barycenter) {
        this.barycenter = barycenter;
    }

    public BigDecimal getMaxdistance() {
        return maxdistance;
    }

    public void setMaxdistance(BigDecimal maxdistance) {
        this.maxdistance = maxdistance;
    }

    public BigDecimal getMaxloading() {
        return maxloading;
    }

    public void setMaxloading(BigDecimal maxloading) {
        this.maxloading = maxloading;
    }

    public BigDecimal getMinbreakageforce() {
        return minbreakageforce;
    }

    public void setMinbreakageforce(BigDecimal minbreakageforce) {
        this.minbreakageforce = minbreakageforce;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getElectricmectype() {
        return electricmectype;
    }

    public void setElectricmectype(String electricmectype) {
        this.electricmectype = electricmectype;
    }

    public String getRotationsustainmodel() {
        return rotationsustainmodel;
    }

    public void setRotationsustainmodel(String rotationsustainmodel) {
        this.rotationsustainmodel = rotationsustainmodel;
    }

    public String getApapttype() {
        return apapttype;
    }

    public void setApapttype(String apapttype) {
        this.apapttype = apapttype;
    }

    public String getHoistertype() {
        return hoistertype;
    }

    public void setHoistertype(String hoistertype) {
        this.hoistertype = hoistertype;
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public BigDecimal getCostcoeffcient() {
        return costcoeffcient;
    }

    public void setCostcoeffcient(BigDecimal costcoeffcient) {
        this.costcoeffcient = costcoeffcient;
    }

    public BigDecimal getElectricmecprice() {
        return electricmecprice;
    }

    public void setElectricmecprice(BigDecimal electricmecprice) {
        this.electricmecprice = electricmecprice;
    }

    public BigDecimal getRotationsustainprice() {
        return rotationsustainprice;
    }

    public void setRotationsustainprice(BigDecimal rotationsustainprice) {
        this.rotationsustainprice = rotationsustainprice;
    }

    public BigDecimal getPricepermeter() {
        return pricepermeter;
    }

    public void setPricepermeter(BigDecimal pricepermeter) {
        this.pricepermeter = pricepermeter;
    }

    public BigDecimal getOthercost() {
        return othercost;
    }

    public void setOthercost(BigDecimal othercost) {
        this.othercost = othercost;
    }

    public BigDecimal getHoisterprice() {
        return hoisterprice;
    }

    public void setHoisterprice(BigDecimal hoisterprice) {
        this.hoisterprice = hoisterprice;
    }

    public BigDecimal getCooperationpartcost() {
        return cooperationpartcost;
    }

    public void setCooperationpartcost(BigDecimal cooperationpartcost) {
        this.cooperationpartcost = cooperationpartcost;
    }

    public BigDecimal getFieldinstallcost() {
        return fieldinstallcost;
    }

    public void setFieldinstallcost(BigDecimal fieldinstallcost) {
        this.fieldinstallcost = fieldinstallcost;
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

    public BigDecimal getWeldinghours() {
        return weldinghours;
    }

    public void setWeldinghours(BigDecimal weldinghours) {
        this.weldinghours = weldinghours;
    }

    public BigDecimal getStandardpartshours() {
        return standardpartshours;
    }

    public void setStandardpartshours(BigDecimal standardpartshours) {
        this.standardpartshours = standardpartshours;
    }

    public BigDecimal getBigstructurehours() {
        return bigstructurehours;
    }

    public void setBigstructurehours(BigDecimal bigstructurehours) {
        this.bigstructurehours = bigstructurehours;
    }

    public BigDecimal getSmallstructurehours() {
        return smallstructurehours;
    }

    public void setSmallstructurehours(BigDecimal smallstructurehours) {
        this.smallstructurehours = smallstructurehours;
    }

    public BigDecimal getElectricalhours() {
        return electricalhours;
    }

    public void setElectricalhours(BigDecimal electricalhours) {
        this.electricalhours = electricalhours;
    }

    /********************************以下为手工添加*********************************/

    private BigDecimal steelcost;

    public BigDecimal getSteelcost(){
        return getPlatecost().add(getIbeamcost()).add(getHsteelcost())
                .add(getAluminiumcost()).add(getEightsidetubecost()).add(getHotdipgalvanizingcost());
    }

    private BigDecimal materialcost;

    public BigDecimal getMaterialcost(){
        return getSteelcost().add(electricmecprice).add(rotationsustainprice).add(pricepermeter).add(othercost)
                .add(hoisterprice).add(cooperationpartcost).add(fieldinstallcost);
    }

    private BigDecimal laborcost;

    public BigDecimal getLaborcost(){
        return getMultiplecost().add(getFittercost()).add(getWeldingcost()).add(getStandardpartscost())
                .add(getElectricalcost()).add(getBigstructurecost()).add(getSmallstructurecost());
    }

    private BigDecimal totalcost;

    public BigDecimal getTotalcost(){
        return getMaterialcost().add(getLaborcost());
    }

    private BigDecimal finalcost;

    public BigDecimal getFinalcost(){
        return getTotalcost().multiply(getCostcoeffcient());
    }

    private BigDecimal platecost;

    private BigDecimal ibeamcost;

    private BigDecimal hsteelcost;

    private BigDecimal aluminiumcost;

    private BigDecimal eightsidetubecost;

    private BigDecimal hotdipgalvanizingcost;

    private List<BigDecimal> materialcostList = Arrays.asList(
            new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0)
            ,new BigDecimal(0));

    private BigDecimal multiplecost;

    private BigDecimal fittercost;

    private BigDecimal weldingcost;

    private BigDecimal standardpartscost;

    private BigDecimal bigstructurecost;

    public void setMaterialcostList(List<BigDecimal> list) {
        this.materialcostList=list;
    }

    public BigDecimal getMultiplecost() {
        return multiplehours.multiply(materialcostList.get(10));
    }

    public BigDecimal getFittercost() {
        return fitterhours.multiply(materialcostList.get(8));
    }

    public BigDecimal getWeldingcost() {
        return weldinghours.multiply(materialcostList.get(12));
    }

    public BigDecimal getStandardpartscost() {
        return standardpartshours.multiply(materialcostList.get(9));
    }

    public BigDecimal getBigstructurecost() {
        return bigstructurehours.multiply(materialcostList.get(7));
    }

    public BigDecimal getSmallstructurecost() {
        return smallstructurehours.multiply(materialcostList.get(6));
    }

    public BigDecimal getElectricalcost() {
        return electricalhours.multiply(materialcostList.get(11));
    }

    private BigDecimal smallstructurecost;

    private BigDecimal electricalcost;

    public BigDecimal getPlatecost() {
        return platetons.multiply(materialcostList.get(0));
    }

    public BigDecimal getIbeamcost() {
        return ibeamtons.multiply(materialcostList.get(1));
    }

    public BigDecimal getHsteelcost() {
        return hsteeltons.multiply(materialcostList.get(2));
    }

    public BigDecimal getAluminiumcost() {
        return aluminiumtons.multiply(materialcostList.get(3));
    }

    public BigDecimal getEightsidetubecost() {
        return eightsidetubetons.multiply(materialcostList.get(4));
    }

    public BigDecimal getHotdipgalvanizingcost() {
        return hotdipgalvanizingtons.multiply(materialcostList.get(5));
    }

}