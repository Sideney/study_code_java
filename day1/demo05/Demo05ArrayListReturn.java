package jmu.day1.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listPrint = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(200)+1);
        }

        listPrint=arrayListReturn(list);
        System.out.println("总个数为：" + listPrint.size());
        for (int i = 0; i < listPrint.size(); i++) {
            System.out.println(listPrint.get(i));
        }
    }

    public static ArrayList<Integer> arrayListReturn(ArrayList<Integer> listALL){
        ArrayList<Integer> listReturn = new ArrayList<>();
        for (int i = 0; i < listALL.size(); i++) {
            if(listALL.get(i)%2==0){
                listReturn.add(listALL.get(i));
            }
        }
        return listReturn;
    }
}
