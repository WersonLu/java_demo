package com.study.file;

import java.io.File;

public class Demo_testfilter {
    public static void main(String[] args) {
        File file = new File("F:\\Workspace\\HomeWork\\HelloWorld");
        Demo_filefilter demo_filefilter = new Demo_filefilter();
        File[] listfiles = file.listFiles(demo_filefilter);
        for (File f : listfiles) {
            System.out.println(f);
        }

    }
}
