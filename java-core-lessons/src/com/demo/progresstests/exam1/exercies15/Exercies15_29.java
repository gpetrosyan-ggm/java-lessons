package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму его цифр.
Результат подсчета должен быть выведен на экран.
Например, для числа 534 на экран будет выведено 12.
 */

import java.util.Scanner;

public class Exercies15_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
        scanner.close();
    }
}
