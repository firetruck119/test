package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class SuspensionCtrackEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double xgg;
    private Double xgcl;
    private Double xgcxl;
    private Double xgcl2;
    private Double xgcwx1;
    private Double xgci;
    private String xgccl;
    private Double xgce;
    private Double xgrp;
    private String xgcclModel;

    public String nameOfPDF(String type) {
        switch (type) {
            case "SimplySupportedc":
                return "简支梁悬挂C型轨强度及挠度校核计算书.pdf";
            case "DoubleSpanbeamc":
                return "双跨梁悬挂C型轨强度及挠度校核计算书.pdf";
        }
        return null;
    }

    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        //String gdjb = steelHave;
        //String gdjby = gdjb.equals("有")?"has":"hasn't";
        //map.put("gdjb",gdjb);
        //map.put("gdjby",gdjby);
        map.put("no", CommonFunc.convertDoubleToString(no));
        map.put("ver", CommonFunc.convertDoubleToString(ver));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("shr", CommonFunc.convertDoubleToString(shr));
        map.put("pzr", CommonFunc.convertDoubleToString(pzr));
        map.put("date", CommonFunc.convertDoubleToString(date));
        map.put("xgg", CommonFunc.convertDoubleToString(xgg));
        map.put("xgcl", CommonFunc.convertDoubleToString(xgcl));
        map.put("xgcxl", CommonFunc.convertDoubleToString(xgcxl));
        map.put("xgcl2", CommonFunc.convertDoubleToString(xgcl2));
        map.put("xgcwx1", CommonFunc.convertDoubleToString(xgcwx1));
        map.put("xgci", CommonFunc.convertDoubleToString(xgci));
        map.put("xgccl", CommonFunc.convertDoubleToString(xgccl));
        map.put("xgce", CommonFunc.convertDoubleToString(xgce));
        map.put("xgrp", CommonFunc.convertDoubleToString(xgrp));
       /*
        map.put("fzed", CommonFunc.convertDoubleToString(fzed));
        map.put("fze", CommonFunc.convertDoubleToString(fze));
        map.put("vzed", CommonFunc.convertDoubleToString(vzed));
        map.put("vyed", CommonFunc.convertDoubleToString(vyed));
        map.put("rzed", CommonFunc.convertDoubleToString(rzed));
        */

       // map.put("gdxhy", CommonFunc.convertDoubleToString(gdxhy));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");
        Double xgco1 = map.get("xgco1");
        Double xgcko1 = map.get("xgcko1");
        Double xgco2 = map.get("xgco2");
        Double xgcko2 = map.get("xgcko2");
        Double xgco3 = map.get("xgco3");
        Double xgcko3 = map.get("xgcko3");
        Double xgcuy = map.get("xgcuy");
        Double xgckuy = map.get("xgckuy");

        Double b1 = xgcko1 / xgco1;
        Double b2 = xgcko2 / xgco2;
        Double b3 = xgcko3 / xgco3;
        Double b4 = xgckuy / xgcuy;
        String fu1 = ( 0.8 < b1 && b1 < 0.9 ) ? "符合" : "不符合";
        String fu2 = ( b2 == 1 ) ? "符合" : "不符合";
        String fu3 = ( 0.9 < b3 && b3 < 1 ) ? "符合" : "不符合";
        String fu4 = ( 0.7 < b4 && b4 <= 0.8 ) ? "符合" : "不符合";



        Map<String, String> result = new HashMap<>();
        result.put("xgco1", CommonFunc.convertDoubleToString(xgco1));
        result.put("xgco2", CommonFunc.convertDoubleToString(xgco2));
        result.put("xgco3", CommonFunc.convertDoubleToString(xgco3));
        result.put("xgcuy", CommonFunc.convertDoubleToString(xgcuy));
         result.put("xgcko1", CommonFunc.convertDoubleToString(xgcko1));
        result.put("xgcko2", CommonFunc.convertDoubleToString(xgcko2));
        result.put("xgcko3", CommonFunc.convertDoubleToString(xgcko3));
        result.put("xgckuy", CommonFunc.convertDoubleToString(xgckuy));
        result.put("b1", CommonFunc.convertDoubleToString(b1));
        result.put("b2", CommonFunc.convertDoubleToString(b2));
        result.put("b3", CommonFunc.convertDoubleToString(b3));
        result.put("b4", CommonFunc.convertDoubleToString(b4));
        result.put("fu1", CommonFunc.convertDoubleToString(fu1));
        result.put("fu2", CommonFunc.convertDoubleToString(fu2));
        result.put("fu3", CommonFunc.convertDoubleToString(fu3));
        result.put("fu4", CommonFunc.convertDoubleToString(fu4));

        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

         /*
        抗弯强度
         */
        Double xgcmax1= 1.25 * xgg * xgcl / 4;
        Double xgco1= xgcmax1 / xgcwx1;
        Double xgcxy= xgco1 / 1.65;
        Double xgcmax2= 1.25 * xgg * xgcxl / 2;
        Double xgcs = 2 * xgcxl;
        Double xgcwx2 = xgcl2 * xgcs * xgcs / 6;
        Double xgco2 = xgcmax2 / xgcwx2;
        Double xgco3 = xgco1 + xgco2;
        Double xgcuy = xgg * xgcl * xgcl / ( 48 * xgce * xgci );
        Double xgnd = xgcl / 200;

        Double xgckmax1 = 1.25 * 13 * xgg * xgcl / 64;
        Double xgcko1 = xgckmax1 / xgcwx1;
        Double xgckxy = xgrp / 1.65;
        Double xgckmax2 = 1.25 * xgg * xgcxl / 2;
        Double xgcks = 2 * xgcxl;
        Double xgckwx2 = xgcl2 * xgcks * xgcks / 6;
        Double xgcko2 = xgckmax2 / xgckwx2;
        Double xgcko3 = xgcko1 + xgcko2;
        Double xgckuy = 0.15 * xgg * xgcl * xgcl * xgcl / ( xgce * xgci );
        Double xgknd = xgcl / 200;

        map.put("xgcmax1", xgcmax1);
        map.put("xgco1", xgco1);
        map.put("xgcxy", xgcxy);
        map.put("xgcmax2", xgcmax2);
        map.put("xgcs", xgcs);
        map.put("xgcwx2", xgcwx2);
        map.put("xgco2", xgco2);
        map.put("xgco3", xgco3);
        map.put("xgcuy", xgcuy);
        map.put("xgnd", xgnd);
        map.put("xgckmax1", xgckmax1);
        map.put("xgcko1", xgcko1);
        map.put("xgckxy", xgckxy);
        map.put("xgckmax2", xgckmax2);
        map.put("xgcks", xgcks);
        map.put("xgckwx2",xgckwx2);
        map.put("xgcko2", xgcko2);
        map.put("xgcko3", xgcko3);
        map.put("xgckuy", xgckuy);
        map.put("xgknd",xgknd);
        /*
        计算公式
         */





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
        Double xgco1 = doubleMap.get("xgco1");
        Double xgcxy = doubleMap.get("xgcxy");
        Double xgco2 = doubleMap.get("xgco2");
        Double xgco3 = doubleMap.get("xgco3");
        Double xgcuy = doubleMap.get("xgcuy");
        Double xgnd = doubleMap.get("xgnd");

        Double xgcko1 = doubleMap.get("xgcko1");
        Double xgckxy = doubleMap.get("xgckxy");
        Double xgcko2 = doubleMap.get("xgcko2");
        Double xgcko3 = doubleMap.get("xgcko3");
        Double xgckuy = doubleMap.get("xgckuy");
        Double xgknd = doubleMap.get("xgknd");

        String xgcp1 = takeSignByCompareNumber(xgco1,xgcxy);
        String xgcp2 = takeSignByCompareNumber(xgco2,xgcxy);
        String xgcp3 = takeSignByCompareNumber(xgco3,xgcxy);
        String xgcp4 = takeSignByCompareNumber(xgcuy,xgnd);

        String xgckp1 = takeSignByCompareNumber(xgcko1,xgckxy);
        String xgckp2 = takeSignByCompareNumber(xgcko2,xgckxy);
        String xgckp3 = takeSignByCompareNumber(xgcko3,xgckxy);
        String xgckp4 = takeSignByCompareNumber(xgckuy,xgknd);

        String xgcm1 = takeStringByCompareNumber(xgco1,xgcxy);
        String xgcm2 = takeStringByCompareNumber(xgco2,xgcxy);
        String xgcm3 = takeStringByCompareNumber(xgco3,xgcxy);
        String xgcm4 = takeStringByCompareNumber(xgcuy,xgnd);

        String xgckm1 = takeStringByCompareNumber(xgcko1,xgckxy);
        String xgckm2 = takeStringByCompareNumber(xgcko2,xgckxy);
        String xgckm3 = takeStringByCompareNumber(xgcko3,xgckxy);
        String xgckm4 = takeStringByCompareNumber(xgckuy,xgknd);


        map.put("xgcp1", CommonFunc.convertDoubleToString(xgcp1));
        map.put("xgcp2", CommonFunc.convertDoubleToString(xgcp2));
        map.put("xgcp3", CommonFunc.convertDoubleToString(xgcp3));
        map.put("xgcp4", CommonFunc.convertDoubleToString(xgcp4));
        map.put("xgckp1", CommonFunc.convertDoubleToString(xgckp1));
        map.put("xgckp2", CommonFunc.convertDoubleToString(xgckp2));
        map.put("xgckp3", CommonFunc.convertDoubleToString(xgckp3));
        map.put("xgckp4", CommonFunc.convertDoubleToString(xgckp4));

        map.put("xgcm1", CommonFunc.convertDoubleToString(xgcm1));
        map.put("xgcm2", CommonFunc.convertDoubleToString(xgcm2));
        map.put("xgcm3", CommonFunc.convertDoubleToString(xgcm3));
        map.put("xgcm4", CommonFunc.convertDoubleToString(xgcm4));
        map.put("xgckm1", CommonFunc.convertDoubleToString(xgckm1));
        map.put("xgckm2", CommonFunc.convertDoubleToString(xgckm2));
        map.put("xgckm3", CommonFunc.convertDoubleToString(xgckm3));
        map.put("xgckm4", CommonFunc.convertDoubleToString(xgckm4));



        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
