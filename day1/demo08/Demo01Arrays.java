package jmu.day1.demo08;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String strArray = Arrays.toString(intArray);
        System.out.println(strArray);

        int[] intArray1 = {2,22,3,69,97,1};
        Arrays.sort(intArray1);
        System.out.println(Arrays.toString(intArray1));//[1, 2, 3, 22, 69, 97]

        String[] strArray1 = {"aaa","ccc","bbb"};
        Arrays.sort(strArray1);
        System.out.println(Arrays.toString(strArray1));//[aaa, bbb, ccc]
    }
}
