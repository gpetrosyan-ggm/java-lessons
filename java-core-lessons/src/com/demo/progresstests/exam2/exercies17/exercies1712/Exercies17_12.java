package com.demo.progresstests.exam2.exercies17.exercies1712;
/*
Напишите метод, который принимает в качестве параметра целое число
и возвращает самую большую цифру в этом числе.
 */

public class Exercies17_12 {


    public int numbers(int number) {
        int num;
        int num1 = 0;
        while (number > 0) {
            num = number%10;
            if (num > num1) {
                num1 = num;
            }
            number /= 10;
        }
        return num1;
    }
}
