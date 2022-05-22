package com.demo.progresstests.exam2.exercies19.exercies1957;
/*
Напишите метод, который получает в качестве параметров целое число Х и массив целых чисел А.
Метод возвращает массив, состоящий из тех значений массива А, которые меньше значения Х.
 */

public class Exercies19_57 {
    int[] massive(int x, int[] arr) {
        int lengt = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                lengt++;
            }

        }
        int[] smaller = new int[lengt];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                smaller[a] = arr[i];
                a++;
            }
        }
        return smaller;
    }
}
