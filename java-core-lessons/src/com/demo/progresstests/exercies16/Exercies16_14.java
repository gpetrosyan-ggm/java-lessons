package com.demo.progresstests.exercies16;
/*
Напишите класс, который выводит на экран все простые трехзначные числа.
Класс также должен определить количество и сумму этих чисел.
 */

public class Exercies16_14 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 100; i < 1000; i++) {

            int x = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    x++;
                }
            }
            if (x == 0) {
                sum += i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println(sum + " " + count);
    }
}
