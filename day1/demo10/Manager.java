package jmu.day1.demo10;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看下群主的余额
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱
        super.setMoney(leftMoney-totalMoney);

        //发红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
