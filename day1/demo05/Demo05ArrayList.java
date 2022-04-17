package jmu.day1.demo05;

/*
* 数组长度不可以发生改变
* 但是arrayList集合的长度是可以改变的
* 对于arrayList来说，<E>代表泛型
* 泛型只能是引用类型，不能是基本类型
*
* 注意事项：
* 对于arrayList来说，直接打印不是地址值，而是内容
* */

import java.util.ArrayList;

public class Demo05ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合名称是list，里面装的都是String类型的数据
        //从jdk1.7+起，右侧尖括号可以不写内容，但<>还是要写
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("bye");
        System.out.println(list);
        String k = list.get(1);
        System.out.println(k);

    }
}
