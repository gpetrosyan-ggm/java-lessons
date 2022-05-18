package com.demo.progresstests.exam2.exercies19.exercies1942;
/*
Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива
и возвращает упорядоченный по возрастанию массив,
содержащий все значения обоих массивов-параметров.
 */

import java.util.Arrays;

public class Exercies19_42 {
    int[] masive(int[] arr1, int[] arr2) {
        int[] revers = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            revers[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            revers[arr1.length + i] = arr2[i];
        }
        Arrays.sort(revers);
        return revers;
    }


    int[] masive2(int[] arr1, int[] arr2) {
        int[] revers = new int[arr1.length + arr2.length];

        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < revers.length; i++) {
            if (a2 >= arr2.length || (a1 < arr1.length && arr1[a1] <= arr2[a2])) {
                revers[i] = arr1[a1];
                a1++;
            } else {
                revers[i] = arr2[a2];
                a2++;
            }
        }
        return revers;
    }
}
