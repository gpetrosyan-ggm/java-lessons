package com.demo.progresstests.exam2.exercies19.exercies1917;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами так, чтобы первая и вторая половины массива были идентичными.
 */
// Sensey amena optimal tarberak@ sa em gtel, tarberak chmnac vor chporcarkem

import java.util.Arrays;

public class Exercies19_17 {
    void massiv(int[] arr) {
        int min = 10;
        int max = 99;
        int a = arr.length / 2;
        if (arr.length % 2 != 0) {
            for (int i = 0; i < a; i++) {
                arr[i] = (int) (Math.random() * (max - min + 1) + min);
                arr[a + 1 + i] = arr[i];
            }
            arr[a] = (int) (Math.random() * (max - min + 1) + min);
        } else {
            for (int i = 0; i < a; i++) {
                arr[i] = (int) (Math.random() * (max - min + 1) + min);
                arr[a + i] = arr[i];
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
