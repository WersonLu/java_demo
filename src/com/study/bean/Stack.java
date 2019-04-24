package com.study.bean;

import java.util.LinkedList;

public class Stack {
    private LinkedList list = new LinkedList();

    public void in(Object obj) {
        list.addLast(obj);
    }

    public Object mout(){
        return list.removeLast();
    }

    public Boolean isEmpty(){
        return list.isEmpty();
    }

}
