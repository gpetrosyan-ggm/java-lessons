package com.demo.progresstests.exam2.exercies19.exercies1942;
/*
Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива
и возвращает упорядоченный по возрастанию массив,
содержащий все значения обоих массивов-параметров.
 */

public class Exercies19_42 {
    int[] masive(int[] arr1, int[] arr2) {
        int[] revers = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            revers[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            revers[arr1.length + i] = arr2[i];
        }

        return revers;
    }
}
