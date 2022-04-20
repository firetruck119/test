package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class SszdcWireRopeEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double sszdclsd;
    private Double sszdclss;

//    钢丝绳参数
    private String dcgssxh;
    private Double dcgssd;
    private Double dcgssn;
    private Double dcgssf;
    private Double dcgssp;
    private Double dcgssa;
    private Double dcgsse;
    private Double dcgssna;
    private Double dcgssnb;

//    伸缩子吊船重量参数
    private Double dggssmwr;
    private Double mffbb;
    private Double r1;
    private Double hwll;
    private Double sszdcms1;
    private Double sszdcms2;
    private Double sszdcms3;
    private Double sszdcms4;
    private Double sszdcms5;

    //    伸缩子吊船-伸出工况重心至前吊点距离参数
    private Double sszdclffbb;
    private Double sszdclr1;
    private Double sszdclwll;
    private Double sszdcls1;
    private Double sszdcls2;
    private Double sszdcls3;
    private Double sszdcls4;
    private Double sszdcls5;

    //    伸缩子吊船-缩回工况重心至前吊点距离参数
    private Double sszdclffbbf;
    private Double sszdclr1f;
    private Double sszdclwllf;
    private Double sszdcls1f;
    private Double sszdcls2f;
    private Double sszdcls3f;
    private Double sszdcls4f;
    private Double sszdcls5f;

    private String ffbbModel;
    private String sszdcgssModel;

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

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("sszdclsd", CommonFunc.convertDoubleToString(sszdclsd));
        map.put("sszdclss", CommonFunc.convertDoubleToString(sszdclss));

        map.put("dcgssxh", CommonFunc.convertDoubleToString(dcgssxh));
        map.put("dcgssd", CommonFunc.convertDoubleToString(dcgssd));
        map.put("dcgssn", CommonFunc.convertDoubleToString(dcgssn));
        map.put("dcgssf", CommonFunc.convertDoubleToString(dcgssf));
        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("dcgssa", CommonFunc.convertDoubleToString(dcgssa));
        map.put("dcgsse", CommonFunc.convertDoubleToString(dcgsse));
        map.put("dcgssna", CommonFunc.convertDoubleToString(dcgssna));
        map.put("dcgssnb", CommonFunc.convertDoubleToString(dcgssnb));

        map.put("dggssmwr", CommonFunc.convertDoubleToString(dggssmwr));
        map.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
        map.put("r1", CommonFunc.convertDoubleToString(r1));
        map.put("hwll", CommonFunc.convertDoubleToString(hwll));
        map.put("sszdcms1", CommonFunc.convertDoubleToString(sszdcms1));
        map.put("sszdcms2", CommonFunc.convertDoubleToString(sszdcms2));
        map.put("sszdcms3", CommonFunc.convertDoubleToString(sszdcms3));
        map.put("sszdcms4", CommonFunc.convertDoubleToString(sszdcms4));
        map.put("sszdcms5", CommonFunc.convertDoubleToString(sszdcms5));

        map.put("sszdclffbb", CommonFunc.convertDoubleToString(sszdclffbb));
        map.put("sszdclr1", CommonFunc.convertDoubleToString(sszdclr1));
        map.put("sszdclwll", CommonFunc.convertDoubleToString(sszdclwll));
        map.put("sszdcls1", CommonFunc.convertDoubleToString(sszdcls1));
        map.put("sszdcls2", CommonFunc.convertDoubleToString(sszdcls2));
        map.put("sszdcls3", CommonFunc.convertDoubleToString(sszdcls3));
        map.put("sszdcls4", CommonFunc.convertDoubleToString(sszdcls4));
        map.put("sszdcls5", CommonFunc.convertDoubleToString(sszdcls5));

        map.put("sszdclffbbf", CommonFunc.convertDoubleToString(sszdclffbbf));
        map.put("sszdclr1f", CommonFunc.convertDoubleToString(sszdclr1f));
        map.put("sszdclwllf", CommonFunc.convertDoubleToString(sszdclwllf));
        map.put("sszdcls1f", CommonFunc.convertDoubleToString(sszdcls1f));
        map.put("sszdcls2f", CommonFunc.convertDoubleToString(sszdcls2f));
        map.put("sszdcls3f", CommonFunc.convertDoubleToString(sszdcls3f));
        map.put("sszdcls4f", CommonFunc.convertDoubleToString(sszdcls4f));
        map.put("sszdcls5f", CommonFunc.convertDoubleToString(sszdcls5f));

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

