package jmu.day1.demo07;

/*
* 静态方法不属于对象，而是属于类。
* 如果没有静态方法，那么必须创建对象，然后通过对象才能使用该方法。
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        //成员方法
        MyClass obj = new MyClass();
        obj.method();
        //静态方法
        MyClass.methodStatic();
    }
}
