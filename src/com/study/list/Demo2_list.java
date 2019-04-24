package com.study.list;

import com.study.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo2_list {

    //list 集合储存对象
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三", 23));
        list.add(new Student("张三2", 23));
        list.add(new Student("张三3", 23));

        for (int i = 0; i < list.size(); i++) {
            Student s = (Student) list.get(i); //同样 强转
            System.out.println(s.getName());
        }

    }
}
