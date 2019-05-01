package com.study.test;

public class Test2 {
    public static void main(String[] args) {

        Integer i = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println(i == i2); //false
        System.out.println(i.equals(i2)); //true

        Integer i3 = 97;
        Integer i4 = 97;

        System.out.println(i3 == i4); //true
        System.out.println(i3.equals(i4)); //true

        //-128-127 byte取值范围
        //在这个取值范围内，自动装箱不会创建对象，从常量池中获取
        //超过这个范围会创建新对象


        Integer i5 = 128;
        Integer i6 = 128;

        System.out.println(i5 == i6); //false
        System.out.println(i5.equals(i6)); //true


        Integer i7 = new Integer(128);
        Integer i8 = new Integer(128);
        System.out.println(i7 == i8);  //false
        System.out.println(i7.equals(i8));//true


        System.out.println(i5 == i7); //false
        System.out.println(i5.equals(i7));//true


    }
}
