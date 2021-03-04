package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import javax.validation.constraints.Max;
import java.util.HashMap;
import java.util.Map;

@Data
public class JibFrontButtFlangeEntity {
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
    private Double ldbflqhz;
    private Double ldbflb;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;

    private Double m5;
    private Double acx5;
    private Double dbflgruxs;
    private Double lslhz;
    private Double lhz5;
    private Double lhz6;

    private Double dbflflsp;
    private Double dbflflspk;
//    private Double dbflflspk1;
    private Double dbfltls;

//    提示提醒
    private String grutstx;

//    吊臂法兰螺栓参数
    private String dbfllsxh;
    private Double dbfllsn;
    private Double dbfllsgcd;
    private Double dbfllsgca;
    private String dbfllsxndj;
    private Double dbfllsss;
    private Double dbflnlsyjlxs;

    //    螺栓行至螺栓群形心垂直距离参数
    private Double dbfllsrh1;
    private Double dbfllsrh2;
    private Double dbfllsrh3;
    private Double dbfllsrh4;
    private Double dbfllsrh5;
    private Double dbfllsrh6;
    private Double dbfllsrh7;
    private Double dbfllsrh8;
    private Double dbfllsrh9;
    private Double dbfllsrh10;
    private Double dbfllsrh11;
    private Double dbfllsrh12;

    //    螺栓行的螺栓数量参数
    private Double dbfllsnh1;
    private Double dbfllsnh2;
    private Double dbfllsnh3;
    private Double dbfllsnh4;
    private Double dbfllsnh5;
    private Double dbfllsnh6;
    private Double dbfllsnh7;
    private Double dbfllsnh8;
    private Double dbfllsnh9;
    private Double dbfllsnh10;
    private Double dbfllsnh11;
    private Double dbfllsnh12;

    //    螺栓列至螺栓群形心水平距离参数
    private Double dbfllsrl1;
    private Double dbfllsrl2;
    private Double dbfllsrl3;
    private Double dbfllsrl4;
    private Double dbfllsrl5;
    private Double dbfllsrl6;
    private Double dbfllsrl7;
    private Double dbfllsrl8;
    private Double dbfllsrl9;

    //    螺栓行的螺栓数量参数
    private Double dbfllsnl1;
    private Double dbfllsnl2;
    private Double dbfllsnl3;
    private Double dbfllsnl4;
    private Double dbfllsnl5;
    private Double dbfllsnl6;
    private Double dbfllsnl7;
    private Double dbfllsnl8;
    private Double dbfllsnl9;

    //    吊臂法兰焊缝参数
    private Double dbflhfwx2;
    private Double dbflhfwy2;
    private String dbflhfhtxh;
    private Double dbflhfffw;

//    工作载荷
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
    private Double m4dbfl;
    private Double m5dbfl;
    private Double m6;
    private Double mflz;

//    工作重心至前对接法兰中心距离
    private Double lslfl;
    private Double lshlfl;
    private Double lfl1;
    private Double lfl2;
    private Double lfl3;
    private Double lfl4;
    private Double lfl5;
    private Double lfl6;

    //    工作吊臂侧向迎风面积
    private Double aslcx;
    private Double ashlcx;
    private Double acx1;
    private Double acx2;
    private Double acx3;
    private Double acx4dbfl;
    private Double acx5dbfl;
    private Double acx6;

    //    工作面心至前对接法兰中心距离
    private Double lslflm;
    private Double lshlflm;
    private Double lflm1;
    private Double lflm2;
    private Double lflm3;
    private Double lflm4;
    private Double lflm5;
    private Double lflm6;

    private String dbflxhModel;
    private String dcModel;
    private String dcgssModel;
    private String ffbbModel;
    private String btModel;
    private String gruModel;

