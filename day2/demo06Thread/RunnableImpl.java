package jmu.day2.demo06Thread;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + "-->" + Thread.currentThread().getName());
        }
    }
}
