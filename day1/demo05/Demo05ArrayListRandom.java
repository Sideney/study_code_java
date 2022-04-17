package jmu.day1.demo05;

/*
* 题目：
* 生成6个1~33之间的随机数字，添加到集合，并遍历集合
*
* 注意事项：
* 1.
* ArrayList<Integer>中Integer是基本引用类型的包装类型，集合不能直接使用基本引用类型。
* 2.
* random.nextInt(x)的作用是生成[0，x}中的随机数。
* */

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i=0;i<6;i++){
            list.add(random.nextInt(33)+1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
