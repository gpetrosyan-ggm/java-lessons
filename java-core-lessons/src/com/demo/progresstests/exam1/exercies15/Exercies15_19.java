package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
для каждого введенного числа класс напечатает сумму его цифр.
 */

import java.util.Scanner;

public class Exercies15_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {

            System.out.println("number ");
            int num = scanner.nextInt();

            int sum = 0;
            while (true) {
                sum += num % 10;
                num = num / 10;
                if (num == 0) {
                    break;
                }
            }
            System.out.println(sum);
        }
        scanner.close();
    }

}
