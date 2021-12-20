package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PurchaseOrderGnEntity {
    private String xmmc;
    private String zjxh;
    private String plh;
    private String jsr;
    private String cgsbjgdn;
    private String cgsbjgdy;
    private String cgsbjgdr;
    private String cgsbn;
    private String cgtjcs;
    private String cgxmdq;
    private String cgdjdy;

    //    臂头电机
    private String cgbtmc;
    private String cgbtdjxh;
    private String cgbtdjfl;
    private String cgbtdjsb;
    private String cgbtdjsd;
    private String cgbtdjgl;
    private String cgbtdjdl;
    private String cgbtdjdy;
    private String cgbtdjjydj;
    private String cgbtdjaz;
    private String cgbtdjsl;
    private String cgbtdjpp;
    private String cgbtdjbz;

    //    臂头电机1
    private String cgbtdjxh1;
    private String cgbtdjfl1;
    private String cgbtdjsb1;
    private String cgbtdjsd1;
    private String cgbtdjgl1;
    private String cgbtdjdl1;
    private String cgbtdjdy1;
    private String cgbtdjjydj1;
    private String cgbtdjaz1;
    private String cgbtdjsl1;
    private String cgbtdjpp1;
    private String cgbtdjbz1;

    //    起升机构电机
    private String cgqsjgmc;
    private String cgqsjgdjxh;
    private String cgqsjgdjfl;
    private String cgqsjgdjsb;
    private String cgqsjgdjsd;
    private String cgqsjgdjgl;
    private String cgqsjgdjdl;
    private String cgqsjgdjdy;
    private String cgqsjgdjjydj;
    private String cgqsjgdjaz;
    private String cgqsjgdjsl;
    private String cgqsjgdjpp;
    private String cgqsjgdjbz;
    //    起升机构电机1
    private String cgqsjgdjxh1;
    private String cgqsjgdjfl1;
    private String cgqsjgdjsb1;
    private String cgqsjgdjsd1;
    private String cgqsjgdjgl1;
    private String cgqsjgdjdl1;
    private String cgqsjgdjdy1;
    private String cgqsjgdjjydj1;
    private String cgqsjgdjaz1;
    private String cgqsjgdjsl1;
    private String cgqsjgdjpp1;
    private String cgqsjgdjbz1;

    //    运行机构电机
    private String cgyxmc;
    private String cgyxdjxh;
    private String cgyxdjfl;
    private String cgyxdjsb;
    private String cgyxdjsd;
    private String cgyxdjgl;
    private String cgyxdjdl;
    private String cgyxdjdy;
    private String cgyxdjjydj;
    private String cgyxdjaz;
    private String cgyxdjsl;
    private String cgyxdjpp;
    private String cgyxdjbz;

    //    大回转机构电机
    private String cgdhzjgmc;
    private String cgdhzjgdjxh;
    private String cgdhzjgdjfl;
    private String cgdhzjgdjsb;
    private String cgdhzjgdjsd;
    private String cgdhzjgdjgl;
    private String cgdhzjgdjdl;
    private String cgdhzjgdjdy;
    private String cgdhzjgdjjydj;
    private String cgdhzjgdjaz;
    private String cgdhzjgdjsl;
    private String cgdhzjgdjpp;
    private String cgdhzjgdjbz;

    //    伸缩机构电机
    private String cgssjgmc;
    private String cgssjgdjxh;
    private String cgssjgdjfl;
    private String cgssjgdjsb;
    private String cgssjgdjsd;
    private String cgssjgdjgl;
    private String cgssjgdjdl;
    private String cgssjgdjdy;
    private String cgssjgdjjydj;
    private String cgssjgdjaz;
    private String cgssjgdjsl;
    private String cgssjgdjpp;
    private String cgssjgdjbz;

    //    仰臂电机
    private String cgybmc;
    private String cgybdjxh;
    private String cgybdjfl;
    private String cgybdjsb;
    private String cgybdjsd;
    private String cgybdjgl;
    private String cgybdjdl;
    private String cgybdjdy;
    private String cgybdjjydj;
    private String cgybdjaz;
    private String cgybdjsl;
    private String cgybdjpp;
    private String cgybdjbz;

    //    GRU电机
    private String cggrumc;
    private String cggrudjxh;
    private String cggrudjfl;
    private String cggrudjsb;
    private String cggrudjsd;
    private String cggrudjgl;
    private String cggrudjdl;
    private String cggrudjdy;
    private String cggrudjjydj;
    private String cggrudjaz;
    private String cggrudjsl;
    private String cggrudjpp;
    private String cggrudjbz;

    //    吊船电机
    private String cgdcmc;
    private String cgdcdjxh;
    private String cgdcdjfl;
    private String cgdcdjsb;
    private String cgdcdjsd;
    private String cgdcdjgl;
    private String cgdcdjdl;
    private String cgdcdjdy;
    private String cgdcdjjydj;
    private String cgdcdjaz;
    private String cgdcdjsl;
    private String cgdcdjpp;
    private String cgdcdjbz;

    //    折臂1电机
    private String cgzb1djmc;
    private String cgzb1djxh;
    private String cgzb1djfl;
    private String cgzb1djsb;
    private String cgzb1djsd;
    private String cgzb1djgl;
    private String cgzb1djdl;
    private String cgzb1djdy;
    private String cgzb1djjydj;
    private String cgzb1djaz;
    private String cgzb1djsl;
    private String cgzb1djpp;
    private String cgzb1djbz;

    //    折臂2电机
    private String cgzb2djmc;
    private String cgzb2djxh;
    private String cgzb2djfl;
    private String cgzb2djsb;
    private String cgzb2djsd;
    private String cgzb2djgl;
    private String cgzb2djdl;
    private String cgzb2djdy;
    private String cgzb2djjydj;
    private String cgzb2djaz;
    private String cgzb2djsl;
    private String cgzb2djpp;
    private String cgzb2djbz;

    // 防风背包电机
    private String cgffbbmc;
    private String cgffbbdjxh;
    private String cgffbbdjfl;
    private String cgffbbdjsb;
    private String cgffbbdjsd;
    private String cgffbbdjgl;
    private String cgffbbdjdl;
    private String cgffbbdjdy;
    private String cgffbbdjjydj;
    private String cgffbbdjaz;
    private String cgffbbdjsl;
    private String cgffbbdjpp;
    private String cgffbbdjbz;

    //    其他电机
    private String cgqt1;
    private String cgqt1mc;
    private String cgqt1djxh;
    private String cgqt1djfl;
    private String cgqt1djsb;
    private String cgqt1djsd;
    private String cgqt1djgl;
    private String cgqt1djdl;
    private String cgqt1djdy;
    private String cgqt1djjydj;
    private String cgqt1djaz;
    private String cgqt1djsl;
    private String cgqt1djpp;
    private String cgqt1djbz;

    //    臂头回转支承
    private String cgbthzzcmc;
    private String cgbthzzcxh;
    private String cgbthzzcms;
    private String cgbthzzccs;
    private String cgbthzzcaz;
    private String cgbthzzcsl;
    private String cgbthzzcpp;
    private String cgbthzzcbz;

    //    大回转机构回转支承
    private String cgdhzjghzzcmc;
    private String cgdhzjghzzcxh;
    private String cgdhzjghzzcms;
    private String cgdhzjghzzccs;
    private String cgdhzjghzzcaz;
    private String cgdhzjghzzcsl;
    private String cgdhzjghzzcpp;
    private String cgdhzjghzzcbz;

    //    折臂1回转支承
    private String cgzb1hzzcmc;
    private String cgzb1hzzcxh;
    private String cgzb1hzzcms;
    private String cgzb1hzzccs;
    private String cgzb1hzzcaz;
    private String cgzb1hzzcsl;
    private String cgzb1hzzcpp;
    private String cgzb1hzzcbz;

    //    折臂2回转支承
    private String cgzb2hzzcmc;
    private String cgzb2hzzcxh;
    private String cgzb2hzzcms;
    private String cgzb2hzzccs;
    private String cgzb2hzzcaz;
    private String cgzb2hzzcsl;
    private String cgzb2hzzcpp;
    private String cgzb2hzzcbz;

    //    其他回转支承
    private String cgqt2;
    private String cgqt2mc;
    private String cgqt2hzzcxh;
    private String cgqt2hzzcms;
    private String cgqt2hzzccs;
    private String cgqt2hzzcaz;
    private String cgqt2hzzcsl;
    private String cgqt2hzzcpp;
    private String cgqt2hzzcbz;

    //    生命绳
    private String cgsmsgg;
    private String cgsmscd;
    private String cgsmscz;
    private String cgsmssl;
    private String cgsmspp;
    private String cgsmsbz;

    //    吊船液压
    private String cgdcyymc;
    private String cgdcyydgj;
    private String cgdcyyzgj;
    private String cgdcyyxgj;
    private String cgdcyyxc;
    private String cgdcyyazj;
    private String cgdcyygl;
    private String cgdcyydl;
    private String cgdcyydy;
    private String cgdcyysl;
    private String cgdcyypp;
    private String cgdcyybz;

    //    伸缩液压
    private String cgssyymc;
    private String cgssyydgj;
    private String cgssyyzgj;
    private String cgssyyxgj;
    private String cgssyyxc;
    private String cgssyyazj;
    private String cgssyydy;
    private String cgssyysl;
    private String cgssyypp;
    private String cgssyybz;

    //    仰臂液压
    private String cgybyymc;
    private String cgybyydgj;
    private String cgybyyzgj;
    private String cgybyyxgj;
    private String cgybyyxc;
    private String cgybyyazj;
    private String cgybyydy;
    private String cgybyysl;
    private String cgybyypp;
    private String cgybyybz;

    //    顶升液压
    private String cgdsyymc;
    private String cgdsyydgj;
    private String cgdsyyzgj;
    private String cgdsyyxgj;
    private String cgdsyyxc;
    private String cgdsyyazj;
    private String cgdsyydy;
    private String cgdsyysl;
    private String cgdsyypp;
    private String cgdsyybz;

    //    整机液压功率、电流
    private String cgyygl;
    private String cgyydl;
    private String cgyydjxh;
    private String cgyydjpp;
    private String cgyydjsl;

    //     下拉
    private String btModel;
    private String cgbtdjppModel;

    private String qsjgModel;

    private String yxjgModel;
    private String cgyxjgdjppModel;

    private String cgdhzjgmkModel;
    private String dhzjgModel;
    private String fbdhzjgdjModel;
    private String cgdhzjgdjppModel;

    private String ssjgModel;
    private String cgssjgdjppModel;

    private String cgybModel;
    private String cgybdjppModel;

    private String gruModel;
    private String cggrudjppModel;
    private String cggruazwzModel;

    private String cgdcModel;
    private String cgdcdjppModel;

    private String cgzb1Model;
    private String cgzb2Model;
    private String cgzbdjppModel;

    private String cgffbbModel;

    private String cgbthzzcppModel;

    private String fbdhzjghzzcModel;
    private String cgdhzjghzzcppModel;

    private String cgzb1hzzcModel;
    private String cgzb2hzzcModel;
    private String cgzbhzzcppModel;

    private String cgsmsModel;

    private String cgssyylxModel;
    private String cgssyyxhModel;

    private String cgybyylxModel;
    private String cgybyyxhModel;

    private String cgdsyylxModel;
    private String cgdsyyxhModel;

    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        map.put("plh", CommonFunc.convertDoubleToString(plh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("cgsbjgdn", CommonFunc.convertDoubleToString(cgsbjgdn));
        map.put("cgsbjgdy", CommonFunc.convertDoubleToString(cgsbjgdy));
        map.put("cgsbjgdr", CommonFunc.convertDoubleToString(cgsbjgdr));
        map.put("cgsbn", CommonFunc.convertDoubleToString(cgsbn));
        map.put("cgtjcs", CommonFunc.convertDoubleToString(cgtjcs));
        map.put("cgxmdq", CommonFunc.convertDoubleToString(cgxmdq));
        map.put("cgdjdy", CommonFunc.convertDoubleToString(cgdjdy));

//        臂头电机
        map.put("cgbtmc", CommonFunc.convertDoubleToString(cgbtmc));
        map.put("cgbtdjxh", CommonFunc.convertDoubleToString(cgbtdjxh));
        map.put("cgbtdjfl", CommonFunc.convertDoubleToString(cgbtdjfl));
        map.put("cgbtdjsb", CommonFunc.convertDoubleToString(cgbtdjsb));
        map.put("cgbtdjsd", CommonFunc.convertDoubleToString(cgbtdjsd));
        map.put("cgbtdjgl", CommonFunc.convertDoubleToString(cgbtdjgl));
        map.put("cgbtdjdl", CommonFunc.convertDoubleToString(cgbtdjdl));
        map.put("cgbtdjdy", CommonFunc.convertDoubleToString(cgbtdjdy));
        map.put("cgbtdjjydj", CommonFunc.convertDoubleToString(cgbtdjjydj));
        map.put("cgbtdjaz", CommonFunc.convertDoubleToString(cgbtdjaz));
        map.put("cgbtdjsl", CommonFunc.convertDoubleToString(cgbtdjsl));
        map.put("cgbtdjpp", CommonFunc.convertDoubleToString(cgbtdjpp));
        map.put("cgbtdjbz", CommonFunc.convertDoubleToString(cgbtdjbz));

        //        臂头电机1
        map.put("cgbtdjxh1", CommonFunc.convertDoubleToString(cgbtdjxh1));
        map.put("cgbtdjfl1", CommonFunc.convertDoubleToString(cgbtdjfl1));
        map.put("cgbtdjsb1", CommonFunc.convertDoubleToString(cgbtdjsb1));
        map.put("cgbtdjsd1", CommonFunc.convertDoubleToString(cgbtdjsd1));
        map.put("cgbtdjgl1", CommonFunc.convertDoubleToString(cgbtdjgl1));
        map.put("cgbtdjdl1", CommonFunc.convertDoubleToString(cgbtdjdl1));
        map.put("cgbtdjdy1", CommonFunc.convertDoubleToString(cgbtdjdy1));
        map.put("cgbtdjjydj1", CommonFunc.convertDoubleToString(cgbtdjjydj1));
        map.put("cgbtdjaz1", CommonFunc.convertDoubleToString(cgbtdjaz1));
        map.put("cgbtdjsl1", CommonFunc.convertDoubleToString(cgbtdjsl1));
        map.put("cgbtdjpp1", CommonFunc.convertDoubleToString(cgbtdjpp1));
        map.put("cgbtdjbz1", CommonFunc.convertDoubleToString(cgbtdjbz1));

//        起升机构电机
        map.put("cgqsjgmc", CommonFunc.convertDoubleToString(cgqsjgmc));
        map.put("cgqsjgdjxh", CommonFunc.convertDoubleToString(cgqsjgdjxh));
        map.put("cgqsjgdjfl", CommonFunc.convertDoubleToString(cgqsjgdjfl));
        map.put("cgqsjgdjsb", CommonFunc.convertDoubleToString(cgqsjgdjsb));
        map.put("cgqsjgdjsd", CommonFunc.convertDoubleToString(cgqsjgdjsd));
        map.put("cgqsjgdjgl", CommonFunc.convertDoubleToString(cgqsjgdjgl));
        map.put("cgqsjgdjdl", CommonFunc.convertDoubleToString(cgqsjgdjdl));
        map.put("cgqsjgdjdy", CommonFunc.convertDoubleToString(cgqsjgdjdy));
        map.put("cgqsjgdjjydj", CommonFunc.convertDoubleToString(cgqsjgdjjydj));
        map.put("cgqsjgdjaz", CommonFunc.convertDoubleToString(cgqsjgdjaz));
        map.put("cgqsjgdjsl", CommonFunc.convertDoubleToString(cgqsjgdjsl));
        map.put("cgqsjgdjpp", CommonFunc.convertDoubleToString(cgqsjgdjpp));
        map.put("cgqsjgdjbz", CommonFunc.convertDoubleToString(cgqsjgdjbz));
//        起升机构电机1
        map.put("cgqsjgdjxh1", CommonFunc.convertDoubleToString(cgqsjgdjxh1));
        map.put("cgqsjgdjfl1", CommonFunc.convertDoubleToString(cgqsjgdjfl1));
        map.put("cgqsjgdjsb1", CommonFunc.convertDoubleToString(cgqsjgdjsb1));
        map.put("cgqsjgdjsd1", CommonFunc.convertDoubleToString(cgqsjgdjsd1));
        map.put("cgqsjgdjgl1", CommonFunc.convertDoubleToString(cgqsjgdjgl1));
        map.put("cgqsjgdjdl1", CommonFunc.convertDoubleToString(cgqsjgdjdl1));
        map.put("cgqsjgdjdy1", CommonFunc.convertDoubleToString(cgqsjgdjdy1));
        map.put("cgqsjgdjjydj1", CommonFunc.convertDoubleToString(cgqsjgdjjydj1));
        map.put("cgqsjgdjaz1", CommonFunc.convertDoubleToString(cgqsjgdjaz1));
        map.put("cgqsjgdjsl1", CommonFunc.convertDoubleToString(cgqsjgdjsl1));
        map.put("cgqsjgdjpp1", CommonFunc.convertDoubleToString(cgqsjgdjpp1));
        map.put("cgqsjgdjbz1", CommonFunc.convertDoubleToString(cgqsjgdjbz1));

//        运行机构电机
        map.put("cgyxmc", CommonFunc.convertDoubleToString(cgyxmc));
        map.put("cgyxdjxh", CommonFunc.convertDoubleToString(cgyxdjxh));
        map.put("cgyxdjfl", CommonFunc.convertDoubleToString(cgyxdjfl));
        map.put("cgyxdjsb", CommonFunc.convertDoubleToString(cgyxdjsb));
        map.put("cgyxdjsd", CommonFunc.convertDoubleToString(cgyxdjsd));
        map.put("cgyxdjgl", CommonFunc.convertDoubleToString(cgyxdjgl));
        map.put("cgyxdjdl", CommonFunc.convertDoubleToString(cgyxdjdl));
        map.put("cgyxdjdy", CommonFunc.convertDoubleToString(cgyxdjdy));
        map.put("cgyxdjjydj", CommonFunc.convertDoubleToString(cgyxdjjydj));
        map.put("cgyxdjaz", CommonFunc.convertDoubleToString(cgyxdjaz));
        map.put("cgyxdjsl", CommonFunc.convertDoubleToString(cgyxdjsl));
        map.put("cgyxdjpp", CommonFunc.convertDoubleToString(cgyxdjpp));
        map.put("cgyxdjbz", CommonFunc.convertDoubleToString(cgyxdjbz));

//        大回转机构电机
        map.put("cgdhzjgmc", CommonFunc.convertDoubleToString(cgdhzjgmc));
        map.put("cgdhzjgdjxh", CommonFunc.convertDoubleToString(cgdhzjgdjxh));
        map.put("cgdhzjgdjfl", CommonFunc.convertDoubleToString(cgdhzjgdjfl));
        map.put("cgdhzjgdjsb", CommonFunc.convertDoubleToString(cgdhzjgdjsb));
        map.put("cgdhzjgdjsd", CommonFunc.convertDoubleToString(cgdhzjgdjsd));
        map.put("cgdhzjgdjgl", CommonFunc.convertDoubleToString(cgdhzjgdjgl));
        map.put("cgdhzjgdjdl", CommonFunc.convertDoubleToString(cgdhzjgdjdl));
        map.put("cgdhzjgdjdy", CommonFunc.convertDoubleToString(cgdhzjgdjdy));
        map.put("cgdhzjgdjjydj", CommonFunc.convertDoubleToString(cgdhzjgdjjydj));
        map.put("cgdhzjgdjaz", CommonFunc.convertDoubleToString(cgdhzjgdjaz));
        map.put("cgdhzjgdjsl", CommonFunc.convertDoubleToString(cgdhzjgdjsl));
        map.put("cgdhzjgdjpp", CommonFunc.convertDoubleToString(cgdhzjgdjpp));
        map.put("cgdhzjgdjbz", CommonFunc.convertDoubleToString(cgdhzjgdjbz));

//        伸缩机构电机
        map.put("cgssjgmc", CommonFunc.convertDoubleToString(cgssjgmc));
        map.put("cgssjgdjxh", CommonFunc.convertDoubleToString(cgssjgdjxh));
        map.put("cgssjgdjfl", CommonFunc.convertDoubleToString(cgssjgdjfl));
        map.put("cgssjgdjsb", CommonFunc.convertDoubleToString(cgssjgdjsb));
        map.put("cgssjgdjsd", CommonFunc.convertDoubleToString(cgssjgdjsd));
        map.put("cgssjgdjgl", CommonFunc.convertDoubleToString(cgssjgdjgl));
        map.put("cgssjgdjdl", CommonFunc.convertDoubleToString(cgssjgdjdl));
        map.put("cgssjgdjdy", CommonFunc.convertDoubleToString(cgssjgdjdy));
        map.put("cgssjgdjjydj", CommonFunc.convertDoubleToString(cgssjgdjjydj));
        map.put("cgssjgdjaz", CommonFunc.convertDoubleToString(cgssjgdjaz));
        map.put("cgssjgdjsl", CommonFunc.convertDoubleToString(cgssjgdjsl));
        map.put("cgssjgdjpp", CommonFunc.convertDoubleToString(cgssjgdjpp));
        map.put("cgssjgdjbz", CommonFunc.convertDoubleToString(cgssjgdjbz));

//        仰臂电机
        map.put("cgybmc", CommonFunc.convertDoubleToString(cgybmc));
        map.put("cgybdjxh", CommonFunc.convertDoubleToString(cgybdjxh));
        map.put("cgybdjfl", CommonFunc.convertDoubleToString(cgybdjfl));
        map.put("cgybdjsb", CommonFunc.convertDoubleToString(cgybdjsb));
        map.put("cgybdjsd", CommonFunc.convertDoubleToString(cgybdjsd));
        map.put("cgybdjgl", CommonFunc.convertDoubleToString(cgybdjgl));
        map.put("cgybdjdl", CommonFunc.convertDoubleToString(cgybdjdl));
        map.put("cgybdjdy", CommonFunc.convertDoubleToString(cgybdjdy));
        map.put("cgybdjjydj", CommonFunc.convertDoubleToString(cgybdjjydj));
        map.put("cgybdjaz", CommonFunc.convertDoubleToString(cgybdjaz));
        map.put("cgybdjsl", CommonFunc.convertDoubleToString(cgybdjsl));
        map.put("cgybdjpp", CommonFunc.convertDoubleToString(cgybdjpp));
        map.put("cgybdjbz", CommonFunc.convertDoubleToString(cgybdjbz));

//        GRU电机
        map.put("cggrumc", CommonFunc.convertDoubleToString(cggrumc));
        map.put("cggrudjxh", CommonFunc.convertDoubleToString(cggrudjxh));
        map.put("cggrudjfl", CommonFunc.convertDoubleToString(cggrudjfl));
        map.put("cggrudjsb", CommonFunc.convertDoubleToString(cggrudjsb));
        map.put("cggrudjsd", CommonFunc.convertDoubleToString(cggrudjsd));
        map.put("cggrudjgl", CommonFunc.convertDoubleToString(cggrudjgl));
        map.put("cggrudjdl", CommonFunc.convertDoubleToString(cggrudjdl));
        map.put("cggrudjdy", CommonFunc.convertDoubleToString(cggrudjdy));
        map.put("cggrudjjydj", CommonFunc.convertDoubleToString(cggrudjjydj));
        map.put("cggrudjaz", CommonFunc.convertDoubleToString(cggrudjaz));
        map.put("cggrudjsl", CommonFunc.convertDoubleToString(cggrudjsl));
        map.put("cggrudjpp", CommonFunc.convertDoubleToString(cggrudjpp));
        map.put("cggrudjbz", CommonFunc.convertDoubleToString(cggrudjbz));

//        吊船电机
        map.put("cgdcmc", CommonFunc.convertDoubleToString(cgdcmc));
        map.put("cgdcdjxh", CommonFunc.convertDoubleToString(cgdcdjxh));
        map.put("cgdcdjfl", CommonFunc.convertDoubleToString(cgdcdjfl));
        map.put("cgdcdjsb", CommonFunc.convertDoubleToString(cgdcdjsb));
        map.put("cgdcdjsd", CommonFunc.convertDoubleToString(cgdcdjsd));
        map.put("cgdcdjgl", CommonFunc.convertDoubleToString(cgdcdjgl));
        map.put("cgdcdjdl", CommonFunc.convertDoubleToString(cgdcdjdl));
        map.put("cgdcdjdy", CommonFunc.convertDoubleToString(cgdcdjdy));
        map.put("cgdcdjjydj", CommonFunc.convertDoubleToString(cgdcdjjydj));
        map.put("cgdcdjaz", CommonFunc.convertDoubleToString(cgdcdjaz));
        map.put("cgdcdjsl", CommonFunc.convertDoubleToString(cgdcdjsl));
        map.put("cgdcdjpp", CommonFunc.convertDoubleToString(cgdcdjpp));
        map.put("cgdcdjbz", CommonFunc.convertDoubleToString(cgdcdjbz));

//        折臂1电机
        map.put("cgzb1djmc", CommonFunc.convertDoubleToString(cgzb1djmc));
        map.put("cgzb1djxh", CommonFunc.convertDoubleToString(cgzb1djxh));
        map.put("cgzb1djfl", CommonFunc.convertDoubleToString(cgzb1djfl));
        map.put("cgzb1djsb", CommonFunc.convertDoubleToString(cgzb1djsb));
        map.put("cgzb1djsd", CommonFunc.convertDoubleToString(cgzb1djsd));
        map.put("cgzb1djgl", CommonFunc.convertDoubleToString(cgzb1djgl));
        map.put("cgzb1djdl", CommonFunc.convertDoubleToString(cgzb1djdl));
        map.put("cgzb1djdy", CommonFunc.convertDoubleToString(cgzb1djdy));
        map.put("cgzb1djjydj", CommonFunc.convertDoubleToString(cgzb1djjydj));
        map.put("cgzb1djaz", CommonFunc.convertDoubleToString(cgzb1djaz));
        map.put("cgzb1djsl", CommonFunc.convertDoubleToString(cgzb1djsl));
        map.put("cgzb1djpp", CommonFunc.convertDoubleToString(cgzb1djpp));
        map.put("cgzb1djbz", CommonFunc.convertDoubleToString(cgzb1djbz));

        //        折臂2电机
        map.put("cgzb2djmc", CommonFunc.convertDoubleToString(cgzb2djmc));
        map.put("cgzb2djxh", CommonFunc.convertDoubleToString(cgzb2djxh));
        map.put("cgzb2djfl", CommonFunc.convertDoubleToString(cgzb2djfl));
        map.put("cgzb2djsb", CommonFunc.convertDoubleToString(cgzb2djsb));
        map.put("cgzb2djsd", CommonFunc.convertDoubleToString(cgzb2djsd));
        map.put("cgzb2djgl", CommonFunc.convertDoubleToString(cgzb2djgl));
        map.put("cgzb2djdl", CommonFunc.convertDoubleToString(cgzb2djdl));
        map.put("cgzb2djdy", CommonFunc.convertDoubleToString(cgzb2djdy));
        map.put("cgzb2djjydj", CommonFunc.convertDoubleToString(cgzb2djjydj));
        map.put("cgzb2djaz", CommonFunc.convertDoubleToString(cgzb2djaz));
        map.put("cgzb2djsl", CommonFunc.convertDoubleToString(cgzb2djsl));
        map.put("cgzb2djpp", CommonFunc.convertDoubleToString(cgzb2djpp));
        map.put("cgzb2djbz", CommonFunc.convertDoubleToString(cgzb2djbz));

        //防风背包电机
        map.put("cgffbbmc", CommonFunc.convertDoubleToString(cgffbbmc));
        map.put("cgffbbdjxh", CommonFunc.convertDoubleToString(cgffbbdjxh));
        map.put("cgffbbdjfl", CommonFunc.convertDoubleToString(cgffbbdjfl));
        map.put("cgffbbdjsb", CommonFunc.convertDoubleToString(cgffbbdjsb));
        map.put("cgffbbdjsd", CommonFunc.convertDoubleToString(cgffbbdjsd));
        map.put("cgffbbdjgl", CommonFunc.convertDoubleToString(cgffbbdjgl));
        map.put("cgffbbdjdl", CommonFunc.convertDoubleToString(cgffbbdjdl));
        map.put("cgffbbdjdy", CommonFunc.convertDoubleToString(cgffbbdjdy));
        map.put("cgffbbdjjydj", CommonFunc.convertDoubleToString(cgffbbdjjydj));
        map.put("cgffbbdjaz", CommonFunc.convertDoubleToString(cgffbbdjaz));
        map.put("cgffbbdjsl", CommonFunc.convertDoubleToString(cgffbbdjsl));
        map.put("cgffbbdjpp", CommonFunc.convertDoubleToString(cgffbbdjpp));
        map.put("cgffbbdjbz", CommonFunc.convertDoubleToString(cgffbbdjbz));

//        其他电机
        map.put("cgqt1", CommonFunc.convertDoubleToString(cgqt1));
        map.put("cgqt1mc", CommonFunc.convertDoubleToString(cgqt1mc));
        map.put("cgqt1djxh", CommonFunc.convertDoubleToString(cgqt1djxh));
        map.put("cgqt1djfl", CommonFunc.convertDoubleToString(cgqt1djfl));
        map.put("cgqt1djsb", CommonFunc.convertDoubleToString(cgqt1djsb));
        map.put("cgqt1djsd", CommonFunc.convertDoubleToString(cgqt1djsd));
        map.put("cgqt1djgl", CommonFunc.convertDoubleToString(cgqt1djgl));
        map.put("cgqt1djdl", CommonFunc.convertDoubleToString(cgqt1djdl));
        map.put("cgqt1djdy", CommonFunc.convertDoubleToString(cgqt1djdy));
        map.put("cgqt1djjydj", CommonFunc.convertDoubleToString(cgqt1djjydj));
        map.put("cgqt1djaz", CommonFunc.convertDoubleToString(cgqt1djaz));
        map.put("cgqt1djsl", CommonFunc.convertDoubleToString(cgqt1djsl));
        map.put("cgqt1djpp", CommonFunc.convertDoubleToString(cgqt1djpp));
        map.put("cgqt1djbz", CommonFunc.convertDoubleToString(cgqt1djbz));

        //        臂头回转支承
        map.put("cgbthzzcmc", CommonFunc.convertDoubleToString(cgbthzzcmc));
        map.put("cgbthzzcxh", CommonFunc.convertDoubleToString(cgbthzzcxh));
        map.put("cgbthzzcms", CommonFunc.convertDoubleToString(cgbthzzcms));
        map.put("cgbthzzccs", CommonFunc.convertDoubleToString(cgbthzzccs));
        map.put("cgbthzzcaz", CommonFunc.convertDoubleToString(cgbthzzcaz));
        map.put("cgbthzzcsl", CommonFunc.convertDoubleToString(cgbthzzcsl));
        map.put("cgbthzzcpp", CommonFunc.convertDoubleToString(cgbthzzcpp));
        map.put("cgbthzzcbz", CommonFunc.convertDoubleToString(cgbthzzcbz));

        //        大回转机构回转支承
        map.put("cgdhzjghzzcmc", CommonFunc.convertDoubleToString(cgdhzjghzzcmc));
        map.put("cgdhzjghzzcxh", CommonFunc.convertDoubleToString(cgdhzjghzzcxh));
        map.put("cgdhzjghzzcms", CommonFunc.convertDoubleToString(cgdhzjghzzcms));
        map.put("cgdhzjghzzccs", CommonFunc.convertDoubleToString(cgdhzjghzzccs));
        map.put("cgdhzjghzzcaz", CommonFunc.convertDoubleToString(cgdhzjghzzcaz));
        map.put("cgdhzjghzzcsl", CommonFunc.convertDoubleToString(cgdhzjghzzcsl));
        map.put("cgdhzjghzzcpp", CommonFunc.convertDoubleToString(cgdhzjghzzcpp));
        map.put("cgdhzjghzzcbz", CommonFunc.convertDoubleToString(cgdhzjghzzcbz));

        //        折臂1回转支承
        map.put("cgzb1hzzcmc", CommonFunc.convertDoubleToString(cgzb1hzzcxh));
        map.put("cgzb1hzzcxh", CommonFunc.convertDoubleToString(cgzb1hzzcxh));
        map.put("cgzb1hzzcms", CommonFunc.convertDoubleToString(cgzb1hzzcms));
        map.put("cgzb1hzzccs", CommonFunc.convertDoubleToString(cgzb1hzzccs));
        map.put("cgzb1hzzcaz", CommonFunc.convertDoubleToString(cgzb1hzzcaz));
        map.put("cgzb1hzzcsl", CommonFunc.convertDoubleToString(cgzb1hzzcsl));
        map.put("cgzb1hzzcpp", CommonFunc.convertDoubleToString(cgzb1hzzcpp));
        map.put("cgzb1hzzcbz", CommonFunc.convertDoubleToString(cgzb1hzzcbz));

        //        折臂2回转支承
        map.put("cgzb2hzzcmc", CommonFunc.convertDoubleToString(cgzb2hzzcxh));
        map.put("cgzb2hzzcxh", CommonFunc.convertDoubleToString(cgzb2hzzcxh));
        map.put("cgzb2hzzcms", CommonFunc.convertDoubleToString(cgzb2hzzcms));
        map.put("cgzb2hzzccs", CommonFunc.convertDoubleToString(cgzb2hzzccs));
        map.put("cgzb2hzzcaz", CommonFunc.convertDoubleToString(cgzb2hzzcaz));
        map.put("cgzb2hzzcsl", CommonFunc.convertDoubleToString(cgzb2hzzcsl));
        map.put("cgzb2hzzcpp", CommonFunc.convertDoubleToString(cgzb2hzzcpp));
        map.put("cgzb2hzzcbz", CommonFunc.convertDoubleToString(cgzb2hzzcbz));

        //        其他回转支承
        map.put("cgqt2", CommonFunc.convertDoubleToString(cgqt2));
        map.put("cgqt2mc", CommonFunc.convertDoubleToString(cgqt2mc));
        map.put("cgqt2hzzcxh", CommonFunc.convertDoubleToString(cgqt2hzzcxh));
        map.put("cgqt2hzzcms", CommonFunc.convertDoubleToString(cgqt2hzzcms));
        map.put("cgqt2hzzccs", CommonFunc.convertDoubleToString(cgqt2hzzccs));
        map.put("cgqt2hzzcaz", CommonFunc.convertDoubleToString(cgqt2hzzcaz));
        map.put("cgqt2hzzcsl", CommonFunc.convertDoubleToString(cgqt2hzzcsl));
        map.put("cgqt2hzzcpp", CommonFunc.convertDoubleToString(cgqt2hzzcpp));
        map.put("cgqt2hzzcbz", CommonFunc.convertDoubleToString(cgqt2hzzcbz));

        //       生命绳
        map.put("cgsmsgg", CommonFunc.convertDoubleToString(cgsmsgg));
        map.put("cgsmscd", CommonFunc.convertDoubleToString(cgsmscd));
        map.put("cgsmscz", CommonFunc.convertDoubleToString(cgsmscz));
        map.put("cgsmssl", CommonFunc.convertDoubleToString(cgsmssl));
        map.put("cgsmspp", CommonFunc.convertDoubleToString(cgsmspp));
        map.put("cgsmsbz", CommonFunc.convertDoubleToString(cgsmsbz));

        //       吊船液压
        map.put("cgdcyymc", CommonFunc.convertDoubleToString(cgdcyymc));
        map.put("cgdcyydgj", CommonFunc.convertDoubleToString(cgdcyydgj));
        map.put("cgdcyyzgj", CommonFunc.convertDoubleToString(cgdcyyzgj));
        map.put("cgdcyyxgj", CommonFunc.convertDoubleToString(cgdcyyxgj));
        map.put("cgdcyyxc", CommonFunc.convertDoubleToString(cgdcyyxc));
        map.put("cgdcyyazj", CommonFunc.convertDoubleToString(cgdcyyazj));
        map.put("cgdcyygl", CommonFunc.convertDoubleToString(cgdcyygl));
        map.put("cgdcyydl", CommonFunc.convertDoubleToString(cgdcyydl));
        map.put("cgdcyydy", CommonFunc.convertDoubleToString(cgdcyydy));
        map.put("cgdcyysl", CommonFunc.convertDoubleToString(cgdcyysl));
        map.put("cgdcyypp", CommonFunc.convertDoubleToString(cgdcyypp));
        map.put("cgdcyybz", CommonFunc.convertDoubleToString(cgdcyybz));

        //       伸缩液压
        map.put("cgssyymc", CommonFunc.convertDoubleToString(cgssyymc));
        map.put("cgssyydgj", CommonFunc.convertDoubleToString(cgssyydgj));
        map.put("cgssyyzgj", CommonFunc.convertDoubleToString(cgssyyzgj));
        map.put("cgssyyxgj", CommonFunc.convertDoubleToString(cgssyyxgj));
        map.put("cgssyyxc", CommonFunc.convertDoubleToString(cgssyyxc));
        map.put("cgssyyazj", CommonFunc.convertDoubleToString(cgssyyazj));
        map.put("cgssyydy", CommonFunc.convertDoubleToString(cgssyydy));
        map.put("cgssyysl", CommonFunc.convertDoubleToString(cgssyysl));
        map.put("cgssyypp", CommonFunc.convertDoubleToString(cgssyypp));
        map.put("cgssyybz", CommonFunc.convertDoubleToString(cgssyybz));

        //       仰臂液压
        map.put("cgybyymc", CommonFunc.convertDoubleToString(cgybyymc));
        map.put("cgybyydgj", CommonFunc.convertDoubleToString(cgybyydgj));
        map.put("cgybyyzgj", CommonFunc.convertDoubleToString(cgybyyzgj));
        map.put("cgybyyxgj", CommonFunc.convertDoubleToString(cgybyyxgj));
        map.put("cgybyyxc", CommonFunc.convertDoubleToString(cgybyyxc));
        map.put("cgybyyazj", CommonFunc.convertDoubleToString(cgybyyazj));
        map.put("cgybyydy", CommonFunc.convertDoubleToString(cgybyydy));
        map.put("cgybyysl", CommonFunc.convertDoubleToString(cgybyysl));
        map.put("cgybyypp", CommonFunc.convertDoubleToString(cgybyypp));
        map.put("cgybyybz", CommonFunc.convertDoubleToString(cgybyybz));

        //       顶升液压
        map.put("cgdsyymc", CommonFunc.convertDoubleToString(cgdsyymc));
        map.put("cgdsyydgj", CommonFunc.convertDoubleToString(cgdsyydgj));
        map.put("cgdsyyzgj", CommonFunc.convertDoubleToString(cgdsyyzgj));
        map.put("cgdsyyxgj", CommonFunc.convertDoubleToString(cgdsyyxgj));
        map.put("cgdsyyxc", CommonFunc.convertDoubleToString(cgdsyyxc));
        map.put("cgdsyyazj", CommonFunc.convertDoubleToString(cgdsyyazj));
        map.put("cgdsyydy", CommonFunc.convertDoubleToString(cgdsyydy));
        map.put("cgdsyysl", CommonFunc.convertDoubleToString(cgdsyysl));
        map.put("cgdsyypp", CommonFunc.convertDoubleToString(cgdsyypp));
        map.put("cgdsyybz", CommonFunc.convertDoubleToString(cgdsyybz));

//整机液压功率、电流
        map.put("cgyygl", CommonFunc.convertDoubleToString(cgyygl));
        map.put("cgyydl", CommonFunc.convertDoubleToString(cgyydl));
        map.put("cgyydjxh", CommonFunc.convertDoubleToString(cgyydjxh));
        map.put("cgyydjpp", CommonFunc.convertDoubleToString(cgyydjpp));
        map.put("cgyydjsl", CommonFunc.convertDoubleToString(cgyydjsl));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();

        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        return map;
    }


    private String takeSignByCompareNumber(Double a, Double b) {
        if (a > b) {
            return ">";
        } else if (a == b) {
            return "=";
        } else {
            return "<";
        }
    }
    //    private String takeEnStringByCompareNumber(Double a, Double b) {
//        if (a > b) {
//            return "doesn't meet";
//        } else {
//            return "meets";
//        }
//    }
    private String takeStringByCompareNumber(Double a, Double b) {
        if (a > b) {
            return "不满足";
        } else {
            return "满足";
        }
    }

    public Map<String, String> takeStringMapForPdf(String type) {
        Map map = new HashMap();
        Map<String, Double> doubleMap = takeDoubleMapForPdf(type);


        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
