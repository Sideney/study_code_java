package jmu.day1.demo07;

/*
* 如果某个成员使用了static关键字，那么这个变量不属于对象，而是属于所在类。
*作用：用来自动生成数据。
* */

public class Demo01StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",19);
        stu1.room = "514";
        Student stu2 = new Student("黄蓉",19);
        System.out.println("姓名:" + stu1.getName() + ",年龄:"+stu1.getAge());
        System.out.println("姓名:" + stu2.getName() + ",年龄:"+stu2.getAge());
        System.out.println("姓名:" + stu1.getName() + ",年龄:"+stu1.getAge() + ",教室："+stu1.room);
        System.out.println("姓名:" + stu2.getName() + ",年龄:"+stu2.getAge() + ",教室："+stu2.room);
    }
}
