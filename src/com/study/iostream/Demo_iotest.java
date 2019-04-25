package com.study.iostream;

import java.io.*;
import java.util.Scanner;

public class Demo_iotest {
    //键盘输入文件， 把文件复制到项目路径
    public static void main(String[] args) throws IOException {

        File file = getFile();
        System.out.println(file);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
        System.out.println("搞完了");


    }

    public static File getFile() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            File file = new File(s);
            if (!file.exists()) {
                System.out.println("文件不存在");
            } else if (file.isDirectory()) {
                System.out.println("这是文件夹");
            } else {
                return file;
            }

        }


    }
}
