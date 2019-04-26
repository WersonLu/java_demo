package com.study.threading;


// 线程间通信
public class Demo_tongxin {
    public static void main(String[] args) {
        Printer2 P = new Printer2();
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        P.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        P.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}

// 等待唤醒
class Printer2 {
    //    String s="aa0";
    private int flag = 1;


    // 等待之前 唤醒对方线程
    public void print1() throws InterruptedException {
        synchronized (this) {
            if (flag != 1) {
                this.wait(); //当前线程等待
            }
            System.out.print("北");
            System.out.print("京");
            System.out.print("欢");
            System.out.print("你");
            System.out.print("\r\n");
            flag = 2;
            this.notify();  //随机唤醒单个线程
        }
    }

    public void print2() throws InterruptedException {
        synchronized (this) {
            if (flag != 2) {
                this.wait();
            }
            System.out.print("c");
            System.out.print("d");
            System.out.print("e");
            System.out.print("f");
            System.out.print("\r\n");
            flag = 1;
            this.notify();
        }
    }
}