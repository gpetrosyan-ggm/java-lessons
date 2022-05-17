package com.demo.progresstests.exam2.exercies19.exercies1910;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, каждое из которых делится на 3 с остатком 1.
 */

import java.util.Arrays;

public class Exercies19_10 {
    void massive(int arr[]) {
        int min = 10;
        int max = 99;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomVal(max, min);
        }
        System.out.println(Arrays.toString(arr));
    }

    int randomVal(int max, int min) {
        int val = (int) (Math.random() * (max - min + 1) + min);
        while (val % 3 != 1) {
            val = (int) (Math.random() * (max - min + 1) + min);
        }
        return val;
    }
}
