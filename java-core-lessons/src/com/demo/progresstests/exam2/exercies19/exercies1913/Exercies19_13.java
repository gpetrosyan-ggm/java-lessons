package com.demo.progresstests.exam2.exercies19.exercies1913;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, у каждого из которых сумма цифр делится на 9 без остатка.
 */

import java.util.Arrays;

public class Exercies19_13 {
    public void massive(int arr[]) {
        int min = 10;
        int max = 99;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomVal(min, max);
        }
        System.out.println(Arrays.toString(arr));
    }

    int randomVal(int min, int max) {
        int val = (int) (Math.random() * (max - min + 1) + min);

        int val3 = val / 10 + val % 10;
        while (val3 % 9 != 0) {

            val = (int) (Math.random() * (max - min + 1) + min);
            val3 = val / 10 + val % 10;
        }
        return val;
    }
}
