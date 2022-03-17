package com.demo.progresstests.exercies15;
/*
Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
для каждого введенного числа класс напечатает сумму его цифр.
 */

import java.util.Scanner;

public class Exercies15_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 15;

        while (count > 0) {

            System.out.println("number " + count);
            int num = scanner.nextInt();

            int sum = 0;
            count--;

            while (true) {

                if (num != 0) {
                    sum += num % 10;
                    num = num / 10;
                } else {
                    break;
                }
            }
            System.out.println(sum);
        }
        scanner.close();
    }

}
