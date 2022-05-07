package com.demo.progresstests.exam1.exercies15;
/*
Последовательность Фибоначчи определяется как серия чисел,
в которой первый и второй члены равны 1, а любой член, начиная с третьего,
равен сумме двух предыдущих членов.
Напишите класс, который принимает с клавиатуры целое положительное число и проверяет,
является ли оно членом последовательности Фибоначчи.
 */

import java.util.Scanner;

public class Exercies15_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 1;
        while (fib3 <= num) {

            if (fib3 == num) {
                System.out.println(num + " tiv@ FIBONACHII andam e");
                break;
            }
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;

        }
        scanner.close();
    }
}
