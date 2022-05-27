package com.demo.progresstests.exam2.exercies19.exercies1970;
/*
Массив целых чисел размером N называется полным, если он содержит все числа от
1 до N включительно. Напишите метод, который принимает в качестве параметра массив
и проверяет, является ли он полным.
 */

public class Exercies19_70 {
    boolean massive(int[] arr) {
        boolean b = false;
        int n = arr.length / 2;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = n; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        b = true;
                        break;
                    }
                }
                if (b == false) {
                    break;
                }
            }
        }
        return b;
    }
}
