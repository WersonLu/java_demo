package com.study.collection;

import com.study.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

// 集合


public class Demo2_collection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("g");
        c.add("b");
        c.add("r");
        System.out.println(c);
        //集合转数组
        Object[] arr = c.toArray();
        System.out.println(arr);
        demo1();
    }

    public static void demo1() {
        Collection c = new ArrayList();
        // 集合 也可以储存对象
        c.add(new Student("张三", 24));
        c.add(new Student("张三3", 24));
        c.add(new Student("张三5", 24));
        Object[] arr = c.toArray();
        //多态 不能使用子类的属性和行为
        for (int i = 0; i < arr.length; i++) {
            Student s = (Student) arr[i];  //向下转型
            System.out.println(s.getName());
        }

    }
}
