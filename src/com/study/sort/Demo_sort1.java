package com.study.sort;

import java.util.Arrays;

public class Demo_sort1 {
    public static void main(String[] args) {

//        demo();
        int[] arr = {23, 45, 35, 56, 12, 32};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        Arrays.binarySearch(arr,56);
    }

    private static void demo() {
        // 冒泡排序
        int[] arr = {23, 45, 35, 56, 12, 32};
        System.out.println(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
