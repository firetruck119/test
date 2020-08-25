package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class CounterweightsEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double lbd;
    private Double lbx;
    private Double lg;
    private Double ll;
    private Double npz;

    private Double swp;
    private Double r1;
    private Double mwr;
    private Double mffbb;
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
    private Double m10;
    private Double m11;
    private Double m12;
    private Double m13;
    private Double m14;
    private Double m15;
    private Double m16;
    private Double m17;
    private Double m18;
    private Double m19;
    private Double m20;
    private Double m21;

    private Double lslqg;
    private Double lshlqg;
    private Double lqg1;
    private Double lqg2;
    private Double lqg3;
    private Double lqg4;
    private Double lqg5;
    private Double lqg6;
    private Double lqg7;
    private Double lqg8;
    private Double lqg9;
    private Double lqg10;
    private Double lqg11;
    private Double lqg12;
    private Double lqg13;
    private Double lqg14;
    private Double lqg15;
    private Double lqg16;
    private Double lqg17;
    private Double lqg18;
    private Double lqg19;
    private Double lqg20;
    private Double lqg21;
    private Double ltjbpz;
    private Double lbp;

    //    非界面
    private Double dcgssp;
    private Double grugssp;
    private Double lbtzh;
    private Double ldcgh;
    private Double ldslzh;
    private String yxjgaz;
    private String hzzcxh;

    private String qt1;
    private String qt2;

    private String dcModel;
    private String dcgssModel;
    private String btModel;
    private String ffbbModel;
    private String trippingModel;
    private String qsjgModel;
    private String gruModel;
    private String yxjgazModel;
    private String dhzjgModel;

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
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("lg", CommonFunc.convertDoubleToString(lg));
        map.put("ll", CommonFunc.convertDoubleToString(ll));
        map.put("npz", CommonFunc.convertDoubleToString(npz));
        map.put("swp", CommonFunc.convertDoubleToString(swp));
        map.put("r1", CommonFunc.convertDoubleToString(r1));
        map.put("mwr", CommonFunc.convertDoubleToString(mwr));
        map.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
        map.put("tsl", CommonFunc.convertDoubleToString(tsl));
        map.put("hwll", CommonFunc.convertDoubleToString(hwll));
        map.put("hsw", CommonFunc.convertDoubleToString(hsw));
        map.put("tshl", CommonFunc.convertDoubleToString(tshl));
        map.put("m1", CommonFunc.convertDoubleToString(m1));
        map.put("m2", CommonFunc.convertDoubleToString(m2));
        map.put("m3", CommonFunc.convertDoubleToString(m3));
        map.put("m4", CommonFunc.convertDoubleToString(m4));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("m6", CommonFunc.convertDoubleToString(m6));
        map.put("m7", CommonFunc.convertDoubleToString(m7));
        map.put("m8", CommonFunc.convertDoubleToString(m8));
        map.put("m9", CommonFunc.convertDoubleToString(m9));
        map.put("m10", CommonFunc.convertDoubleToString(m10));
        map.put("m11", CommonFunc.convertDoubleToString(m11));
        map.put("m12", CommonFunc.convertDoubleToString(m12));
        map.put("m13", CommonFunc.convertDoubleToString(m13));
        map.put("m14", CommonFunc.convertDoubleToString(m14));
        map.put("m15", CommonFunc.convertDoubleToString(m15));
        map.put("m16", CommonFunc.convertDoubleToString(m16));
        map.put("m17", CommonFunc.convertDoubleToString(m17));
        map.put("m18", CommonFunc.convertDoubleToString(m18));
        map.put("m19", CommonFunc.convertDoubleToString(m19));
        map.put("m20", CommonFunc.convertDoubleToString(m20));
        map.put("m21", CommonFunc.convertDoubleToString(m21));


        map.put("lslqg", CommonFunc.convertDoubleToString(lslqg));
        map.put("lshlqg", CommonFunc.convertDoubleToString(lshlqg));
        map.put("lqg1", CommonFunc.convertDoubleToString(lqg1));
        map.put("lqg2", CommonFunc.convertDoubleToString(lqg2));
        map.put("lqg3", CommonFunc.convertDoubleToString(lqg3));
        map.put("lqg4", CommonFunc.convertDoubleToString(lqg4));
        map.put("lqg5", CommonFunc.convertDoubleToString(lqg5));
        map.put("lqg6", CommonFunc.convertDoubleToString(lqg6));
        map.put("lqg7", CommonFunc.convertDoubleToString(lqg7));
        map.put("lqg8", CommonFunc.convertDoubleToString(lqg8));
        map.put("lqg9", CommonFunc.convertDoubleToString(lqg9));
        map.put("lqg10", CommonFunc.convertDoubleToString(lqg10));
        map.put("lqg11", CommonFunc.convertDoubleToString(lqg11));
        map.put("lqg12", CommonFunc.convertDoubleToString(lqg12));
        map.put("lqg13", CommonFunc.convertDoubleToString(lqg13));
        map.put("lqg14", CommonFunc.convertDoubleToString(lqg14));
        map.put("lqg15", CommonFunc.convertDoubleToString(lqg15));
        map.put("lqg16", CommonFunc.convertDoubleToString(lqg16));
        map.put("lqg17", CommonFunc.convertDoubleToString(lqg17));
        map.put("lqg18", CommonFunc.convertDoubleToString(lqg18));
        map.put("lqg19", CommonFunc.convertDoubleToString(lqg19));
        map.put("lqg20", CommonFunc.convertDoubleToString(lqg20));
        map.put("lqg21", CommonFunc.convertDoubleToString(lqg21));
        map.put("ltjbpz", CommonFunc.convertDoubleToString(ltjbpz));
        map.put("lbp", CommonFunc.convertDoubleToString(lbp));

        map.put("yxjgaz", CommonFunc.convertDoubleToString(yxjgaz));
        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("hzzcxh", CommonFunc.convertDoubleToString(hzzcxh));

        map.put("qt1", CommonFunc.convertDoubleToString(qt1));
        map.put("qt2", CommonFunc.convertDoubleToString(qt2));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String,String> check(){
        Map<String,String> map=new HashMap<>();
        Map<String,String> cp=takeMapForCheckPDF();
        Map<String,String> p=takeMapForPDF("");
        map.put("m11s",CommonFunc.convertDoubleToString(p.get("m11s")));

        if( m11==null ) {
            return map;
        };
        map.put("m11",CommonFunc.convertDoubleToString(m11));
        map.put("mqyz",CommonFunc.convertDoubleToString(cp.get("mqyz")));
        map.put("mkpzyz",CommonFunc.convertDoubleToString(cp.get("mkpzyz")));
        map.put("pzyzy1",CommonFunc.convertDoubleToString(cp.get("pzyzy1")));
        map.put("pzyzm1",CommonFunc.convertDoubleToString(cp.get("pzyzm1")));
        return map;

    }
    /*
          验证部分
           */
    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

      if( m11==null ) {
          return null;
      };

        Double ma1 = map.get("ma1");
        Double ma2 = map.get("ma2");
        Double ma3 = map.get("ma3");
        Double ma4 = map.get("ma4");
        Double ma6 = map.get("ma6");
        Double ma20 = map.get("ma20");

        Double ma5 = map.get("ma5");
        Double ma7 = map.get("ma7");
        Double ma8 = map.get("ma8");
        Double ma9 = map.get("ma9");
        Double ma10 = map.get("ma10");
        Double ma12 = map.get("ma12");
        Double ma13 = map.get("ma13");
        Double ma14 = map.get("ma14");
        Double ma15 = map.get("ma15");
        Double ma16 = map.get("ma16");
        Double ma17 = map.get("ma17");
        Double ma18 = map.get("ma18");
        Double ma19 = map.get("ma19");
        Double ma21 = map.get("ma21");

        Double tsljz = swp + 1.5 * r1 + mwr + mffbb;
        Double tshljz = 1.25 * hwll + hsw;
        Double mslajz = tsljz * lslqg * 10;
        Double mshlajz = tshljz * lshlqg * 10;
        Double mqyz = mslajz + mshlajz + ma1 + ma2 + ma3 + ma4 + ma6 + ma20;
        Double ma11 = m11 * lqg11 * 10;
        Double mkpzyz = ma5 + ma7 + ma8 + ma9 + ma10 + ma11 + ma12 + ma13 + ma14 + ma15 + ma16 + ma17 + ma18 + ma19 + ma21;

        String pzyzy1 = (mqyz <= mkpzyz) ? "没有" : "有";
        String pzyzm1 = (mqyz <= mkpzyz) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("m1", CommonFunc.convertDoubleToString(m1));
        result.put("m2", CommonFunc.convertDoubleToString(m2));
        result.put("m3", CommonFunc.convertDoubleToString(m3));
        result.put("m4", CommonFunc.convertDoubleToString(m4));
        result.put("m6", CommonFunc.convertDoubleToString(m6));
        result.put("m20", CommonFunc.convertDoubleToString(m20));
        result.put("qt1", CommonFunc.convertDoubleToString(qt1));
        result.put("qt2", CommonFunc.convertDoubleToString(qt2));

        result.put("lslqg", CommonFunc.convertDoubleToString(lslqg));
        result.put("lshlqg", CommonFunc.convertDoubleToString(lshlqg));
        result.put("lqg1", CommonFunc.convertDoubleToString(lqg1));
        result.put("lqg2", CommonFunc.convertDoubleToString(lqg2));
        result.put("lqg3", CommonFunc.convertDoubleToString(lqg3));
        result.put("lqg4", CommonFunc.convertDoubleToString(lqg4));
        result.put("lqg6", CommonFunc.convertDoubleToString(lqg6));
        result.put("lqg20", CommonFunc.convertDoubleToString(lqg20));

        result.put("ma1", CommonFunc.convertDoubleToString(ma1));
        result.put("ma2", CommonFunc.convertDoubleToString(ma2));
        result.put("ma3", CommonFunc.convertDoubleToString(ma3));
        result.put("ma4", CommonFunc.convertDoubleToString(ma4));
        result.put("ma6", CommonFunc.convertDoubleToString(ma6));
        result.put("ma20", CommonFunc.convertDoubleToString(ma20));

        result.put("m5", CommonFunc.convertDoubleToString(m5));
        result.put("m7", CommonFunc.convertDoubleToString(m7));
        result.put("m8", CommonFunc.convertDoubleToString(m8));
        result.put("m9", CommonFunc.convertDoubleToString(m9));
        result.put("m10", CommonFunc.convertDoubleToString(m10));
        result.put("m11", CommonFunc.convertDoubleToString(m11));
        result.put("m12", CommonFunc.convertDoubleToString(m12));
        result.put("m13", CommonFunc.convertDoubleToString(m13));
        result.put("m14", CommonFunc.convertDoubleToString(m14));
        result.put("m15", CommonFunc.convertDoubleToString(m15));
        result.put("m16", CommonFunc.convertDoubleToString(m16));
        result.put("m17", CommonFunc.convertDoubleToString(m17));
        result.put("m18", CommonFunc.convertDoubleToString(m18));
        result.put("m19", CommonFunc.convertDoubleToString(m19));
        result.put("m21", CommonFunc.convertDoubleToString(m21));

        result.put("lqg5", CommonFunc.convertDoubleToString(lqg5));
        result.put("lqg7", CommonFunc.convertDoubleToString(lqg7));
        result.put("lqg8", CommonFunc.convertDoubleToString(lqg8));
        result.put("lqg9", CommonFunc.convertDoubleToString(lqg9));
        result.put("lqg10", CommonFunc.convertDoubleToString(lqg10));
        result.put("lqg11", CommonFunc.convertDoubleToString(lqg11));
        result.put("lqg12", CommonFunc.convertDoubleToString(lqg12));
        result.put("lqg13", CommonFunc.convertDoubleToString(lqg13));
        result.put("lqg14", CommonFunc.convertDoubleToString(lqg14));
        result.put("lqg15", CommonFunc.convertDoubleToString(lqg15));
        result.put("lqg16", CommonFunc.convertDoubleToString(lqg16));
        result.put("lqg17", CommonFunc.convertDoubleToString(lqg17));
        result.put("lqg18", CommonFunc.convertDoubleToString(lqg18));
        result.put("lqg19", CommonFunc.convertDoubleToString(lqg19));
        result.put("lqg21", CommonFunc.convertDoubleToString(lqg21));

        result.put("ma5", CommonFunc.convertDoubleToString(ma5));
        result.put("ma7", CommonFunc.convertDoubleToString(ma7));
        result.put("ma8", CommonFunc.convertDoubleToString(ma8));
        result.put("ma9", CommonFunc.convertDoubleToString(ma9));
        result.put("ma10", CommonFunc.convertDoubleToString(ma10));
        result.put("ma12", CommonFunc.convertDoubleToString(ma12));
        result.put("ma13", CommonFunc.convertDoubleToString(ma13));
        result.put("ma14", CommonFunc.convertDoubleToString(ma14));
        result.put("ma15", CommonFunc.convertDoubleToString(ma15));
        result.put("ma16", CommonFunc.convertDoubleToString(ma16));
        result.put("ma17", CommonFunc.convertDoubleToString(ma17));
        result.put("ma18", CommonFunc.convertDoubleToString(ma18));
        result.put("ma19", CommonFunc.convertDoubleToString(ma19));
        result.put("ma21", CommonFunc.convertDoubleToString(ma21));

        result.put("tsljz", CommonFunc.convertDoubleToString(tsljz));
        result.put("tshljz", CommonFunc.convertDoubleToString(tshljz));
        result.put("mslajz", CommonFunc.convertDoubleToString(mslajz));
        result.put("mshlajz", CommonFunc.convertDoubleToString(mshlajz));
        result.put("mqyz", CommonFunc.convertDoubleToString(mqyz));
        result.put("ma11", CommonFunc.convertDoubleToString(ma11));
        result.put("mkpzyz", CommonFunc.convertDoubleToString(mkpzyz));
        result.put("pzyzy1", CommonFunc.convertDoubleToString(pzyzy1));
        result.put("pzyzm1", CommonFunc.convertDoubleToString(pzyzm1));
        result.put("m11", CommonFunc.convertDoubleToString(m11));
        result.put("lqg11", CommonFunc.convertDoubleToString(lqg11));

        return result;
    }

    /*
            正文部分程序
             */
    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

         /*
        倾覆力矩和抗倾覆力矩
         */
        Double msla = tsl * lslqg * 10;
        Double mshla = tshl * lshlqg * 10;
        Double ma1 = m1 * lqg1 * 10;
        Double ma2 = m2 * lqg2 * 10;
        Double ma3 = m3 * lqg3 * 10;
        Double ma4 = m4 * lqg4 * 10;
        Double ma5 = m5 * lqg5 * 10;
        Double ma6 = m6 * lqg6 * 10;
        Double ma7 = m7 * lqg7 * 10;
        Double ma8 = m8 * lqg8 * 10;
        Double ma9 = m9 * lqg9 * 10;
        Double ma10 = m10 * lqg10 * 10;
