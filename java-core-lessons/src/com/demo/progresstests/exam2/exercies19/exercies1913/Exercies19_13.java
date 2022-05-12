package com.demo.progresstests.exam2.exercies19.exercies1913;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами, у каждого из которых сумма цифр делится на 9 без остатка.
 */

public class Exercies19_13 {
    public void massive(int arr[]) {
        int min = 10;
        int max = 99;
        int count = 0;
        for (int i = 0; ; ) {

            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            int arr1 = arr[i] / 10;
            int arr2 = arr[i] % 10;
            int arr3 = arr1 + arr2;

            if (arr3 % 9 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
            if (count == arr.length) {
                break;
            }
        }
    }
}
