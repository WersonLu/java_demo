package com.study.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo_io3 {
    public static void main(String[] args) throws IOException {

        //行号读取
        LineNumberReader inr = new LineNumberReader(new FileReader("str.txt"));
        String line;
        while ((line = inr.readLine()) != null) {

            System.out.println(inr.getLineNumber() + ":" + line);
        }
        inr.close();
    }
}
