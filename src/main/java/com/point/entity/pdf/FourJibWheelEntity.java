package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class FourJibWheelEntity {
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
    private Double dbyj;
    private String dbgcph;
    private Double dbgcshzr;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
    private Double mbg1;
    private Double mbm1;
    private Double mbg2;
    private Double mbm2;
    private Double mbg3;
    private Double mbm3;
    private Double mbg4;
    private Double mbm4;

    private Double fssjg;
    private Double sslltl;

    private Double dbgcshzr1;
    private Double dbgcshzr2;
    private Double dbgcshzr3;
    private Double dbgcshzr4;
    private Double dbgcshzr5;
    private Double dbgcshzr6;
    private Double dbgcshzr7;

    private Double dbjbxglr;
    private Double db1bshdlr;
    private Double db1bxglr;
    private Double db2bshdlr;
    private Double db2bxglr;
    private Double db3bshdlr;
    private Double db3bxglr;
    private Double db4bshdlr;

    private Double m5;

    //    提示提醒
    private String grutstx;

    //    平行吊臂方向距离
    private Double dblx1;
    private Double dblx2;
    private Double dblx3;
    private Double dblx4;
    private Double dblx5;
    private Double dbld1;
    private Double dbld2;
    private Double dbld3;
    private Double dbld4;
    private Double dbld5;

    //    第一段搭接处滚轮
    private String dbjbxglxh;
    private Double dbjbxglfk;
    private Double dbjbxgln;
    private Double dbjbxgld;
    private Double dbjbxglb;

    private String db1bshdlxh;
    private Double db1bshdlfk;
    private Double db1bshdln;
    private Double db1bshdld;
    private Double db1bshdlb;

    private Double dbdjl1;

    //    第二段搭接处滚轮
    private String db1bxglxh;
    private Double db1bxglfk;
    private Double db1bxgln;
    private Double db1bxgld;
    private Double db1bxglb;

    private String db2bshdlxh;
    private Double db2bshdlfk;
    private Double db2bshdln;
    private Double db2bshdld;
    private Double db2bshdlb;

    private Double dbdjl2;

    //    第三段搭接处滚轮
    private String db2bxglxh;
    private Double db2bxglfk;
    private Double db2bxgln;
    private Double db2bxgld;
    private Double db2bxglb;

    private String db3bshdlxh;
    private Double db3bshdlfk;
    private Double db3bshdln;
    private Double db3bshdld;
    private Double db3bshdlb;

    private Double dbdjl3;

    //    第四段搭接处滚轮
    private String db3bxglxh;
    private Double db3bxglfk;
    private Double db3bxgln;
    private Double db3bxgld;
    private Double db3bxglb;

    private String db4bshdlxh;
    private Double db4bshdlfk;
    private Double db4bshdln;
    private Double db4bshdld;
    private Double db4bshdlb;

    private Double dbdjl4;

    //   链条
    private String db2bltxh;
    private Double tlt1;
    private Double nlt1;

    private String db3bltxh;
    private Double tlt2;
    private Double nlt2;

    private String db4bltxh;
    private Double tlt3;
    private Double nlt3;

    //   齿轮齿条式伸缩机构
    private String ssjgxh;
    private Double nssjg;
    private Double fssjgk;
    private Double pssjg;

    //   液压式伸缩机构
    private Double ssdd;
    private Double ssxd;
    private Double ssi;
    private Double sslltlk;
    private Double ssnsl;
    private Double sslb;
    private Double ssns;
    private Double ssnk;
    private Double ssk;

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
    private Double m6db;
    private Double m7db;
    private Double m8db;
    private Double m9db;
    private Double mlz;

    private Double fslf;
    private Double fshlf;
    private Double ff1;
    private Double ff2;
    private Double ff3;
    private Double ff6gl;
    private Double ff7gl;
    private Double ff8gl;
    private Double ff9gl;
    private Double flz;

    private Double lslp;
    private Double lshlp;
    private Double lp1;
    private Double lp2;
    private Double lp3;
    private Double lp6gl;
    private Double lp7gl;
    private Double lp8gl;
    private Double lp9gl;

    private Double lslpi;
    private Double lshlpi;
    private Double lp1i;
    private Double lp2i;
    private Double lp3i;
    private Double lp7gli;
    private Double lp8gli;
    private Double lp9gli;

    private Double lslpii;
    private Double lshlpii;
    private Double lp1ii;
    private Double lp2ii;
    private Double lp3ii;
    private Double lp8glii;
    private Double lp9glii;

    private Double lslpiii;
    private Double lshlpiii;
    private Double lp1iii;
    private Double lp2iii;
    private Double lp3iii;
    private Double lp9gliii;

//    下拉
    private String db4Model;
    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;

    private String dbjbxglModel;
    private String db1bshdlModel;
    private String db1bxglModel;
    private String db2bshdlModel;
    private String db2bxglModel;
    private String db3bshdlModel;
    private String db3bxglModel;
    private String db4bshdlModel;

    private String db2bltModel;
    private String db3bltModel;
    private String db4bltModel;
    private String ssjgxsModel;
    private String ssjgModel;
    private String ssyygModel;
    private String ssyygezModel;

    private String xmfaxzModel;

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
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));
        map.put("dbgcph", CommonFunc.convertDoubleToString(dbgcph));
        map.put("dbgcshzr", CommonFunc.convertDoubleToString(dbgcshzr));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("mbg1", CommonFunc.convertDoubleToString(mbg1));
        map.put("mbm1", CommonFunc.convertDoubleToString(mbm1));
        map.put("mbg2", CommonFunc.convertDoubleToString(mbg2));
        map.put("mbm2", CommonFunc.convertDoubleToString(mbm2));
        map.put("mbg3", CommonFunc.convertDoubleToString(mbg3));
        map.put("mbm3", CommonFunc.convertDoubleToString(mbm3));
        map.put("mbg4", CommonFunc.convertDoubleToString(mbg4));
        map.put("mbm4", CommonFunc.convertDoubleToString(mbm4));

        map.put("fssjg", CommonFunc.convertDoubleToString(fssjg));
        map.put("sslltl", CommonFunc.convertDoubleToString(sslltl));

        map.put("dbgcshzr1", CommonFunc.convertDoubleToString(dbgcshzr1));
        map.put("dbgcshzr2", CommonFunc.convertDoubleToString(dbgcshzr2));
        map.put("dbgcshzr3", CommonFunc.convertDoubleToString(dbgcshzr3));
        map.put("dbgcshzr4", CommonFunc.convertDoubleToString(dbgcshzr4));
        map.put("dbgcshzr5", CommonFunc.convertDoubleToString(dbgcshzr5));
        map.put("dbgcshzr6", CommonFunc.convertDoubleToString(dbgcshzr6));
        map.put("dbgcshzr7", CommonFunc.convertDoubleToString(dbgcshzr7));

        map.put("dbjbxglr", CommonFunc.convertDoubleToString(dbjbxglr));
        map.put("db1bshdlr", CommonFunc.convertDoubleToString(db1bshdlr));
        map.put("db1bxglr", CommonFunc.convertDoubleToString(db1bxglr));
        map.put("db2bshdlr", CommonFunc.convertDoubleToString(db2bshdlr));
        map.put("db2bxglr", CommonFunc.convertDoubleToString(db2bxglr));
        map.put("db3bshdlr", CommonFunc.convertDoubleToString(db3bshdlr));
        map.put("db3bxglr", CommonFunc.convertDoubleToString(db3bxglr));
        map.put("db4bshdlr", CommonFunc.convertDoubleToString(db4bshdlr));

        map.put("m5", CommonFunc.convertDoubleToString(m5));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dblx1", CommonFunc.convertDoubleToString(dblx1));
        map.put("dblx2", CommonFunc.convertDoubleToString(dblx2));
        map.put("dblx3", CommonFunc.convertDoubleToString(dblx3));
        map.put("dblx4", CommonFunc.convertDoubleToString(dblx4));
        map.put("dblx5", CommonFunc.convertDoubleToString(dblx5));
        map.put("dbld1", CommonFunc.convertDoubleToString(dbld1));
        map.put("dbld2", CommonFunc.convertDoubleToString(dbld2));
        map.put("dbld3", CommonFunc.convertDoubleToString(dbld3));
        map.put("dbld4", CommonFunc.convertDoubleToString(dbld4));
        map.put("dbld5", CommonFunc.convertDoubleToString(dbld5));

