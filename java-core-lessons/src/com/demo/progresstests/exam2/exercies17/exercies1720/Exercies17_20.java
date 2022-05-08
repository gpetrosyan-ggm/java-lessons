package com.demo.progresstests.exam2.exercies17.exercies1720;
/*
Напишите метод, который принимает в качестве параметра целое число и выводит на экран
в одну строку через пробел все делители этого числа (не считая 1 и самого числа).
В случае если у числа нет ни одного делителя - на экран
выводится соответствующее текстовое сообщение.
 */

public class Exercies17_20 {
    protected void divider(int num) {
        int no = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                no++;
                System.out.print(i + " ");
            }
        }
        if (no == 0) {
            System.out.println(num + " tiv@ parz tiv e");
        }
    }
}
