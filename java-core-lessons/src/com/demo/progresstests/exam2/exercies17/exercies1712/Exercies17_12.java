package com.demo.progresstests.exam2.exercies17.exercies1712;
/*
Напишите метод, который принимает в качестве параметра целое число
и возвращает самую большую цифру в этом числе.
 */

public class Exercies17_12 {
    int num = 0;

    public void numbers(int number) {
        while (number > 0) {
            if (number % 10 > num) {
                num = number % 10;
            }
            number /= 10;
        }
        System.out.println(num);
    }
}