//        Double ma11= m11*lqg11*10;
        Double ma12 = m12 * lqg12 * 10;
        Double ma13 = m13 * lqg13 * 10;
        Double ma14 = m14 * lqg14 * 10;
        Double ma15 = m15 * lqg15 * 10;
        Double ma16 = m16 * lqg16 * 10;
        Double ma17 = m17 * lqg17 * 10;
        Double ma18 = m18 * lqg18 * 10;
        Double ma19 = m19 * lqg19 * 10;
        Double ma20 = m20 * lqg20 * 10;
        Double ma21 = m21 * lqg21 * 10;

        Double mq = msla + mshla + ma1 + ma2 + ma3 + ma4 + ma6 + ma20;
        Double mkpz = ma5 + ma7 + ma8 + ma9 + ma10 + ma12 + ma13 + ma14 + ma15 + ma16 + ma17 + ma18 + ma19 + ma21;
        Double m11s = (npz * mq - mkpz) / (lqg11 * 10);

        map.put("msla", msla);
        map.put("mshla", mshla);
        map.put("ma1", ma1);
        map.put("ma2", ma2);
        map.put("ma3", ma3);
        map.put("ma4", ma4);
        map.put("ma5", ma5);
        map.put("ma6", ma6);
        map.put("ma7", ma7);
        map.put("ma8", ma8);
        map.put("ma9", ma9);
        map.put("ma10", ma10);
//        map.put("ma11", ma11);
        map.put("ma12", ma12);
        map.put("ma13", ma13);
        map.put("ma14", ma14);
        map.put("ma15", ma15);
        map.put("ma16", ma16);
        map.put("ma17", ma17);
        map.put("ma18", ma18);
        map.put("ma19", ma19);
        map.put("ma20", ma20);
        map.put("ma21", ma21);

        map.put("mq", mq);
        map.put("mkpz", mkpz);
        map.put("m11s", m11s);

        /*
        计算公式
         */

        return map;
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
