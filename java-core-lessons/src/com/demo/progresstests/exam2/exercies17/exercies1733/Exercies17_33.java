package com.demo.progresstests.exam2.exercies17.exercies1733;
/*
Напишите метод, который принимает в качестве параметров целое число Х и цифру D.
Метод возвращает количество цифр D в числе Х.
Например, для числа 765672 и цифры 7 метод возвращает значение 2.
 */

public class Exercies17_33 {
    int countNum(int x, int d) {
        int count = 0;
        while (x > 0) {
            if (x % 10 == d) {
                count++;
            }
            x /= 10;
        }
        return count;
    }
}
