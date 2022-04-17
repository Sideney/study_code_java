package jmu.designPatten.AbstractFactory;

import java.util.Scanner;

public class Monopoly {
    public static void main(String... args) {
        play();
    }

    public static void play(){
        Map map = new Map();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入指令（1输出普通地图，2输出魔法地图）");
        int order;
        order  = scanner.nextInt();
        if(order == 1){
            map.getMap(new NormalFactory());
        }else{
            map.getMap(new MagicFactory());
        }
    }
}

