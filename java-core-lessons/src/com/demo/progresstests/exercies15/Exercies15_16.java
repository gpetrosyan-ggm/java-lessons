package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число
и выводит на экран количество четных цифр в нем и сумму его нечетных цифр.
 */

import java.util.Scanner;

public class Exercies15_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        System.out.println("number");
        int num = scanner.nextInt();

        while (true) {
            if (num % 2 == 0) {
                count++;
            } else {
                sum += num % 10;
            }
            num /= 10;
            if (num == 0) {
                break;
            }
        }
        System.out.println(sum + "   " + count);
        scanner.close();
    }
}
