package jmu.day1.demo08;

import java.util.Arrays;

/*
* 题目：
* 请使用Arrays的相关API，将一个随机字符串的所有字符升序排列，并倒序打印。
* */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "saf1fd6dv185gvavvs";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
