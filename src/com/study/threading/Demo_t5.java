package com.study.threading;

public class Demo_t5 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + ":" + "...aaaaaa");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i == 2) {
                        try {
                            t1.join();  // t2 执行2次后，t1 插队全部执行后再执行t2
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName() + ":" + "...cccccc");
                }
            }
        };
        t1.start();
        t2.start();


    }
}
