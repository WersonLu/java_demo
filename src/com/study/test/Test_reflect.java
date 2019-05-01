package com.study.test;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.IOException;

//通过反射创建对象
public class Test_reflect {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));
        Class clzss = Class.forName(br.readLine());
        DemoClass dc = (DemoClass) clzss.newInstance();
        dc.run();

    }
}
