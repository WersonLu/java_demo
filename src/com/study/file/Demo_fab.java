package com.study.file;

import java.io.File;

public class Demo_fab {
    // java递归
    public static void main(String[] args) {


        int res = 1;
        for (int i = 1; i <= 6; i++) {
            res = res * i;
        }
        System.out.println(res);
        // int 最大值 内存溢出
        int x = fun(12);
        System.out.println(x);

        File file = new File("F:/Workspace");
        getDir(file);

    }

    public static int fun(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fun(num - 1);
        }
    }


    public static void getDir(File dir) {
        //找文件递归
//        File dir=new File(path);
        File[] subFiles = dir.listFiles();
        for (File file : subFiles) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file);
            } else if (file.isDirectory()) {
                getDir(file);
            }
        }

    }
}

