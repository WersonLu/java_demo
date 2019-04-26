package com.study.threading;

public class Demo_single {
    public static void main(String[] args) {


    }
}

//饿汉式
class Singleton {
    // 私有构造函数
    private Singleton() {

    }

    public static Singleton s = new Singleton();

    public static Singleton getInstance() {
        return s;
    }
}

//懒汉式

class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 s2;

    public static Singleton2 getInstance() {
        if (s2 == null) {
            s2 = new Singleton2();
        }
        return s2;
    }
}