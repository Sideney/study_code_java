package jmu.designPatten.AbstractFactory;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    public void getMap(AbstractFactory abstractFactory){
        ArrayList<AbstractBlock> map = new ArrayList<>();
        map.add(abstractFactory.getEmpty());
        map.add(abstractFactory.getPark());
        map.add(abstractFactory.getPrison());
        Random random = new Random(3);
        int col = 12;
        for(int i = 1;i<col;i++){
            int tt= random.nextInt(3);
            map.get(tt).printBlock();
            if(i==4||i==6||i==8){
                System.out.println();
            }
            if(i==5||i==7){
                System.out.print("    ");
            }
        }
    }
}
