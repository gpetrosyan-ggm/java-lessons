package com.demo.progresstests.exercies15;
/*
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
для каждого введенного числа класс должен напечатать сумму его цифр.
После окончания ввода класс выведет на экран порядковый номер числа с самой большой суммой цифр.
 */

import java.util.Scanner;

public class Exercies15_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {

            System.out.println("number");
            int num = Math.abs(scanner.nextInt());
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }

        System.out.println(maxSumIndex + " " + maxSum);
        scanner.close();
    }
}
