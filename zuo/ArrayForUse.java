package jmu.zuo;

import java.util.Random;

public class ArrayForUse {

    public static int MAXSIZE = 7;


    public static int[] toGetArray(){
        int[] array = new int[MAXSIZE];

        for(int i=0;i < array.length;i++){
            array[i] = (int)(Math.random() * 50);
        }

        return array;
    }

}
