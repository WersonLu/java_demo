package com.study.threading;

public class Demo_t2 {
    public static void main(String[] args) {
//        demo();
        new Thread("线程1") {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + ":" + "aaa");
                }
            }
        }.start();
        demo2();
        System.out.println(Thread.currentThread().getName());


    }

    private static void demo2() {
        // 匿名内部类实现线程
        new Thread("线程2") {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + ":" + "aaa");
                }
            }
        }.start();
        new Thread(
                new Runnable() {
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + "cccc");
                        }
                    }
                }
        ).start();

    }

    private static void demo() {
        Myt m = new Myt();
//        m.run();//并没有开启线程
        m.start();//开启线程
        for (int i = 0; i < 100000; i++) {
            System.out.println("bbb");
        }
        Myt2 myt2 = new Myt2();
        new Thread(myt2).start();
    }
}


// 实现线程的两种方法
class Myt extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("aaaaaa");
        }
    }
}

class Myt2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("ccccc");
        }
    }
}
