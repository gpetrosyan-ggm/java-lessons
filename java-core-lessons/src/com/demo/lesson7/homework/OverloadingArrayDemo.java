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
    }
}
