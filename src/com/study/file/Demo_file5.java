package com.study.file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo_file5 {
    public static void main(String[] args) {

        File file = new File("D:\\");
//        String[] arr = file.list();
//        for (String s : arr) {
//            System.out.println(s);
//        }
//        File[] subfiles = file.listFiles();
//        for (File subFile : subfiles) {
//            if (subFile.isFile() && subFile.getName().endsWith(".jpg")) {
//                System.out.println(subFile);
//            }
//        }
        String[] arr = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
//                System.out.println(name);
                File file1 = new File(dir, name);
                return file1.isFile() && file1.getName().endsWith(".jpg");
            }
        });
        for (String string : arr) {
            System.out.println(string);
        }

    }
}
