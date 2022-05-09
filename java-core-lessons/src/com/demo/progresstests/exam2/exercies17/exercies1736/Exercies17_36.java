package com.demo.progresstests.exam2.exercies17.exercies1736;
/*
Напишите метод, который принимает в качестве параметра целое число и проверяет,
каких цифр в нем больше четных или нечетных (по значению).
В случае если больше четных - метод возвращает 1,
если больше нечетных - метод возвращает -1,
в случае равенства количества четных и нечетных цифр - метод возвращает О.
 */

public class Exercies17_36 {
    void anymore(int num) {
        int count1 = 0;
        int count2 = 0;
        int count;
        while (num > 0) {
            if (num % 2 == 0) {
                count2++;
            } else {
                count1++;
            }
            num /= 10;
        }
        if (count1 > count2) {
            count = -1;

        } else if (count2 > count1) {
            count = 1;
        } else {
            count = 0;
        }
        System.out.println(count);
    }

}
