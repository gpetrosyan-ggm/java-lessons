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
        int sum1 = 0;
        int number = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("number");
            int num = scanner.nextInt();
            int sum = 0;
            while (true) {

                sum += num % 10;
                num /= 10;

                if (sum > sum1) {
                    sum1 = sum;
                    number = i;
                }
                if (num == 0) {
                    System.out.println(sum);
                    break;
                }
            }

        }
        System.out.println(sum1 + " " + number);
        scanner.close();
    }
}
