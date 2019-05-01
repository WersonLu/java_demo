package com.study.reflact;

import com.study.bean.Student;

import java.lang.reflect.Constructor;

public class Demo_r2 {
    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName("com.study.bean.Student");
        // 通过空参构造函数来创建对象
        Student s = (Student) clazz.newInstance();
        System.out.println(s);

        // 获取有参构造 ，通过有参构造创建对象
//        Constructor c = clazz.getConstructor(String.class, int.class);
//        Student s = (Student) c.newInstance("张三", 23);
//        System.out.println(s);


    }
}
