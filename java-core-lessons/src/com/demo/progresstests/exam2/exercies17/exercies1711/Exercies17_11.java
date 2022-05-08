package com.demo.progresstests.exam2.exercies17.exercies1711;
/*
Напишите метод, который принимает в качестве параметра целое число
и возвращает количество цифр в этом числе.
 */

public class Exercies17_11 {
    void number(int num) {

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
