package jmu.day1.demo10;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member member1 = new Member("a",0);
        Member member2 = new Member("b",0);
        Member member3 = new Member("c",0);

        ArrayList<Integer> redList = new ArrayList<>();
        redList = manager.send(80,3);

        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
