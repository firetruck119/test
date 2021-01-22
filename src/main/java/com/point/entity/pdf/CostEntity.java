package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class CostEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    //    吊船
    private String cbdct;
    private String cbdcmc;
    private Double cbdcsl;
    private Double cbdcdj;

    //    臂头
    private String cbbtt;
    private String cbbtmc;
    private Double cbbtsl;
    private Double cbbtdj;

    //    伸缩机构
    private String cbssjgt;
    private String cbssjgmc;
    private Double cbssjgsl;
    private Double cbssjgdj;

    //    GRU
    private String cbgrut;
    private String cbgrumc;
    private Double cbgrusl;
    private Double cbgrudj;

    //    起升机构
    private String cbqsjgt;
    private String cbqsjgmc;
    private Double cbqsjgsl;
    private Double cbqsjgdj;

    //   收揽器
    private String cbslqt;
    private String cbslqmc;
    private Double cbslqsl;
    private Double cbslqdj;

    //    大回转机构
    private String cbhzt;
    private String cbhzmc;
    private Double cbhzsl;
    private Double cbhzdj;

    //    运行机构
    private String cbyxt;
    private String cbyxmc;
    private Double cbyxsl;
    private Double cbyxdj;

    //    夹轨器
    private String cbjgqt;
    private String cbjgqmc;
    private Double cbjgqsl;
    private Double cbjgqdj;

    //    大臂
    private String cbdbmc;
    private Double cbdbzl;
    private Double cbdbdj;
    private Double cbdblyl;

    //    配重块
    private String cbpzkmc;
    private Double cbpzkzl;
    private Double cbpzkdj;
    private Double cbpzklyl;
    private Double cbpzfgzl;
    private Double cbpzfgdj;
    private Double cbpzfglyl;
    private Double cbpzktzl;
    private Double cbpzktdj;
    private Double cbpzktlyl;

    //    配重箱体
    private Double cbpzxtzl;
    private Double cbpzxtdj;
    private Double cbpzxtlyl;

    //    立柱
    private String cblzmc;
    private Double cblzzl;
    private Double cblzdj;
    private Double cblzlyl;

    //    底架
    private String cbdjmc;
    private Double cbdjzl;
    private Double cbdjdj;
    private Double cbdjlyl;

    //    3大件热浸锌、油漆、气体
    private Double cb3zl;
    private Double cb3jxdj;
    private Double cb3yqdj;
    private Double cb3hszl;
    private Double cb3hsdj;
    private Double cb3qdj;

    //    臂头电机
    private String cbbtdjxh;
    private Double cbbtdjsl;
    private Double cbbtdjdj;

    //    伸缩机构电机
    private String cbssjgdjxh;
    private Double cbssjgdjsl;
    private Double cbssjgdjdj;

    //    GRU电机
    private String cbgrudjxh;
    private Double cbgrudjsl;
    private Double cbgrudjdj;

    //    起升机构电机1
    private String cbqsjgdj1xh;
    private Double cbqsjgdj1sl;
    private Double cbqsjgdj1dj;

    //    起升机构电机2
    private String cbqsjgdj2xh;
    private Double cbqsjgdj2sl;
    private Double cbqsjgdj2dj;

    //    大回转机构电机
    private String cbhzdjxh;
    private Double cbhzdjsl;
    private Double cbhzdjdj;

    //    主动运行电机
    private String cbyxdjxh;
    private Double cbyxdjsl;
    private Double cbyxdjdj;

    //    吊船钢丝绳
    private String cbdcgssmc;
    private Double cbdcgsssl;
    private Double cbdcgsscd;
    private Double cbdcgssdj;

    //    GRU钢丝绳
    private String cbgrugssmc;
    private Double cbgrugsssl;
    private Double cbgrugsscd;
    private Double cbgrugssdj;

    //    安全绳
    private Double cbaqssl;
    private Double cbaqscd;
    private Double cbaqsdj;

    //    齿条
    private String cbctmc;
    private Double cbctsl;
    private Double cbctcd;
    private Double cbctdj;

    //    臂头回转支承
    private String cbbthzzcxh;
    private Double cbbthzzcsl;
    private Double cbbthzzcdj;

    //    大回转机构回转支承
    private String cbhzhzzcxh;
    private Double cbhzhzzcsl;
    private Double cbhzhzzcdj;

    //    伸缩臂链条1246
    private Double cblt1sl;
    private Double cblt1cd;
    private Double cblt1dj;
    private Double cblt1lyl;

    //    伸缩臂链条1266
    private Double cblt2sl;
    private Double cblt2cd;
    private Double cblt2dj;
    private Double cblt2lyl;

    //    伸缩臂链条1666
    private Double cblt3sl;
    private Double cblt3cd;
    private Double cblt3dj;
    private Double cblt3lyl;

    //    伸缩臂链条2466
    private Double cblt4sl;
    private Double cblt4cd;
    private Double cblt4dj;
    private Double cblt4lyl;

    //    移动配重链条1246
    private Double cblt5sl;
    private Double cblt5cd;
    private Double cblt5dj;
    private Double cblt5lyl;

    //    防风销座
    private Double cbxzsl;
    private Double cbxzzl;
    private Double cbxzdj;

    //    防风销钉
    private String cbxdxh;
    private Double cbxdsl;
    private Double cbxddj;

    //    伸缩臂机加件
    private String cbssjjmc;
    private Double cbssjjsl;
    private Double cbssjjdj;

    //    大臂-立柱销轴
    private String cbdbxzmc;
    private Double cbdbxzsl;
    private Double cbdbxzdj;

    //    电气元件
    private String cbdqmc;
    private Double cbdqsl;
    private Double cbdqdj;

    //    液压系统
    private String cbyymc;
    private Double cbyysl;
    private Double cbyydj;

    //    轨道
    private String cbgdxh;
    private String cbgdcz;
    private Double cbgdsl;
    private Double cbgdzl;
    private Double cbgddj;
    private Double cbgdlyl;

    //    轨道热浸锌
    private Double cbgdjxsl;
    private Double cbgdjxdj;

    //    埋板
    private String cbmbxh;
    private String cbmbcz;
    private Double cbmbsl;
    private Double cbmbmzl;
    private Double cbmbzl;
    private Double cbmbdj;
    private String cbmbdjdw;
    private Double cbmblyl;

    //    埋板热浸锌
    private Double cbmbjxsl;
    private Double cbmbjxdj;

    //    地脚螺栓
    private String cbdjlsxh;
    private String cbdjlscz;
    private Double cbdjlssl;
    private Double cbdjlsdj;


    //    马道
    private String cbmdcz;
    private Double cbmdsl;
    private Double cbmdmj;
    private Double cbmddj;

    //    护栏
    private String cbhlcz;
    private Double cbhlsl;
    private Double cbhlcd;
    private Double cbhldj;

    //    爬梯
    private String cbptcz;
    private Double cbptsl;
    private Double cbptcd;
    private Double cbptdj;

    //    GRU检修平台
    private String cbgrujxmc;
    private Double cbgrujxsl;
    private Double cbgrujxzl;
    private Double cbgrujxdj;
    private Double cbgrujxlyl;

    //     起升机构检修平台
    private String cbqsjgjxmc;
    private Double cbqsjgjxsl;
    private Double cbqsjgjxzl;
    private Double cbqsjgjxdj;
    private Double cbqsjgjxlyl;

    //    伸缩机构检修平台
    private String cbssjgjxmc;
    private Double cbssjgjxsl;
    private Double cbssjgjxzl;
    private Double cbssjgjxdj;
    private Double cbssjgjxlyl;

    //    试验轨道
    private Double cbsygdsl;
    private Double cbsygdzl;
    private Double cbsygddj;

    //    试验架
    private Double cbsyjsl;
    private Double cbsyjzl;
    private Double cbsyjdj;

    //    木方
    private Double cbmfsl;
