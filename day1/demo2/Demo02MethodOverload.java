package jmu.day1.demo2;

public class Demo02MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,12,16));
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
