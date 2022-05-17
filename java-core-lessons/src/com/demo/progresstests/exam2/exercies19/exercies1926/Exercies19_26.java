package com.demo.progresstests.exam2.exercies19.exercies1926;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел М
и целое число Х и проверяет, встречается ли в массиве пара чисел,
произведение которых равно Х (эти числа необязательно расположены в смежных ячейках).
 */

public class Exercies19_26 {
    void massive(int[] arr, int x) {
        boolean total = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[i] * arr[j] == x) {
                    total = true;
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
