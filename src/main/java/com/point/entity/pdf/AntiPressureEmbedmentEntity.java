package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class AntiPressureEmbedmentEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String jsr;
    private String shr;
    private String date;
    private Double h;
    private Double v;
    private Double n;
    private String cz;
    private Double d;
    private Double nd;
    private String nr;
    private String nc;
    private Double by;
    private Double bx;
    private String pcz;
    private Double t;
    private String ccz;
    private String bak;
    private Double la;
    private Double c0;
    private Double c10;
    private Double pb;
    private Double pl;


    public Double getPb() {
        return pb;
    }

    public void setPb(Double pb) {
        this.pb = pb;
    }

    public Double getPl() {
        return pl;
    }

    public void setPl(Double pl) {
        this.pl = pl;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getV() {
        return v;
    }

    public void setV(Double v) {
        this.v = v;
    }

    public Double getN() {
        return n;
    }

    public void setN(Double n) {
        this.n = n;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getNd() {
        return nd;
    }

    public void setNd(Double nd) {
        this.nd = nd;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public Double getBy() {
        return by;
    }

    public void setBy(Double by) {
        this.by = by;
    }

    public Double getBx() {
        return bx;
    }

    public void setBx(Double bx) {
        this.bx = bx;
    }

    public String getPcz() {
        return pcz;
    }

    public void setPcz(String pcz) {
        this.pcz = pcz;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public String getCcz() {
        return ccz;
    }

    public void setCcz(String ccz) {
        this.ccz = ccz;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public Double getLa() {
        return la;
    }

    public void setLa(Double la) {
        this.la = la;
    }

    public Double getC0() {
        return c0;
    }

    public void setC0(Double c0) {
        this.c0 = c0;
    }

    public Double getC10() {
        return c10;
    }

    public void setC10(Double c10) {
        this.c10 = c10;
    }

    private Double getFy() {
        Double fy = 0.0;
        if (cz.equals("Q235B")) fy = 210.0;
        if (cz.equals("Q345B")) fy = 295.0;
        if (cz.equals("HPB300")) fy = 270.0;
        if (cz.equals("HRB335")) fy = 300.0;
        if (cz.equals("HRB400")) fy = 360.0;
        if (cz.equals("HRB500")) fy = 435.0;
        return fy;
    }

    private Double getFc() {
        Double result = 0.0;
        if (ccz.equals("C20")) result = 9.6;
        if (ccz.equals("C25")) result = 11.9;
        if (ccz.equals("C30")) result = 14.3;
        if (ccz.equals("C35")) result = 16.7;
        if (ccz.equals("C40")) result = 19.1;
        if (ccz.equals("C45")) result = 21.1;
        return result;
    }

    private Double getFt() {
        Double result = 0.0;
        if (ccz.equals("C20")) result = 1.1;
        if (ccz.equals("C25")) result = 1.27;
        if (ccz.equals("C30")) result = 1.43;
        if (ccz.equals("C35")) result = 1.57;
        if (ccz.equals("C40")) result = 1.71;
        if (ccz.equals("C45")) result = 1.8;
        return result;
    }

    private Double getAr() {
        Double result = 0.0;
        if (nr.equals("2")) result = 1.0;
        if (nr.equals("3")) result = 0.9;
        if (nr.equals("4")) result = 0.85;
        return result;
    }

    private String getSatisfied(boolean flag) {
        return flag ? "满足" : "不满足";
    }

    private String getUnSatisfied(boolean flag) {
        return flag ? "不满足" : "满足";
    }

    private String compareWithOne(Double value){
        if(value>1){
            return ">";
        }else if(value<1){
            return "<";
        }else{
            return "=";
        }
    }

    public Map<String, String> getMapForPdf() {
        Map<String, String> result = new HashMap<>();
        Double m = v * h / 1000;
        Double fy = getFy();
        Double fc = getFc();
        Double ft = getFt();
        Double ar = getAr();
        Double av = (4 - 0.08 * d) * Math.pow(fc / fy, 0.5);
        Double ab = 0.6 + 0.25 * t / d;
        Double m1000 = m * 1000 < 0.4 * n * by ? 0.4 * n * by : m * 1000;
        Double as2min = (m1000 * 1000 - 0.4 * n * 1000 * by) / (0.4 * ar * ab * fy * by);
        Double as1min = (v * 1000 - 0.3 * n * 1000) / (ar * av * fy) + ((m1000 * 1000 - 0.4 * n * 1000 * by) / (1.3 * ar * ab * fy * by));
        Double asmin = Math.max(as2min, as1min);
        Double as = (Math.PI * d * d / 4) * nd;
        Double na = asmin / as;
        String c1 = getUnSatisfied(na > 1);
        String z1 = compareWithOne(na);
        double lamin = 15 * d;
        double nla = lamin / la;
        String c7 = getUnSatisfied(nla > 1);
        String z2 = compareWithOne(nla);
        double tmin =  by / 8;
        double nt = tmin / t;
        String c2 = getUnSatisfied(nt > 1);
        String z3 = compareWithOne(nt);
        double c0min =  2 * d;
        double nc0 = c0min / c0;
        String c3 = getUnSatisfied(nc0 > 1);
        String z4 = compareWithOne(nc0);
        double c1min = 3 * d;
        double nc1 = c1min / c10;
        String z5 = compareWithOne(nc1);
        String c8 = getUnSatisfied(nc1 > 1);
        double bmin =  6 * d;
        double b =  by;
        double nb = bmin / b;
        String z6 = compareWithOne(nb);
        double amin = n * 1000 / fc / 0.5;
        double a = pl * pb;
        double np = amin / a;
        String z8 = compareWithOne(np);
        String c9 = getUnSatisfied(np > 1);
        String c4 = getUnSatisfied(nb > 1);
        String z7 = compareWithOne(na);
        String c5 = getSatisfied(c2.equals("满足")&&c3.equals("满足")&&c4.equals("满足")&&c7.equals("满足")&&c8.equals("满足")&&c9.equals("满足"));
        result.put("no",CommonFunc.convertDoubleToString(no));
        result.put("ver",CommonFunc.convertDoubleToString(ver));
        result.put("xmmc",CommonFunc.convertDoubleToString(xmmc));
        result.put("jsr",CommonFunc.convertDoubleToString(jsr));
        result.put("shr",CommonFunc.convertDoubleToString(shr));
        result.put("date",CommonFunc.convertDoubleToString(date));
        result.put("h",CommonFunc.convertDoubleToString(h));
        result.put("v",CommonFunc.convertDoubleToString(v));
        result.put("n",CommonFunc.convertDoubleToString(n));
        result.put("m",CommonFunc.convertDoubleToString(m));
        result.put("cz",CommonFunc.convertDoubleToString(cz));
        result.put("fy",CommonFunc.convertDoubleToString(fy));
        result.put("d",CommonFunc.convertDoubleToString(d));
        result.put("nd",CommonFunc.convertDoubleToString(nd));
        result.put("nr",CommonFunc.convertDoubleToString(nr));
        result.put("nc",CommonFunc.convertDoubleToString(nc));
        result.put("by",CommonFunc.convertDoubleToString(by));
        result.put("bx",CommonFunc.convertDoubleToString(bx));
        result.put("pcz",CommonFunc.convertDoubleToString(pcz));
        result.put("t",CommonFunc.convertDoubleToString(t));
        result.put("ccz",CommonFunc.convertDoubleToString(ccz));
        result.put("fc",CommonFunc.convertDoubleToString(fc));
        result.put("ft",CommonFunc.convertDoubleToString(ft));
        result.put("ar",CommonFunc.convertDoubleToString(ar));
        result.put("av",CommonFunc.convertDoubleToString(av));
        result.put("ab",CommonFunc.convertDoubleToString(ab));
        result.put("asmin",CommonFunc.convertDoubleToString(asmin));
        result.put("as2min",CommonFunc.convertDoubleToString(as2min));
        result.put("as1min",CommonFunc.convertDoubleToString(as1min));
        result.put("as",CommonFunc.convertDoubleToString(as));
        result.put("na",CommonFunc.convertDoubleToString(na));
        result.put("c1",CommonFunc.convertDoubleToString(c1));
        result.put("z1",CommonFunc.convertDoubleToString(z1));
        result.put("bak",CommonFunc.convertDoubleToString(bak));
        result.put("lamin",CommonFunc.convertDoubleToString(lamin));
        result.put("la",CommonFunc.convertDoubleToString(la));
        result.put("nla",CommonFunc.convertDoubleToString(nla));
        result.put("c7",CommonFunc.convertDoubleToString(c7));
        result.put("z2",CommonFunc.convertDoubleToString(z2));
        result.put("tmin",CommonFunc.convertDoubleToString(tmin));
        result.put("nt",CommonFunc.convertDoubleToString(nt));
        result.put("c2",CommonFunc.convertDoubleToString(c2));
        result.put("z3",CommonFunc.convertDoubleToString(z3));
        result.put("c0min",CommonFunc.convertDoubleToString(c0min));
        result.put("c0",CommonFunc.convertDoubleToString(c0));
        result.put("nc0",CommonFunc.convertDoubleToString(nc0));
        result.put("c3",CommonFunc.convertDoubleToString(c3));
        result.put("z4",CommonFunc.convertDoubleToString(z4));
        result.put("c1min",CommonFunc.convertDoubleToString(c1min));
        result.put("c10",CommonFunc.convertDoubleToString(c10));
        result.put("nc1",CommonFunc.convertDoubleToString(nc1));
        result.put("z5",CommonFunc.convertDoubleToString(z5));
        result.put("c8",CommonFunc.convertDoubleToString(c8));
        result.put("bmin",CommonFunc.convertDoubleToString(bmin));
        result.put("b",CommonFunc.convertDoubleToString(b));
        result.put("nb",CommonFunc.convertDoubleToString(nb));
        result.put("z6",CommonFunc.convertDoubleToString(z6));
        result.put("amin",CommonFunc.convertDoubleToString(amin));
        result.put("a",CommonFunc.convertDoubleToString(a));
        result.put("np",CommonFunc.convertDoubleToString(np));
        result.put("z8",CommonFunc.convertDoubleToString(z8));
        result.put("c9",CommonFunc.convertDoubleToString(c9));
        result.put("c4",CommonFunc.convertDoubleToString(c4));
        result.put("z7",CommonFunc.convertDoubleToString(z7));
        result.put("c5",CommonFunc.convertDoubleToString(c5));
        result.put("pb",CommonFunc.convertDoubleToString(pb));
        result.put("pl",CommonFunc.convertDoubleToString(pl));
        return result;
    }
}
