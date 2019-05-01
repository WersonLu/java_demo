package com.study.adapter;

public class Demo_adapter {
    public static void main(String[] args) {

    }
}

interface HeS {
    public void zuo();

    public void lianjing();

    public void sport();
}

abstract class IOB implements HeS {
    // 一个适配器类
    @Override
    public void zuo() {

    }

    @Override
    public void lianjing() {

    }

    @Override
    public void sport() {

    }
}

class Luzs extends IOB {
    public void sport() {
        System.out.println("鲁智深大闹野猪林");
        System.out.println("倒把垂杨柳");
    }
}