package com.demo.progresstests.exam2.exercies17.exercies1713;
/*
Напишите метод, который принимает в качестве параметра два целых числа
и возвращает значение true, если в числах одинаковое количество цифр;
в ином случае метод возвращает значение false.
 */

public class Exercies17_13 {
    public boolean bolean(int a, int b) {
        int countA = 0;
        int countB = 0;
       // boolean d = false;

        while (a > 0) {
            a /= 10;
            countA++;
        }
        while (b > 0) {
            b /= 10;
            countB++;
        }
        return  countB == countA;

    }
}
