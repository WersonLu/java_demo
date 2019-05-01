package com.study.reflact;

import com.study.bean.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo_r1 {
    public static void main(String[] args) throws Exception {

//        //多态
//        Juicer j = new Juicer();
//        j.run(new Apple());
//        Class clszz=Class.forName("com.study.reflact.Apple");

        // 反射
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Fruit f = (Fruit) clazz.newInstance();
        Juicer j = new Juicer();
        j.run(f);


    }
}

interface Fruit {
    public void squeeze();
}

class Apple implements Fruit {
    public void squeeze() {
        System.out.println("苹果汁");
    }
}

class Orange implements Fruit {
    public void squeeze() {
        System.out.println("橘子汁");
    }
}

class Juicer {
    //    public void run(Apple apple) {
//        apple.squeeze();
//    }
//
//    public void run(Orange orange) {
//        orange.squeeze();
//    }
    public void run(Fruit f) {
        f.squeeze();
    }

}