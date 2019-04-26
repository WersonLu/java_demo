package com.study.threading;

public class Demo_t3 {
    public static void main(String[] args) throws InterruptedException {
//        demo();
        new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+":"+"...aaa");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+":"+"...bbb");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    private static void demo() throws InterruptedException {
        for (int i = 20; i > 0; i--) {
            System.out.println("倒计时：" + i);
            Thread.sleep(1000);

        }
    }
}
