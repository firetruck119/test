package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class CleaningCycleEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private String csmc;
    private String cslx;
    private Double oyx;

    private Double h;
    private Double lc;
    private Double nxz;
    private Double nsb;
    private Double ldc;
    private Double wcd;
    private Double vdc;
    private Double vqx;
    private Double tzh;
    private Double txd;
    private Double tmr;
    private Double ozh;
    private Double osj;

    private String cslxModel;

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

        map.put("csmc", CommonFunc.convertDoubleToString(csmc));
        map.put("cslx", CommonFunc.convertDoubleToString(cslx));
        map.put("oyx", CommonFunc.convertDoubleToString(oyx));

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("lc", CommonFunc.convertDoubleToString(lc));
        map.put("nxz", CommonFunc.convertDoubleToString(nxz));
        map.put("nsb", CommonFunc.convertDoubleToString(nsb));
        map.put("ldc", CommonFunc.convertDoubleToString(ldc));
        map.put("wcd", CommonFunc.convertDoubleToString(wcd));
        map.put("vdc", CommonFunc.convertDoubleToString(vdc));
        map.put("vqx", CommonFunc.convertDoubleToString(vqx));
        map.put("tzh", CommonFunc.convertDoubleToString(tzh));
        map.put("txd", CommonFunc.convertDoubleToString(txd));
        map.put("tmr", CommonFunc.convertDoubleToString(tmr));
        map.put("ozh", CommonFunc.convertDoubleToString(ozh));
        map.put("osj", CommonFunc.convertDoubleToString(osj));
        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");
        Double tll = map.get("tll");
        Double ty1 = lc * tzh / wcd ;
        Double ty2 = lc * h / vqx ;
        Double ty3 = 2 * osj * lc * h / vdc / wcd ;
        Double ty4 = lc * nxz * txd / wcd ;
        Double tyz = ty1 + ty2 + ty3 + ty4 ;
        Double tyll = ozh * tyz / nsb / 60 / tmr ;
        Double a1 = tll / tyll ;
        String a2 = (0.95 <= a1 && a1 <= 1.05) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("h", CommonFunc.convertDoubleToString(h));
        result.put("lc", CommonFunc.convertDoubleToString(lc));
        result.put("nxz", CommonFunc.convertDoubleToString(nxz));
        result.put("nsb", CommonFunc.convertDoubleToString(nsb));
        result.put("wcd", CommonFunc.convertDoubleToString(wcd));
        result.put("vdc", CommonFunc.convertDoubleToString(vdc));
        result.put("vqx", CommonFunc.convertDoubleToString(vqx));
        result.put("tzh", CommonFunc.convertDoubleToString(tzh));
        result.put("txd", CommonFunc.convertDoubleToString(txd));
        result.put("tmr", CommonFunc.convertDoubleToString(tmr));
        result.put("ozh", CommonFunc.convertDoubleToString(ozh));
        result.put("osj", CommonFunc.convertDoubleToString(osj));
        result.put("tll", CommonFunc.convertDoubleToString(tll));
        result.put("ty1", CommonFunc.convertDoubleToString(ty1));
        result.put("ty2", CommonFunc.convertDoubleToString(ty2));
        result.put("ty3", CommonFunc.convertDoubleToString(ty3));
        result.put("ty4", CommonFunc.convertDoubleToString(ty4));
        result.put("tyz", CommonFunc.convertDoubleToString(tyz));
        result.put("tyll", CommonFunc.convertDoubleToString(tyll));
        result.put("a1", CommonFunc.convertDoubleToString(a1));
        result.put("a2", CommonFunc.convertDoubleToString(a2));
        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

//      计算
        Double n3= lc / wcd ;
        Double smj= h * wcd ;
        Double t2= smj / vqx ;
        Double t3= osj * h * 2 / vdc ;
        Double t4= nxz * txd ;
        Double tz= tzh + t2 + t3 + t4 ;
        Double tll= ozh * n3 * tz / nsb / 60 / tmr ;
        Double ttq= 100 * tll / oyx ;
        map.put("n3", n3);
        map.put("smj", smj);
        map.put("t2", t2);
        map.put("t3", t3);
        map.put("t4", t4);
        map.put("tz", tz);
        map.put("tll", tll);
        map.put("ttq", ttq);
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
