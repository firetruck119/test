package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class JibRearButtFlangeEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double p;
    private Double ldbhflhz;
    private Double ldbhflb;

    //非页面数据
    private Double m5;
    private Double acx5;
    private Double dbhflgruxs;
    private Double m11;
    private Double acx11;
    private Double lhz5;
    private Double lhz11;

    private Double dbhflflsp;
    private Double dbhflflspk;
//    private Double dbhflflspk1;
    private Double dbhfltls;

//    提示提醒
//    private String grutstx;

//   配重臂法兰螺栓参数
    private String dbhfllsxh;
    private Double dbhfllsn;
    private Double dbhfllsgcd;
    private Double dbhfllsgca;
    private String dbhfllsxndj;
    private Double dbhfllsss;
    private Double dbhflnlsyjlxs;

    //    螺栓行至八边管中心垂直距离参数
    private Double dbhfllsrh1;
    private Double dbhfllsrh2;
    private Double dbhfllsrh3;
    private Double dbhfllsrh4;
    private Double dbhfllsrh5;
    private Double dbhfllsrh6;
    private Double dbhfllsrh7;
    private Double dbhfllsrh8;
    private Double dbhfllsrh9;
    private Double dbhfllsrh10;
    private Double dbhfllsrh11;
    private Double dbhfllsrh12;

    //    螺栓行的螺栓数量参数
    private Double dbhfllsnh1;
    private Double dbhfllsnh2;
    private Double dbhfllsnh3;
    private Double dbhfllsnh4;
    private Double dbhfllsnh5;
    private Double dbhfllsnh6;
    private Double dbhfllsnh7;
    private Double dbhfllsnh8;
    private Double dbhfllsnh9;
    private Double dbhfllsnh10;
    private Double dbhfllsnh11;
    private Double dbhfllsnh12;

    //    螺栓列至八边管中心水平距离参数
    private Double dbhfllsrl1;
    private Double dbhfllsrl2;
    private Double dbhfllsrl3;
    private Double dbhfllsrl4;
    private Double dbhfllsrl5;
    private Double dbhfllsrl6;
    private Double dbhfllsrl7;
    private Double dbhfllsrl8;
    private Double dbhfllsrl9;

    //    螺栓行的螺栓数量参数
    private Double dbhfllsnl1;
    private Double dbhfllsnl2;
    private Double dbhfllsnl3;
    private Double dbhfllsnl4;
    private Double dbhfllsnl5;
    private Double dbhfllsnl6;
    private Double dbhfllsnl7;
    private Double dbhfllsnl8;
    private Double dbhfllsnl9;

    //    配重臂法兰焊缝参数
    private Double dbhflhfwx2;
    private Double dbhflhfwy2;
    private String dbhflhfhtxh;
    private Double dbhflhfffw;

//    工作载荷
    private Double m5dbhfl;
    private Double m10dbhfl;
    private Double m11dbhfl;
    private Double mhflz;

//    工作重心至前对接法兰中心距离
    private Double lhfl5;
    private Double lhfl10;
    private Double lhfl11;

    //    工作吊臂侧向迎风面积
    private Double acx5dbhfl;
    private Double acx10dbhfl;
    private Double acx11dbhfl;

    //    工作面心至前对接法兰中心距离
    private Double lhflm5;
    private Double lhflm10;
    private Double lhflm11;

    private String dbhflxhModel;
    private String gruModel;

    private String dbhflgruwzModel;
//    private String dbhfllsljgkModel;
    private String dbhfllsxndjModel;

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
        map.put("p", CommonFunc.convertDoubleToString(p));
        map.put("ldbhflhz", CommonFunc.convertDoubleToString(ldbhflhz));
        map.put("ldbhflb", CommonFunc.convertDoubleToString(ldbhflb));

        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("dbhflgruxs", CommonFunc.convertDoubleToString(dbhflgruxs));
        map.put("m11", CommonFunc.convertDoubleToString(m11));
        map.put("acx11", CommonFunc.convertDoubleToString(acx11));
        map.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        map.put("lhz11", CommonFunc.convertDoubleToString(lhz11));
        map.put("dbhflflsp", CommonFunc.convertDoubleToString(dbhflflsp));
        map.put("dbhflflspk", CommonFunc.convertDoubleToString(dbhflflspk));
//        map.put("dbhflflspk1", CommonFunc.convertDoubleToString(dbhflflspk1));
        map.put("dbhfltls", CommonFunc.convertDoubleToString(dbhfltls));

