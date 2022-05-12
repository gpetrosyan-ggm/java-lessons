package com.demo.progresstests.exam2.exercies19.exercies1916;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами так, чтобы значение первого элемента было равно
значению последнего, значение второго элемента было равно значению предпоследнего и так далее.
 */

import java.util.Arrays;

public class Exercies19_16 {
    public static void masive(int[] arr) {
        int min = 10;
        int max = 99;
        int a = arr.length / 2;
        for (int i = 0; i < a; i++) {

            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            arr[arr.length - 1 - i] = arr[i];

        }
        if (arr.length % 2 != 0) {
            arr[a] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println(Arrays.toString(arr));
    }

}