//    private Double cbmftj;
    private Double cbmfdj;
//    private String cbmfdjdw;

    //    包装
//    private Double cbbzsl;
//    private Double cbbzdj;

    //    6.8m车
    private Double cbc1lc;
    private Double cbc1zzl;
    private Double cbc1sl;
    private Double cbc1dj;

    //    9.6m车
    private Double cbc2lc;
    private Double cbc2zzl;
    private Double cbc2sl;
    private Double cbc2dj;

    //    13.0m车
    private Double cbc3lc;
    private Double cbc3zzl;
    private Double cbc3sl;
    private Double cbc3dj;

    //    17.5m车
    private Double cbc4lc;
    private Double cbc4zzl;
    private Double cbc4sl;
    private Double cbc4dj;

    //    8模块成本小计(含税)
    private Double cbdchszj;
    private Double cbbthszj;
    private Double cbssjghszj;
    private Double cbgruhszj;
    private Double cbqsjghszj;
    private Double cbslqhszj;
    private Double cbhzhszj;
    private Double cbyxhszj;
    private Double cbjgqhszj;

    //    8模块成本小计
    private Double cbdczj;
    private Double cbbtzj;
    private Double cbssjgzj;
    private Double cbgruzj;
    private Double cbqsjgzj;
    private Double cbslqzj;
    private Double cbhzzj;
    private Double cbyxzj;
    private Double cbjgqzj;

    //    3大件成本小计
    private Double cbdbzj;
    private Double cbpzkzj;
    private Double cbpzfgzj;
    private Double cbpzktzj;
    private Double cbpzxtzj;
    private Double cblzzj;
    private Double cbdjzj;
    private Double cb3jxzj;
    private Double cb3yqzj;
    private Double cb3hszj;
    private Double cb3qzj;

    //    电机成本小计
    private Double cbbtdjzj;
    private Double cbssjgdjzj;
    private Double cbgrudjzj;
    private Double cbqsjgdj1zj;
    private Double cbqsjgdj2zj;
    private Double cbhzdjzj;
    private Double cbyxdjzj;

    //    擦窗机外购件成本小计
    private Double cbdcgsszj;
    private Double cbgrugsszj;
    private Double cbaqszj;
    private Double cbctzj;
    private Double cbbthzzczj;
    private Double cbhzhzzczj;

    //    擦窗机外协件成本小计
    private Double cblt1zj;
    private Double cblt2zj;
    private Double cblt3zj;
    private Double cblt4zj;
    private Double cblt5zj;
    private Double cbxzzj;
    private Double cbxdzj;
    private Double cbssjjzj;
    private Double cbdbxzzj;

    //    电气液压系统成本小计
    private Double cbdqzj;
    private Double cbyyzj;

    //    轨道成本小计
    private Double cbgdzj;
    private Double cbgdjxzj;
    private Double cbmbzj;
    private Double cbmbjxzj;
    private Double cbdjlszj;
    private Double cbmdzj;
    private Double cbhlzj;
    private Double cbptzj;

    //    检修平台成本小计
    private Double cbgrujxzj;
    private Double cbqsjgjxzj;
    private Double cbssjgjxzj;

    //    工厂内作业成本小计
    private Double cbsygdzj;
    private Double cbsyjzj;

    //    包装成本小计
    private Double cbmfzj;
//    private Double cbbzzj;

    //    运输成本小计
    private Double cbc1zj;
    private Double cbc2zj;
    private Double cbc3zj;
    private Double cbc4zj;

//    前端填写数值
    private Double lg;
    private Double ll;
    private Double cbgdmmzl;
    private Double cbgdcd;

