package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class TrackInstallationCostEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    //    轨道安装清单
    private String cbgdxh;
    private Double cbgdcd;
    private Double gdcbmjsl;
    private Double gdcbwmcgmjsl;
    private Double gdcbfqcgmjsl;
    private Double gdcbzzrsl;
    private Double gdcbcgsl;
    private Double gdcbhlsl;
    private Double gdcbzdsl;

    //    轨道施工环境
    private String gdcbsgdq;
    private String gdcbgdsg;
    private String gdcbmjsg;
    private String gdcbhlsg;

    //    后台
    private Double gdcbgdlkdjb;
    private Double gdcbgdjzddjb;
    private Double gdcbgdew1dj;
    private Double gdcbgdew2dj;
    private Double gdcbgdtbdjb;
    private Double gdcbgdjqgdjb;
    private Double gdcbgdtbxs;
    private Double gdcbgdjqgxs;

    //    轨道安装单价
    private Double gdcbgdwbcbdj;

    private Double gdcbgdlkdj;
    private String gdcbgdlkbz;

    private Double gdcbgdjzddj;
    private String gdcbgdjzdbz;

    private Double gdcbgdcbdj;
    private String gdcbgdcbbz;

    private Double gdcbgdzsdj;
    private String gdcbgdzsbz;

    private Double gdcbgdewdj;
    private String gdcbgdewbz;

    private Double gdcbgdhtdj;
    private String gdcbgdhtbz;

    private Double gdcbgdqtdj;
    private String gdcbgdqtbz;

    private Double gdcbgdyqdj;
    private String gdcbgdyqbz;

    private Double gdcbgdfcdj;
    private String gdcbgdfcbz;

    private Double gdcbgddlsgdj;
    private String gdcbgddlsgbz;

    private Double gdcbgdtbdj;
    private String gdcbgdtbbz;

    private Double gdcbgdjqgdj;
    private String gdcbgdjqgbz;

    //    轨道安装
    private Double gdcbgdcjbsl;
    private Double gdcbgdcjbdj;
    private Double gdcbgdxzdsl;
    private Double gdcbgdxzddj;

    //    埋件安装
    private Double gdcbmjdj;
    private Double gdcbmjlksl;
    private Double gdcbmjlkdj;
    private Double gdcbwmcgmjdj;
    private Double gdcbfqcgmjdj;

    //    附件安装
    private Double gdcbzzrdj;
    private Double gdcbcgdj;
    private Double gdcbhldj;
    private Double gdcbhllksl;
    private Double gdcbhllkdj;
    private Double gdcbzddj;

    //    轨道安装成本小计
    private Double gdcbgdazdj;
    private Double gdcbgdazzj;
    private Double gdcbgdcjbzj;
    private Double gdcbgdxzdzj;

    //    埋件安装成本小计
    private Double gdcbmjzj;
    private Double gdcbmjlkzj;
    private Double gdcbwmcgmjzj;
    private Double gdcbfqcgmjzj;

    //    轨道附件安装成本小计
    private Double gdcbzzrzj;
    private Double gdcbcgzj;
    private Double gdcbhlzj;
    private Double gdcbhllkzj;
    private Double gdcbzdzj;

    //     下拉
    private String gdcbgdModel;
    private String gdcbmjlxModel;
    private String gdcbgdlkModel;
    private String gdcbgdjzdModel;
    private String gdcbmjlkModel;
    private String gdcbhllkModel;
    private String gdcbdqModel;
    private String gdcbgdtbModel;
    private String gdcbgdjqgModel;

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

//        轨道安装清单
        map.put("cbgdxh", CommonFunc.convertDoubleToString(cbgdxh));
        map.put("cbgdcd", CommonFunc.convertDoubleToString(cbgdcd));
        map.put("gdcbmjsl", CommonFunc.convertDoubleToString(gdcbmjsl));
        map.put("gdcbwmcgmjsl", CommonFunc.convertDoubleToString(gdcbwmcgmjsl));
        map.put("gdcbfqcgmjsl", CommonFunc.convertDoubleToString(gdcbfqcgmjsl));
        map.put("gdcbzzrsl", CommonFunc.convertDoubleToString(gdcbzzrsl));
        map.put("gdcbcgsl", CommonFunc.convertDoubleToString(gdcbcgsl));
        map.put("gdcbhlsl", CommonFunc.convertDoubleToString(gdcbhlsl));
        map.put("gdcbzdsl", CommonFunc.convertDoubleToString(gdcbzdsl));

