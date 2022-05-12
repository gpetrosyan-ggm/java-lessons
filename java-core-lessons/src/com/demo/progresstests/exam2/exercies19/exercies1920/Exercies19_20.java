package com.demo.progresstests.exam2.exercies19.exercies1920;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так,
чтобы значения элементов в массиве не повторялись.
 */

import java.util.Arrays;

public class Exercies19_20 {
    void massive(int[] arr) {
        int min = 10;
        int max = 99;
        arr[0] = (int) (Math.random() * (max - min + 1) + min);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            for (int j = (i - 1); j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    i -= 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