    private String dbflgruwzModel;
//    private String dbfllsljgkModel;
    private String dbfllsxndjModel;

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
        map.put("ldbflqhz", CommonFunc.convertDoubleToString(ldbflqhz));
        map.put("ldbflb", CommonFunc.convertDoubleToString(ldbflb));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("dbflgruxs", CommonFunc.convertDoubleToString(dbflgruxs));
        map.put("lslhz", CommonFunc.convertDoubleToString(lslhz));
        map.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        map.put("lhz6", CommonFunc.convertDoubleToString(lhz6));
        map.put("dbflflsp", CommonFunc.convertDoubleToString(dbflflsp));
        map.put("dbflflspk", CommonFunc.convertDoubleToString(dbflflspk));
//        map.put("dbflflspk1", CommonFunc.convertDoubleToString(dbflflspk1));
        map.put("dbfltls", CommonFunc.convertDoubleToString(dbfltls));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dbfllsxh", CommonFunc.convertDoubleToString(dbfllsxh));
        map.put("dbfllsn", CommonFunc.convertDoubleToString(dbfllsn));
        map.put("dbfllsgcd", CommonFunc.convertDoubleToString(dbfllsgcd));
        map.put("dbfllsgca", CommonFunc.convertDoubleToString(dbfllsgca));
        map.put("dbfllsxndj", CommonFunc.convertDoubleToString(dbfllsxndj));
        map.put("dbfllsss", CommonFunc.convertDoubleToString(dbfllsss));
        map.put("dbflnlsyjlxs", CommonFunc.convertDoubleToString(dbflnlsyjlxs));

        map.put("dbfllsrh1", CommonFunc.convertDoubleToString3(dbfllsrh1));
        map.put("dbfllsrh2", CommonFunc.convertDoubleToString3(dbfllsrh2));
        map.put("dbfllsrh3", CommonFunc.convertDoubleToString3(dbfllsrh3));
        map.put("dbfllsrh4", CommonFunc.convertDoubleToString3(dbfllsrh4));
        map.put("dbfllsrh5", CommonFunc.convertDoubleToString3(dbfllsrh5));
        map.put("dbfllsrh6", CommonFunc.convertDoubleToString3(dbfllsrh6));
        map.put("dbfllsrh7", CommonFunc.convertDoubleToString3(dbfllsrh7));
        map.put("dbfllsrh8", CommonFunc.convertDoubleToString3(dbfllsrh8));
        map.put("dbfllsrh9", CommonFunc.convertDoubleToString3(dbfllsrh9));
        map.put("dbfllsrh10", CommonFunc.convertDoubleToString3(dbfllsrh10));
        map.put("dbfllsrh11", CommonFunc.convertDoubleToString3(dbfllsrh11));
        map.put("dbfllsrh12", CommonFunc.convertDoubleToString3(dbfllsrh12));

        map.put("dbfllsnh1", CommonFunc.convertDoubleToString3(dbfllsnh1));
        map.put("dbfllsnh2", CommonFunc.convertDoubleToString3(dbfllsnh2));
        map.put("dbfllsnh3", CommonFunc.convertDoubleToString3(dbfllsnh3));
        map.put("dbfllsnh4", CommonFunc.convertDoubleToString3(dbfllsnh4));
        map.put("dbfllsnh5", CommonFunc.convertDoubleToString3(dbfllsnh5));
        map.put("dbfllsnh6", CommonFunc.convertDoubleToString3(dbfllsnh6));
        map.put("dbfllsnh7", CommonFunc.convertDoubleToString3(dbfllsnh7));
        map.put("dbfllsnh8", CommonFunc.convertDoubleToString3(dbfllsnh8));
        map.put("dbfllsnh9", CommonFunc.convertDoubleToString3(dbfllsnh9));
        map.put("dbfllsnh10", CommonFunc.convertDoubleToString3(dbfllsnh10));
        map.put("dbfllsnh11", CommonFunc.convertDoubleToString3(dbfllsnh11));
        map.put("dbfllsnh12", CommonFunc.convertDoubleToString3(dbfllsnh12));

