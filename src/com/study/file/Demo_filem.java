package com.study.file;

import java.io.File;

public class Demo_filem {
    public static void main(String[] args) {

        File dir = new File("ccc");
        System.out.println(dir.isDirectory()); //文件夹 true

        File dir2 = new File("zzz2");
        System.out.println(dir2.isDirectory());

        System.out.println(dir.isFile()); //文件

        File dir3 = new File("yyy.txt");
        dir3.setReadable(false);  //window 一切文件可读
        dir3.setWritable(false); //window 可设置不可写
        System.out.println(dir3.isFile());
        System.out.println(dir3.canRead());
        System.out.println(dir3.canWrite());



    }
}
