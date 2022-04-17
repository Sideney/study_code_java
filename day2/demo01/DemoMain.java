package jmu.day2.demo01;

/*
* 使用匿名内部类！
* 匿名内部类的定义格式：
* 接口名称 对象名 = new 接口名称（）{
*   //覆盖重写所有抽象方法
* }；
* */

public class DemoMain {
    public static void main(String[] args) {
        MyInterFace obj = new MyInterFace() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法实现！");
            }
        };

        obj.method();
    }
}
