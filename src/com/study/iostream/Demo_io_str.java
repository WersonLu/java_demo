package com.study.iostream;


//import java.io.FileNotFoundException;

import java.io.*;

//字符流
// gbk 码表 把字节转换为字符

public class Demo_io_str {
    public static void main(String[] args) throws IOException {
//        demo7();
//        return;


    }

    private static void demo7() throws IOException {
        //逐行 拷贝
        BufferedReader br = new BufferedReader(new FileReader("str.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("str_copy4.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();  //必须手动换行   跨平台支持
        }
        br.close();
        bw.close();
    }

    private static void demo6() throws IOException {
        //逐行读取
        BufferedReader br = new BufferedReader(new FileReader("str.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    private static void demo5() throws IOException {
        // 带缓冲区的字符流拷贝
        BufferedReader br = new BufferedReader(new FileReader("str.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("str_copy3.txt"));
        int c;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }
        br.close();
        bw.close();
    }

    private static void demo4() throws IOException {
        //        自定义数组拷贝
        FileReader fr = new FileReader("str.txt");
        FileWriter fw = new FileWriter("str_copy2.txt");
        char[] arr = new char[1024];
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(arr, 0, len);
        }
        fr.close();
        fw.close();
    }

    private static void demo3() throws IOException {
        // 字符流的文件拷贝
        FileReader fr = new FileReader("str.txt");
        FileWriter fw = new FileWriter("str_copy.txt");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();  //writer 类自带2k缓冲区
    }

    private static void demo2() throws IOException {
        //字符串转为字节数组，通过 编码表翻译
        // 字符写入
        FileWriter fw = new FileWriter("str.txt", true);
        fw.write("大家好");
        fw.write(97);
        fw.close();
    }

    private static void demo1() throws IOException {
        //一次性读出字符
        FileReader fileReader = new FileReader("copy8.txt");
        int c;
        while ((c = fileReader.read()) != -1) {
            System.out.println((char) c);
        }
        fileReader.close();
    }

    private static void demo() throws IOException {
        FileReader fileReader = new FileReader("copy8.txt");
        int x = fileReader.read();
        System.out.println(x);
        char c = (char) x;
        System.out.println(c);
        fileReader.close();
    }

}
