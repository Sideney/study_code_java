package jmu.day1.demo05;

import java.util.ArrayList;

public class Demo05ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公",19);
        Student two = new Student("段誉",19);
        Student three = new Student("欧阳锋",19);
        Student four = new Student("张无忌",19);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("大名:" + list.get(i).getName() + ", 年龄:" + list.get(i).getAge());
        }

    }
}
