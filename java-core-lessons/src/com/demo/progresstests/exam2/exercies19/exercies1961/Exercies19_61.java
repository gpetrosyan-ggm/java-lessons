package com.demo.progresstests.exam2.exercies19.exercies1961;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел.
Метод возвращает массив, в котором значения из массива-параметра записаны по принципу
«каждое значение - только один раз».
Например, для массива-параметра 1, 1, 3, 4, 2, 2, 6, 7, 1 будет возвращен массив 1, 3, 4, 2, 6, 7.
 */

import java.util.Arrays;

public class Exercies19_61 {
    int[] massive(int[] arr) {
        int length = 0;
        int a = 1;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    length++;
                    break;
                }
            }

        }
        int[] present = new int[arr.length - length];
        present[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                present[a] = arr[i];
                a++;
            }


        }
        return present;
    }
}
