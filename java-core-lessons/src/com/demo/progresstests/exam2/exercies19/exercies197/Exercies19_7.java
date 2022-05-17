package com.demo.progresstests.exam2.exercies19.exercies197;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его случайными
числами в диапазоне О...99.
 */

import java.util.Arrays;

public class Exercies19_7 {
    void massiv(int arr[]) {
        int max = 99;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomVal(max, min);
        }
        System.out.println(Arrays.toString(arr));
    }

    int randomVal(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
