package com.study.stringbuffer;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo_str1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);




    }

    private static void demo6() {
        // 自己实现数组转字符串
        int[] arr = {1, 2, 3, 56, 7};
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            //sb.append(arr[i]+",");
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
//        sb.append("]");

        System.out.println(sb);
    }

    private static void demo5() {
        // stringbuffer  string 相互转换
        // string=> stringbuffer    构造，append 方法
        StringBuffer sb = new StringBuffer("xiaomi");
        System.out.println(sb);

        //stringbuffer =>string

        System.out.println(sb.toString());
        System.out.println(sb.substring(0, sb.length()));
    }

    private static void demo4() {

        // 截取操作
        StringBuffer sb = new StringBuffer("huawei");
        String str = sb.substring(3); // 截取  不该变原有的
        System.out.println(sb);

        String string = sb.substring(1, 4); //截取  不该变原有的
        System.out.println(string);
        System.out.println(sb);
    }

    private static void demo3() {
        // 替换 反转
        StringBuffer sb = new StringBuffer("huawei");
        sb.replace(0, 3, "bai");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }

    private static void demo2() {
        StringBuffer sb = new StringBuffer("123");
        sb.insert(3, "你好");
        System.out.println(sb);  //123你好

        StringBuffer sb2 = new StringBuffer("123");
        sb2.append("wers");
        System.out.println(sb2); //123wers
        sb2.deleteCharAt(4);  //索引删除
        System.out.println(sb2);//123wrs
        sb2.delete(0, sb2.length());
        System.out.println(sb2);  // 清空缓冲区
    }

    private static void demo() {
        StringBuffer sb = new StringBuffer();
        sb.append("aaa");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());  // 默认的初始容量


        StringBuffer sb1 = new StringBuffer(10);
        System.out.println(sb1.capacity()); //初始化指定容量

        StringBuffer sb2 = new StringBuffer();

        // 字符串缓冲区，再堆内存创建一个对象，底层时长度16的字符数组，调用添加方法时，不会创建新对象
        StringBuffer sb3 = sb2.append(true);
        StringBuffer sb4 = sb3.append("广州");

        // 如果sb4 时new出来的，就是独立空间
        System.out.println(sb3); //true广州
        System.out.println(sb4);//true广州
    }
}
