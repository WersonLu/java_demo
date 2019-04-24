package com.study.file;

import java.io.File;

public class Demo_file1 {

    public static void main(String[] args) {

        File parent = new File("F://Workspace/HomeWork/HelloWorld/src");
        String child = "tips.txt";
        File file = new File(parent, child);
        System.out.println(file.exists()); //true
        System.out.println(parent.exists());//true

        demo();
    }

    private static void demo() {
        File file = new File("F:\\Workspace\\HomeWork\\HelloWorld\\src\\tips.txt");
        System.out.println(file.exists());//true

        File file1 = new File("xx.txt");
        System.out.println(file1.exists());//false
    }
}
