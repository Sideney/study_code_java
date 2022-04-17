package jmu.day1.demo09;

public class Cat extends Animal{
    //必须覆盖重写抽象父类的所有抽象方法
    @Override
    public void eat(){
        System.out.println("猫吃鱼！");
    }
}
