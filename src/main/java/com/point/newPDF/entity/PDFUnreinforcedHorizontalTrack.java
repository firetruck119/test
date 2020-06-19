package com.point.newPDF.entity;

import lombok.*;

@Data
@NoArgsConstructor
public class PDFUnreinforcedHorizontalTrack implements PDFEntity {

    private String sjht;

    //封面内容
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    //轨道计算基本参数
    private Double lkj;
    private Double dcw;
    private Double bcw;
    private Double fzedk;
    private Double fzek;
    private Double vzedk;
    private Double vyedk;
    private Double rzedk;
    private Double fzed;
    private Double fze;
    private Double vzed;
    private Double vyed;
    private Double rzed;

    //关于bef1的计算参数
    private Double bef1x;
    private Double bef1c;

    //初选轨道型号及钢材牌号参数
    private Double gdxh;
    private Double gcph;
    private Double gdh;
    private Double gdb;
    private Double gdtw;
    private Double gdtfs;
    private Double gdtfx;
    private Double gdhw;
    private Double gdhy;
    private Double gdsy;
    private Double gdiy;
    private Double gdiz;
    private Double gdwysel;
    private Double gdwyxel;
    private Double gdwzel;
    private Double gdz;
    private Double gdy;
    private Double gdss;
    private Double gdshzr;

    //轨道截面强度校核计算
    private Double myed;
    private Double mzed;
    private Double sxed;
    private Double a1;
    private Double u1;
    private Double ted1;
    private Double ted2;
    private Double ted;
    private Double a2;
    private Double u2;
    private Double u3;

    //立柱屈曲失稳临界力矩校核计算
    private Double iw;
    private Double it;
    private Double s;
    private Double ccr;
    private Double mcr;
    private Double klt;
    private Double qlt1;
    private Double qlt2;
    private Double qlt;
    private Double xlt;
    private Double mbrd;
    private Double a3;
    private Double u4;
    private Double u5;

    //支承处轨道腹板屈曲失稳临界力矩校核计算
    private Double k1;
    private Double q1;
    private Double xs1;
    private Double bef1;
    private Double nwrd;
    private Double a4;
    private Double u6;
    private Double u7;

    //竖向轮载的复合应力校核计算
    private Double sx1ed;
    private Double d;
    private Double szed;
    private Double tled;
    private Double a5;
    private Double u8;
    private Double u9;

    //竖向轮载校核计算
    private Double fzrd;
    private Double a6;
    private Double u10;
    private Double u11;

    //竖向轮载引起的腹板屈曲失稳校核计算
    private Double bef2;
    private Double ncrd;
    private Double k2;
    private Double q2;
    private Double xs2;
    private Double a7;
    private Double u12;
    private Double u13;

    //腹板受压校核计算
    private Double fz1rd;
    private Double a8;
    private Double u14;
    private Double u15;

    //支承反力校核计算
    private Double fz2rd;
    private Double a9;
    private Double u16;
    private Double u17;

    //支承反力引起的腹板屈曲失稳校核计算
    private Double bef3;
    private Double nc1rd;
    private Double a10;
    private Double u18;
    private Double u19;

    //接触应力校核计算
    private Double shz;
    private Double a11;
    private Double u20;
    private Double u21;

    //正常使用极限状态校核计算
    private Double fz;
    private Double fy;

    //结论判断
    private Double u22;
    private Double u23;
    private Double u24;
    private Double u25;
    private Double u26;

    @Override
    public void calculateValue() {

    }

    @Override
    public void mapForPDF(String langurage) {

    }

    @Override
    public void mapForCkeck(String langurage) {

    }

    @Override
    public String PDFName(String langurage) {
        return null;
    }

    public static void main(String[] args) {
        PDFUnreinforcedHorizontalTrack P = new PDFUnreinforcedHorizontalTrack();
        System.out.println();
    }
}