//        第一段搭接
        map.put("dbjbxglxh", CommonFunc.convertDoubleToString(dbjbxglxh));
        map.put("dbjbxglfk", CommonFunc.convertDoubleToString(dbjbxglfk));
        map.put("dbjbxgln", CommonFunc.convertDoubleToString(dbjbxgln));
        map.put("dbjbxgld", CommonFunc.convertDoubleToString(dbjbxgld));
        map.put("dbjbxglb", CommonFunc.convertDoubleToString(dbjbxglb));

        map.put("db1bshdlxh", CommonFunc.convertDoubleToString(db1bshdlxh));
        map.put("db1bshdlfk", CommonFunc.convertDoubleToString(db1bshdlfk));
        map.put("db1bshdln", CommonFunc.convertDoubleToString(db1bshdln));
        map.put("db1bshdld", CommonFunc.convertDoubleToString(db1bshdld));
        map.put("db1bshdlb", CommonFunc.convertDoubleToString(db1bshdlb));

        map.put("dbdjl1", CommonFunc.convertDoubleToString(dbdjl1));

        //        第二段搭接
        map.put("db1bxglxh", CommonFunc.convertDoubleToString(db1bxglxh));
        map.put("db1bxglfk", CommonFunc.convertDoubleToString(db1bxglfk));
        map.put("db1bxgln", CommonFunc.convertDoubleToString(db1bxgln));
        map.put("db1bxgld", CommonFunc.convertDoubleToString(db1bxgld));
        map.put("db1bxglb", CommonFunc.convertDoubleToString(db1bxglb));

        map.put("db2bshdlxh", CommonFunc.convertDoubleToString(db2bshdlxh));
        map.put("db2bshdlfk", CommonFunc.convertDoubleToString(db2bshdlfk));
        map.put("db2bshdln", CommonFunc.convertDoubleToString(db2bshdln));
        map.put("db2bshdld", CommonFunc.convertDoubleToString(db2bshdld));
        map.put("db2bshdlb", CommonFunc.convertDoubleToString(db2bshdlb));

        map.put("dbdjl2", CommonFunc.convertDoubleToString(dbdjl2));

               //        第三段搭接
        map.put("db2bxglxh", CommonFunc.convertDoubleToString(db2bxglxh));
        map.put("db2bxglfk", CommonFunc.convertDoubleToString(db2bxglfk));
        map.put("db2bxgln", CommonFunc.convertDoubleToString(db2bxgln));
        map.put("db2bxgld", CommonFunc.convertDoubleToString(db2bxgld));
        map.put("db2bxglb", CommonFunc.convertDoubleToString(db2bxglb));

        map.put("db3bshdlxh", CommonFunc.convertDoubleToString(db3bshdlxh));
        map.put("db3bshdlfk", CommonFunc.convertDoubleToString(db3bshdlfk));
        map.put("db3bshdln", CommonFunc.convertDoubleToString(db3bshdln));
        map.put("db3bshdld", CommonFunc.convertDoubleToString(db3bshdld));
        map.put("db3bshdlb", CommonFunc.convertDoubleToString(db3bshdlb));

        map.put("dbdjl3", CommonFunc.convertDoubleToString(dbdjl3));

        //        第四段搭接
        map.put("db3bxglxh", CommonFunc.convertDoubleToString(db3bxglxh));
        map.put("db3bxglfk", CommonFunc.convertDoubleToString(db3bxglfk));
        map.put("db3bxgln", CommonFunc.convertDoubleToString(db3bxgln));
        map.put("db3bxgld", CommonFunc.convertDoubleToString(db3bxgld));
        map.put("db3bxglb", CommonFunc.convertDoubleToString(db3bxglb));

        map.put("db4bshdlxh", CommonFunc.convertDoubleToString(db4bshdlxh));
        map.put("db4bshdlfk", CommonFunc.convertDoubleToString(db4bshdlfk));
        map.put("db4bshdln", CommonFunc.convertDoubleToString(db4bshdln));
        map.put("db4bshdld", CommonFunc.convertDoubleToString(db4bshdld));
        map.put("db4bshdlb", CommonFunc.convertDoubleToString(db4bshdlb));

        map.put("dbdjl4", CommonFunc.convertDoubleToString(dbdjl4));

        //        链条
        map.put("db2bltxh", CommonFunc.convertDoubleToString(db2bltxh));
        map.put("tlt1", CommonFunc.convertDoubleToString(tlt1));
        map.put("nlt1", CommonFunc.convertDoubleToString(nlt1));

        map.put("db3bltxh", CommonFunc.convertDoubleToString(db3bltxh));
        map.put("tlt2", CommonFunc.convertDoubleToString(tlt2));
        map.put("nlt2", CommonFunc.convertDoubleToString(nlt2));

        map.put("db4bltxh", CommonFunc.convertDoubleToString(db4bltxh));
        map.put("tlt3", CommonFunc.convertDoubleToString(tlt3));
        map.put("nlt3", CommonFunc.convertDoubleToString(nlt3));

