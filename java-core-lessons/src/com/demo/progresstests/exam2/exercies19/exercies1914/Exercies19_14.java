package com.demo.progresstests.exam2.exercies19.exercies1914;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так, чтобы цифра десятков каждого элемента
массива была равна цифре единиц следующего элемента.
 */

import java.util.Arrays;

public class Exercies19_14 {
    void massive(int arr[]) {
        int min = 10;
        int max = 99;
        arr[0] = (int) (Math.random() * (max - min + 1) + min);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = randomVal(max, min);

            while (arr[i - 1] / 10 != arr[i] % 10) {
                arr[i] = randomVal(max, min);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    int randomVal(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}
