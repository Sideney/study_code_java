package jmu.day1.demo11;

public class Cat extends Animal{
    String wClass;

    public String getwClass() {
        return wClass;
    }

    public void setwClass(String wClass) {
        this.wClass = wClass;
    }

    @Override
    public void call(){
        System.out.println("猫叫");
    }
}
