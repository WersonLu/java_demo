package com.study.set;

import java.util.LinkedHashSet;

public class Demo_linkedhash {
    public static void main(String[] args) {

        // 底层是链表实现的  set集合中唯一能保证怎么存怎么取的对象

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("a2");
        lhs.add("a3");
        lhs.add("a4");
        lhs.add("a6");
        System.out.println(lhs);


    }
}
