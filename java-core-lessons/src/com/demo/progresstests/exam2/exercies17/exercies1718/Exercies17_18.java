package com.demo.progresstests.exam2.exercies17.exercies1718;
/*
Назовем «большим обменом» операцию, при которой два числа «обмениваются» своими левыми цифрами.
1. Напишите класс, который принимает с клавиатуры два трехзначных положительных числа
   и совершает над ними операцию «обмена».
2. Напишите класс, который принимает с клавиатуры два целых положительных числа
   и совершает над ними операцию «обмена».
 */

public class Exercies17_18 {

    public void threeDigit(int num1, int num2) {
        int a = num1;
        int b = num2;
        a /= 100;
        b /= 100;
        num1 = num1 % 100 + b * 100;
        num2 = num2 % 100 + a * 100;

        System.out.print(num1 + " " + num2);
        System.out.println();
    }

    public void exchange(int num1, int num2) {
        int a = num1;
        int a1 = num1;
        int b = num2;

        int count2 = 1;
        int count1 = 1;
        while (num1 > 9) {
            num1 /= 10;
            count1 *= 10;
        }
        while (num2 > 9) {
            num2 /= 10;
            count2 *= 10;
        }
        a = a % count1 + b / count2 * count1;
        b = b % count2 + a1 / count1 * count2;
        System.out.print(a + " " + b);
    }
}
