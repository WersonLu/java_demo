package com.study.list;

import com.study.bean.Student;

import java.util.ArrayList;

public class Demo_qiantao {

    // 集合嵌套
    public static void main(String[] args) {
        ArrayList<ArrayList<Student>> lists = new ArrayList<>();

        ArrayList<Student> first = new ArrayList<>();
        first.add(new Student("李思思", 23));
        first.add(new Student("李思思2", 23));
        first.add(new Student("李思思3", 23));

        ArrayList<Student> two = new ArrayList<>();
        two.add(new Student("李思思4", 23));
        two.add(new Student("李思思5", 23));
        two.add(new Student("李思思6", 23));

        lists.add(first);
        lists.add(two);
        System.out.println(lists);

        for (ArrayList<Student> a : lists) {
            for (Student s : a) {
                System.out.println(s);
            }
        }

    }
}