//        齿轮齿条式伸缩机构
        map.put("ssjgxh", CommonFunc.convertDoubleToString(ssjgxh));
        map.put("nssjg", CommonFunc.convertDoubleToString(nssjg));
        map.put("fssjgk", CommonFunc.convertDoubleToString(fssjgk));
        map.put("pssjg", CommonFunc.convertDoubleToString(pssjg));

        //        液压式伸缩机构
        map.put("ssdd", CommonFunc.convertDoubleToString(ssdd));
        map.put("ssxd", CommonFunc.convertDoubleToString(ssxd));
        map.put("ssi", CommonFunc.convertDoubleToString(ssi));
        map.put("sslltlk", CommonFunc.convertDoubleToString(sslltlk));
        map.put("ssnsl", CommonFunc.convertDoubleToString(ssnsl));
        map.put("sslb", CommonFunc.convertDoubleToString(sslb));
        map.put("ssns", CommonFunc.convertDoubleToString(ssns));
        map.put("ssnk", CommonFunc.convertDoubleToString(ssnk));
        map.put("ssk", CommonFunc.convertDoubleToString(ssk));

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
        map.put("m6db", CommonFunc.convertDoubleToString(m6db));
        map.put("m7db", CommonFunc.convertDoubleToString(m7db));
        map.put("m8db", CommonFunc.convertDoubleToString(m8db));
        map.put("m9db", CommonFunc.convertDoubleToString(m9db));
        map.put("mlz", CommonFunc.convertDoubleToString(mlz));

        map.put("fslf", CommonFunc.convertDoubleToString(fslf));
        map.put("fshlf", CommonFunc.convertDoubleToString(fshlf));
        map.put("ff1", CommonFunc.convertDoubleToString(ff1));
        map.put("ff2", CommonFunc.convertDoubleToString(ff2));
        map.put("ff3", CommonFunc.convertDoubleToString(ff3));
        map.put("ff6gl", CommonFunc.convertDoubleToString(ff6gl));
        map.put("ff7gl", CommonFunc.convertDoubleToString(ff7gl));
        map.put("ff8gl", CommonFunc.convertDoubleToString(ff8gl));
        map.put("ff9gl", CommonFunc.convertDoubleToString(ff9gl));
        map.put("flz", CommonFunc.convertDoubleToString(flz));

        map.put("lslp", CommonFunc.convertDoubleToString(lslp));
        map.put("lshlp", CommonFunc.convertDoubleToString(lshlp));
        map.put("lp1", CommonFunc.convertDoubleToString(lp1));
        map.put("lp2", CommonFunc.convertDoubleToString(lp2));
        map.put("lp3", CommonFunc.convertDoubleToString(lp3));
        map.put("lp6gl", CommonFunc.convertDoubleToString(lp6gl));
        map.put("lp7gl", CommonFunc.convertDoubleToString(lp7gl));
        map.put("lp8gl", CommonFunc.convertDoubleToString(lp8gl));
        map.put("lp9gl", CommonFunc.convertDoubleToString(lp9gl));

        map.put("lslpi", CommonFunc.convertDoubleToString(lslpi));
        map.put("lshlpi", CommonFunc.convertDoubleToString(lshlpi));
        map.put("lp1i", CommonFunc.convertDoubleToString(lp1i));
        map.put("lp2i", CommonFunc.convertDoubleToString(lp2i));
        map.put("lp3i", CommonFunc.convertDoubleToString(lp3i));
        map.put("lp7gli", CommonFunc.convertDoubleToString(lp7gli));
        map.put("lp8gli", CommonFunc.convertDoubleToString(lp8gli));
        map.put("lp9gli", CommonFunc.convertDoubleToString(lp9gli));

        map.put("lslpii", CommonFunc.convertDoubleToString(lslpii));
        map.put("lshlpii", CommonFunc.convertDoubleToString(lshlpii));
        map.put("lp1ii", CommonFunc.convertDoubleToString(lp1ii));
        map.put("lp2ii", CommonFunc.convertDoubleToString(lp2ii));
        map.put("lp3ii", CommonFunc.convertDoubleToString(lp3ii));
        map.put("lp8glii", CommonFunc.convertDoubleToString(lp8glii));
        map.put("lp9glii", CommonFunc.convertDoubleToString(lp9glii));

        map.put("lslpiii", CommonFunc.convertDoubleToString(lslpiii));
        map.put("lshlpiii", CommonFunc.convertDoubleToString(lshlpiii));
        map.put("lp1iii", CommonFunc.convertDoubleToString(lp1iii));
        map.put("lp2iii", CommonFunc.convertDoubleToString(lp2iii));
        map.put("lp3iii", CommonFunc.convertDoubleToString(lp3iii));
        map.put("lp9gliii", CommonFunc.convertDoubleToString(lp9gliii));

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

        //第四段搭接处滚轮
        Double mslliii= fslf * lslpiii ;
        Double mshlliii= fshlf * lshlpiii ;
        Double ml1iii= ff1 * lp1iii ;
        Double ml2iii= ff2 * lp2iii ;
        Double ml3iii= ff3 * lp3iii ;
        Double ml9iii= ff9gl * lp9gliii ;
        map.put("mslliii", mslliii);
        map.put("mshlliii", mshlliii);
        map.put("ml1iii", ml1iii);
        map.put("ml2iii", ml2iii);
        map.put("ml3iii", ml3iii);
        map.put("ml9iii", ml9iii);

        Double mliii = mslliii + mshlliii + ml1iii + ml2iii + ml3iii + ml9iii ;
        Double ngl8 = mliii / dbdjl4 / 1000 ;
        Double ngl7 = ( flz - ff6gl - ff7gl - ff8gl ) / 1000 + ngl8 ;
        Double ngl81 = ngl8 * Math.cos( Math.PI / 4 ) ;
        Double ngl71 = ngl7 * Math.cos( Math.PI / 4 ) ;
        Double glbz16 = ngl71 / db3bxglfk ;
        Double glbz17 = ngl81 / db4bshdlfk ;
        map.put("mliii", mliii);
        map.put("ngl8", ngl8);
        map.put("ngl7", ngl7);
        map.put("ngl81", ngl81);
        map.put("ngl71", ngl71);
        map.put("glbz16", glbz16);
        map.put("glbz17", glbz17);

        Double shz7 = sqrt( 0.35 * 210000 * 1000 * ngl71 / db3bxgld / db3bxglb / db3bxgln ) ;
        Double shz8 = sqrt( 0.35 * 210000 * 1000 * ngl81 / db4bshdld / db4bshdlb / db4bshdln ) ;
        Double glbz18 = shz7 / dbgcshzr ;
        Double glbz19 = shz8 / dbgcshzr ;
        map.put("shz7", shz7);
        map.put("shz8", shz8);
        map.put("glbz18", glbz18);
        map.put("glbz19", glbz19);

        //第三段搭接处滚轮
        Double msllii= fslf * lslpii ;
        Double mshllii= fshlf * lshlpii ;
        Double ml1ii= ff1 * lp1ii ;
        Double ml2ii= ff2 * lp2ii ;
        Double ml3ii= ff3 * lp3ii ;
        Double ml8ii= ff8gl * lp8glii ;
        Double ml9ii= ff9gl * lp9glii ;
        map.put("msllii", msllii);
        map.put("mshllii", mshllii);
        map.put("ml1ii", ml1ii);
        map.put("ml2ii", ml2ii);
        map.put("ml3ii", ml3ii);
        map.put("ml8ii", ml8ii);
        map.put("ml9ii", ml9ii);

        Double mlii = msllii + mshllii + ml1ii + ml2ii + ml3ii + ml8ii + ml9ii ;
        Double ngl6 = mlii / dbdjl3 / 1000 ;
        Double ngl5 = ( flz - ff6gl - ff7gl ) / 1000 + ngl6 ;
        Double ngl61 = ngl6 * Math.cos( Math.PI / 4 ) ;
        Double ngl51 = ngl5 * Math.cos( Math.PI / 4 ) ;
        Double glbz11 = ngl51 / db2bxglfk ;
        Double glbz12 = ngl61 / db3bshdlfk ;
        map.put("mlii", mlii);
        map.put("ngl6", ngl6);
        map.put("ngl5", ngl5);
        map.put("ngl61", ngl61);
        map.put("ngl51", ngl51);
        map.put("glbz11", glbz11);
        map.put("glbz12", glbz12);

        Double shz5 = sqrt( 0.35 * 210000 * 1000 * ngl51 / db2bxgld / db2bxglb / db2bxgln ) ;
        Double shz6 = sqrt( 0.35 * 210000 * 1000 * ngl61 / db3bshdld / db3bshdlb / db3bshdln ) ;
        Double glbz13 = shz5 / dbgcshzr ;
        Double glbz14 = shz6 / dbgcshzr ;
        map.put("shz5", shz5);
        map.put("shz6", shz6);
        map.put("glbz13", glbz13);
        map.put("glbz14", glbz14);

        //第二段搭接处滚轮
        Double mslli= fslf * lslpi ;
        Double mshlli= fshlf * lshlpi ;
        Double ml1i= ff1 * lp1i ;
        Double ml2i= ff2 * lp2i ;
        Double ml3i= ff3 * lp3i ;
        Double ml7i= ff7gl * lp7gli ;
        Double ml8i= ff8gl * lp8gli ;
        Double ml9i= ff9gl * lp9gli ;
        map.put("mslli", mslli);
        map.put("mshlli", mshlli);
        map.put("ml1i", ml1i);
        map.put("ml2i", ml2i);
        map.put("ml3i", ml3i);
        map.put("ml7i", ml7i);
        map.put("ml8i", ml8i);
        map.put("ml9i", ml9i);

        Double mli = mslli + mshlli + ml1i + ml2i + ml3i + ml7i + ml8i + ml9i ;
        Double ngl4 = mli / dbdjl2 / 1000 ;
        Double ngl3 = ( flz - ff6gl ) / 1000 + ngl4 ;
        Double ngl41 = ngl4 * Math.cos( Math.PI / 4 ) ;
        Double ngl31 = ngl3 * Math.cos( Math.PI / 4 ) ;
        Double glbz6 = ngl31 / db1bxglfk ;
        Double glbz7 = ngl41 / db2bshdlfk ;
        map.put("mli", mli);
        map.put("ngl4", ngl4);
        map.put("ngl3", ngl3);
        map.put("ngl41", ngl41);
        map.put("ngl31", ngl31);
        map.put("glbz6", glbz6);
        map.put("glbz7", glbz7);

        Double shz3 = sqrt( 0.35 * 210000 * 1000 * ngl31 / db1bxgld / db1bxglb / db1bxgln ) ;
        Double shz4 = sqrt( 0.35 * 210000 * 1000 * ngl41 / db2bshdld / db2bshdlb / db2bshdln ) ;
        Double glbz8 = shz3 / dbgcshzr ;
        Double glbz9 = shz4 / dbgcshzr ;
        map.put("shz3", shz3);
        map.put("shz4", shz4);
        map.put("glbz8", glbz8);
        map.put("glbz9", glbz9);

