package com.study.file;

import java.io.File;
import java.io.IOException;

public class Demo_file2 {
    public static void main(String[] args) throws IOException {


        File dir3=new File("ccc/ddd");
        System.out.println(dir3.mkdirs()); //没有就创建多级文件夹， 返回true
//        demo2();
//        demo();
    }

    private static void demo2() {
        File file = new File("zzz");
        System.out.println(file.mkdir()); //没有就创建文件夹， 返回true
    }

    private static void demo() throws IOException {
        File file = new File("yyy.txt");
        System.out.println(file.createNewFile());//没有就创建文件 返回true

    }
}