//    后台
    private Double m4;
    private Double m12;
    private Double m15;
    private String djlx;

    //     下拉
    private String dcModel;
    private String btModel;
    private String ssjgModel;
    private String gruModel;
    private String qsjgModel;
    private String slqModel;
    private String dhzjgModel;
    private String yxjgModel;
    private String jgqModel;
    private String dbxhModel;
    private String pzkModel;
    private String lzxhModel;
    private String djxhModel;
    private String dcgssModel;
    private String ctxhModel;
    private String lt1Model;
    private String lt2Model;
    private String lt3Model;
    private String lt4Model;
    private String lt5Model;
    private String xdModel;
    private String gdModel;
    private String gdczModel;
    private String mbModel;
    private String djlsModel;
    private String grujxModel;
    private String qsjgjxModel;
    private String ssjgjxModel;
    private String mfModel;
    private String yscsModel;

//    private String djModel;

    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        map.put("no", CommonFunc.convertDoubleToString(no));
        map.put("ver", CommonFunc.convertDoubleToString(ver));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("shr", CommonFunc.convertDoubleToString(shr));
        map.put("pzr", CommonFunc.convertDoubleToString(pzr));
        map.put("date", CommonFunc.convertDoubleToString(date));

//        吊船
        map.put("cbdct", CommonFunc.convertDoubleToString(cbdct));
        map.put("cbdcmc", CommonFunc.convertDoubleToString(cbdcmc));
        map.put("cbdcsl", CommonFunc.convertDoubleToString(cbdcsl));
        map.put("cbdcdj", CommonFunc.convertDoubleToString(cbdcdj));

