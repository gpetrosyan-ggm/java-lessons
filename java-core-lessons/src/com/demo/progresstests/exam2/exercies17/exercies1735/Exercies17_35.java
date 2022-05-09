package com.demo.progresstests.exam2.exercies17.exercies1735;
/*
Напишите метод, который принимает в качестве параметра целое число и возвращает значение true,
если оно - симметричное (палиндром - как, например, число 53477435);
в ином случае метод возвращает значение false.
 */

public class Exercies17_35 {
    public void symmetric(int num) {
        boolean sym = false;
        int coun = 1;
        int x = 0;
        int num1 = num;
        int num2 = num;
        while (num1 > 9) {
            num1 /= 10;
            coun *= 10;
        }
        while (num2 > 0) {
            x += num2 % 10 * coun;
            num2 /= 10;
            coun /= 10;
        }
        if (x == num) {
            sym = true;
        }
        System.out.println(sym);
    }

}
