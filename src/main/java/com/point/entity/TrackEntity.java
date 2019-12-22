package com.point.entity;

import com.point.common.CommonFunc;

import java.io.Serializable;
import java.lang.reflect.Field;

public class TrackEntity implements Serializable {
    private String gdxh;
    private String h;
    private String b;
    private String tw;
    private String tfs;
    private String tfx;
    private String hw;
    private String hy;
    private String sy;
    private String iy;
    private String iz;
    private String wysel;
    private String wyxel;
    private String wzel;
    private String z;
    private String y;
    private String gdxhen;

    public String getGdxhen() {
        return gdxhen;
    }

    public void setGdxhen(String gdxhen) {
        this.gdxhen = gdxhen;
    }


    public String getGdxh() {
        return gdxh;
    }

    public void setGdxh(String gdxh) {
        this.gdxh = gdxh;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }

    public String getTfs() {
        return tfs;
    }

    public void setTfs(String tfs) {
        this.tfs = tfs;
    }

    public String getTfx() {
        return tfx;
    }

    public void setTfx(String tfx) {
        this.tfx = tfx;
    }

    public String getHw() {
        return hw;
    }

    public void setHw(String hw) {
        this.hw = hw;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getSy() {
        return sy;
    }

    public void setSy(String sy) {
        this.sy = sy;
    }

    public String getIy() {
        return iy;
    }

    public void setIy(String iy) {
        this.iy = iy;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public String getWysel() {
        return wysel;
    }

    public void setWysel(String wysel) {
        this.wysel = wysel;
    }

    public String getWyxel() {
        return wyxel;
    }

    public void setWyxel(String wyxel) {
        this.wyxel = wyxel;
    }

    public String getWzel() {
        return wzel;
    }

    public void setWzel(String wzel) {
        this.wzel = wzel;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }



    private  void setValue(TrackEntity obj, String name, String Value) throws IllegalAccessException, NoSuchFieldException {
        Field strs = TrackEntity.class.getDeclaredField(name);
        strs.setAccessible(true);
        strs.set(obj,"abc");
    }


    public String switchHy(String xh, Double tfs){
        switch (xh){
            case "H200+贴板":
            case "H250+贴板":
                return String.valueOf(tfs+16);
            case "I20b":
            case "I22b":
            case "I25b":
            case "I28b":
            case "I32b":
            case "H175":
            case "H200":
            case "H250":
            case "拼焊H200*216":
            case "拼焊H250*266":
            default:
                return CommonFunc.convertDoubleToString(tfs);
        }
    }
    public String switchZ(String xh,Double h){
        switch (xh){

            case "I20b":
            case "I22b":
            case "I25b":
            case "I28b":
            case "I32b":
            case "H175":
            case "H200":
            case "H250":
                return CommonFunc.convertDoubleToString(h/2);
            case "H200+贴板":
                return "132.4";
            case "H250+贴板":
                return "162";
            case "拼焊H200*216":
                return "114.7";
            case "拼焊H250*266":
                return "139.8";
            default:
                return "";
        }
    }

}