//        臂头
        map.put("cbbtt", CommonFunc.convertDoubleToString(cbbtt));
        map.put("cbbtmc", CommonFunc.convertDoubleToString(cbbtmc));
        map.put("cbbtsl", CommonFunc.convertDoubleToString(cbbtsl));
        map.put("cbbtdj", CommonFunc.convertDoubleToString(cbbtdj));

        //        伸缩机构
        map.put("cbssjgt", CommonFunc.convertDoubleToString(cbssjgt));
        map.put("cbssjgmc", CommonFunc.convertDoubleToString(cbssjgmc));
        map.put("cbssjgsl", CommonFunc.convertDoubleToString(cbssjgsl));
        map.put("cbssjgdj", CommonFunc.convertDoubleToString(cbssjgdj));

        //        GRU
        map.put("cbgrut", CommonFunc.convertDoubleToString(cbgrut));
        map.put("cbgrumc", CommonFunc.convertDoubleToString(cbgrumc));
        map.put("cbgrusl", CommonFunc.convertDoubleToString(cbgrusl));
        map.put("cbgrudj", CommonFunc.convertDoubleToString(cbgrudj));

        //        起升机构
        map.put("cbqsjgt", CommonFunc.convertDoubleToString(cbqsjgt));
        map.put("cbqsjgmc", CommonFunc.convertDoubleToString(cbqsjgmc));
        map.put("cbqsjgsl", CommonFunc.convertDoubleToString(cbqsjgsl));
        map.put("cbqsjgdj", CommonFunc.convertDoubleToString(cbqsjgdj));

        //        收揽器
        map.put("cbslqt", CommonFunc.convertDoubleToString(cbslqt));
        map.put("cbslqmc", CommonFunc.convertDoubleToString(cbslqmc));
        map.put("cbslqsl", CommonFunc.convertDoubleToString(cbslqsl));
        map.put("cbslqdj", CommonFunc.convertDoubleToString(cbslqdj));

        //        大回转机构
        map.put("cbhzt", CommonFunc.convertDoubleToString(cbhzt));
        map.put("cbhzmc", CommonFunc.convertDoubleToString(cbhzmc));
        map.put("cbhzsl", CommonFunc.convertDoubleToString(cbhzsl));
        map.put("cbhzdj", CommonFunc.convertDoubleToString(cbhzdj));

        //        运行机构
        map.put("cbyxt", CommonFunc.convertDoubleToString(cbyxt));
        map.put("cbyxmc", CommonFunc.convertDoubleToString(cbyxmc));
        map.put("cbyxsl", CommonFunc.convertDoubleToString(cbyxsl));
        map.put("cbyxdj", CommonFunc.convertDoubleToString(cbyxdj));

        //        夹轨器
        map.put("cbjgqt", CommonFunc.convertDoubleToString(cbjgqt));
        map.put("cbjgqmc", CommonFunc.convertDoubleToString(cbjgqmc));
        map.put("cbjgqsl", CommonFunc.convertDoubleToString(cbjgqsl));
        map.put("cbjgqdj", CommonFunc.convertDoubleToString(cbjgqdj));

        //        大臂
        map.put("cbdbmc", CommonFunc.convertDoubleToString(cbdbmc));
        map.put("cbdbzl", CommonFunc.convertDoubleToString(cbdbzl));
        map.put("cbdbdj", CommonFunc.convertDoubleToString(cbdbdj));
        map.put("cbdblyl", CommonFunc.convertDoubleToString(cbdblyl));

        //        配重块
        map.put("cbpzkmc", CommonFunc.convertDoubleToString(cbpzkmc));
        map.put("cbpzkzl", CommonFunc.convertDoubleToString(cbpzkzl));
        map.put("cbpzkdj", CommonFunc.convertDoubleToString(cbpzkdj));
        map.put("cbpzklyl", CommonFunc.convertDoubleToString(cbpzklyl));
        map.put("cbpzfgzl", CommonFunc.convertDoubleToString(cbpzfgzl));
        map.put("cbpzfgdj", CommonFunc.convertDoubleToString(cbpzfgdj));
        map.put("cbpzfglyl", CommonFunc.convertDoubleToString(cbpzfglyl));
        map.put("cbpzktzl", CommonFunc.convertDoubleToString(cbpzktzl));
        map.put("cbpzktdj", CommonFunc.convertDoubleToString(cbpzktdj));
        map.put("cbpzktlyl", CommonFunc.convertDoubleToString(cbpzktlyl));

        //        配重箱体
        map.put("cbpzxtzl", CommonFunc.convertDoubleToString(cbpzxtzl));
        map.put("cbpzxtdj", CommonFunc.convertDoubleToString(cbpzxtdj));
        map.put("cbpzxtlyl", CommonFunc.convertDoubleToString(cbpzxtlyl));

        //        立柱
        map.put("cblzmc", CommonFunc.convertDoubleToString(cblzmc));
        map.put("cblzzl", CommonFunc.convertDoubleToString(cblzzl));
        map.put("cblzdj", CommonFunc.convertDoubleToString(cblzdj));
        map.put("cblzlyl", CommonFunc.convertDoubleToString(cblzlyl));

        //        底架
        map.put("cbdjmc", CommonFunc.convertDoubleToString(cbdjmc));
        map.put("cbdjzl", CommonFunc.convertDoubleToString(cbdjzl));
        map.put("cbdjdj", CommonFunc.convertDoubleToString(cbdjdj));
        map.put("cbdjlyl", CommonFunc.convertDoubleToString(cbdjlyl));

        //        3大件热浸锌、油漆、气体
        map.put("cb3zl", CommonFunc.convertDoubleToString(cb3zl));
        map.put("cb3jxdj", CommonFunc.convertDoubleToString(cb3jxdj));
        map.put("cb3yqdj", CommonFunc.convertDoubleToString(cb3yqdj));
        map.put("cb3hszl", CommonFunc.convertDoubleToString(cb3hszl));
        map.put("cb3hsdj", CommonFunc.convertDoubleToString(cb3hsdj));
        map.put("cb3qdj", CommonFunc.convertDoubleToString(cb3qdj));

        //       臂头电机
        map.put("cbbtdjxh", CommonFunc.convertDoubleToString(cbbtdjxh));
        map.put("cbbtdjsl", CommonFunc.convertDoubleToString(cbbtdjsl));
        map.put("cbbtdjdj", CommonFunc.convertDoubleToString(cbbtdjdj));

        //       伸缩机构电机
        map.put("cbssjgdjxh", CommonFunc.convertDoubleToString(cbssjgdjxh));
        map.put("cbssjgdjsl", CommonFunc.convertDoubleToString(cbssjgdjsl));
        map.put("cbssjgdjdj", CommonFunc.convertDoubleToString(cbssjgdjdj));

        //       GRU电机
        map.put("cbgrudjxh", CommonFunc.convertDoubleToString(cbgrudjxh));
        map.put("cbgrudjsl", CommonFunc.convertDoubleToString(cbgrudjsl));
        map.put("cbgrudjdj", CommonFunc.convertDoubleToString(cbgrudjdj));

        //       起升机构电机1
        map.put("cbqsjgdj1xh", CommonFunc.convertDoubleToString(cbqsjgdj1xh));
        map.put("cbqsjgdj1sl", CommonFunc.convertDoubleToString(cbqsjgdj1sl));
        map.put("cbqsjgdj1dj", CommonFunc.convertDoubleToString(cbqsjgdj1dj));

        //       起升机构电机2
        map.put("cbqsjgdj2xh", CommonFunc.convertDoubleToString(cbqsjgdj2xh));
        map.put("cbqsjgdj2sl", CommonFunc.convertDoubleToString(cbqsjgdj2sl));
        map.put("cbqsjgdj2dj", CommonFunc.convertDoubleToString(cbqsjgdj2dj));

        //       大回转机构电机
        map.put("cbhzdjxh", CommonFunc.convertDoubleToString(cbhzdjxh));
        map.put("cbhzdjsl", CommonFunc.convertDoubleToString(cbhzdjsl));
        map.put("cbhzdjdj", CommonFunc.convertDoubleToString(cbhzdjdj));

        //       主动运行电机
        map.put("cbyxdjxh", CommonFunc.convertDoubleToString(cbyxdjxh));
        map.put("cbyxdjsl", CommonFunc.convertDoubleToString(cbyxdjsl));
        map.put("cbyxdjdj", CommonFunc.convertDoubleToString(cbyxdjdj));

        //       吊船钢丝绳
        map.put("cbdcgssmc", CommonFunc.convertDoubleToString(cbdcgssmc));
        map.put("cbdcgsssl", CommonFunc.convertDoubleToString(cbdcgsssl));
        map.put("cbdcgsscd", CommonFunc.convertDoubleToString(cbdcgsscd));
        map.put("cbdcgssdj", CommonFunc.convertDoubleToString(cbdcgssdj));

        //       GRU钢丝绳
        map.put("cbgrugssmc", CommonFunc.convertDoubleToString(cbgrugssmc));
        map.put("cbgrugsssl", CommonFunc.convertDoubleToString(cbgrugsssl));
        map.put("cbgrugsscd", CommonFunc.convertDoubleToString(cbgrugsscd));
        map.put("cbgrugssdj", CommonFunc.convertDoubleToString(cbgrugssdj));

        //       安全绳
        map.put("cbaqssl", CommonFunc.convertDoubleToString(cbaqssl));
        map.put("cbaqscd", CommonFunc.convertDoubleToString(cbaqscd));
        map.put("cbaqsdj", CommonFunc.convertDoubleToString(cbaqsdj));

        //       齿条
        map.put("cbctmc", CommonFunc.convertDoubleToString(cbctmc));
        map.put("cbctsl", CommonFunc.convertDoubleToString(cbctsl));
        map.put("cbctcd", CommonFunc.convertDoubleToString(cbctcd));
        map.put("cbctdj", CommonFunc.convertDoubleToString(cbctdj));

        //       臂头回转支承
        map.put("cbbthzzcxh", CommonFunc.convertDoubleToString(cbbthzzcxh));
        map.put("cbbthzzcsl", CommonFunc.convertDoubleToString(cbbthzzcsl));
        map.put("cbbthzzcdj", CommonFunc.convertDoubleToString(cbbthzzcdj));

        //       大回转机构回转支承
        map.put("cbhzhzzcxh", CommonFunc.convertDoubleToString(cbhzhzzcxh));
        map.put("cbhzhzzcsl", CommonFunc.convertDoubleToString(cbhzhzzcsl));
        map.put("cbhzhzzcdj", CommonFunc.convertDoubleToString(cbhzhzzcdj));

        //       伸缩臂链条1246
        map.put("cblt1sl", CommonFunc.convertDoubleToString(cblt1sl));
        map.put("cblt1cd", CommonFunc.convertDoubleToString(cblt1cd));
        map.put("cblt1dj", CommonFunc.convertDoubleToString(cblt1dj));
        map.put("cblt1lyl", CommonFunc.convertDoubleToString(cblt1lyl));

        //       伸缩臂链条1266
        map.put("cblt2sl", CommonFunc.convertDoubleToString(cblt2sl));
        map.put("cblt2cd", CommonFunc.convertDoubleToString(cblt2cd));
        map.put("cblt2dj", CommonFunc.convertDoubleToString(cblt2dj));
        map.put("cblt2lyl", CommonFunc.convertDoubleToString(cblt2lyl));

        //       伸缩臂链条1666
        map.put("cblt3sl", CommonFunc.convertDoubleToString(cblt3sl));
        map.put("cblt3cd", CommonFunc.convertDoubleToString(cblt3cd));
        map.put("cblt3dj", CommonFunc.convertDoubleToString(cblt3dj));
        map.put("cblt3lyl", CommonFunc.convertDoubleToString(cblt3lyl));

        //       伸缩臂链条2466
        map.put("cblt4sl", CommonFunc.convertDoubleToString(cblt4sl));
        map.put("cblt4cd", CommonFunc.convertDoubleToString(cblt4cd));
        map.put("cblt4dj", CommonFunc.convertDoubleToString(cblt4dj));
        map.put("cblt4lyl", CommonFunc.convertDoubleToString(cblt4lyl));

        //       移动配重链条1246
        map.put("cblt5sl", CommonFunc.convertDoubleToString(cblt5sl));
        map.put("cblt5cd", CommonFunc.convertDoubleToString(cblt5cd));
        map.put("cblt5dj", CommonFunc.convertDoubleToString(cblt5dj));
        map.put("cblt5lyl", CommonFunc.convertDoubleToString(cblt5lyl));

        //       防风销座
        map.put("cbxzsl", CommonFunc.convertDoubleToString(cbxzsl));
        map.put("cbxzzl", CommonFunc.convertDoubleToString(cbxzzl));
        map.put("cbxzdj", CommonFunc.convertDoubleToString(cbxzdj));

        //       防风销钉
        map.put("cbxdxh", CommonFunc.convertDoubleToString(cbxdxh));
        map.put("cbxdsl", CommonFunc.convertDoubleToString(cbxdsl));
        map.put("cbxddj", CommonFunc.convertDoubleToString(cbxddj));

        //       伸缩臂机加件
        map.put("cbssjjmc", CommonFunc.convertDoubleToString(cbssjjmc));
        map.put("cbssjjsl", CommonFunc.convertDoubleToString(cbssjjsl));
        map.put("cbssjjdj", CommonFunc.convertDoubleToString(cbssjjdj));

        //       大臂-立柱销轴
        map.put("cbdbxzmc", CommonFunc.convertDoubleToString(cbdbxzmc));
        map.put("cbdbxzsl", CommonFunc.convertDoubleToString(cbdbxzsl));
        map.put("cbdbxzdj", CommonFunc.convertDoubleToString(cbdbxzdj));

        //       电气元件
        map.put("cbdqmc", CommonFunc.convertDoubleToString(cbdqmc));
        map.put("cbdqsl", CommonFunc.convertDoubleToString(cbdqsl));
        map.put("cbdqdj", CommonFunc.convertDoubleToString(cbdqdj));

        //       液压系统
        map.put("cbyymc", CommonFunc.convertDoubleToString(cbyymc));
        map.put("cbyysl", CommonFunc.convertDoubleToString(cbyysl));
        map.put("cbyydj", CommonFunc.convertDoubleToString(cbyydj));

        //       轨道
        map.put("cbgdxh", CommonFunc.convertDoubleToString(cbgdxh));
        map.put("cbgdcz", CommonFunc.convertDoubleToString(cbgdcz));
        map.put("cbgdsl", CommonFunc.convertDoubleToString(cbgdsl));
        map.put("cbgdzl", CommonFunc.convertDoubleToString(cbgdzl));
        map.put("cbgddj", CommonFunc.convertDoubleToString(cbgddj));
        map.put("cbgdlyl", CommonFunc.convertDoubleToString(cbgdlyl));

        //       轨道热浸锌
        map.put("cbgdjxsl", CommonFunc.convertDoubleToString(cbgdjxsl));
        map.put("cbgdjxdj", CommonFunc.convertDoubleToString(cbgdjxdj));

        //       埋板
        map.put("cbmbxh", CommonFunc.convertDoubleToString(cbmbxh));
        map.put("cbmbcz", CommonFunc.convertDoubleToString(cbmbcz));
        map.put("cbmbsl", CommonFunc.convertDoubleToString(cbmbsl));
        map.put("cbmbmzl", CommonFunc.convertDoubleToString(cbmbmzl));
        map.put("cbmbzl", CommonFunc.convertDoubleToString(cbmbzl));
        map.put("cbmbdj", CommonFunc.convertDoubleToString(cbmbdj));
        map.put("cbmbdjdw", CommonFunc.convertDoubleToString(cbmbdjdw));
        map.put("cbmblyl", CommonFunc.convertDoubleToString(cbmblyl));

        //       埋板热浸锌
        map.put("cbmbjxsl", CommonFunc.convertDoubleToString(cbmbjxsl));
        map.put("cbmbjxdj", CommonFunc.convertDoubleToString(cbmbjxdj));

        //       地脚螺栓
        map.put("cbdjlsxh", CommonFunc.convertDoubleToString(cbdjlsxh));
        map.put("cbdjlscz", CommonFunc.convertDoubleToString(cbdjlscz));
        map.put("cbdjlssl", CommonFunc.convertDoubleToString(cbdjlssl));
        map.put("cbdjlsdj", CommonFunc.convertDoubleToString(cbdjlsdj));

        //       马道
        map.put("cbmdcz", CommonFunc.convertDoubleToString(cbmdcz));
        map.put("cbmdsl", CommonFunc.convertDoubleToString(cbmdsl));
        map.put("cbmdmj", CommonFunc.convertDoubleToString(cbmdmj));
        map.put("cbmddj", CommonFunc.convertDoubleToString(cbmddj));

        //       护栏
        map.put("cbhlcz", CommonFunc.convertDoubleToString(cbhlcz));
        map.put("cbhlsl", CommonFunc.convertDoubleToString(cbhlsl));
        map.put("cbhlcd", CommonFunc.convertDoubleToString(cbhlcd));
        map.put("cbhldj", CommonFunc.convertDoubleToString(cbhldj));

        //       爬梯
        map.put("cbptcz", CommonFunc.convertDoubleToString(cbptcz));
        map.put("cbptsl", CommonFunc.convertDoubleToString(cbptsl));
        map.put("cbptcd", CommonFunc.convertDoubleToString(cbptcd));
        map.put("cbptdj", CommonFunc.convertDoubleToString(cbptdj));

        //       GRU检修平台
        map.put("cbgrujxmc", CommonFunc.convertDoubleToString(cbgrujxmc));
        map.put("cbgrujxsl", CommonFunc.convertDoubleToString(cbgrujxsl));
        map.put("cbgrujxzl", CommonFunc.convertDoubleToString(cbgrujxzl));
        map.put("cbgrujxdj", CommonFunc.convertDoubleToString(cbgrujxdj));
        map.put("cbgrujxlyl", CommonFunc.convertDoubleToString(cbgrujxlyl));

        //       起升机构检修平台
        map.put("cbqsjgjxmc", CommonFunc.convertDoubleToString(cbqsjgjxmc));
        map.put("cbqsjgjxsl", CommonFunc.convertDoubleToString(cbqsjgjxsl));
        map.put("cbqsjgjxzl", CommonFunc.convertDoubleToString(cbqsjgjxzl));
        map.put("cbqsjgjxdj", CommonFunc.convertDoubleToString(cbqsjgjxdj));
        map.put("cbqsjgjxlyl", CommonFunc.convertDoubleToString(cbqsjgjxlyl));

        //       伸缩机构检修平台
        map.put("cbssjgjxmc", CommonFunc.convertDoubleToString(cbssjgjxmc));
        map.put("cbssjgjxsl", CommonFunc.convertDoubleToString(cbssjgjxsl));
        map.put("cbssjgjxzl", CommonFunc.convertDoubleToString(cbssjgjxzl));
        map.put("cbssjgjxdj", CommonFunc.convertDoubleToString(cbssjgjxdj));
        map.put("cbssjgjxlyl", CommonFunc.convertDoubleToString(cbssjgjxlyl));

        //       试验轨道
        map.put("cbsygdsl", CommonFunc.convertDoubleToString(cbsygdsl));
        map.put("cbsygdzl", CommonFunc.convertDoubleToString(cbsygdzl));
        map.put("cbsygddj", CommonFunc.convertDoubleToString(cbsygddj));

        //       试验架
        map.put("cbsyjsl", CommonFunc.convertDoubleToString(cbsyjsl));
        map.put("cbsyjzl", CommonFunc.convertDoubleToString(cbsyjzl));
        map.put("cbsyjdj", CommonFunc.convertDoubleToString(cbsyjdj));

        //       木方
        map.put("cbmfsl", CommonFunc.convertDoubleToString(cbmfsl));