        map.put("dbfllsrl1", CommonFunc.convertDoubleToString3(dbfllsrl1));
        map.put("dbfllsrl2", CommonFunc.convertDoubleToString3(dbfllsrl2));
        map.put("dbfllsrl3", CommonFunc.convertDoubleToString3(dbfllsrl3));
        map.put("dbfllsrl4", CommonFunc.convertDoubleToString3(dbfllsrl4));
        map.put("dbfllsrl5", CommonFunc.convertDoubleToString3(dbfllsrl5));
        map.put("dbfllsrl6", CommonFunc.convertDoubleToString3(dbfllsrl6));
        map.put("dbfllsrl7", CommonFunc.convertDoubleToString3(dbfllsrl7));
        map.put("dbfllsrl8", CommonFunc.convertDoubleToString3(dbfllsrl8));
        map.put("dbfllsrl9", CommonFunc.convertDoubleToString3(dbfllsrl9));

        map.put("dbfllsnl1", CommonFunc.convertDoubleToString3(dbfllsnl1));
        map.put("dbfllsnl2", CommonFunc.convertDoubleToString3(dbfllsnl2));
        map.put("dbfllsnl3", CommonFunc.convertDoubleToString3(dbfllsnl3));
        map.put("dbfllsnl4", CommonFunc.convertDoubleToString3(dbfllsnl4));
        map.put("dbfllsnl5", CommonFunc.convertDoubleToString3(dbfllsnl5));
        map.put("dbfllsnl6", CommonFunc.convertDoubleToString3(dbfllsnl6));
        map.put("dbfllsnl7", CommonFunc.convertDoubleToString3(dbfllsnl7));
        map.put("dbfllsnl8", CommonFunc.convertDoubleToString3(dbfllsnl8));
        map.put("dbfllsnl9", CommonFunc.convertDoubleToString3(dbfllsnl9));

        map.put("dbflhfwx2", CommonFunc.convertDoubleToString(dbflhfwx2));
        map.put("dbflhfwy2", CommonFunc.convertDoubleToString(dbflhfwy2));
        map.put("dbflhfhtxh", CommonFunc.convertDoubleToString(dbflhfhtxh));
        map.put("dbflhfffw", CommonFunc.convertDoubleToString(dbflhfffw));

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
        map.put("m4dbfl", CommonFunc.convertDoubleToString(m4dbfl));
        map.put("m5dbfl", CommonFunc.convertDoubleToString(m5dbfl));
        map.put("m6", CommonFunc.convertDoubleToString(m6));
        map.put("mflz", CommonFunc.convertDoubleToString(mflz));

        map.put("lslfl", CommonFunc.convertDoubleToString(lslfl));
        map.put("lshlfl", CommonFunc.convertDoubleToString(lshlfl));
        map.put("lfl1", CommonFunc.convertDoubleToString(lfl1));
        map.put("lfl2", CommonFunc.convertDoubleToString(lfl2));
        map.put("lfl3", CommonFunc.convertDoubleToString(lfl3));
        map.put("lfl4", CommonFunc.convertDoubleToString(lfl4));
        map.put("lfl5", CommonFunc.convertDoubleToString(lfl5));
        map.put("lfl6", CommonFunc.convertDoubleToString(lfl6));

        map.put("aslcx", CommonFunc.convertDoubleToString(aslcx));
        map.put("ashlcx", CommonFunc.convertDoubleToString(ashlcx));
        map.put("acx1", CommonFunc.convertDoubleToString(acx1));
        map.put("acx2", CommonFunc.convertDoubleToString(acx2));
        map.put("acx3", CommonFunc.convertDoubleToString(acx3));
        map.put("acx4dbfl", CommonFunc.convertDoubleToString(acx4dbfl));
        map.put("acx5dbfl", CommonFunc.convertDoubleToString(acx5dbfl));
        map.put("acx6", CommonFunc.convertDoubleToString(acx6));

