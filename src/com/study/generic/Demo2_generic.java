package com.study.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_generic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
