package jmu.day1.demo3;

import java.util.ArrayList;
import java.util.List;

public class FoodApp {

    static List<Food> foodsList = new ArrayList<>();

    public static void main(String[] args) {
        addFood();
        showAllFood();

    }


    public static void showAllFood(){
        for(int i=0;i<foodsList.size();i++){
            System.out.println(foodsList.get(i));
        }
    }

    public static List<Food> addFood(){
        foodsList.add(new Food(1,"鱼香肉丝",20));
        foodsList.add(new Food(2,"炒泡面",30));
        foodsList.add(new Food(3,"炒青菜",40));
        foodsList.add(new Food(4,"肉蟹",50));
        return foodsList;
    }
}