//        伸出（挂物料）弯矩
        Double sszdcljmffbb = mffbb * sszdclffbb * 10 ;
        Double sszdcljmr1 = r1 * sszdclr1 * 10 ;
        Double sszdcljmwll = hwll * sszdclwll * 10 ;
        Double sszdcljms1 = sszdcms1 * sszdcls1 * 10 ;
        Double sszdcljms2 = sszdcms2 * sszdcls2 * 10 ;
        Double sszdcljms3 = sszdcms3 * sszdcls3 * 10 ;
        Double sszdcljms4 = sszdcms4 * sszdcls4 * 10 ;
        Double sszdcljms5 = sszdcms5 * sszdcls5 * 10 ;
        map.put("sszdcljmffbb", sszdcljmffbb);
        map.put("sszdcljmr1", sszdcljmr1);
        map.put("sszdcljmwll", sszdcljmwll);
        map.put("sszdcljms1", sszdcljms1);
        map.put("sszdcljms2", sszdcljms2);
        map.put("sszdcljms3", sszdcljms3);
        map.put("sszdcljms4", sszdcljms4);
        map.put("sszdcljms5", sszdcljms5);

//        伸出（挂物料）吊点受力
        Double sszdcmsz1 = mffbb + r1 + hwll + sszdcms1 + sszdcms2 + sszdcms3 + sszdcms4 + sszdcms5 ;
        Double sszdcljmsqg1 = sszdcljmffbb + sszdcljmr1 + sszdcljmwll + sszdcljms1 + sszdcljms2 ;
        Double sszdcljmskg1 = sszdcljms3 + sszdcljms4 + sszdcljms5 ;
        Double sszdcfb11 = 1000 * Math.abs( sszdcljmskg1 - sszdcljmsqg1 ) / sszdclsd ;
        Double sszdcfa11 = sszdcmsz1 * 10 - sszdcfb11 ;
        Double sszdcfa1 = sszdcfa11 + dggssmwr * 10 * dcgssna ;
        Double sszdcfb1 = sszdcfb11 + dggssmwr * 10 * dcgssnb ;
        map.put("sszdcmsz1", sszdcmsz1);
        map.put("sszdcljmsqg1", sszdcljmsqg1);
        map.put("sszdcljmskg1", sszdcljmskg1);
        map.put("sszdcfb11", sszdcfb11);
        map.put("sszdcfa11", sszdcfa11);
        map.put("sszdcfa1", sszdcfa1);
        map.put("sszdcfb1", sszdcfb1);

        //        伸出（挂物料）吊点钢丝绳安全系数
        Double sszdczpa1 = 1000 * dcgssna * dcgssf / sszdcfa1 ;
        Double sszdczpb1 = 1000 * dcgssnb * dcgssf / sszdcfb1 ;
        map.put("sszdczpa1", sszdczpa1);
        map.put("sszdczpb1", sszdczpb1);

        //        伸出（挂物料）吊点钢丝绳弹性变量
        Double sszdcdla1 = sszdcfa1 * h / dcgssna / dcgsse / dcgssa ;
        Double sszdcdlb1 = sszdcfb1 * h / dcgssnb / dcgsse / dcgssa ;
        map.put("sszdcdla1", sszdcdla1);
        map.put("sszdcdlb1", sszdcdlb1);

