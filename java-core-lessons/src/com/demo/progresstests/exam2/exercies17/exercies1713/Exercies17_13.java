package com.demo.progresstests.exam2.exercies17.exercies1713;
/*
Напишите метод, который принимает в качестве параметра два целых числа
и возвращает значение true, если в числах одинаковое количество цифр;
в ином случае метод возвращает значение false.
 */

public class Exercies17_13 {
    public void bolean(int a, int b) {
        int countA = 0;
        int countB = 0;
        boolean d;

        while (a > 0) {
            a /= 10;
            countA++;
        }
        while (b > 0) {
            b /= 10;
            countB++;
        }
        if (countA == countB) {
            d = true;
        } else {
            d = false;
        }
        System.out.println(d);
    }
}
