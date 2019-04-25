package com.study.iostream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_iocn {

    public static void main(String[] args) throws IOException {
//        demo3();
//        return;
        try (
                FileInputStream fileInputStream = new FileInputStream("yyy.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("yyy2.txt");
        ) {
            int b;
            while ((b = fileInputStream.read()) != -1) {
                fileOutputStream.write(b);
            }
        }


    }

    private static void demo3() throws IOException {
        //      字节流  写入中文，必须要转字节数组

        FileOutputStream fos = new FileOutputStream("yyy.txt", true);
        fos.write("\r\n".getBytes());
        fos.write("我读书少".getBytes());


        fos.close();
    }

    private static void demo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("yyy.txt");
        byte[] arr = new byte[3];
        int leb;
        while ((leb = fileInputStream.read(arr)) != -1) {
            System.out.println(new String(arr, 0, leb));
        }
        fileInputStream.close();
    }
}
