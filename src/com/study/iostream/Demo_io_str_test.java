package com.study.iostream;

import java.io.*;
import java.util.ArrayList;

public class Demo_io_str_test {

    public static void main(String[] args) throws IOException {
        //逐行 拷贝
        BufferedReader br = new BufferedReader(new FileReader("str.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("str_copy5.txt"));

        for (int i = list.size() - 1; i >= 0; i++) {
            bw.write(list.get(i));
            bw.newLine();
        }

        bw.close();


    }
}
