package com.study.test;

import java.util.*;

// 几个小练习

public class Test1 {
    public static void main(String[] args) {
//        demo1()0;
//        demo2();
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("cc");
        list.add("aa");
        list.add("dd");
        list.add("aa");
        list.add("bb");
        list.add("ff");
        System.out.println(list);
        demo3(list);
        System.out.println(list);

//        demo22();
    }




    private static void demo3(List<String> list) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);

    }

    //字符串去重
    public static void getSingle() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        System.out.println(list);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(list);
        list.clear();
        list.addAll(linkedHashSet);
//        return list;


    }

    //键盘输入字符串去重
    private static void demo2() {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>();
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        for (char c : arr) {
            hs.add(c);
        }
        System.out.println(hs);
    }

    private static void demo1() {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();

        while (hs.size() < 10) {
            hs.add(r.nextInt(20) + 1);
        }

        System.out.println(hs);
    }
}
