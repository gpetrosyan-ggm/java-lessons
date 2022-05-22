package com.demo.progresstests.exam2.exercies19.exercies1951;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел одинаковой длины.
Метод возвращает массив, содержащий значения массивов-параметров, записанные по правилу
«ПО очереди из параллельных ячеею>
Например, для массивов 1, 2, 3, 4 и 6, 7, 8, 9 метод возвращает массив 1, 6, 2, 7, 3, 8, 4, 9.
 */

public class Exercies19_51 {
    int[] massive(int[] arr1, int[] arr2) {
        int[] mas = new int[arr1.length + arr2.length];
        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = arr1[a1];
                a1++;
            } else {
                mas[i] = arr2[a2];
                a2++;
            }
        }
        return mas;
    }
}
