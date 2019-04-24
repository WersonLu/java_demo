package com.study.error;

import com.study.bean.Student;

public class Demo_throwable {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//        Student s=new Student();
//        s.setAge(12);
    }
}
