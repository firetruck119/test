package com.point.web.newController.Tool;

import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorHanYuPinYin implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return convertToHanYuPinYinString(o1).compareTo(convertToHanYuPinYinString(o2));
    }
    private String convertToHanYuPinYinString(String str) {

        StringBuilder sb = new StringBuilder();
        String[] arr = null;
        arr = PinyinHelper.toHanyuPinyinStringArray(str.charAt(0));
        if (arr != null && arr.length > 0) {
            for (String string : arr) {
                sb.append(string);
            }
        } else {
            sb.append(str.charAt(0));
        }
        return sb.toString();
    }
}