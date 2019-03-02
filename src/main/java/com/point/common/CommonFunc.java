package com.point.common;

public class CommonFunc {
    public static String convertDoubleToString(Double value) {
        try {
            if (value == null) {
                return "";
            }
            String result = String.format("%.2f", value);
            if (result.endsWith(".00")) {
                result = result.replace(".00", "");
            }
            if (result.endsWith(".0")) {
                result = result.replace(".0", "");
            }
            if(result.contains(".")){
                if (result.endsWith("0")){
                    result=result.substring(0,result.length()-1);
                }
            }
            return result;
        } catch (Exception ex) {

        }
        return "";
    }
}
