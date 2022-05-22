package com.demo.progresstests.exam2.exercies19.exercies1943;
/*
Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива
и возвращает упорядоченный по возрастанию массив, содержащий значения обоих массивов-параметров,
но без повторов значений.
Например, если массивы-параметры содержат 1, 3, 5, 7 и 2, 5, 7, 9, 11, т
о выходной массив содержит значения 1, 2, 3, 5, 7, 9, 11.
 */

import java.util.Arrays;

public class Exercies19_43 {
    int[] massive(int[] arr1, int[] arr2) {
        int k = 0;
        int a = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }


            }
        }

        int[] revers1 = new int[arr1.length + arr2.length];

        for (int i = 0; i < (arr1.length + arr2.length); i++) {
            if (i < arr1.length) {
                revers1[i] = arr1[i];
            } else {
                revers1[i] = arr2[k];
                k++;
            }
        }
        Arrays.sort(revers1);
        int[] revers = new int[arr1.length + arr2.length - count];
        revers[0] = revers1[0];
        for (int i = 1; i < revers1.length; i++) {
            if (revers1[i] != revers1[i - 1]) {
                revers[i - a] = revers1[i];
            } else {
                a++;
            }

        }
        return revers;
    }

}
