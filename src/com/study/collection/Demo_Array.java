package com.study.collection;

import com.study.bean.Student;

public class Demo_Array {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student("张三", 35);
        arr[1] = new Student("里屋", 35);
        arr[2] = new Student("张天", 35);
        //引用数据类型储存对象的地址值
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
