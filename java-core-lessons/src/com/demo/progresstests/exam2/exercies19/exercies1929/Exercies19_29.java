package com.demo.progresstests.exam2.exercies19.exercies1929;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел М
и два целых числа К и Т (номера ячеек массива).
Метод возвращает сумму значений, расположенных в ячейках массива от ячейки номер
К - до ячейки номер Т.
 */

public class Exercies19_29 {
    int massive(int[] arr, int k, int t) {
        int sum = 0;
        if (k >= arr.length || t >= arr.length) {
            System.out.print("chkpav  sum = ");
        } else {
            if (k > t) {
                int a = k;
                k = t;
                t = a;

            }
            for (int i = k; i <= t; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }

}
