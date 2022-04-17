package jmu.day1.demo11;

public class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call(){
        System.out.println("动物叫");
    }
}