        map.put("lslflm", CommonFunc.convertDoubleToString(lslflm));
        map.put("lshlflm", CommonFunc.convertDoubleToString(lshlflm));
        map.put("lflm1", CommonFunc.convertDoubleToString(lflm1));
        map.put("lflm2", CommonFunc.convertDoubleToString(lflm2));
        map.put("lflm3", CommonFunc.convertDoubleToString(lflm3));
        map.put("lflm4", CommonFunc.convertDoubleToString(lflm4));
        map.put("lflm5", CommonFunc.convertDoubleToString(lflm5));
        map.put("lflm6", CommonFunc.convertDoubleToString(lflm6));

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

//        前对接法兰螺栓拉力校核
        //        载荷倾覆力矩
        Double mslfl = 10 * tsl * lslfl ;
        Double mshlfl = 10 * tshl * lshlfl ;
        Double mfl1 = 10 * m1 * lfl1 ;
        Double mfl2 = 10 * m2 * lfl2 ;
        Double mfl3 = 10 * m3 * lfl3 ;
        Double mfl4 = 10 * m4dbfl * lfl4 ;
        Double mfl5 = 10 * m5dbfl * lfl5 ;
        Double mfl6 = 10 * m6 * lfl6 ;
        map.put("mslfl", mslfl);
        map.put("mshlfl", mshlfl);
        map.put("mfl1", mfl1);
        map.put("mfl2", mfl2);
        map.put("mfl3", mfl3);
        map.put("mfl4", mfl4);
        map.put("mfl5", mfl5);
        map.put("mfl6", mfl6);

        Double mslflw = p * aslcx * lslflm ;
        Double mshlflw = p * ashlcx * lshlflm ;
        Double mflw1 = p * acx1 * lflm1 ;
        Double mflw2 = p * acx2 * lflm2 ;
        Double mflw3 = p * acx3 * lflm3 ;
        Double mflw4 = p * acx4dbfl * lflm4 ;
        Double mflw5 = p * acx5dbfl * lflm5 ;
        Double mflw6 = p * acx6 * lflm6 ;
        map.put("mslflw", mslflw);
        map.put("mshlflw", mshlflw);
        map.put("mflw1", mflw1);
        map.put("mflw2", mflw2);
        map.put("mflw3", mflw3);
        map.put("mflw4", mflw4);
        map.put("mflw5", mflw5);
        map.put("mflw6", mflw6);

        Double mflq = mslfl + mshlfl + mfl1 + mfl2 + mfl3 + mfl4 + mfl5 + mfl6 ;
        Double mflw = mslflw + mshlflw + mflw1 + mflw2 + mflw3 + mflw4 + mflw5 + mflw6 ;
        Double flslh = mflq * dbfllsrh1 / ( dbfllsnh1 * dbfllsrh1 * dbfllsrh1 + dbfllsnh2 * dbfllsrh2 * dbfllsrh2 + dbfllsnh3 * dbfllsrh3 * dbfllsrh3 + dbfllsnh4 * dbfllsrh4 * dbfllsrh4 + dbfllsnh5 * dbfllsrh5 * dbfllsrh5 + dbfllsnh6 * dbfllsrh6 * dbfllsrh6 + dbfllsnh7 * dbfllsrh7 * dbfllsrh7 + dbfllsnh8 * dbfllsrh8 * dbfllsrh8 + dbfllsnh9 * dbfllsrh9 * dbfllsrh9 + dbfllsnh10 * dbfllsrh10 * dbfllsrh10 + dbfllsnh11 * dbfllsrh11 * dbfllsrh11 + dbfllsnh12 * dbfllsrh12 * dbfllsrh12 ) ;
        Double flsll = mflw * dbfllsrl1 / ( dbfllsnl1 * dbfllsrl1 * dbfllsrl1 + dbfllsnl2 * dbfllsrl2 * dbfllsrl2 + dbfllsnl3 * dbfllsrl3 * dbfllsrl3 + dbfllsnl4 * dbfllsrl4 * dbfllsrl4 + dbfllsnl5 * dbfllsrl5 * dbfllsrl5 + dbfllsnl6 * dbfllsrl6 * dbfllsrl6 + dbfllsnl7 * dbfllsrl7 * dbfllsrl7 + dbfllsnl8 * dbfllsrl8 * dbfllsrl8 + dbfllsnl9 * dbfllsrl9 * dbfllsrl9 ) ;
        Double flsl = flslh + flsll ;
        map.put("mflq", mflq);
        map.put("mflw", mflw);
        map.put("flslh", flslh);
        map.put("flsll", flsll);
        map.put("flsl", flsl);
//        map.put("btxs", btxs);
//        map.put("nt", nt);
//        map.put("flslk", flslk);
//        map.put("ntk", ntk);