//        map.put("cbmftj", CommonFunc.convertDoubleToString(cbmftj));
        map.put("cbmfdj", CommonFunc.convertDoubleToString(cbmfdj));
//        map.put("cbmfdjdw", CommonFunc.convertDoubleToString(cbmfdjdw));

        //       包装
//        map.put("cbbzsl", CommonFunc.convertDoubleToString(cbbzsl));
//        map.put("cbbzdj", CommonFunc.convertDoubleToString(cbbzdj));

        //       6.8m车
        map.put("cbc1lc", CommonFunc.convertDoubleToString(cbc1lc));
        map.put("cbc1zzl", CommonFunc.convertDoubleToString(cbc1zzl));
        map.put("cbc1sl", CommonFunc.convertDoubleToString(cbc1sl));
        map.put("cbc1dj", CommonFunc.convertDoubleToString(cbc1dj));

        //       9.6m车
        map.put("cbc2lc", CommonFunc.convertDoubleToString(cbc2lc));
        map.put("cbc2zzl", CommonFunc.convertDoubleToString(cbc2zzl));
        map.put("cbc2sl", CommonFunc.convertDoubleToString(cbc2sl));
        map.put("cbc2dj", CommonFunc.convertDoubleToString(cbc2dj));

        //       13.0m车
        map.put("cbc3lc", CommonFunc.convertDoubleToString(cbc3lc));
        map.put("cbc3zzl", CommonFunc.convertDoubleToString(cbc3zzl));
        map.put("cbc3sl", CommonFunc.convertDoubleToString(cbc3sl));
        map.put("cbc3dj", CommonFunc.convertDoubleToString(cbc3dj));

        //       17.5m车
        map.put("cbc4lc", CommonFunc.convertDoubleToString(cbc4lc));
        map.put("cbc4zzl", CommonFunc.convertDoubleToString(cbc4zzl));
        map.put("cbc4sl", CommonFunc.convertDoubleToString(cbc4sl));
        map.put("cbc4dj", CommonFunc.convertDoubleToString(cbc4dj));

        //        前端填写数据
        map.put("lg", CommonFunc.convertDoubleToString(lg));
        map.put("ll", CommonFunc.convertDoubleToString(ll));
        map.put("cbgdmmzl", CommonFunc.convertDoubleToString(cbgdmmzl));
        map.put("cbgdcd", CommonFunc.convertDoubleToString(cbgdcd));

