package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PurchaseOrderMheEntity {
    private String xmmc;
    private String zjxh;
    private String plh;
    private String jsr;
    private String cgsbjgdn;
    private String cgsbjgdy;
    private String cgsbjgdr;
    private String cgsbn;

//    手填电压频率
    private String cgdqdy;
    private String cgdqpl;
    private String cgdqdypl;

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
    private String cgssjgdjxh1;
    private String cgssjgdjfl1;
    private String cgssjgdjsb1;
    private String cgssjgdjsd1;
    private String cgssjgdjgl1;
    private String cgssjgdjdl1;
    private String cgssjgdjdy1;
    private String cgssjgdjjydj1;
    private String cgssjgdjaz1;
    private String cgssjgdjsl1;
    private String cgssjgdjpp1;
    private String cgssjgdjbz1;


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

    //     下拉
    private String btModel;

    private String qsjgModel;

    private String yxjgModel;

    private String cgdhzjgmkModel;
    private String dhzjgModel;
    private String fbdhzjgdjModel;

    private String ssjgModel;

    private String cgybModel;

    private String gruModel;

    private String cgdcModel;

    private String cgzb1Model;
    private String cgzb2Model;

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

//        收到填写电压频率
        map.put("cgdqdy", CommonFunc.convertDoubleToString(cgdqdy));
        map.put("cgdqpl", CommonFunc.convertDoubleToString(cgdqpl));
        map.put("cgdqdypl", CommonFunc.convertDoubleToString(cgdqdypl));

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
        map.put("cgssjgdjxh1", CommonFunc.convertDoubleToString(cgssjgdjxh1));
        map.put("cgssjgdjfl1", CommonFunc.convertDoubleToString(cgssjgdjfl1));
        map.put("cgssjgdjsb1", CommonFunc.convertDoubleToString(cgssjgdjsb1));
        map.put("cgssjgdjsd1", CommonFunc.convertDoubleToString(cgssjgdjsd1));
        map.put("cgssjgdjgl1", CommonFunc.convertDoubleToString(cgssjgdjgl1));
        map.put("cgssjgdjdl1", CommonFunc.convertDoubleToString(cgssjgdjdl1));
        map.put("cgssjgdjdy1", CommonFunc.convertDoubleToString(cgssjgdjdy1));
        map.put("cgssjgdjjydj1", CommonFunc.convertDoubleToString(cgssjgdjjydj1));
        map.put("cgssjgdjaz1", CommonFunc.convertDoubleToString(cgssjgdjaz1));
        map.put("cgssjgdjsl1", CommonFunc.convertDoubleToString(cgssjgdjsl1));
        map.put("cgssjgdjpp1", CommonFunc.convertDoubleToString(cgssjgdjpp1));
        map.put("cgssjgdjbz1", CommonFunc.convertDoubleToString(cgssjgdjbz1));

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

//        map.put("cgdqdy", CommonFunc.convertDoubleToString(cgdqdy));
//        map.put("cgdqpl", CommonFunc.convertDoubleToString(cgdqpl));
//        String cgdqdypl = cgdqdy + ' ' + cgdqpl ;
//        map.put("cgdqdypl", CommonFunc.convertDoubleToString(cgdqdypl));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
