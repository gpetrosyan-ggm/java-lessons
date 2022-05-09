package com.demo.progresstests.exam2.exercies17.exercies1715;
/*
Напишите метод, который принимает в качестве параметра целое число и возвращает значение true,
если это число простое; в ином случае метод возвращает значение false.
 */

public class Exercies17_15 {
   protected boolean primeNumber(int num) {

        boolean prime = true;
        int num1 = num-1;
        for (int i = 2; i < num1; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