//        后台
        map.put("m4", CommonFunc.convertDoubleToString(m4));
        map.put("m12", CommonFunc.convertDoubleToString(m12));
        map.put("m15", CommonFunc.convertDoubleToString(m15));
        map.put("djlx", CommonFunc.convertDoubleToString(djlx));

        //       8模块成本小计（含税）
        map.put("cbdchszj", CommonFunc.convertDoubleToString(cbdchszj));
        map.put("cbbthszj", CommonFunc.convertDoubleToString(cbbthszj));
        map.put("cbssjghszj", CommonFunc.convertDoubleToString(cbssjghszj));
        map.put("cbgruhszj", CommonFunc.convertDoubleToString(cbgruhszj));
        map.put("cbqsjghszj", CommonFunc.convertDoubleToString(cbqsjghszj));
        map.put("cbslqhszj", CommonFunc.convertDoubleToString(cbslqhszj));
        map.put("cbhzhszj", CommonFunc.convertDoubleToString(cbhzhszj));
        map.put("cbyxhszj", CommonFunc.convertDoubleToString(cbyxhszj));
        map.put("cbjgqhszj", CommonFunc.convertDoubleToString(cbjgqhszj));

        //       8模块成本小计
        map.put("cbdczj", CommonFunc.convertDoubleToString(cbdczj));
        map.put("cbbtzj", CommonFunc.convertDoubleToString(cbbtzj));
        map.put("cbssjgzj", CommonFunc.convertDoubleToString(cbssjgzj));
        map.put("cbgruzj", CommonFunc.convertDoubleToString(cbgruzj));
        map.put("cbqsjgzj", CommonFunc.convertDoubleToString(cbqsjgzj));
        map.put("cbslqzj", CommonFunc.convertDoubleToString(cbslqzj));
        map.put("cbhzzj", CommonFunc.convertDoubleToString(cbhzzj));
        map.put("cbyxzj", CommonFunc.convertDoubleToString(cbyxzj));
        map.put("cbjgqzj", CommonFunc.convertDoubleToString(cbjgqzj));

        //       3大件成本小计
        map.put("cbdbzj", CommonFunc.convertDoubleToString(cbdbzj));
        map.put("cbpzkzj", CommonFunc.convertDoubleToString(cbpzkzj));
        map.put("cbpzfgzj", CommonFunc.convertDoubleToString(cbpzfgzj));
        map.put("cbpzktzj", CommonFunc.convertDoubleToString(cbpzktzj));
        map.put("cbpzxtzj", CommonFunc.convertDoubleToString(cbpzxtzj));
        map.put("cblzzj", CommonFunc.convertDoubleToString(cblzzj));
        map.put("cbdjzj", CommonFunc.convertDoubleToString(cbdjzj));
        map.put("cb3jxzj", CommonFunc.convertDoubleToString(cb3jxzj));
        map.put("cb3yqzj", CommonFunc.convertDoubleToString(cb3yqzj));
        map.put("cb3hszj", CommonFunc.convertDoubleToString(cb3hszj));
        map.put("cb3qzj", CommonFunc.convertDoubleToString(cb3qzj));

        //       电机成本小计
        map.put("cbbtdjzj", CommonFunc.convertDoubleToString(cbbtdjzj));
        map.put("cbssjgdjzj", CommonFunc.convertDoubleToString(cbssjgdjzj));
        map.put("cbgrudjzj", CommonFunc.convertDoubleToString(cbgrudjzj));
        map.put("cbqsjgdj1zj", CommonFunc.convertDoubleToString(cbqsjgdj1zj));
        map.put("cbqsjgdj2zj", CommonFunc.convertDoubleToString(cbqsjgdj2zj));
        map.put("cbhzdjzj", CommonFunc.convertDoubleToString(cbhzdjzj));
        map.put("cbyxdjzj", CommonFunc.convertDoubleToString(cbyxdjzj));

        //       擦窗机外购件成本小计
        map.put("cbdcgsszj", CommonFunc.convertDoubleToString(cbdcgsszj));
        map.put("cbgrugsszj", CommonFunc.convertDoubleToString(cbgrugsszj));
        map.put("cbaqszj", CommonFunc.convertDoubleToString(cbaqszj));
        map.put("cbctzj", CommonFunc.convertDoubleToString(cbctzj));
        map.put("cbbthzzczj", CommonFunc.convertDoubleToString(cbbthzzczj));
        map.put("cbhzhzzczj", CommonFunc.convertDoubleToString(cbhzhzzczj));

        //       擦窗机外协件成本小计
        map.put("cblt1zj", CommonFunc.convertDoubleToString(cblt1zj));
        map.put("cblt2zj", CommonFunc.convertDoubleToString(cblt2zj));
        map.put("cblt3zj", CommonFunc.convertDoubleToString(cblt3zj));
        map.put("cblt4zj", CommonFunc.convertDoubleToString(cblt4zj));
        map.put("cblt5zj", CommonFunc.convertDoubleToString(cblt5zj));
        map.put("cbxzzj", CommonFunc.convertDoubleToString(cbxzzj));
        map.put("cbxdzj", CommonFunc.convertDoubleToString(cbxdzj));
        map.put("cbssjjzj", CommonFunc.convertDoubleToString(cbssjjzj));
        map.put("cbdbxzzj", CommonFunc.convertDoubleToString(cbdbxzzj));

        //       电气液压系统成本小计
        map.put("cbdqzj", CommonFunc.convertDoubleToString(cbdqzj));
        map.put("cbyyzj", CommonFunc.convertDoubleToString(cbyyzj));

        //       轨道成本小计
        map.put("cbgdzj", CommonFunc.convertDoubleToString(cbgdzj));
        map.put("cbgdjxzj", CommonFunc.convertDoubleToString(cbgdjxzj));
        map.put("cbmbzj", CommonFunc.convertDoubleToString(cbmbzj));
        map.put("cbmbjxzj", CommonFunc.convertDoubleToString(cbmbjxzj));
        map.put("cbdjlszj", CommonFunc.convertDoubleToString(cbdjlszj));
        map.put("cbmdzj", CommonFunc.convertDoubleToString(cbmdzj));
        map.put("cbhlzj", CommonFunc.convertDoubleToString(cbhlzj));
        map.put("cbptzj", CommonFunc.convertDoubleToString(cbptzj));

        //       检修平台成本小计
        map.put("cbgrujxzj", CommonFunc.convertDoubleToString(cbgrujxzj));
        map.put("cbqsjgjxzj", CommonFunc.convertDoubleToString(cbqsjgjxzj));
        map.put("cbssjgjxzj", CommonFunc.convertDoubleToString(cbssjgjxzj));

        //       工厂内作业成本小计
        map.put("cbsygdzj", CommonFunc.convertDoubleToString(cbsygdzj));
        map.put("cbsyjzj", CommonFunc.convertDoubleToString(cbsyjzj));

        //       包装成本小计
        map.put("cbmfzj", CommonFunc.convertDoubleToString(cbmfzj));
