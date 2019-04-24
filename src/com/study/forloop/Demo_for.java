package com.study.forloop;

import com.study.bean.Student;

import java.util.ArrayList;


// 增强for循环
// 依赖于迭代器
public class Demo_for {

    public static void main(String[] args) {
        demo1();
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("张三2", 23));
        list.add(new Student("张三3", 23));
        list.add(new Student("张三4", 23));
        for (Student student : list) {
            System.out.println(student.getName());
        }

    }

    private static void demo1() {
        int[] arr = {11, 22, 33, 44, 55, 66};
        for (int i : arr) {
            System.out.println(i);
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a1");
        list.add("a2");
        for (String st : list
        ) {
            System.out.println(st);
        }
    }
}
