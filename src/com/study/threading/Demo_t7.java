package com.study.threading;

public class Demo_t7 {
    public static void main(String[] args) {

        // 同步代码块
        final Printer p = new Printer();
        new Thread() {
            public void run() {
                while (true) {
                    p.print1(); // 匿名内部类使用局部变量 ，final 修饰
                }
            }
        }.start();
        new Thread() {
            public void run() {
                while (true) {
                    p.print2();
                }
            }
        }.start();
    }
}

class Printer {
    String s="aa0";
    public void print1() {
        synchronized (s){
            System.out.println("a1");
            System.out.println("a2");
            System.out.println("a3");
        }
        }

    public void print2() {
        synchronized (s){
            System.out.println("b1");
            System.out.println("b2");
            System.out.println("b3");
        }
    }
}

