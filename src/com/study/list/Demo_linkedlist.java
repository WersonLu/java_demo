package com.study.list;

import java.util.LinkedList;

public class Demo_linkedlist {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst("a");
        list.addFirst("a2");
        list.addFirst("a3");
        list.addFirst("a4");
        list.addFirst("a5");
        System.out.println(list);
        System.out.println(list.removeFirst());

    }
}
