package com.study.iostream;


import java.io.*;

// 码表转换
public class Demo_io4 {
    public static void main(String[] args) throws IOException {
        demo();



    }

    private static void demo() throws IOException {
        //指定码表 读写字符
        InputStreamReader isr = new InputStreamReader(new FileInputStream("str.txt"), "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("str_.txt"), "utf-8");
        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }
        isr.close();
        osw.close();
    }
}
