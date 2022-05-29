package com.demo.progresstests.exam2.exercies19.exercies1970;
/*
Массив целых чисел размером N называется полным, если он содержит все числа от
1 до N включительно. Напишите метод, который принимает в качестве параметра массив
и проверяет, является ли он полным.
 */

import java.util.Arrays;

public class Exercies19_70 {
    boolean massive(int[] arr) {
        boolean b = true;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                b = false;
                break;
            }
        }
        return b;
    }
}
