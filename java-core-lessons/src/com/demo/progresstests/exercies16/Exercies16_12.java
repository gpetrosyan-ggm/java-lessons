package com.demo.progresstests.exercies16;
/*
Два положительных трехзначных числа а и Ь называются «родственными»,
если сумма делителей числа а равна Ь, а сумма делителей числа Ь равна а.
Например, это числа 220 и 284, так как сумма делителей 220 равна 284,
а сумма делителей 284 равна 220.
Напишите класс, который принимает с клавиатуры положительное трехзначное число
и ищет ближайшее к нему и большее него «родственное» число.
 */

import java.util.Scanner;

public class Exercies16_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number a");
        int a = scanner.nextInt();
        int sum = 0;
        int sum1;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        for (int b = (a + 1); b < 1000; b++) {
            sum1 = 0;
            for (int j = 1; j < b; j++) {
                if (b % j == 0) {
                    sum1 += j;
                }

                }
            if (sum1 == a && sum == b) {
                System.out.println(b);
                break;

            }
        }
    }
}
