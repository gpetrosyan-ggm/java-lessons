package com.demo.progresstests.exam2.exercies19.exercies1912;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, у каждого из которых цифра десятков больше цифры единиц.
 */

public class Exercies19_12 {
    void massive(int arr[]) {
        int min = 10;
        int max = 98;
        int count = 0;
        for (int i = 0; ; ) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            if (arr[i] / 10 > arr[i] % 9) {
                System.out.print(arr[i] + " ");
                count++;
            }
            if (count == arr.length) {
                break;
            }
        }
    }
}
