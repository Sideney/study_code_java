package jmu.day2.demo06Thread;

public class Ru {
    public static void main(String[] args) {

        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(i + "-->" + Thread.currentThread().getName());
        }


    }
}
