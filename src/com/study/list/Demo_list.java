package com.study.list;

import java.util.ArrayList;
import java.util.List;


//list
//list 集合才有索引
public class Demo_list {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("h");
        list.add(4, "j");
        System.out.println(list);
        //只能用索引删除
        Object c = list.remove(2);
        System.out.println(c);

        //通过索引获取 修改
        Object c2 = list.get(3);
        System.out.println(c2);
        list.set(2,"ss");

        //可直接索引遍历
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }
}
