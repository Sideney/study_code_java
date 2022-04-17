package jmu.day2.demo02;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02Col {
    public static void main(String[] args) {
        Collection<String> str = new ArrayList<>();
        System.out.println(str);
        str.add("张三");
        boolean b = str.add("李四");
        System.out.println(b);
        System.out.println(str);
        boolean remove = str.remove("李四");
        System.out.println(remove);
    }
}
