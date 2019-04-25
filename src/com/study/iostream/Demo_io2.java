package com.study.iostream;

import java.io.*;

public class Demo_io2 {

    public static void main(String[] args) throws IOException {
        System.out.println("sss");
        copy_sa();
//        return;

    }

    private static void copy_sa() throws IOException {
//        解密
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy7.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy8.txt"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b ^ 123);
        }

        bis.close();
        bos.close();
    }

    private static void copy_sally() throws IOException {
        //拷贝时加密
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("yyy.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy7.txt"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b ^ 123);
        }

        bis.close();
        bos.close();
    }

    private static void copy5() throws IOException {
        // 效率更高的拷贝
        FileInputStream fis = new FileInputStream("yyy.txt");
        FileOutputStream fos = new FileOutputStream("copy4.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
//        bis.close();
        bos.close();
    }

    private static void demo3() throws IOException {
//        一次性读取写入，速度快   不安全

        FileInputStream fis = new FileInputStream("yyy.txt");
//        输出流
        FileOutputStream fileOutputStream = new FileOutputStream("copy2.txt");

//        int len = fis.available();
//        System.out.println(len);
//        跟文件大小一样的数组
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        fileOutputStream.write(arr);
        fis.close();
        fileOutputStream.close();
    }

    private static void copy() throws IOException {
        //文件拷贝  效率慢

        //输入流
        FileInputStream fis = new FileInputStream("yyy.txt");
//        输出流
        FileOutputStream fileOutputStream = new FileOutputStream("copy.txt");

        int b;
        while ((b = fis.read()) != -1) {
            fileOutputStream.write(b);
        }
        fis.close();
        fileOutputStream.close();
    }

    private static void demo() throws IOException {
        //        字节写出
        //写出int数， 去除前三个8位ascii码转为
        // 追加模式
        FileOutputStream fos = new FileOutputStream("yyy.txt", true);
        fos.write(97);
        fos.write(98);
        fos.write(100);
        fos.close();
    }
}
