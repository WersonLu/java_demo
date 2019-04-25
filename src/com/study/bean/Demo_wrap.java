package com.study.bean;

//import com.sun.org.apache.bcel.internal.classfile.Code;


//装饰设计模式  降低耦合性
public class Demo_wrap {

    public static void main(String[] args) {
        WHStudent whStudent = new WHStudent(new Student1());
        whStudent.code();
    }
}

interface Coder {
    public void code();
}

class Student1 implements Coder {
    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("java web");
    }
}

class WHStudent implements Coder {
    private Student1 s;

    public WHStudent(Student1 s) {
        this.s = s;
    }

    @Override
    public void code() {
        s.code();
        System.out.println("ssh");
        System.out.println("py");
        System.out.println("ssm");

    }
}