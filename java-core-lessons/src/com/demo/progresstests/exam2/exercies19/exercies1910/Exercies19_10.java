package com.demo.progresstests.exam2.exercies19.exercies1910;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, каждое из которых делится на 3 с остатком 1.
 */

public class Exercies19_10 {
    void massive(int arr[]) {
        int min = 10;
        int max = 99;
        int count = 0;
        for (int i = 0; ;) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            if (arr[i] % 3 == 1) {
                System.out.print(arr[i] + " ");
                count++;
            }
            if (arr.length == count) {
                break;
            }
        }
    }
}
