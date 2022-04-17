package jmu.day2.demo06Thread;

public class GetThreadName {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        new MyThread().start();

        System.out.println(Thread.currentThread());
    }
}
