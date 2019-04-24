package com.study.generic;

import com.study.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_generic {
    public static void main(String[] args) {

        // 泛型只能储存 对象  引用数据类型
        ArrayList<Student> list = new ArrayList<>();
//        list.add(110);
//        list.add("aa");
        list.add(new Student("张三", 24));
        list.add(new Student("张三2", 24));
        list.add(new Student("张三3", 24));
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            // 因为泛型的原因 ，这里不用 强转了
            System.out.println(it.next().getName());
        }
    }
}