//        轨道施工环境
        map.put("gdcbsgdq", CommonFunc.convertDoubleToString(gdcbsgdq));
        map.put("gdcbgdsg", CommonFunc.convertDoubleToString(gdcbgdsg));
        map.put("gdcbmjsg", CommonFunc.convertDoubleToString(gdcbmjsg));
        map.put("gdcbhlsg", CommonFunc.convertDoubleToString(gdcbhlsg));

        //        后台
        map.put("gdcbgdlkdjb", CommonFunc.convertDoubleToString(gdcbgdlkdjb));
        map.put("gdcbgdjzddjb", CommonFunc.convertDoubleToString(gdcbgdjzddjb));
        map.put("gdcbgdew1dj", CommonFunc.convertDoubleToString(gdcbgdew1dj));
        map.put("gdcbgdew2dj", CommonFunc.convertDoubleToString(gdcbgdew2dj));
        map.put("gdcbgdtbdjb", CommonFunc.convertDoubleToString(gdcbgdtbdjb));
        map.put("gdcbgdjqgdjb", CommonFunc.convertDoubleToString(gdcbgdjqgdjb));
        map.put("gdcbgdtbxs", CommonFunc.convertDoubleToString(gdcbgdtbxs));
        map.put("gdcbgdjqgxs", CommonFunc.convertDoubleToString(gdcbgdjqgxs));

        //       轨道安装单价
        map.put("gdcbgdwbcbdj", CommonFunc.convertDoubleToString(gdcbgdwbcbdj));

        map.put("gdcbgdlkdj", CommonFunc.convertDoubleToString(gdcbgdlkdj));
        map.put("gdcbgdlkbz", CommonFunc.convertDoubleToString(gdcbgdlkbz));

        map.put("gdcbgdjzddj", CommonFunc.convertDoubleToString(gdcbgdjzddj));
        map.put("gdcbgdjzdbz", CommonFunc.convertDoubleToString(gdcbgdjzdbz));

        map.put("gdcbgdcbdj", CommonFunc.convertDoubleToString(gdcbgdcbdj));
        map.put("gdcbgdcbbz", CommonFunc.convertDoubleToString(gdcbgdcbbz));

        map.put("gdcbgdzsdj", CommonFunc.convertDoubleToString(gdcbgdzsdj));
        map.put("gdcbgdzsbz", CommonFunc.convertDoubleToString(gdcbgdzsbz));

        map.put("gdcbgdewdj", CommonFunc.convertDoubleToString(gdcbgdewdj));
        map.put("gdcbgdewbz", CommonFunc.convertDoubleToString(gdcbgdewbz));

        map.put("gdcbgdhtdj", CommonFunc.convertDoubleToString(gdcbgdhtdj));
        map.put("gdcbgdhtbz", CommonFunc.convertDoubleToString(gdcbgdhtbz));

        map.put("gdcbgdqtdj", CommonFunc.convertDoubleToString(gdcbgdqtdj));
        map.put("gdcbgdqtbz", CommonFunc.convertDoubleToString(gdcbgdqtbz));

        map.put("gdcbgdyqdj", CommonFunc.convertDoubleToString(gdcbgdyqdj));
        map.put("gdcbgdyqbz", CommonFunc.convertDoubleToString(gdcbgdyqbz));

        map.put("gdcbgdfcdj", CommonFunc.convertDoubleToString(gdcbgdfcdj));
        map.put("gdcbgdfcbz", CommonFunc.convertDoubleToString(gdcbgdfcbz));

        map.put("gdcbgddlsgdj", CommonFunc.convertDoubleToString(gdcbgddlsgdj));
        map.put("gdcbgddlsgbz", CommonFunc.convertDoubleToString(gdcbgddlsgbz));

        map.put("gdcbgdtbdj", CommonFunc.convertDoubleToString(gdcbgdtbdj));
        map.put("gdcbgdtbbz", CommonFunc.convertDoubleToString(gdcbgdtbbz));

        map.put("gdcbgdjqgdj", CommonFunc.convertDoubleToString(gdcbgdjqgdj));
        map.put("gdcbgdjqgbz", CommonFunc.convertDoubleToString(gdcbgdjqgbz));

        //       轨道安装
        map.put("gdcbgdcjbsl", CommonFunc.convertDoubleToString(gdcbgdcjbsl));
        map.put("gdcbgdcjbdj", CommonFunc.convertDoubleToString(gdcbgdcjbdj));
        map.put("gdcbgdxzdsl", CommonFunc.convertDoubleToString(gdcbgdxzdsl));
        map.put("gdcbgdxzddj", CommonFunc.convertDoubleToString(gdcbgdxzddj));

        //       埋件安装
        map.put("gdcbmjdj", CommonFunc.convertDoubleToString(gdcbmjdj));
        map.put("gdcbmjlksl", CommonFunc.convertDoubleToString(gdcbmjlksl));
        map.put("gdcbmjlkdj", CommonFunc.convertDoubleToString(gdcbmjlkdj));
        map.put("gdcbwmcgmjdj", CommonFunc.convertDoubleToString(gdcbwmcgmjdj));
        map.put("gdcbfqcgmjdj", CommonFunc.convertDoubleToString(gdcbfqcgmjdj));

        //       护栏安装
        map.put("gdcbzzrdj", CommonFunc.convertDoubleToString(gdcbzzrdj));
        map.put("gdcbcgdj", CommonFunc.convertDoubleToString(gdcbcgdj));
        map.put("gdcbhldj", CommonFunc.convertDoubleToString(gdcbhldj));
        map.put("gdcbhllksl", CommonFunc.convertDoubleToString(gdcbhllksl));
        map.put("gdcbhllkdj", CommonFunc.convertDoubleToString(gdcbhllkdj));
        map.put("gdcbzddj", CommonFunc.convertDoubleToString(gdcbzddj));

        //       轨道安装小计
        map.put("gdcbgdazdj", CommonFunc.convertDoubleToString(gdcbgdazdj));
        map.put("gdcbgdazzj", CommonFunc.convertDoubleToString(gdcbgdazzj));
        map.put("gdcbgdcjbzj", CommonFunc.convertDoubleToString(gdcbgdcjbzj));
        map.put("gdcbgdxzdzj", CommonFunc.convertDoubleToString(gdcbgdxzdzj));

        //       埋件安装小计
        map.put("gdcbmjzj", CommonFunc.convertDoubleToString(gdcbmjzj));
        map.put("gdcbmjlkzj", CommonFunc.convertDoubleToString(gdcbmjlkzj));
        map.put("gdcbwmcgmjzj", CommonFunc.convertDoubleToString(gdcbwmcgmjzj));
        map.put("gdcbfqcgmjzj", CommonFunc.convertDoubleToString(gdcbfqcgmjzj));

        //       附件安装小计
        map.put("gdcbzzrzj", CommonFunc.convertDoubleToString(gdcbzzrzj));
        map.put("gdcbcgzj", CommonFunc.convertDoubleToString(gdcbcgzj));
        map.put("gdcbhlzj", CommonFunc.convertDoubleToString(gdcbhlzj));
        map.put("gdcbhllkzj", CommonFunc.convertDoubleToString(gdcbhllkzj));
        map.put("gdcbzdzj", CommonFunc.convertDoubleToString(gdcbzdzj));

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

        Double gdcbgdzj = ( gdcbgdazzj + gdcbgdcjbzj + gdcbgdxzdzj ) / 10000 ;
        Double gdcbmjazzj = ( gdcbmjzj + gdcbmjlkzj + gdcbwmcgmjzj + gdcbfqcgmjzj ) / 10000 ;
        Double gdcbfjzj = ( gdcbzzrzj + gdcbcgzj + gdcbhlzj + gdcbhllkzj + gdcbzdzj ) / 10000 ;
        Double gdcbgcazzj = gdcbgdzj + gdcbmjazzj + gdcbfjzj ;
        map.put("gdcbgdzj", gdcbgdzj);
        map.put("gdcbmjazzj", gdcbmjazzj);
        map.put("gdcbfjzj", gdcbfjzj);
        map.put("gdcbgcazzj", gdcbgcazzj);

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
