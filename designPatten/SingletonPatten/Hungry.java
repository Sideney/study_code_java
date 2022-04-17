package jmu.designPatten.SingletonPatten;

/*
* 饿汉式单例
* */
public class Hungry {
    private Hungry(){
        System.out.println(this);
    }

    private final static Hungry hungry = new Hungry();

    private static Hungry getInstance(){
        return hungry;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> Hungry.getInstance()).start();
        }
    }
}
