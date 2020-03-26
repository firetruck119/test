package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class WireRopeEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double swp;
    private Double r1;
    private Double mwr;
    private Double tsl;
    private Double hwll;
    private Double hsw;
    private Double tshl;

    private String dcgssxh;
    private Double dcgssd;
    private Double dcgssn;
    private Double dcgssf;
    private Double dcgssp;
    private String grugssxh;
    private Double grugssd;
    private Double grugssn;
    private Double grugssf;
    private Double grugssp;
    private String typeOfShipWireRope;
    private String typeOfMaterielWireRope;

    private String createSatisfied(double v1, double v2) {
        return v1 >= v2 ? "满足" : "不满足";
    }

    private String createSign(double v1, double v2) {
        if (v1 > v2) return ">";
        else if (v1 == v2) return "=";
        else return "<";
    }


    public Map<String, String> createMapForPdf() {
        Map<String, String> result = new HashMap<>();
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));
        result.put("h", CommonFunc.convertDoubleToString(h));
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("xh1", CommonFunc.convertDoubleToString(dcgssxh));
        result.put("dcgssxh", CommonFunc.convertDoubleToString(dcgssxh));
        result.put("dcgssd", CommonFunc.convertDoubleToString(dcgssd));
        result.put("dcgssn", CommonFunc.convertDoubleToString(dcgssn));
        result.put("dcgssf", CommonFunc.convertDoubleToString(dcgssf));
        result.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        result.put("grugssxh", CommonFunc.convertDoubleToString(grugssxh));
        result.put("grugssd", CommonFunc.convertDoubleToString(grugssd));
        result.put("grugssn", CommonFunc.convertDoubleToString(grugssn));
        result.put("grugssf", CommonFunc.convertDoubleToString(grugssf));
        result.put("grugssp", CommonFunc.convertDoubleToString(grugssp));

        Double gsss1 = tsl / 100 / dcgssn;
        Double zp1p = dcgssf / gsss1;
        String gssp1 = createSign(zp1p, 12);
        String gssm1 = createSatisfied(zp1p, 12);
        result.put("gsss1", CommonFunc.convertDoubleToString(gsss1));
        result.put("zp1p", CommonFunc.convertDoubleToString(zp1p));
        result.put("gssp1", CommonFunc.convertDoubleToString(gssp1));
        result.put("gssm1", CommonFunc.convertDoubleToString(gssm1));

        Double gsss2 = tshl / 100 / grugssn;
        Double zp2p = grugssf / gsss2;
        String gssp2 = createSign(zp2p, 6);
        String gssm2 = createSatisfied(zp2p, 6);
        result.put("gsss2", CommonFunc.convertDoubleToString(gsss2));
        result.put("zp2p", CommonFunc.convertDoubleToString(zp2p));
        result.put("gssp2", CommonFunc.convertDoubleToString(gssp2));
        result.put("gssm2", CommonFunc.convertDoubleToString(gssm2));
        return result;
    }

    public Map<String, String> createMapForPdf2() {
        Map<String, String> result = new HashMap<>();
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));
        result.put("h", CommonFunc.convertDoubleToString(h));
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("xh1", CommonFunc.convertDoubleToString(dcgssxh));
        result.put("dcgssxh", CommonFunc.convertDoubleToString(dcgssxh));
        result.put("dcgssd", CommonFunc.convertDoubleToString(dcgssd));
        result.put("dcgssn", CommonFunc.convertDoubleToString(dcgssn));
        result.put("dcgssf", CommonFunc.convertDoubleToString(dcgssf));
        result.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        result.put("grugssxh", CommonFunc.convertDoubleToString(grugssxh));
        result.put("grugssd", CommonFunc.convertDoubleToString(grugssd));
        result.put("grugssn", CommonFunc.convertDoubleToString(grugssn));
        result.put("grugssf", CommonFunc.convertDoubleToString(grugssf));
        result.put("grugssp", CommonFunc.convertDoubleToString(grugssp));

        Double gsss1 = tsl / 100 / dcgssn;
        Double zp1p = dcgssf / gsss1;
        String gssp1 = createSign(zp1p, 12);
        String gssm1 = createSatisfied(zp1p, 12);
        result.put("gsss1", CommonFunc.convertDoubleToString(gsss1));
        result.put("zp1p", CommonFunc.convertDoubleToString(zp1p));
        result.put("gssp1", CommonFunc.convertDoubleToString(gssp1));
        result.put("gssm1", CommonFunc.convertDoubleToString(gssm1));
        Double gsss1p = dcgssf / 12;
        String gssyzp1 = createSign(gsss1p, gsss1);
        String gssyzm1 = createSatisfied(gsss1p, gsss1);
        result.put("gsss1p", CommonFunc.convertDoubleToString(gsss1p));
        result.put("gssyzp1", CommonFunc.convertDoubleToString(gssyzp1));
        result.put("gssyzm1", CommonFunc.convertDoubleToString(gssyzm1));

        Double gsss2 = tshl / 100 / grugssn;
        Double zp2p = grugssf / gsss2;
        String gssp2 = createSign(zp2p, 6);
        String gssm2 = createSatisfied(zp2p, 6);
        result.put("gsss2", CommonFunc.convertDoubleToString(gsss2));
        result.put("zp2p", CommonFunc.convertDoubleToString(zp2p));
        result.put("gssp2", CommonFunc.convertDoubleToString(gssp2));
        result.put("gssm2", CommonFunc.convertDoubleToString(gssm2));
        Double gsss2p = grugssf / 6;
        String gssyzp2 = createSign(gsss1p, gsss1);
        String gssyzm2 = createSatisfied(gsss1p, gsss1);
        result.put("gsss2p", CommonFunc.convertDoubleToString(gsss2p));
        result.put("gssyzp2", CommonFunc.convertDoubleToString(gssyzp2));
        result.put("gssyzm2", CommonFunc.convertDoubleToString(gssyzm2));
        return result;
    }

    public Map<String, String> check() {
        Map<String, String> result = new HashMap<>();
        Map<String, String> map = createMapForPdf();
        result.put("zp1p", map.get("zp1p"));
        result.put("gssm1", map.get("gssm1"));
        result.put("zp2p", map.get("zp2p"));
        result.put("gssm2", map.get("gssm2"));
        return result;
    }
}