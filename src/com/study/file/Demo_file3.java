package com.study.file;

import java.io.File;
import java.io.IOException;

public class Demo_file3 {
    public static void main(String[] args) throws IOException {

        File file = new File("xxx.txt");
        File file1 = new File("bbb.txt");
//        file.createNewFile();
        //renameTo 路径相同改名
        //renameTo 路径不同 改名剪切
//        System.out.println(file1.renameTo(file));

        //delete 只能删除空文件夹
        System.out.println(file.delete());

    }
}
