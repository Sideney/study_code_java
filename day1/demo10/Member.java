package jmu.day1.demo10;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> redList){
        int index = new Random().nextInt(redList.size());
        int delta = redList.remove(index);
        //当前成员的存款
        int money = this.getMoney();
        //加上红包重新设置
        super.setMoney(money + delta);
    }
}
