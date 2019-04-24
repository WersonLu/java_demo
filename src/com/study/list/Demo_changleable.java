package com.study.list;

public class Demo_changleable {

    public static void main(String[] args) {
        int[] arr = {11, 2, 22, 33};
        print(arr);
        print(11, 22, 333, 44, 55, 66, 77, 88);
    }

    //    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
// 可变参数就是数组
    public static void print(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