//        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dbhfllsxh", CommonFunc.convertDoubleToString(dbhfllsxh));
        map.put("dbhfllsn", CommonFunc.convertDoubleToString(dbhfllsn));
        map.put("dbhfllsgcd", CommonFunc.convertDoubleToString(dbhfllsgcd));
        map.put("dbhfllsgca", CommonFunc.convertDoubleToString(dbhfllsgca));
        map.put("dbhfllsxndj", CommonFunc.convertDoubleToString(dbhfllsxndj));
        map.put("dbhfllsss", CommonFunc.convertDoubleToString(dbhfllsss));
        map.put("dbhflnlsyjlxs", CommonFunc.convertDoubleToString(dbhflnlsyjlxs));

        map.put("dbhfllsrh1", CommonFunc.convertDoubleToString3(dbhfllsrh1));
        map.put("dbhfllsrh2", CommonFunc.convertDoubleToString3(dbhfllsrh2));
        map.put("dbhfllsrh3", CommonFunc.convertDoubleToString3(dbhfllsrh3));
        map.put("dbhfllsrh4", CommonFunc.convertDoubleToString3(dbhfllsrh4));
        map.put("dbhfllsrh5", CommonFunc.convertDoubleToString3(dbhfllsrh5));
        map.put("dbhfllsrh6", CommonFunc.convertDoubleToString3(dbhfllsrh6));
        map.put("dbhfllsrh7", CommonFunc.convertDoubleToString3(dbhfllsrh7));
        map.put("dbhfllsrh8", CommonFunc.convertDoubleToString3(dbhfllsrh8));
        map.put("dbhfllsrh9", CommonFunc.convertDoubleToString3(dbhfllsrh9));
        map.put("dbhfllsrh10", CommonFunc.convertDoubleToString3(dbhfllsrh10));
        map.put("dbhfllsrh11", CommonFunc.convertDoubleToString3(dbhfllsrh11));
        map.put("dbhfllsrh12", CommonFunc.convertDoubleToString3(dbhfllsrh12));

        map.put("dbhfllsnh1", CommonFunc.convertDoubleToString3(dbhfllsnh1));
        map.put("dbhfllsnh2", CommonFunc.convertDoubleToString3(dbhfllsnh2));
        map.put("dbhfllsnh3", CommonFunc.convertDoubleToString3(dbhfllsnh3));
        map.put("dbhfllsnh4", CommonFunc.convertDoubleToString3(dbhfllsnh4));
        map.put("dbhfllsnh5", CommonFunc.convertDoubleToString3(dbhfllsnh5));
        map.put("dbhfllsnh6", CommonFunc.convertDoubleToString3(dbhfllsnh6));
        map.put("dbhfllsnh7", CommonFunc.convertDoubleToString3(dbhfllsnh7));
        map.put("dbhfllsnh8", CommonFunc.convertDoubleToString3(dbhfllsnh8));
        map.put("dbhfllsnh9", CommonFunc.convertDoubleToString3(dbhfllsnh9));
        map.put("dbhfllsnh10", CommonFunc.convertDoubleToString3(dbhfllsnh10));
        map.put("dbhfllsnh11", CommonFunc.convertDoubleToString3(dbhfllsnh11));
        map.put("dbhfllsnh12", CommonFunc.convertDoubleToString3(dbhfllsnh12));

        map.put("dbhfllsrl1", CommonFunc.convertDoubleToString3(dbhfllsrl1));
        map.put("dbhfllsrl2", CommonFunc.convertDoubleToString3(dbhfllsrl2));
        map.put("dbhfllsrl3", CommonFunc.convertDoubleToString3(dbhfllsrl3));
        map.put("dbhfllsrl4", CommonFunc.convertDoubleToString3(dbhfllsrl4));
        map.put("dbhfllsrl5", CommonFunc.convertDoubleToString3(dbhfllsrl5));
        map.put("dbhfllsrl6", CommonFunc.convertDoubleToString3(dbhfllsrl6));
        map.put("dbhfllsrl7", CommonFunc.convertDoubleToString3(dbhfllsrl7));
        map.put("dbhfllsrl8", CommonFunc.convertDoubleToString3(dbhfllsrl8));
        map.put("dbhfllsrl9", CommonFunc.convertDoubleToString3(dbhfllsrl9));

        map.put("dbhfllsnl1", CommonFunc.convertDoubleToString3(dbhfllsnl1));
        map.put("dbhfllsnl2", CommonFunc.convertDoubleToString3(dbhfllsnl2));
        map.put("dbhfllsnl3", CommonFunc.convertDoubleToString3(dbhfllsnl3));
        map.put("dbhfllsnl4", CommonFunc.convertDoubleToString3(dbhfllsnl4));
        map.put("dbhfllsnl5", CommonFunc.convertDoubleToString3(dbhfllsnl5));
        map.put("dbhfllsnl6", CommonFunc.convertDoubleToString3(dbhfllsnl6));
        map.put("dbhfllsnl7", CommonFunc.convertDoubleToString3(dbhfllsnl7));
        map.put("dbhfllsnl8", CommonFunc.convertDoubleToString3(dbhfllsnl8));
        map.put("dbhfllsnl9", CommonFunc.convertDoubleToString3(dbhfllsnl9));

        map.put("dbhflhfwx2", CommonFunc.convertDoubleToString(dbhflhfwx2));
        map.put("dbhflhfwy2", CommonFunc.convertDoubleToString(dbhflhfwy2));
        map.put("dbhflhfhtxh", CommonFunc.convertDoubleToString(dbhflhfhtxh));
        map.put("dbhflhfffw", CommonFunc.convertDoubleToString(dbhflhfffw));

        map.put("m5dbhfl", CommonFunc.convertDoubleToString(m5dbhfl));
        map.put("m10dbhfl", CommonFunc.convertDoubleToString(m10dbhfl));
        map.put("m11dbhfl", CommonFunc.convertDoubleToString(m11dbhfl));
        map.put("mhflz", CommonFunc.convertDoubleToString(mhflz));

        map.put("lhfl5", CommonFunc.convertDoubleToString(lhfl5));
        map.put("lhfl10", CommonFunc.convertDoubleToString(lhfl10));
        map.put("lhfl11", CommonFunc.convertDoubleToString(lhfl11));

        map.put("acx5dbhfl", CommonFunc.convertDoubleToString(acx5dbhfl));
        map.put("acx10dbhfl", CommonFunc.convertDoubleToString(acx10dbhfl));
        map.put("acx11dbhfl", CommonFunc.convertDoubleToString(acx11dbhfl));

        map.put("lhflm5", CommonFunc.convertDoubleToString(lhflm5));
        map.put("lhflm10", CommonFunc.convertDoubleToString(lhflm10));
        map.put("lhflm11", CommonFunc.convertDoubleToString(lhflm11));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    //验证部分
    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();

        return result;
    }

    //正文部分
    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        //        对接法兰螺栓拉力校核
        //        载荷倾覆力矩
        Double mhfl5 = 10 * m5dbhfl * lhfl5 ;
        Double mhfl10 = 10 * m10dbhfl * lhfl10 ;
        Double mhfl11 = 10 * m11dbhfl * lhfl11 ;
        map.put("mhfl5", mhfl5);
        map.put("mhfl10", mhfl10);
        map.put("mhfl11", mhfl11);

        Double mhflw5 = p * acx5dbhfl * lhflm5 ;
        Double mhflw10 = p * acx10dbhfl * lhflm10 ;
        Double mhflw11 = p * acx11dbhfl * lhflm11 ;
        map.put("mhflw5", mhflw5);
        map.put("mhflw10", mhflw10);
        map.put("mhflw11", mhflw11);

        Double mhflq = mhfl5 + mhfl10 + mhfl11 ;
        Double mhflw = mhflw5 + mhflw10 + mhflw11 ;
        Double flslh = mhflq * dbhfllsrh1 / ( dbhfllsnh1 * dbhfllsrh1 * dbhfllsrh1 + dbhfllsnh2 * dbhfllsrh2 * dbhfllsrh2 + dbhfllsnh3 * dbhfllsrh3 * dbhfllsrh3 + dbhfllsnh4 * dbhfllsrh4 * dbhfllsrh4 + dbhfllsnh5 * dbhfllsrh5 * dbhfllsrh5 + dbhfllsnh6 * dbhfllsrh6 * dbhfllsrh6 + dbhfllsnh7 * dbhfllsrh7 * dbhfllsrh7 + dbhfllsnh8 * dbhfllsrh8 * dbhfllsrh8 + dbhfllsnh9 * dbhfllsrh9 * dbhfllsrh9 + dbhfllsnh10 * dbhfllsrh10 * dbhfllsrh10 + dbhfllsnh11 * dbhfllsrh11 * dbhfllsrh11 + dbhfllsnh12 * dbhfllsrh12 * dbhfllsrh12 ) ;
        Double flsll = mhflw * dbhfllsrl1 / ( dbhfllsnl1 * dbhfllsrl1 * dbhfllsrl1 + dbhfllsnl2 * dbhfllsrl2 * dbhfllsrl2 + dbhfllsnl3 * dbhfllsrl3 * dbhfllsrl3 + dbhfllsnl4 * dbhfllsrl4 * dbhfllsrl4 + dbhfllsnl5 * dbhfllsrl5 * dbhfllsrl5 + dbhfllsnl6 * dbhfllsrl6 * dbhfllsrl6 + dbhfllsnl7 * dbhfllsrl7 * dbhfllsrl7 + dbhfllsnl8 * dbhfllsrl8 * dbhfllsrl8 + dbhfllsnl9 * dbhfllsrl9 * dbhfllsrl9 ) ;
        Double flsl = flslh + flsll ;
        map.put("mhflq", mhflq);
        map.put("mhflw", mhflw);
        map.put("flslh", flslh);
        map.put("flsll", flsll);
        map.put("flsl", flsl);


