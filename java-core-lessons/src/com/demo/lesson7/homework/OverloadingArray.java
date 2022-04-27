package com.demo.lesson7.homework;
/*
Սարքել Overloading method֊ներ որը կընդունի որպես արգումենտ array (մասիվ)
    1. double տեսակի միաչափ (double[])  և կտպի պարունակություն
    2. long տեսակի միաչափ (long[])  և կտպի պարունակություն
    3. double տեսակի արկչափ (double[][])  և կտպի պարունակություն
    4. long տեսակի արկչափ (long[][])  և կտպի պարունակություն
 */

import java.util.Arrays;

public class OverloadingArray {
    void array(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (double x : array) {
            System.out.print(x + "; ");
        }
    }
    void array(long[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    void array(double[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
    void array(long[][] array) {
        System.out.println();
        for (long x[] : array) {
            for (long y : x) {
                System.out.print(y + " ");
            }
        }
    }
}