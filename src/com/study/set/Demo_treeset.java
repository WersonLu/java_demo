package com.study.set;

import com.study.bean.Student;

import java.util.TreeSet;

public class Demo_treeset {

    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        ts.add(new Student("搜索",23));
        ts.add(new Student("搜索2",23));
        ts.add(new Student("搜索3",23));
        ts.add(new Student("搜索4",23));
        ts.add(new Student("搜索5",23));
        System.out.println(ts);
    }
}
