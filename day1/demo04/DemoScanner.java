package jmu.day1.demo04;

import java.util.Scanner;
/*
* Scanner类的使用
*  */

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int temp = Math.max(a, b);
        int max = Math.max(temp, c);
        System.out.println(max);
    }
}
