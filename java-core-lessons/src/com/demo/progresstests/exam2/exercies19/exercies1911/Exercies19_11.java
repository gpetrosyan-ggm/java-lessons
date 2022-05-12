package com.demo.progresstests.exam2.exercies19.exercies1911;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, у каждого из которых цифра десятков равна цифре единиц.
 */

public class Exercies19_11 {
    void massive(int arr[]) {
        int min = 10;
        int max = 99;
        int continu = 0;
        for (int i = 0; ; ) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            if (arr[i] / 10 == arr[i] % 10) {
                System.out.print(arr[i] + " ");
                continu++;
            }
            if (continu == arr.length) {
                break;
            }
        }
    }
}
