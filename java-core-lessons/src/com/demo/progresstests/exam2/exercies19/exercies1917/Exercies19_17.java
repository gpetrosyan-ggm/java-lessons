package com.demo.progresstests.exam2.exercies19.exercies1917;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами так, чтобы первая и вторая половины массива были идентичными.
 */


import java.util.Arrays;

public class Exercies19_17 {
    void massiv(int[] arr) {
        int min = 10;
        int max = 99;
        int arrLengt = arr.length / 2;

        int a = arr.length % 2 == 0 ? arrLengt : arrLengt + 1;

        if (arr.length % 2 != 0) {
            arr[arrLengt] = randomVal(max, min);
        }

        for (int i = 0; i < arrLengt; i++) {
            arr[i] = randomVal(max, min);
            arr[a + i] = arr[i];

        }

        System.out.println(Arrays.toString(arr));
    }

    int randomVal(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
