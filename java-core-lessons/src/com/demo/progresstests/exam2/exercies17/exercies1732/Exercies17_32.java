package com.demo.progresstests.exam2.exercies17.exercies1732;
/*
Напишите метод, который принимает в качестве параметров целое число Х и цифру D.
Метод возвращает значение true, если цифра D встречается хотя бы раз в числе Х;
в ином случае метод возвращает значение false.
 */

public class Exercies17_32 {
    public boolean number(int num, int x) {
        boolean yes = false;
        while (num > 0) {
            if (num % 10 == x) {
                yes = true;
                break;
            }
            num /= 10;
        }
        return yes;
    }
}