//        伸出（无物料）吊点受力
        Double sszdcmsz2 = mffbb + r1 + sszdcms1 + sszdcms2 + sszdcms3 + sszdcms4 + sszdcms5 ;
        Double sszdcljmsqg2 = sszdcljmffbb + sszdcljmr1 + sszdcljms1 + sszdcljms2 ;
        Double sszdcljmskg2 = sszdcljms3 + sszdcljms4 + sszdcljms5 ;
        Double sszdcfb21 = 1000 * Math.abs( sszdcljmskg2 - sszdcljmsqg2 ) / sszdclsd ;
        Double sszdcfa21 = sszdcmsz2 * 10 - sszdcfb21 ;
        Double sszdcfa2 = sszdcfa21 + dggssmwr * 10 * dcgssna ;
        Double sszdcfb2 = sszdcfb21 + dggssmwr * 10 * dcgssnb ;
        map.put("sszdcmsz2", sszdcmsz2);
        map.put("sszdcljmsqg2", sszdcljmsqg2);
        map.put("sszdcljmskg2", sszdcljmskg2);
        map.put("sszdcfb21", sszdcfb21);
        map.put("sszdcfa21", sszdcfa21);
        map.put("sszdcfa2", sszdcfa2);
        map.put("sszdcfb2", sszdcfb2);

        //        伸出（无物料）吊点钢丝绳安全系数
        Double sszdczpa2 = 1000 * dcgssna * dcgssf / sszdcfa2 ;
        Double sszdczpb2 = 1000 * dcgssnb * dcgssf / sszdcfb2 ;
        map.put("sszdczpa2", sszdczpa2);
        map.put("sszdczpb2", sszdczpb2);

        //        伸出（无物料）吊点钢丝绳弹性变量
        Double sszdcdla2 = sszdcfa2 * h / dcgssna / dcgsse / dcgssa ;
        Double sszdcdlb2 = sszdcfb2 * h / dcgssnb / dcgsse / dcgssa ;
        map.put("sszdcdla2", sszdcdla2);
        map.put("sszdcdlb2", sszdcdlb2);

        //        缩回（挂物料）弯矩
        Double sszdcljmffbbf = mffbb * sszdclffbbf * 10 ;
        Double sszdcljmr1f = r1 * sszdclr1f * 10 ;
        Double sszdcljmwllf = hwll * sszdclwllf * 10 ;
        Double sszdcljms1f = sszdcms1 * sszdcls1f * 10 ;
        Double sszdcljms2f = sszdcms2 * sszdcls2f * 10 ;
        Double sszdcljms3f = sszdcms3 * sszdcls3f * 10 ;
        Double sszdcljms4f = sszdcms4 * sszdcls4f * 10 ;
        Double sszdcljms5f = sszdcms5 * sszdcls5f * 10 ;
        map.put("sszdcljmffbbf", sszdcljmffbbf);
        map.put("sszdcljmr1f", sszdcljmr1f);
        map.put("sszdcljmwllf", sszdcljmwllf);
        map.put("sszdcljms1f", sszdcljms1f);
        map.put("sszdcljms2f", sszdcljms2f);
        map.put("sszdcljms3f", sszdcljms3f);
        map.put("sszdcljms4f", sszdcljms4f);
        map.put("sszdcljms5f", sszdcljms5f);

