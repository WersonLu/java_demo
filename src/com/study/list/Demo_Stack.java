package com.study.list;

import com.study.bean.Stack;

import java.util.LinkedList;

public class Demo_Stack {
    //模拟栈   先进后出
    public static void main(String[] args) {
        Stack s=new Stack();
        s.in("a");
        s.in("a1");
        s.in("a2");
        s.in("a3");
        s.in("a4");
        while (!s.isEmpty()){
            System.out.println(s.mout());
        }
//        LinkedList list = new LinkedList();
//        list.addLast("a");
//        list.addLast("a1");
//        list.addLast("a2");
//        list.addLast("a3");
//        list.addLast("a4");
//        System.out.println(list);
////        System.out.println(list.removeLast());
//        while (!list.isEmpty()) {
//            System.out.println(list.removeLast());
//        }
    }
}
