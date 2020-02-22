package com.point.common;


public enum  ImgDataType {
    gif("image/gif;base64"),png("image/png;base64"),jpg("image/jpeg;base64"),icon("image/x-icon;base64");

    private String typeBybase64;

    ImgDataType(String type){
        typeBybase64=type;
    }
    public static ImgDataType getTypeByName(String name){
        return ImgDataType.valueOf(name);
    }

    public String getTypeBybase64() {
        return typeBybase64;
    }
}


