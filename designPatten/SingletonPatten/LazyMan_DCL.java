package jmu.designPatten.SingletonPatten;
/*
懒汉式单例
dcl
 */
public class LazyMan_DCL {
    private LazyMan_DCL(){
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private static LazyMan_DCL lazyMan;

    public static LazyMan_DCL getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan_DCL.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan_DCL();
                }

            }
        }
        return lazyMan;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                LazyMan_DCL.getInstance();
            }).start();
        }
    }
}
