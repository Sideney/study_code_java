package jmu.day2.demo03;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 1.准备牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();

        String[] colors = {"♠","♥","♣","■"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        poker.add("大王");
        poker.add("小王");

        for (String num:nums) {
            for(String color:colors){
                poker.add(color+num);
            }
        }

        /*
        * 2.洗牌
        * 使用Collections中的方法
        * static void shuFFle();
        * */
        Collections.shuffle(poker);
        System.out.println(poker);

        /*
         *3.发牌
         */
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> p = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String tmp = poker.get(i);
            if(i>=51){
                p.add(tmp);
            }else if(i%3==0){
                p1.add(tmp);
            }else if(i%3==1){
                p2.add(tmp);
            }else{
                p3.add(tmp);
            }
        }
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}
