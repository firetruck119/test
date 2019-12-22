package com.point.entity.pdf;


import com.point.common.CommonFunc;
import com.point.entity.Component;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class FsStabilityEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double pf;

    private Double lbd;
    private Double lbx;
    private Double lbp;
    private Double lg;
    private Double ll;
    private Double mz;
    private Double mzf;

    private String lsxh;
    private Double fj;
    private Double n1;
    private Double n2;

    private Double swp;
    private Double r1;
    private Double mwr;
    private Double tsl;
    private Double hwll;
    private Double hsw;
    private Double tshl;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;
    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;

    private Double lslq;
    private Double lshlq;
    private Double lq1;
    private Double lq2;
    private Double lq3;
    private Double lq4;
    private Double lq5;
    private Double lq6;
    private Double lq7;
    private Double lq8;
    private Double lq9;

    private Double hsl;
    private Double hshl;
    private Double h1;
    private Double h2;
    private Double h3;
    private Double h4;
    private Double h5;
    private Double h6;
    private Double h7;
    private Double h8;
    private Double h9;

    private Double asltx;
    private Double ashltx;
    private Double atx1;
    private Double atx2;
    private Double atx3;
    private Double atx4;
    private Double atx5;
    private Double atx6;
    private Double atx7;
    private Double atx8;
    private Double atx9;

    private Double lh1;
    private Double lh2;
    private Double lh3;
    private Double lh4;
    private Double lh5;
    private Double lh6;
    private Double lh7;
    private Double lh8;
    private Double lh9;

    private Double hf1;
    private Double hf2;
    private Double hf3;
    private Double hf4;
    private Double hf5;
    private Double hf6;
    private Double hf7;
    private Double hf8;
    private Double hf9;

    private Double aftx1;
    private Double aftx2;
    private Double aftx3;
    private Double aftx4;
    private Double aftx5;
    private Double aftx6;
    private Double aftx7;
    private Double aftx8;
    private Double aftx9;

    public Map<String, String> getMapForObject() {
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
        result.put("pf", CommonFunc.convertDoubleToString(pf));
        result.put("lbd", CommonFunc.convertDoubleToString(lbd));
        result.put("lbx", CommonFunc.convertDoubleToString(lbx));
        result.put("lbp", CommonFunc.convertDoubleToString(lbp));
        result.put("lg", CommonFunc.convertDoubleToString(lg));
        result.put("ll", CommonFunc.convertDoubleToString(ll));
        result.put("mz", CommonFunc.convertDoubleToString(mz));
        result.put("mzf", CommonFunc.convertDoubleToString(mzf));
        result.put("lsxh", CommonFunc.convertDoubleToString(lsxh));
        result.put("fj", CommonFunc.convertDoubleToString(fj));
        result.put("n1", CommonFunc.convertDoubleToString(n1));
        result.put("n2", CommonFunc.convertDoubleToString(n2));
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("m1", CommonFunc.convertDoubleToString(m1));
        result.put("m2", CommonFunc.convertDoubleToString(m2));
        result.put("m3", CommonFunc.convertDoubleToString(m3));
        result.put("m4", CommonFunc.convertDoubleToString(m4));
        result.put("m5", CommonFunc.convertDoubleToString(m5));
        result.put("m6", CommonFunc.convertDoubleToString(m6));
        result.put("m7", CommonFunc.convertDoubleToString(m7));
        result.put("m8", CommonFunc.convertDoubleToString(m8));
        result.put("m9", CommonFunc.convertDoubleToString(m9));
        result.put("lslq", CommonFunc.convertDoubleToString(lslq));
        result.put("lshlq", CommonFunc.convertDoubleToString(lshlq));
        result.put("lq1", CommonFunc.convertDoubleToString(lq1));
        result.put("lq2", CommonFunc.convertDoubleToString(lq2));
        result.put("lq3", CommonFunc.convertDoubleToString(lq3));
        result.put("lq4", CommonFunc.convertDoubleToString(lq4));
        result.put("lq5", CommonFunc.convertDoubleToString(lq5));
        result.put("lq6", CommonFunc.convertDoubleToString(lq6));
        result.put("lq7", CommonFunc.convertDoubleToString(lq7));
        result.put("lq8", CommonFunc.convertDoubleToString(lq8));
        result.put("lq9", CommonFunc.convertDoubleToString(lq9));
        result.put("hsl", CommonFunc.convertDoubleToString(hsl));
        result.put("hshl", CommonFunc.convertDoubleToString(hshl));
        result.put("h1", CommonFunc.convertDoubleToString(h1));
        result.put("h2", CommonFunc.convertDoubleToString(h2));
        result.put("h3", CommonFunc.convertDoubleToString(h3));
        result.put("h4", CommonFunc.convertDoubleToString(h4));
        result.put("h5", CommonFunc.convertDoubleToString(h5));
        result.put("h6", CommonFunc.convertDoubleToString(h6));
        result.put("h7", CommonFunc.convertDoubleToString(h7));
        result.put("h8", CommonFunc.convertDoubleToString(h8));
        result.put("h9", CommonFunc.convertDoubleToString(h9));
        result.put("asltx", CommonFunc.convertDoubleToString(asltx));
        result.put("ashltx", CommonFunc.convertDoubleToString(ashltx));
        result.put("atx1", CommonFunc.convertDoubleToString(atx1));
        result.put("atx2", CommonFunc.convertDoubleToString(atx2));
        result.put("atx3", CommonFunc.convertDoubleToString(atx3));
        result.put("atx4", CommonFunc.convertDoubleToString(atx4));
        result.put("atx5", CommonFunc.convertDoubleToString(atx5));
        result.put("atx6", CommonFunc.convertDoubleToString(atx6));
        result.put("atx7", CommonFunc.convertDoubleToString(atx7));
        result.put("atx8", CommonFunc.convertDoubleToString(atx8));
        result.put("atx9", CommonFunc.convertDoubleToString(atx9));
        result.put("lh1", CommonFunc.convertDoubleToString(lh1));
        result.put("lh2", CommonFunc.convertDoubleToString(lh2));
        result.put("lh3", CommonFunc.convertDoubleToString(lh3));
        result.put("lh4", CommonFunc.convertDoubleToString(lh4));
        result.put("lh5", CommonFunc.convertDoubleToString(lh5));
        result.put("lh6", CommonFunc.convertDoubleToString(lh6));
        result.put("lh7", CommonFunc.convertDoubleToString(lh7));
        result.put("lh8", CommonFunc.convertDoubleToString(lh8));
        result.put("lh9", CommonFunc.convertDoubleToString(lh9));
        result.put("hf1", CommonFunc.convertDoubleToString(hf1));
        result.put("hf2", CommonFunc.convertDoubleToString(hf2));
        result.put("hf3", CommonFunc.convertDoubleToString(hf3));
        result.put("hf4", CommonFunc.convertDoubleToString(hf4));
        result.put("hf5", CommonFunc.convertDoubleToString(hf5));
        result.put("hf6", CommonFunc.convertDoubleToString(hf6));
        result.put("hf7", CommonFunc.convertDoubleToString(hf7));
        result.put("hf8", CommonFunc.convertDoubleToString(hf8));
        result.put("hf9", CommonFunc.convertDoubleToString(hf9));
        result.put("aftx1", CommonFunc.convertDoubleToString(aftx1));
        result.put("aftx2", CommonFunc.convertDoubleToString(aftx2));
        result.put("aftx3", CommonFunc.convertDoubleToString(aftx3));
        result.put("aftx4", CommonFunc.convertDoubleToString(aftx4));
        result.put("aftx5", CommonFunc.convertDoubleToString(aftx5));
        result.put("aftx6", CommonFunc.convertDoubleToString(aftx6));
        result.put("aftx7", CommonFunc.convertDoubleToString(aftx7));
        result.put("aftx8", CommonFunc.convertDoubleToString(aftx8));
        result.put("aftx9", CommonFunc.convertDoubleToString(aftx9));
        return result;
    }

    public Map<String, Double> getMapForDouble() {
        Map<String, Double> result = new HashMap<>();
        Double msla = 2 * 10 * tsl * lslq;
        Double mshla = 1.4 * 10 * tshl * lshlq;
        Double ma1 = 1.25 * 10 * m1 * lq1;
        result.put("msla", msla);
        result.put("mshla", mshla);
        result.put("ma1", ma1);

        Double ma2 = 10 * m2 * lq2;
        Double ma3 = 10 * m3 * lq3;
        Double ma4 = 10 * m4 * lq4;
        Double ma5 = 10 * m5 * lq5;
        Double ma6 = 10 * m6 * lq6;
        Double ma7 = 10 * m7 * lq7;
        Double ma8 = 10 * m8 * lq8;
        Double ma9 = 10 * m9 * lq9;
        result.put("ma2", ma2);
        result.put("ma3", ma3);
        result.put("ma4", ma4);
        result.put("ma5", ma5);
        result.put("ma6", ma6);
        result.put("ma7", ma7);
        result.put("ma8", ma8);
        result.put("ma9", ma9);


        Double msltw = 1.25 * 250 * asltx * hsl;
        Double mshltw = 1.25 * 250 * ashltx * hshl;
        Double mtw1 = 1.25 * 250 * atx1 * h1;
        Double mtw2 = 1.25 * 250 * atx2 * h2;
        Double mtw3 = 1.25 * 250 * atx3 * h3;
        Double mtw4 = 1.25 * 250 * atx4 * h4;
        Double mtw5 = 1.25 * 250 * atx5 * h5;
        Double mtw6 = 1.25 * 250 * atx6 * h6;
        Double mtw7 = 1.25 * 250 * atx7 * h7;
        Double mtw8 = 1.25 * 250 * atx8 * h8;
        Double mtw9 = 1.25 * 250 * atx9 * h9;

        result.put("msltw", msltw);
        result.put("mshltw", mshltw);
        result.put("mtw1", mtw1);
        result.put("mtw2", mtw2);
        result.put("mtw3", mtw3);
        result.put("mtw4", mtw4);
        result.put("mtw5", mtw5);
        result.put("mtw6", mtw6);
        result.put("mtw7", mtw7);
        result.put("mtw8", mtw8);
        result.put("mtw9", mtw9);

        Double mh1 = 10 * m1 * lh1;
        Double mh2 = 10 * m2 * lh2;
        Double mh3 = 10 * m3 * lh3;
        Double mh4 = 10 * m4 * lh4;
        Double mh5 = 10 * m5 * lh5;
        Double mh6 = 10 * m6 * lh6;
        Double mh7 = 10 * m7 * lh7;
        Double mh8 = 10 * m8 * lh8;
        Double mh9 = 10 * m9 * lh9;
        result.put("mh1", mh1);
        result.put("mh2", mh2);
        result.put("mh3", mh3);
        result.put("mh4", mh4);
        result.put("mh5", mh5);
        result.put("mh6", mh6);
        result.put("mh7", mh7);
        result.put("mh8", mh8);
        result.put("mh9", mh9);

        Double mftw1 = pf * aftx1 * hf1;
        Double mftw2 = pf * aftx2 * hf2;
        Double mftw3 = pf * aftx3 * hf3;
        Double mftw4 = pf * aftx4 * hf4;
        Double mftw5 = pf * aftx5 * hf5;
        Double mftw6 = pf * aftx6 * hf6;
        Double mftw7 = pf * aftx7 * hf7;
        Double mftw8 = pf * aftx8 * hf8;
        Double mftw9 = pf * aftx9 * hf9;
        result.put("mftw1", mftw1);
        result.put("mftw2", mftw2);
        result.put("mftw3", mftw3);
        result.put("mftw4", mftw4);
        result.put("mftw5", mftw5);
        result.put("mftw6", mftw6);
        result.put("mftw7", mftw7);
        result.put("mftw8", mftw8);
        result.put("mftw9", mftw9);


        Double mq = msla + mshla + ma1;
        Double mm2 = ma2 + ma3 + ma4 + ma5 + ma6 + ma7 + ma8 + ma9;
        Double mtw = msltw + mshltw + mtw1 + mtw2 + mtw3 + mtw4 + mtw5 + mtw6 + mtw7 + mtw8 + mtw9;
        Double mqh = mh1 + mh2 + mh3 + mh4 + mh5 + mh6 + mh7 + mh8 + mh9;
        Double mftw = mftw1 + mftw2 + mftw3 + mftw4 + mftw5 + mftw6 + mftw7 + mftw8 + mftw9;
        Double mm1 = mq + mtw;
        Double mm3 = n1 * n2 * fj * lg;
        Double mmh1 = mm2 + mm3;
        Double mm1p = mqh + mftw;
        Double mmh2 = 0 + mm3;
        result.put("mq", mq);
        result.put("mm2", mm2);
        result.put("mtw", mtw);
        result.put("mqh", mqh);
        result.put("mftw", mftw);
        result.put("mm1", mm1);
        result.put("mm3", mm3);
        result.put("mmh1", mmh1);
        result.put("mm1p", mm1p);
        result.put("mmh2", mmh2);

        Double mslq = 1.25 * 10 * tsl * lslq;
        Double mshlq = 1.25 * 10 * tshl * lshlq;
        Double mq1 = 1.25 * 10 * m1 * lq1;
        result.put("mslq", mslq);
        result.put("mshlq", mshlq);
        result.put("mq1", mq1);

        Double mq2 = 1.25 * 10 * m2 * lq2;
        Double mq3 = 1.25 * 10 * m3 * lq3;
        Double mq4 = 1.25 * 10 * m4 * lq4;
        Double mq5 = 1.25 * 10 * m5 * lq5;
        Double mq6 = 1.25 * 10 * m6 * lq6;
        Double mq7 = 1.25 * 10 * m7 * lq7;
        Double mq8 = 1.25 * 10 * m8 * lq8;
        Double mq9 = 1.25 * 10 * m9 * lq9;
        result.put("mq2", mq2);
        result.put("mq3", mq3);
        result.put("mq4", mq4);
        result.put("mq5", mq5);
        result.put("mq6", mq6);
        result.put("mq7", mq7);
        result.put("mq8", mq8);
        result.put("mq9", mq9);

        Double fsl = 1.25 * 250 * asltx;
        Double fshl = 1.25 * 250 * ashltx;
        Double f1 = 1.25 * 250 * atx1;
        Double f2 = 1.25 * 250 * atx2;
        Double f3 = 1.25 * 250 * atx3;
        Double f4 = 1.25 * 250 * atx4;
        Double f5 = 1.25 * 250 * atx5;
        Double f6 = 1.25 * 250 * atx6;
        Double f7 = 1.25 * 250 * atx7;
        Double f8 = 1.25 * 250 * atx8;
        Double f9 = 1.25 * 250 * atx9;
        result.put("fsl", fsl);
        result.put("fshl", fshl);
        result.put("f1", f1);
        result.put("f2", f2);
        result.put("f3", f3);
        result.put("f4", f4);
        result.put("f5", f5);
        result.put("f6", f6);
        result.put("f7", f7);
        result.put("f8", f8);
        result.put("f9", f9);

        Double cdv = 1.25 * 10 * mz / 2;
        Double cdt = 0.05 * cdv;
        result.put("cdv", cdv);
        result.put("cdt", cdt);

        Double mqq = mslq + mshlq + mq1;
        Double mkq = mq2 + mq3 + mq4 + mq5 + mq6 + mq7 + mq8 + mq9;
        Double mfq = mqq - mkq;
        Double fw = fsl + fshl + f1 + f2 + f3 + f4 + f5 + f6 + f7 + f8 + f9;
        Double hab = mfq / lg / 2;
        Double hcd = -hab;
        Double dh = mtw / lg / 2;
        Double abh = hab + dh + fw / 2;
        Double cdh = hcd - dh + fw / 2;
        result.put("mqq", mqq);
        result.put("mkq", mkq);
        result.put("mfq", mfq);
        result.put("fw", fw);
        result.put("hab", hab);
        result.put("hcd", hcd);
        result.put("dh", dh);
        result.put("abh", abh);
        result.put("cdh", cdh);

        Double ff1 = pf * aftx1;
        Double ff2 = pf * aftx2;
        Double ff3 = pf * aftx3;
        Double ff4 = pf * aftx4;
        Double ff5 = pf * aftx5;
        Double ff6 = pf * aftx6;
        Double ff7 = pf * aftx7;
        Double ff8 = pf * aftx8;
        Double ff9 = pf * aftx9;
        result.put("ff1", ff1);
        result.put("ff2", ff2);
        result.put("ff3", ff3);
        result.put("ff4", ff4);
        result.put("ff5", ff5);
        result.put("ff6", ff6);
        result.put("ff7", ff7);
        result.put("ff8", ff8);
        result.put("ff9", ff9);

        Double cdvf = 10 * mzf / 2;
        result.put("cdvf", cdvf);

        Double fwf = ff1 + ff2 + ff3 + ff4 + ff5 + ff6 + ff7 + ff8 + ff9;
        Double habf = -mqh / lg / 2;
        Double hcdf = -habf;
        Double dhf = mftw / lg / 2;
        Double abhf = habf - dhf - fwf / 2;
        Double cdhf = hcdf + dhf - fwf / 2;
        result.put("fwf", fwf);
        result.put("habf", habf);
        result.put("hcdf", hcdf);
        result.put("dhf", dhf);
        result.put("abhf", abhf);
        result.put("cdhf", cdhf);

        Double cdvv = cdv / 1000;
        Double cdtt = cdt / 1000;
        Double abhh = abh / 1000;
        Double cdhh = cdh / 1000;
        result.put("cdvv", cdvv);
        result.put("cdtt", cdtt);
        result.put("abhh", abhh);
        result.put("cdhh", cdhh);

        Double cdvvf = cdvf / 1000;
        Double abhhf = abhf / 1000;
        Double cdhhf = cdhf / 1000;
        result.put("cdvvf", cdvvf);
        result.put("abhhf", abhhf);
        result.put("cdhhf", cdhhf);

        return result;
    }

    public Map<String, String> getMapForPDF() {
        Map<String, Double> doubleMap = getMapForDouble();
        Map<String, String> objectMap = getMapForObject();
        Double mmh1 = doubleMap.get("mmh1");
        Double mm1 = doubleMap.get("mm1");
        Double mmh2 = doubleMap.get("mmh2");
        Double mm2 = doubleMap.get("mm2");
        String x1 = mmh1 >= mm1 ? "≥" : "<";
        String x2 = mmh1 >= mm1 ? "满足" : "不满足";
        String x3 = mmh2 >= mm2 ? "≥" : "<";
        String x4 = mmh2 >= mm2 ? "满足" : "不满足";
        String x5 = (mmh2 >= mm2 && mmh1 >= mm1) ? "满足" : "不满足";
        Map<String, String> result = new HashMap<>();
        result.put("x1", x1);
        result.put("x2", x2);
        result.put("x3", x3);
        result.put("x4", x4);
        result.put("x5", x5);
        for (Map.Entry<String, Double> e : doubleMap.entrySet()) {
            result.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }
        result.putAll(objectMap);
        return result;
    }

    String getSign(Double a,Double b){
        if(a>b)
            return ">";
        else if(a<b)
            return "<";
        else
            return "=";
    }
    public Map<String, String> getMapForInspectionPDF() {
        Map<String,Double> doubleMap=getMapForDouble();
        Double mq=doubleMap.get("mq");
        Double mm2=doubleMap.get("mm2");
        Double dmq=mq-mm2;
        Double dfq=dmq/n1/n2/lg;
        String y1=getSign(fj,dfq);
        String y2=fj>=dfq?"满足":"不满足";

        Map<String,String> result=new HashMap<>();
        result.put("mq",CommonFunc.convertDoubleToString(mq));
        result.put("mm2",CommonFunc.convertDoubleToString(mm2));
        result.put("fj",CommonFunc.convertDoubleToString(fj));
        result.put("n1",CommonFunc.convertDoubleToString(n1));
        result.put("n2",CommonFunc.convertDoubleToString(n2));
        result.put("lg",CommonFunc.convertDoubleToString(lg));
        result.put("dmq",CommonFunc.convertDoubleToString(dmq));
        result.put("dfq",CommonFunc.convertDoubleToString(dfq));
        result.put("y1",CommonFunc.convertDoubleToString(y1));
        result.put("y2",CommonFunc.convertDoubleToString(y2));

        return result;
    }
    public Map<String,String> getMapForInspection(){
        Map<String,String> result=new HashMap<>();
        Map<String,String> PDFMap=getMapForPDF();

        result.put("x2",PDFMap.get("x2"));
        result.put("x4",PDFMap.get("x4"));

        result.put("cdvv",PDFMap.get("cdvv"));
        result.put("cdtt",PDFMap.get("cdtt"));
        result.put("abhh",PDFMap.get("abhh"));
        result.put("cdhh",PDFMap.get("cdhh"));

        result.put("cdvvf",PDFMap.get("cdvvf"));
        result.put("abhhf",PDFMap.get("abhhf"));
        result.put("cdhhf",PDFMap.get("cdhhf"));
        result.put("zero","0");
        return result;
    }


}
