package com.study.error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo_error {

    public static void main(String[] args) throws FileNotFoundException {
//        int[] arr = {1, 3, 4, 5, 6};
//        try {
//            System.out.println(arr[5]);
//            System.out.println(10 / 0);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
////            static{
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数");

        while (true) {
            String line = scanner.nextLine();
            try {
                int num = Integer.parseInt(line);
                System.out.println(Integer.toBinaryString(num));
                break;
            } catch (Exception e) {
//                System.out.println("整数过大");
                try {
                    new BigInteger(line);
                    System.out.println("过大整数");
                } catch (Exception el) {
                    try {
                        new BigDecimal(line);
                        System.out.println("小数");
                    } catch (Exception e2) {
                        System.out.println("非法字符");
                    }
                }
            }
        }


    }


}