//第一段搭接处滚轮
        Double msll= fslf * lslp ;
        Double mshll= fshlf * lshlp ;
        Double ml1= ff1 * lp1 ;
        Double ml2= ff2 * lp2 ;
        Double ml3= ff3 * lp3 ;
        Double ml6= ff6gl * lp6gl ;
        Double ml7= ff7gl * lp7gl ;
        Double ml8= ff8gl * lp8gl ;
        Double ml9= ff9gl * lp9gl ;
        map.put("msll", msll);
        map.put("mshll", mshll);
        map.put("ml1", ml1);
        map.put("ml2", ml2);
        map.put("ml3", ml3);
        map.put("ml6", ml6);
        map.put("ml7", ml7);
        map.put("ml8", ml8);
        map.put("ml9", ml9);

        Double ml = msll + mshll + ml1 + ml2 + ml3 + ml6 + ml7 + ml8 + ml9 ;
        Double ngl2 = ml / dbdjl1 / 1000 ;
        Double ngl1 = flz / 1000 + ngl2 ;
        Double ngl21 = ngl2 * Math.cos( Math.PI / 4 ) ;
        Double ngl11 = ngl1 * Math.cos( Math.PI / 4 ) ;
        Double glbz1 = ngl11 / dbjbxglfk ;
        Double glbz2 = ngl21 / db1bshdlfk ;
        map.put("ml", ml);
        map.put("ngl2", ngl2);
        map.put("ngl1", ngl1);
        map.put("ngl21", ngl21);
        map.put("ngl11", ngl11);
        map.put("glbz1", glbz1);
        map.put("glbz2", glbz2);

        Double shz1 = sqrt( 0.35 * 210000 * 1000 * ngl11 / dbjbxgld / dbjbxglb / dbjbxgln ) ;
        Double shz2 = sqrt( 0.35 * 210000 * 1000 * ngl21 / db1bshdld / db1bshdlb / db1bshdln ) ;
        Double glbz3 = shz1 / dbgcshzr ;
        Double glbz4 = shz2 / dbgcshzr ;
        map.put("shz1", shz1);
        map.put("shz2", shz2);
        map.put("glbz3", glbz3);
        map.put("glbz4", glbz4);

        //        链条校核
        Double f7 = 2 * ngl71 * 0.05 / db3bxglr ;
        Double f8 = 2 * ngl81 * 0.05 / db4bshdlr ;
        Double tlts3 = ( tsl + tshl + ( mlz - m6db - m7db - m8db ) * Math.sin( dbyj / 180 * Math.PI ) ) * 10 / 1000 + f7 +f8 ;
        Double tltbz3 = nlt3 * tlt3 ;
        Double glbz20 = nlt3 * tlt3 / tlts3 ;
        map.put("f7", f7);
        map.put("f8", f8);
        map.put("tlts3", tlts3);
        map.put("tltbz3", tltbz3);
        map.put("glbz20", glbz20);

        Double f5 = 2 * ngl51 * 0.05 / db2bxglr ;
        Double f6 = 2 * ngl61 * 0.05 / db3bshdlr ;
        Double tlts2 = 2 * tlts3 + m8db * 10 * Math.sin( dbyj / 180 * Math.PI ) / 1000 + f5 +f6 ;
        Double tltbz2 = nlt2 * tlt2 ;
        Double glbz15 = nlt2 * tlt2 / tlts2 ;
        map.put("f5", f5);
        map.put("f6", f6);
        map.put("tlts2", tlts2);
        map.put("tltbz2", tltbz2);
        map.put("glbz15", glbz15);

        Double f3 = 2 * ngl31 * 0.05 / db1bxglr ;
        Double f4 = 2 * ngl41 * 0.05 / db2bshdlr ;
        Double tlts1 = 2 * tlts2 - tlts3 + m7db * 10 * Math.sin( dbyj / 180 * Math.PI ) / 1000 + f3 +f4 ;
        Double tltbz1 = nlt1 * tlt1 ;
        Double glbz10 = nlt1 * tlt1 / tlts1 ;
        map.put("f3", f3);
        map.put("f4", f4);
        map.put("tlts1", tlts1);
        map.put("tltbz1", tltbz1);
        map.put("glbz10", glbz10);

        //        齿轮齿条式伸缩机构机构推力
        if (ssjgxsModel.equals("齿轮齿条式伸缩机构")) {
            Double f1 = 2 * ngl11 * 0.05 / dbjbxglr;
            Double f2 = 2 * ngl21 * 0.05 / db1bshdlr;
            Double tjs = 2 * tlts1 - tlts2 + m6db * 10 * Math.sin( dbyj / 180 * Math.PI ) / 1000 + f1 +f2 ;
            Double tn = nssjg * fssjgk ;
            Double glbz5 = tjs / tn;
            map.put("f1", f1);
            map.put("f2", f2);
            map.put("tjs", tjs);
            map.put("tn", tn);
            map.put("glbz5", glbz5);
        }

        //        液压式伸缩机构机构推力
        if (ssjgxsModel.equals("液压式伸缩机构")) {
            Double f1 = 2 * ngl11 * 0.05 / dbjbxglr;
            Double f2 = 2 * ngl21 * 0.05 / db1bshdlr;
            Double tjs = 2 * tlts1 - tlts2 + m6db * 10 * Math.sin( dbyj / 180 * Math.PI ) / 1000 + f1 +f2 ;
            Double tyys = ssns * tjs / ssnsl;
            Double yyssbz1 = tyys / sslltlk;
            map.put("f1", f1);
            map.put("f2", f2);
            map.put("tjs", tjs);
            map.put("tyys", tyys);
            map.put("yyssbz1", yyssbz1);

            //        液压式伸缩机构机构稳定性
            Double fk = 3.14 * 3.14 * 180000 * ssi / ssk / ssk / sslb / sslb;
            Double fknk = fk / ssnk / 1000;
            Double tjsyy = tjs;
            Double yyssbz2 = tjs / fknk;
            map.put("fk", fk);
            map.put("fknk", fknk);
            map.put("tjsyy", tjsyy);
            map.put("yyssbz2", yyssbz2);
        }


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

        Double ngl71 = doubleMap.get("ngl71");
        Double ngl81 = doubleMap.get("ngl81");
        String glb16 = takeSignByCompareNumber(ngl71, db3bxglfk);
        String glb17 = takeSignByCompareNumber(ngl81, db4bshdlfk);
        String glm16 = takeStringByCompareNumber(ngl71, db3bxglfk);
        String glm17 = takeStringByCompareNumber(ngl81, db4bshdlfk);
        map.put("glb16", CommonFunc.convertDoubleToString(glb16));
        map.put("glb17", CommonFunc.convertDoubleToString(glb17));
        map.put("glm16", CommonFunc.convertDoubleToString(glm16));
        map.put("glm17", CommonFunc.convertDoubleToString(glm17));

        Double shz7 = doubleMap.get("shz7");
        Double shz8 = doubleMap.get("shz8");
        String glb18 = takeSignByCompareNumber(shz7, dbgcshzr);
        String glb19 = takeSignByCompareNumber(shz8, dbgcshzr);
        String glm18 = takeStringByCompareNumber(shz7, dbgcshzr);
        String glm19 = takeStringByCompareNumber(shz8, dbgcshzr);
        map.put("glb18", CommonFunc.convertDoubleToString(glb18));
        map.put("glb19", CommonFunc.convertDoubleToString(glb19));
        map.put("glm18", CommonFunc.convertDoubleToString(glm18));
        map.put("glm19", CommonFunc.convertDoubleToString(glm19));

        Double ngl51 = doubleMap.get("ngl51");
        Double ngl61 = doubleMap.get("ngl61");
        String glb11 = takeSignByCompareNumber(ngl51, db2bxglfk);
        String glb12 = takeSignByCompareNumber(ngl61, db3bshdlfk);
        String glm11 = takeStringByCompareNumber(ngl51, db2bxglfk);
        String glm12 = takeStringByCompareNumber(ngl61, db3bshdlfk);
        map.put("glb11", CommonFunc.convertDoubleToString(glb11));
        map.put("glb12", CommonFunc.convertDoubleToString(glb12));
        map.put("glm11", CommonFunc.convertDoubleToString(glm11));
        map.put("glm12", CommonFunc.convertDoubleToString(glm12));

        Double shz5 = doubleMap.get("shz5");
        Double shz6 = doubleMap.get("shz6");
        String glb13 = takeSignByCompareNumber(shz5, dbgcshzr);
        String glb14 = takeSignByCompareNumber(shz6, dbgcshzr);
        String glm13 = takeStringByCompareNumber(shz5, dbgcshzr);
        String glm14 = takeStringByCompareNumber(shz6, dbgcshzr);
        map.put("glb13", CommonFunc.convertDoubleToString(glb13));
        map.put("glb14", CommonFunc.convertDoubleToString(glb14));
        map.put("glm13", CommonFunc.convertDoubleToString(glm13));
        map.put("glm14", CommonFunc.convertDoubleToString(glm14));

        Double ngl31 = doubleMap.get("ngl31");
        Double ngl41 = doubleMap.get("ngl41");
        String glb6 = takeSignByCompareNumber(ngl31, db1bxglfk);
        String glb7 = takeSignByCompareNumber(ngl41, db2bshdlfk);
        String glm6 = takeStringByCompareNumber(ngl31, db1bxglfk);
        String glm7 = takeStringByCompareNumber(ngl41, db2bshdlfk);
        map.put("glb6", CommonFunc.convertDoubleToString(glb6));
        map.put("glb7", CommonFunc.convertDoubleToString(glb7));
        map.put("glm6", CommonFunc.convertDoubleToString(glm6));
        map.put("glm7", CommonFunc.convertDoubleToString(glm7));

        Double shz3 = doubleMap.get("shz3");
        Double shz4 = doubleMap.get("shz4");
        String glb8 = takeSignByCompareNumber(shz3, dbgcshzr);
        String glb9 = takeSignByCompareNumber(shz4, dbgcshzr);
        String glm8 = takeStringByCompareNumber(shz3, dbgcshzr);
        String glm9 = takeStringByCompareNumber(shz4, dbgcshzr);
        map.put("glb8", CommonFunc.convertDoubleToString(glb8));
        map.put("glb9", CommonFunc.convertDoubleToString(glb9));
        map.put("glm8", CommonFunc.convertDoubleToString(glm8));
        map.put("glm9", CommonFunc.convertDoubleToString(glm9));

        Double ngl11 = doubleMap.get("ngl11");
        Double ngl21 = doubleMap.get("ngl21");
        String glb1 = takeSignByCompareNumber(ngl11, dbjbxglfk);
        String glb2 = takeSignByCompareNumber(ngl21, db1bshdlfk);
        String glm1 = takeStringByCompareNumber(ngl11, dbjbxglfk);
        String glm2 = takeStringByCompareNumber(ngl21, db1bshdlfk);
        map.put("glb1", CommonFunc.convertDoubleToString(glb1));
        map.put("glb2", CommonFunc.convertDoubleToString(glb2));
        map.put("glm1", CommonFunc.convertDoubleToString(glm1));
        map.put("glm2", CommonFunc.convertDoubleToString(glm2));

        Double shz1 = doubleMap.get("shz1");
        Double shz2 = doubleMap.get("shz2");
        String glb3 = takeSignByCompareNumber(shz1, dbgcshzr);
        String glb4 = takeSignByCompareNumber(shz2, dbgcshzr);
        String glm3 = takeStringByCompareNumber(shz1, dbgcshzr);
        String glm4 = takeStringByCompareNumber(shz2, dbgcshzr);
        map.put("glb3", CommonFunc.convertDoubleToString(glb3));
        map.put("glb4", CommonFunc.convertDoubleToString(glb4));
        map.put("glm3", CommonFunc.convertDoubleToString(glm3));
        map.put("glm4", CommonFunc.convertDoubleToString(glm4));

        Double glbz20 = doubleMap.get("glbz20");
        String glb20 = takeSignByCompareNumber(glbz20, 8.0);
        String glm20 = (glbz20 < 8) ? "不满足" : "满足";
        map.put("glb20", CommonFunc.convertDoubleToString(glb20));
        map.put("glm20", CommonFunc.convertDoubleToString(glm20));

        Double glbz15 = doubleMap.get("glbz15");
        String glb15 = takeSignByCompareNumber(glbz15, 8.0);
        String glm15 = (glbz15 < 8) ? "不满足" : "满足";
        map.put("glb15", CommonFunc.convertDoubleToString(glb15));
        map.put("glm15", CommonFunc.convertDoubleToString(glm15));

        Double glbz10 = doubleMap.get("glbz10");
        String glb10 = takeSignByCompareNumber(glbz10, 8.0);
        String glm10 = (glbz10 < 8) ? "不满足" : "满足";
        map.put("glb10", CommonFunc.convertDoubleToString(glb10));
        map.put("glm10", CommonFunc.convertDoubleToString(glm10));

        if (ssjgxsModel.equals("齿轮齿条式伸缩机构")) {
            Double tjs = doubleMap.get("tjs");
            Double tn = doubleMap.get("tn");
            String glb5 = takeSignByCompareNumber(tjs, tn);
            String glm5 = takeStringByCompareNumber(tjs, tn);
            map.put("glb5", CommonFunc.convertDoubleToString(glb5));
            map.put("glm5", CommonFunc.convertDoubleToString(glm5));
        }

        if (ssjgxsModel.equals("液压式伸缩机构")) {
            Double tyys = doubleMap.get("tyys");
            String yyssb1 = takeSignByCompareNumber(tyys, sslltlk);
            String yyssm1 = takeStringByCompareNumber(tyys, sslltlk);
            map.put("yyssb1", CommonFunc.convertDoubleToString(yyssb1));
            map.put("yyssm1", CommonFunc.convertDoubleToString(yyssm1));

            Double tjs = doubleMap.get("tjs");
            Double fknk = doubleMap.get("fknk");
            String yyssb2 = takeSignByCompareNumber(tjs, fknk);
            String yyssm2 = takeStringByCompareNumber(tjs, fknk);
            map.put("yyssb2", CommonFunc.convertDoubleToString(yyssb2));
            map.put("yyssm2", CommonFunc.convertDoubleToString(yyssm2));
        }

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
