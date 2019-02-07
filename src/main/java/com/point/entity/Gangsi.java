package com.point.entity;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public class Gangsi {
    private String project_name; // 工程名称
    private String calculated_contents; //计算内容
    private String cn; //计算编号
    private BigDecimal f0;// 单根钢丝绳最大受力（整数长度5位，保留2位小数）
    private BigDecimal s; //钢丝绳破断拉力 （整数长度5位，保留2位小数）
    private String jisuanren;  //计算人
    private String jisuanshijian;// 计算时间

    private MultipartFile ppppp;//图片


    private BigDecimal zp; //= s/ f0 （保留2位小数）

    private String fuhao;  //当zp>8，显示为 >;
    //当zp<8，显示为 <;
    //当zp=8，显示为 =;
    private String manzu;  //当fuhao  为 >或=，显示为 满足;
    //否则为显示为 不满足。
    private String opType;

    public MultipartFile getPpppp() {
        return ppppp;
    }

    public void setPpppp(MultipartFile ppppp) {
        this.ppppp = ppppp;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getCalculated_contents() {
        return calculated_contents;
    }

    public void setCalculated_contents(String calculated­_contents) {
        this.calculated_contents = calculated­_contents;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public BigDecimal getF0() {
        return f0;
    }

    public void setF0(BigDecimal f0) {
        this.f0 = f0;
    }

    public BigDecimal getS() {
        return s;
    }

    public void setS(BigDecimal s) {
        this.s = s;
    }

    public String getJisuanren() {
        return jisuanren;
    }

    public void setJisuanren(String jisuanren) {
        this.jisuanren = jisuanren;
    }

    public String getJisuanshijian() {
        return jisuanshijian;
    }

    public void setJisuanshijian(String jisuanshijian) {
        this.jisuanshijian = jisuanshijian;
    }

    public BigDecimal getZp() {
        return s.divide(f0,2,BigDecimal.ROUND_HALF_EVEN);
    }

    public String getFuhao() {
        if(getZp().compareTo(new BigDecimal(8))>0){
            return ">";
        }
        else if(getZp().compareTo(new BigDecimal(8))<0){
            return "<";
        }
        else{
            return "=";
        }
    }

    public String getManzu() {
        if(getFuhao().equals("<")){
            return "不满足";
        }else{
            return "满足";
        }
    }

    //private BigDecimal zp; //= s/ f0 （保留2位小数）

    //private String fuhao;  //当zp>8，显示为 >;
    //当zp<8，显示为 <;
    //当zp=8，显示为 =;
    //private String manzu;  //当fuhao  为 >或=，显示为 满足;
    //否则为显示为 不满足。
}
