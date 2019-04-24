package com.study.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_aslist {


    public static void main(String[] args) {
        demo2();
        int[] arr2 = {1, 2, 3, 4, 5};
        List<int[]> list = Arrays.asList(arr2);
        System.out.println(list);  //内存地址

        demo3();

    }

    private static void demo2() {
        //数组转集合
        String[] arr = {"a", "b", "c"};

        List<String> list = Arrays.asList(arr);

//        list.add("ff");
        System.out.println(list);
    }

    private static void demo3() {
//        集合转数组
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
//        这个长度小于实际长度均可
        String[] arr = list.toArray(new String[1]);
//        System.out.println(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
