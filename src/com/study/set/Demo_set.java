package com.study.set;

import com.study.bean.Student;

import java.util.HashSet;

public class Demo_set {
    public static void main(String[] args) {
//        demo1();
        HashSet<Object> hs = new HashSet<>();

        hs.add(new Student("刘生", 23));
        hs.add(new Student("刘生", 23));
        hs.add(new Student("刘生2", 23));
        hs.add(new Student("刘生2", 23));
        System.out.println(hs);
    }

    private static void demo1() {
        HashSet<String> hs = new HashSet<>();

        hs.add("a");
        hs.add("a1");
        hs.add("a2");
        hs.add("a3");
        System.out.println(hs);

        for (String string : hs
        ) {
            System.out.println(string);
        }
    }

}
