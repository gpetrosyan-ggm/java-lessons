package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который вводит с клавиатуры целые положительные числа до тех пор,
пока не будет введено число, сумма цифр которого равна 5.
 */

import java.util.Scanner;

public class Exercies15_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("number");
            int num = scanner.nextInt();
            int sum = 0;

            while (true) {
                sum += num % 10;
                num /= 10;

                if (num == 0) {
                    System.out.println(sum);
                    break;
                }
            }
            if (sum == 5) {
                System.out.println("bingo sum = " + sum);
                break;
            }

        }
        scanner.close();
    }
}
