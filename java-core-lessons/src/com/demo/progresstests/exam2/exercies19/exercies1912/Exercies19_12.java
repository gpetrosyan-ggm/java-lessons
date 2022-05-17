package com.demo.progresstests.exam2.exercies19.exercies1912;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, у каждого из которых цифра десятков больше цифры единиц.
 */

import java.util.Arrays;

public class Exercies19_12 {
    void massive(int arr[]) {
        int min = 10;
        int max = 98;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomVal(max, min);
        }
        System.out.println(Arrays.toString(arr));
    }

    int randomVal(int max, int min) {
        int val = (int) (Math.random() * (max - min + 1) + min);
        while (val / 10 <= val % 10) {
            val = (int) (Math.random() * (max - min + 1) + min);
        }
        return val;
    }
}
