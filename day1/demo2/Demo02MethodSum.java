package jmu.day1.demo2;
/*
  定义一个方法，用来求1-100之间的所有数字的和值。
*/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());

    }

    /*
    三要素
    返回值：int
    方法名称：getSum
    参数列表：不需要参数
    */

    public static int getSum(){
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
