package com.point.entity;


public class CleaningCycleCalculation {



    public String getCalculator() {
        return calculator;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private String projectName;

    private String calculator;

    private String check;

    private String date;

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    private String opType;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    private String no;

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    private String v1;
    private String h;
    private String l;
    private String l1;
    private String w;
    private String v2;
    private String t1;
    private String a;
    private String ti;
    private String b;
    private String n;

    private String n1;
    private String s_;
    private String t2;
    private String t3;
    private String t4;
    private String t;
    private String t_1;
    private String t_2;
    private String t_3;


    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getS_() {
        return s_;
    }

    public void setS_(String s_) {
        this.s_ = s_;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getT4() {
        return t4;
    }

    public void setT4(String t4) {
        this.t4 = t4;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getT_1() {
        return t_1;
    }

    public void setT_1(String t_1) {
        this.t_1 = t_1;
    }

    public String getT_2() {
        return t_2;
    }

    public void setT_2(String t_2) {
        this.t_2 = t_2;
    }

    public String getT_3() {
        if(t_3!=null){
            return "清洗周期为"+t_3+"天";
        }else
            return null;
    }

    public void setT_3(String t_3) {
        this.t_3 = t_3;
    }

}