        //        前对接法兰螺栓预紧力校核
        //        风载荷
        Double fslfl = p * aslcx ;
        Double fshlfl = p * ashlcx ;
        Double ffl1 = p * acx1 ;
        Double ffl2 = p * acx2 ;
        Double ffl3 = p * acx3 ;
        Double ffl4 = p * acx4dbfl ;
        Double ffl5 = p * acx5dbfl ;
        Double ffl6 = p * acx6 ;
        map.put("fslfl", fslfl);
        map.put("fshlfl", fshlfl);
        map.put("ffl1", ffl1);
        map.put("ffl2", ffl2);
        map.put("ffl3", ffl3);
        map.put("ffl4", ffl4);
        map.put("ffl5", ffl5);
        map.put("ffl6", ffl6);

        Double fflw = fslfl + fshlfl + ffl1 + ffl2 + ffl3 + ffl4 + ffl5 + ffl6 ;
        Double flsyj = Math.sqrt( 100 * mflz * mflz + fflw * fflw ) / 0.15 / dbfllsn ;
        Double flss = dbflnlsyjlxs * Math.max(flsl,flsyj) ;
        Double flssk = flss / 1000 ;
        map.put("fflw", fflw);
        map.put("flsyj", flsyj);
        map.put("flss", flss);
        map.put("flssk", flssk);


        //螺栓拧紧力矩计算
        Double tlss = 0.18 * flss * dbfllsgcd / 1000 ;
        map.put("tlss", tlss);

        //法兰焊缝计算
        Double dbflhfsq = 1000 * mflq / dbflhfwx2 ;
        Double dbflhfsw = 1000 * mflw / dbflhfwy2 ;
        Double dbflhfs1 = dbflhfsq + dbflhfsw ;
        map.put("dbflhfsq", dbflhfsq);
        map.put("dbflhfsw", dbflhfsw);
        map.put("dbflhfs1", dbflhfs1);

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
        Double btxs = 0.17 + 0.33 - 0.057 * ldbflb / dbfllsgcd ;
        Double nt = 0.2 * dbfllsss * dbfllsgca / 1.34 / btxs ;
        Double flslk = flsl / 1000 ;
        Double ntk = nt / 1000 ;
        map.put("btxs", CommonFunc.convertDoubleToString3(btxs));
        map.put("nt", CommonFunc.convertDoubleToString(nt));
        map.put("flslk", CommonFunc.convertDoubleToString(flslk));
        map.put("ntk", CommonFunc.convertDoubleToString(ntk));
        String dbflb1 = takeSignByCompareNumber(flsl,nt);
        String dbflm1 = takeStringByCompareNumber(flsl,nt);
        map.put("dbflb1", CommonFunc.convertDoubleToString(dbflb1));
        map.put("dbflm1", CommonFunc.convertDoubleToString(dbflm1));



        Double flss = doubleMap.get("flss");
        String dbflb2 = takeSignByCompareNumber(flss,dbflflsp);
        String dbflm2 = takeStringByCompareNumber(flss,dbflflsp);
        map.put("dbflb2", CommonFunc.convertDoubleToString(dbflb2));
        map.put("dbflm2", CommonFunc.convertDoubleToString(dbflm2));

        Double tlss = doubleMap.get("tlss");
        String dbflb3 = takeSignByCompareNumber(tlss,dbfltls);
        String dbflm3 = takeStringByCompareNumber(tlss,dbfltls);
        map.put("dbflb3", CommonFunc.convertDoubleToString(dbflb3));
        map.put("dbflm3", CommonFunc.convertDoubleToString(dbflm3));

        Double dbflhfs1 = doubleMap.get("dbflhfs1");
        String dbflb4 = takeSignByCompareNumber(dbflhfs1,dbflhfffw);
        String dbflm4 = takeStringByCompareNumber(dbflhfs1,dbflhfffw);
        map.put("dbflb4", CommonFunc.convertDoubleToString(dbflb4));
        map.put("dbflm4", CommonFunc.convertDoubleToString(dbflm4));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
