package com.study.threading;

public class Demo_t4 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + ":" + "...aaaaaa");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + ":" + "...b");
                }
            }
        };
        t2.setDaemon(true);//守护线程
        t1.start();
        t2.start();


    }
}
