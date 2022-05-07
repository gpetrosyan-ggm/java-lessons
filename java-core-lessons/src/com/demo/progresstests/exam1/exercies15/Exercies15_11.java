package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры пары двузначных целых чисел,
пока не будет введена пара одинаковых чисел.
Класс должен выводить на экран сумму всех первых чисел в парах
и сумму всех вторых чисел в парах (не считая чисел, введенных в последней паре).
 */

import java.util.Scanner;

public class Exercies15_11 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("number 1");
            int num1 = scanner.nextInt();

            System.out.println("number 2");
            int num2 = scanner.nextInt();

            if (num1 == num2) {
                break;
            }
            sum1 += num1;
            sum2 += num2;
        }
        System.out.println("sum1 = " + sum1 + " sum2 = " + sum2);
        scanner.close();
    }
}
