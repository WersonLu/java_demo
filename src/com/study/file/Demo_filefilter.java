package com.study.file;

import java.io.File;
import java.io.FileFilter;





public class Demo_filefilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }
}
