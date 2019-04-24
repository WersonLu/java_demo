package com.study.list;

import com.study.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Arraylist {


    public static void main(String[] args) {
        // 去重
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("a");
        ArrayList newl = getSinge(list);
        System.out.println(newl);


        // 对象去重
        ArrayList list2 = new ArrayList();
        list2.add(new Student("张三", 24));
        list2.add(new Student("张三", 24));
        list2.add(new Student("张三2", 24));
        list2.add(new Student("张三2", 24));
        list2.add(new Student("张三3", 24));
        list2.add(new Student("张三3", 24));

        ArrayList new2 = getSinge(list2); //由结果可知无法去重  需要重写对象的eequals方法
        System.out.println(new2);
        // 重写对象的equals 可以正确去重
        //[Student{name='张三', age=24}, Student{name='张三2', age=24}, Student{name='张三3', age=24}]


    }



    public static ArrayList getSinge(ArrayList list) {
        ArrayList arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object c = it.next();
            if (!arrayList.contains(c)) {
                arrayList.add(c);
            }
        }
        return arrayList;

    }


}
