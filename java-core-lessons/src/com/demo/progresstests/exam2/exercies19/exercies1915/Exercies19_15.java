package com.demo.progresstests.exam2.exercies19.exercies1915;
/*
Напишите метод, который получает в качестве параметра массив и дополнительный параметр S.
Метод сначала заполняет четные ячейки массива двузначными положительными случайными числами.
Затем нечетные ячейки метод заполняет так, чтобы сумма значений в нечетной ячейке
и в предшествующей ей четной ячейке была равна S. Каким условиям должен отвечать
параметр S для того, чтобы задача имела решение?
 */

import java.util.Arrays;

public class Exercies19_15 {
    void massive(int arr[], int s) {
        int min = 10;
        int max = 99 - s;

        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            if (i <= arr.length - 2) {
                arr[i + 1] = arr[i] + s;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
