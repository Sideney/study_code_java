package jmu.day2.demo06Thread;

public class MyThread extends Thread{

    @Override
    public void run(){
        //String name = getName();
        //System.out.println(name);
        System.out.println(currentThread());
    }
}