//        对接法兰螺栓预紧力校核
        //        风载荷
        Double fhflw5 = p * acx5dbhfl ;
        Double fhflw10 = p * acx10dbhfl ;
        Double fhflw11 = p * acx11dbhfl ;
        map.put("fhflw5", fhflw5);
        map.put("fhflw10", fhflw10);
        map.put("fhflw11", fhflw11);

        Double fhflw = fhflw5 + fhflw10 + fhflw11 ;
        Double flsyj = Math.sqrt( 100 * mhflz * mhflz + fhflw * fhflw ) / 0.15 / dbhfllsn ;
        Double flss = dbhflnlsyjlxs * Math.max( flsl , flsyj ) ;
        Double flssk = flss / 1000 ;
        map.put("fhflw", fhflw);
        map.put("flsyj", flsyj);
        map.put("flss", flss);
        map.put("flssk", flssk);

        //螺栓拧紧力矩计算
        Double tlss = 0.18 * flss * dbhfllsgcd / 1000 ;
        map.put("tlss", tlss);

        //法兰焊缝计算
        Double dbhflhfsq = 1000 * mhflq / dbhflhfwx2 ;
        Double dbhflhfsw = 1000 * mhflw / dbhflhfwy2 ;
        Double dbhflhfs1 = dbhflhfsq + dbhflhfsw ;
        map.put("dbhflhfsq", dbhflhfsq);
        map.put("dbhflhfsw", dbhflhfsw);
        map.put("dbhflhfs1", dbhflhfs1);

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

        Double flsl = doubleMap.get("flsl");
        Double btxs = 0.17 + 0.33 - 0.057 * ldbhflb / dbhfllsgcd ;
        Double nt = 0.2 * dbhfllsss * dbhfllsgca / 1.34 / btxs ;
        Double flslk = flsl / 1000 ;
        Double ntk = nt / 1000 ;
        map.put("btxs", CommonFunc.convertDoubleToString3(btxs));
        map.put("nt", CommonFunc.convertDoubleToString(nt));
        map.put("flslk", CommonFunc.convertDoubleToString(flslk));
        map.put("ntk", CommonFunc.convertDoubleToString(ntk));
        String dbhflb1 = takeSignByCompareNumber(flsl,nt);
        String dbhflm1 = takeStringByCompareNumber(flsl,nt);
        map.put("dbhflb1", CommonFunc.convertDoubleToString(dbhflb1));
        map.put("dbhflm1", CommonFunc.convertDoubleToString(dbhflm1));

        Double flss = doubleMap.get("flss");
        String dbhflb2 = takeSignByCompareNumber(flss,dbhflflsp);
        String dbhflm2 = takeStringByCompareNumber(flss,dbhflflsp);
        map.put("dbhflb2", CommonFunc.convertDoubleToString(dbhflb2));
        map.put("dbhflm2", CommonFunc.convertDoubleToString(dbhflm2));

        Double tlss = doubleMap.get("tlss");
        String dbhflb3 = takeSignByCompareNumber(tlss,dbhfltls);
        String dbhflm3 = takeStringByCompareNumber(tlss,dbhfltls);
        map.put("dbhflb3", CommonFunc.convertDoubleToString(dbhflb3));
        map.put("dbhflm3", CommonFunc.convertDoubleToString(dbhflm3));

        Double dbhflhfs1 = doubleMap.get("dbhflhfs1");
        String dbhflb4 = takeSignByCompareNumber(dbhflhfs1,dbhflhfffw);
        String dbhflm4 = takeStringByCompareNumber(dbhflhfs1,dbhflhfffw);
        map.put("dbhflb4", CommonFunc.convertDoubleToString(dbhflb4));
        map.put("dbhflm4", CommonFunc.convertDoubleToString(dbhflm4));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
