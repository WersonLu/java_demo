package com.study.iostream;

//import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo_iotest2 {
    public static void main(String[] args) throws IOException {
//        通过键盘录入写入文件
        Scanner s = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("test.txt");

        while (true) {
            String sc = s.nextLine();
            if ("quit".equals(sc)) {
                break;
            }
            fos.write(sc.getBytes());
            fos.write("\r\n".getBytes());
        }

    }
}
