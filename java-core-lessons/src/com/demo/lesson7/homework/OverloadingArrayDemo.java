package com.demo.lesson7.homework;

import java.util.Arrays;

public class OverloadingArrayDemo {
    public static void main(String[] args) {
        OverloadingArray arr = new OverloadingArray();
        double[] arr1 = {4, 6.7, 12.3};
        arr.array(arr1);
        long[] arr2 = {74, 124};
        arr.array(arr2);
        double[][] arr3 = {{34, 67.2}, {45, 6}};
        arr.array(arr3);
        long[][] arr4 = {{34, 67, 2}, {45, 6}};
        arr.array(arr4);
        //esi uxaki porcarkum em arel for-each hamar
        int[][][] arr5 = {{{1, 2, 3}}, {{4, 5 , 6} , {7, 8 , 9}}};
        arr.array(arr5);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(Arrays.toString(arr4[i]));
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
        for (double x : arr1) {
            System.out.print(x + " ");

        }
        System.out.println();
        for (long x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (double x[] : arr3) {
            for (double y : x) {
                System.out.print(y + " ");
            }
        }
        System.out.println();
        for (long x[] : arr4) {
            for (long y : x) {
                System.out.print(y + " ");
            }
        }
        System.out.println();
        for (int i[][]: arr5){
            for (int j[] : i){
                for(int k : j){
                    System.out.print(k + " ");
                }
            }
        }
    }
}
