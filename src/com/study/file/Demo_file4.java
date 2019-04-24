package com.study.file;

import java.io.File;

public class Demo_file4 {
    public static void main(String[] args) {
        File file = new File("yyy.txt");
        System.out.println(file.getAbsolutePath());  //绝对路径
        //F:\Workspace\HomeWork\HelloWorld\yyy.txt
//        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath()); //yyy.txt

        System.out.println(file.getName());  //yyy.txt

        System.out.println(file.length()); //0

//        System.out.println(file.getParent());

        System.out.println(file.lastModified());

        File file1 = new File("D:\\BaiduDownload\\全套");
//        String[] arr = file1.list();  //仅为了获取文件名
//        for (String s : arr) {
//            System.out.println(s);
//        }

        File[] subfiles = file1.listFiles(); //获取文件对象

        for (File file2 : subfiles) {
            System.out.println(file2);
        }
    }

}
