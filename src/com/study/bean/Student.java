package com.study.bean;

import java.util.Objects;

public class Student {

    private String name;
    private Integer age;

    public Student() {

    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws Exception {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            throw new Exception("你的年龄怪怪的");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student p = (Student) obj;
        System.out.println("执行了么");
        return this.name.equals(p.name) && this.age == p.age;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) &&
//                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

}


