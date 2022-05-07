package com.demo.progresstests.exam1.exercies16;
/*
Напишите класс, который читает с клавиатуры целые положительные числа и для каждого числа
выводит на экран: число цифр в числе, сумму цифр числа и число делителей введенного числа.
Класс также должен подсчитать и вывести на экран общую сумму всех цифр введенных чисел.
 */

import java.util.Scanner;

public class Exercies16_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int num = 1;
        while (num > 0) {
            int count = 0;
            int countTem = 0;
            int sum = 0;

            System.out.println("number");
            num = scanner.nextInt();

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            for (; ; ) {

                if (num % 10 != 0) {
                    countTem++;
                    sum += num % 10;

                    num = num / 10;
                } else break;
            }
            sum1 += sum;
            System.out.println("tvi tvanshanneri qanak " + countTem);
            System.out.println("tvi tvanshanneri gumar " + sum);
            System.out.println("tvi bajanararneri gumar " + count);
            System.out.println("bolor gumar@ " + sum1);
        }
    }
}
