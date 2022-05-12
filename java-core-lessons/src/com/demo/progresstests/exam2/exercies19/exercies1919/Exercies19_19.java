package com.demo.progresstests.exam2.exercies19.exercies1919;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так, чтобы они образовывали
возрастающую последовательность (каждый элемент больше предыдущего).
 */

import java.util.Arrays;

public class Exercies19_19 {
    void massiv(int[] arr) {
        int min = 10;
        int max = 99;
        int val = -1;
        for (int i = 0; i < arr.length; i++) {
            val = randomVal(min, max, val);
            arr[i] = val;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    void massiv2(int[] arr) {
        int min = 10;
        int max = 99;
        for (int i = 0; i < arr.length; i++) {
            int val = randomVal(min, max);
            arr[i] = val;
            if (val > min) {
                min = val;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private int randomVal(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private int randomVal(int min, int max, int val) {
        int randomVal = (int) (Math.random() * (max - min + 1) + min);
        while (val == randomVal) {
            randomVal = (int) (Math.random() * (max - min + 1) + min);
        }
        return randomVal;
    }

}
