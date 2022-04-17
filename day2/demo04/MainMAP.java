package jmu.day2.demo04;

import java.util.*;

public class MainMAP {
    public static void main(String[] args) {
        show01();
        show03();
        show04();
    }

    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("jack",19);
        map.put("jack",20);
        map.put("Tom",19);

        Set<Map.Entry<String,Integer>> set = map.entrySet();

        Iterator<Map.Entry<String,Integer>> it = set.iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("jack",19);
        map.put("jack",20);
        map.put("Tom",19);
        Integer v1 = map.get("jack");
        System.out.println(v1);
        Set<String> s1 = map.keySet();
        for (String s:s1
             ) {
            System.out.println(map.get(s));
        }
        //System.out.println(map.keySet());
    }

    private static void show01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("jack",19);
        map.put("jack",20);
        map.put("Tom",19);
        System.out.println(map);
    }
}
