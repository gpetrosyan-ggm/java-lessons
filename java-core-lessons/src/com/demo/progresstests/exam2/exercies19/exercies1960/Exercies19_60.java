package com.demo.progresstests.exam2.exercies19.exercies1960;
/*
Напишите метод, который получает в качестве параметров два массива
(не обязательно одинакового размера) целых чисел.
Метод возвращает массив значений, которые присутствуют в первом массиве,
но не присутствуют во втором.

 */
// es inch em arel vor senc 100% e berum

public class Exercies19_60 {
    int[] massive(int[] arr1, int[] arr2) {
        int length = 0;
        boolean b;
        int a = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    length++;
                }
            }
        }
        int[] present = new int[arr1.length - length];

        for (int i = 0; i < arr1.length; i++) {
            b = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    b = false;
                }
            }
            if (b == true) {
                present[a] = arr1[i];
                a++;
            }

        }
        return present;
    }
}
