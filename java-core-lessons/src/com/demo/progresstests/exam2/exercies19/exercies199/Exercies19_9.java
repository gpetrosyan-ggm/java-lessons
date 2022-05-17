package com.demo.progresstests.exam2.exercies19.exercies199;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными четными числами.
 */

import java.util.Arrays;

public class Exercies19_9 {
    void massive(int arr[]) {
        int min = 10;
        int max = 99;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(max, min);
        }
        System.out.println(Arrays.toString(arr));

    }

    int random(int max, int min) {
        int val = (int) (Math.random() * (max - min + 1) + min);
        if (val % 2 != 0) {
            while (val % 2 != 0) {
                val = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return val;
    }
}
