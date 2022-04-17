package jmu.day2.demo07.WaitAndNotify;

public class Demo07WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();

        new Thread(){
            @Override
            public void run(){
                synchronized (obj){
                    System.out.println("告知老板要的包子品种和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我吃饱了");
                }
            }
        }.start();

        new Thread(){
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("老板做好包子，告知顾客");
                    obj.notify();
                }
            }
        }.start();
    }
}
