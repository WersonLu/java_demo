package com.study.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_io {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("yyy.txt");

        int b;
        //读取的字节，返回int，而不是bytes
        while ((b = fileInputStream.read()) != -1) {
            System.out.println(b);
        }
        fileInputStream.close();
    }
}
