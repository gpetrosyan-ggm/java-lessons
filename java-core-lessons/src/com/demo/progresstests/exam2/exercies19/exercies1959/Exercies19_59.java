package com.demo.progresstests.exam2.exercies19.exercies1959;
/*
Напишите метод, который получает в качестве параметров два массива
(не обязательно одинакового размера, состоящие из неповторяющихся элементов) целых чисел.
Метод возвращает массив значений, которые присутствуют и в первом массиве, и во втором.
 */

public class Exercies19_59 {
    int[] massive(int[] arr1, int[] arr2) {
        int length = 0;
        int a = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    length++;
                }
            }
        }
        int[] present = new int[length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    present[a] = arr1[i];
                    a++;
                }
            }
        }
        return present;
    }
}
