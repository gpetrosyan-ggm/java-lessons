package com.demo.progresstests.exam2.exercies19.exercies1946;

import java.util.Arrays;

/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и дополнительное целое число К. Если К положительное, метод производит К правых сдвигов,
если К отрицательное, - метод производит К левых сдвигов.

 */
public class Exercies19_46 {
    void massive(int[] arr, int k) {
        int[] shift = new int[arr.length];
        if (k >= 0) {
            int length = arr.length - 1;
            for (int i = 0; i < length; i++) {
                shift[i + 1] = arr[i];
            }
            shift[0] = arr[arr.length - 1];

        } else {
            for (int i = 1; i < arr.length; i++) {
                shift[i - 1] = arr[i];
                shift[arr.length - 1] = arr[0];
            }
        }
        System.out.println(Arrays.toString(shift));
    }
}
