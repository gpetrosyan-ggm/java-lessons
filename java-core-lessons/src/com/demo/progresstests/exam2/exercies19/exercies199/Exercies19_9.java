package com.demo.progresstests.exam2.exercies19.exercies199;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными четными числами.
 */

public class Exercies19_9 {
    void massive(int arr[]) {
        int min = 10;
        int max = 99;
        int count = 0;
        for (int i = 0; ; ) {
             arr[i] = (int) (Math.random() * (max - min + 1) + min);
             // qani vor shat erkar er dra hamar if()-ic haneci, vor hamel el haskacvi vor masivi elementa
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
            if (count == arr.length) {
                break;
            }
        }
    }
}