//        map.put("cbbzzj", CommonFunc.convertDoubleToString(cbbzzj));

        //       运输成本小计
        map.put("cbc1zj", CommonFunc.convertDoubleToString(cbc1zj));
        map.put("cbc2zj", CommonFunc.convertDoubleToString(cbc2zj));
        map.put("cbc3zj", CommonFunc.convertDoubleToString(cbc3zj));
        map.put("cbc4zj", CommonFunc.convertDoubleToString(cbc4zj));

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

        Double cb8mkzj = cbdczj + cbbtzj + cbssjgzj + cbgruzj + cbqsjgzj + cbslqzj + cbhzzj + cbyxzj + cbjgqzj ;
        Double cb3djzj = cbdbzj + cbpzkzj + cbpzfgzj + cbpzktzj + cbpzxtzj + cblzzj + cbdjzj + cb3jxzj + cb3yqzj + cb3hszj + cb3qzj ;
        Double cbdjzjzj = cbbtdjzj + cbssjgdjzj + cbgrudjzj + cbqsjgdj1zj + cbqsjgdj2zj + cbhzdjzj + cbyxdjzj ;
        Double cbwgjzj = cbdcgsszj + cbgrugsszj + cbaqszj + cbctzj + cbbthzzczj + cbhzhzzczj ;
        Double cbwxjzj = cblt1zj + cblt2zj + cblt3zj + cblt4zj + cblt5zj + cbxzzj + cbxdzj + cbssjjzj + cbdbxzzj ;
        Double cbdqyyzj = cbdqzj + cbyyzj ;
        Double cbgdxtzj = cbgdzj + cbgdjxzj + cbmbzj + cbmbjxzj + cbdjlszj + cbmdzj + cbhlzj + cbptzj ;
        Double cbjxzj = cbgrujxzj + cbqsjgjxzj + cbssjgjxzj ;
        Double cbcnzyzj = cbsygdzj + cbsyjzj ;
        Double cbbzcbzj = cbmfzj ;
        Double cbyszj = cbc1zj + cbc2zj + cbc3zj + cbc4zj ;
        Double cbbmuclzj = cb8mkzj + cb3djzj + cbdjzjzj + cbwgjzj + cbwxjzj + cbdqyyzj + cbgdxtzj + cbjxzj + cbcnzyzj + cbbzcbzj + cbyszj ;

        map.put("cb8mkzj", cb8mkzj);
        map.put("cb3djzj", cb3djzj);
        map.put("cbdjzjzj", cbdjzjzj);
        map.put("cbwgjzj", cbwgjzj);
        map.put("cbwxjzj", cbwxjzj);
        map.put("cbdqyyzj", cbdqyyzj);
        map.put("cbgdxtzj", cbgdxtzj);
        map.put("cbjxzj", cbjxzj);
        map.put("cbcnzyzj", cbcnzyzj);
        map.put("cbbzcbzj", cbbzcbzj);
        map.put("cbyszj", cbyszj);
        map.put("cbbmuclzj", cbbmuclzj);

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
