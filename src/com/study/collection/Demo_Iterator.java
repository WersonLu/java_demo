package com.study.collection;

import com.study.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo_Iterator {
    public static void main(String[] args) {
        Collection c2 = new ArrayList();
        c2.add(new Student("张三", 24));
        c2.add(new Student("张三3", 24));
        c2.add(new Student("张三5", 24));

        // 获取迭代器 并迭代
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();  //向下转型
//            System.out.println(it.next()); //输出对象
            System.out.println(s.getName()); //输出姓名
        }
    }
}
