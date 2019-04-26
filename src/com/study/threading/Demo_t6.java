package com.study.threading;

public class Demo_t6 {
    public static void main(String[] args) {
        MyT myT = new MyT();
        MyT myT1 = new MyT();
        myT1.setPriority(Thread.MIN_PRIORITY);
        myT.setPriority(Thread.MAX_PRIORITY); // 优先级设定
        myT.start();
        myT1.start();

    }
}

class MyT extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
//            if (i % 10 == 0) {
//                Thread.yield();  // 礼让线程
//                System.out.println(getName() + ":" + "aaa>>>>>" + i);
//            }

            System.out.println(getName() + ":" + "aaa>>>>>" + i);

        }
    }
}