//        缩回（挂物料）吊点受力
        Double sszdcmsz3 = mffbb + r1 + hwll + sszdcms1 + sszdcms2 + sszdcms3 + sszdcms4 + sszdcms5 ;
        Double sszdcljmsqg3 = sszdcljmffbbf + sszdcljmr1f + sszdcljmwllf + sszdcljms1f ;
        Double sszdcljmskg3 = sszdcljms2f + sszdcljms3f + sszdcljms4f + sszdcljms5f ;
        Double sszdcfb31 = 1000 * Math.abs( sszdcljmskg3 - sszdcljmsqg3 ) / sszdclsd ;
        Double sszdcfa31 = sszdcmsz3 * 10 - sszdcfb31 ;
        Double sszdcfa3 = sszdcfa31 + dggssmwr * 10 * dcgssna ;
        Double sszdcfb3 = sszdcfb31 + dggssmwr * 10 * dcgssnb ;
        map.put("sszdcmsz3", sszdcmsz3);
        map.put("sszdcljmsqg3", sszdcljmsqg3);
        map.put("sszdcljmskg3", sszdcljmskg3);
        map.put("sszdcfb31", sszdcfb31);
        map.put("sszdcfa31", sszdcfa31);
        map.put("sszdcfa3", sszdcfa3);
        map.put("sszdcfb3", sszdcfb3);

        //        缩回（挂物料）吊点钢丝绳安全系数
        Double sszdczpa3 = 1000 * dcgssna * dcgssf / sszdcfa3 ;
        Double sszdczpb3 = 1000 * dcgssnb * dcgssf / sszdcfb3 ;
        map.put("sszdczpa3", sszdczpa3);
        map.put("sszdczpb3", sszdczpb3);

        //        缩回（挂物料）吊点钢丝绳弹性变量
        Double sszdcdla3 = sszdcfa3 * h / dcgssna / dcgsse / dcgssa ;
        Double sszdcdlb3 = sszdcfb3 * h / dcgssnb / dcgsse / dcgssa ;
        map.put("sszdcdla3", sszdcdla3);
        map.put("sszdcdlb3", sszdcdlb3);

        //        缩回（无物料）吊点受力
        Double sszdcmsz4 = mffbb + r1 + sszdcms1 + sszdcms2 + sszdcms3 + sszdcms4 + sszdcms5 ;
        Double sszdcljmsqg4 = sszdcljmffbbf + sszdcljmr1f + sszdcljms1f ;
        Double sszdcljmskg4 = sszdcljms2f + sszdcljms3f + sszdcljms4f + sszdcljms5f ;
        Double sszdcfb41 = 1000 * Math.abs( sszdcljmskg4 - sszdcljmsqg4 ) / sszdclsd ;
        Double sszdcfa41 = sszdcmsz4 * 10 - sszdcfb41 ;
        Double sszdcfa4 = sszdcfa41 + dggssmwr * 10 * dcgssna ;
        Double sszdcfb4 = sszdcfb41 + dggssmwr * 10 * dcgssnb ;
        map.put("sszdcmsz4", sszdcmsz4);
        map.put("sszdcljmsqg4", sszdcljmsqg4);
        map.put("sszdcljmskg4", sszdcljmskg4);
        map.put("sszdcfb41", sszdcfb41);
        map.put("sszdcfa41", sszdcfa41);
        map.put("sszdcfa4", sszdcfa4);
        map.put("sszdcfb4", sszdcfb4);

        //        缩回（无物料）吊点钢丝绳安全系数
        Double sszdczpa4 = 1000 * dcgssna * dcgssf / sszdcfa4 ;
        Double sszdczpb4 = 1000 * dcgssnb * dcgssf / sszdcfb4 ;
        map.put("sszdczpa4", sszdczpa4);
        map.put("sszdczpb4", sszdczpb4);

        //        缩回（无物料）吊点钢丝绳弹性变量
        Double sszdcdla4 = sszdcfa4 * h / dcgssna / dcgsse / dcgssa ;
        Double sszdcdlb4 = sszdcfb4 * h / dcgssnb / dcgsse / dcgssa ;
        map.put("sszdcdla4", sszdcdla4);
        map.put("sszdcdlb4", sszdcdlb4);

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
        if (a < b) {
            return "不满足";
        } else {
            return "满足";
        }
    }

    public Map<String, String> takeStringMapForPdf(String type) {
        Map map = new HashMap();
        Map<String, Double> doubleMap = takeDoubleMapForPdf(type);

//        伸出（挂物料）
        Double sszdczpa1 = doubleMap.get("sszdczpa1");
        String sszdcgssb1 = takeSignByCompareNumber(sszdczpa1, 12.0);
        String sszdcgssm1 = takeStringByCompareNumber(sszdczpa1, 12.0);
        map.put("sszdcgssb1", CommonFunc.convertDoubleToString(sszdcgssb1));
        map.put("sszdcgssm1", CommonFunc.convertDoubleToString(sszdcgssm1));

        Double sszdczpb1= doubleMap.get("sszdczpb1");
        String sszdcgssb2 = takeSignByCompareNumber(sszdczpb1, 12.0);
        String sszdcgssm2 = takeStringByCompareNumber(sszdczpb1, 12.0);
        map.put("sszdcgssb2", CommonFunc.convertDoubleToString(sszdcgssb2));
        map.put("sszdcgssm2", CommonFunc.convertDoubleToString(sszdcgssm2));

        //        伸出（无物料）
        Double sszdczpa2 = doubleMap.get("sszdczpa2");
        String sszdcgssb3 = takeSignByCompareNumber(sszdczpa2, 12.0);
        String sszdcgssm3 = takeStringByCompareNumber(sszdczpa2, 12.0);
        map.put("sszdcgssb3", CommonFunc.convertDoubleToString(sszdcgssb3));
        map.put("sszdcgssm3", CommonFunc.convertDoubleToString(sszdcgssm3));

        Double sszdczpb2= doubleMap.get("sszdczpb2");
        String sszdcgssb4 = takeSignByCompareNumber(sszdczpb2, 12.0);
        String sszdcgssm4 = takeStringByCompareNumber(sszdczpb2, 12.0);
        map.put("sszdcgssb4", CommonFunc.convertDoubleToString(sszdcgssb4));
        map.put("sszdcgssm4", CommonFunc.convertDoubleToString(sszdcgssm4));

        //        缩回（挂物料）
        Double sszdczpa3 = doubleMap.get("sszdczpa3");
        String sszdcgssb5 = takeSignByCompareNumber(sszdczpa3, 12.0);
        String sszdcgssm5 = takeStringByCompareNumber(sszdczpa3, 12.0);
        map.put("sszdcgssb5", CommonFunc.convertDoubleToString(sszdcgssb5));
        map.put("sszdcgssm5", CommonFunc.convertDoubleToString(sszdcgssm5));

        Double sszdczpb3= doubleMap.get("sszdczpb3");
        String sszdcgssb6 = takeSignByCompareNumber(sszdczpb3, 12.0);
        String sszdcgssm6 = takeStringByCompareNumber(sszdczpb3, 12.0);
        map.put("sszdcgssb6", CommonFunc.convertDoubleToString(sszdcgssb6));
        map.put("sszdcgssm6", CommonFunc.convertDoubleToString(sszdcgssm6));

        //        缩回（无物料）
        Double sszdczpa4 = doubleMap.get("sszdczpa4");
        String sszdcgssb7 = takeSignByCompareNumber(sszdczpa4, 12.0);
        String sszdcgssm7 = takeStringByCompareNumber(sszdczpa4, 12.0);
        map.put("sszdcgssb7", CommonFunc.convertDoubleToString(sszdcgssb7));
        map.put("sszdcgssm7", CommonFunc.convertDoubleToString(sszdcgssm7));

        Double sszdczpb4= doubleMap.get("sszdczpb4");
        String sszdcgssb8 = takeSignByCompareNumber(sszdczpb4, 12.0);
        String sszdcgssm8 = takeStringByCompareNumber(sszdczpb4, 12.0);
        map.put("sszdcgssb8", CommonFunc.convertDoubleToString(sszdcgssb8));
        map.put("sszdcgssm8", CommonFunc.convertDoubleToString(sszdcgssm8));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
