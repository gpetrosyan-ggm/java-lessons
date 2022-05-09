package com.demo.progresstests.exam2.exercies17.exercies1719;
/*
Напишите метод, который получает в качестве параметров два целых числа.
Метод возвращает значение true, если первая цифра в первом параметре
равна последней цифре во втором параметре. В ином случае метод возвращает значение false.
 */

public class Exercies17_19 {
    boolean number(int num1, int num2) {

        boolean ret = false;
        while (num1 > 9) {
            num1 /= 10;
        }
        if (num1 == num2 % 10) {
            ret = true;
        }
        return ret;
    }
}
