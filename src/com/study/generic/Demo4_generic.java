package com.study.generic;

import com.study.bean.Student;
import com.study.bean.WorkerStuden;

import java.util.ArrayList;
import java.util.List;

public class Demo4_generic {
    public static void main(String[] args) {

//        右边不确定，左右可使用？ 通配符
//        List<?> lit = new ArrayList<String>();
//        lit.add("aa");

        /*
        *  extent E  向下限定 子类
        *  super E  向上  父类
        * */

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("刘生", 23));
        list.add(new Student("刘生2", 23));


        ArrayList<WorkerStuden> list1 = new ArrayList<>();
        list1.add(new WorkerStuden("刘生3", 23));

        // WorkerStuden 继承于studen 所以以下成立
        list.addAll(list1);

        System.out.println(list);


    }
}
