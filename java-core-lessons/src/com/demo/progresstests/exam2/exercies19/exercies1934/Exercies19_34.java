package com.demo.progresstests.exam2.exercies19.exercies1934;
/*
Напишите метод, который принимает в качестве параметра массив
целых чисел и возвращает число ячеек массива, содержащих значения
большие среднего арифметического массива.

 */

import java.util.Arrays;

public class Exercies19_34 {
    int massive(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double medium = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > medium) {
                count++;

            }

        }
        return count;
    }


}
