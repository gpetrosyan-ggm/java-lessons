package com.demo.progresstests.exam2.exercies17.exercies1727;
/*
Напишите метод, который принимает в качестве параметра целое положительное число n
и возвращает значение факториала (n!).
 */

public class Exercies17_27 {
    int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


}
