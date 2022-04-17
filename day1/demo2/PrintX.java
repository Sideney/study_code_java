package jmu.day1.demo2;
/*
题目要求
定义一个方法：打印指定次数的HelloWorld。
 */
public class PrintX {
    public static void main(String[] args) {
          int count;
          count = 10;
          printX(count);
    }

    /*
    返回值类型：无需返回
    方法名称：printX
    参数列表：count
     */
    public static void printX(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("hello world!");
        }
    }

}


