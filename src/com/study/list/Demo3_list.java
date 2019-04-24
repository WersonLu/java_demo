package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_list {
    // 判断集合 有没有这个原属
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("world");

//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//        // String str=it.next(); //此时集合里是对象，不是字符串
//            String str = (String) it.next();
//            if ("world".equals(str)) {
//                list.add("hello");  //并发修改错误
//            }
//        }

        //LIST 集合特有的迭代方法
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            // String str=it.next(); //此时集合里是对象，不是字符串
            String str = (String) lit.next();
            if ("world".equals(str)) {
                lit.add("hello");   //可以正常修改
            }
        }

        System.out.println(list);

    }
}
