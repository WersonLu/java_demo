package com.study.forloop;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_for_Delete {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("b");
        list.add("e");
        list.add("gg");

        // 1，普通for 循环删除元素 索引--
        for (int i = 0; i < list.size(); i++) {
            if ("a2".equals(list.get(i))) {
                list.remove(i--);
            }
        }
        System.out.println(list);

        //2, 迭代器删除
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            if ("b".equals(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println(list);
       //2.1 迭代器 for循环
        for(Iterator<String> it2=list.iterator();it2.hasNext();){
            if ("e".equals(it2.next())){
                it2.remove();
            }
        }
        System.out.println(list);

        //3.增强for循环删除   无法删除
        for(String  string:list){
            if ("gg".equals(string)){
                list.remove("gg");
            }
        }
    }
}
