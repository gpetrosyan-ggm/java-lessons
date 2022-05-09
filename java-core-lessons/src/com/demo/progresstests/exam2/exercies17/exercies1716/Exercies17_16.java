package com.demo.progresstests.exam2.exercies17.exercies1716;
/*
Напишите метод, который получает в качестве параметра целое положительное число.
Метод возвращает крайнюю левую цифру числа.

 */

public class Exercies17_16 {
    int leftNumber(int num) {
        while (num > 9) {
            num /= 10;
        }
        return num;
    }
}
