package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры целое трехзначное
положительное число и изменяет его следующим образом:
    • для чисел, больших 500, - переставляет местами числа единиц и сотен (вместо 672 - 276);
    • в остальных числах переставляются местами числа десятков и единиц (вместо 363 - 336).
 */

import java.util.Scanner;

public class Exercies8_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish drakan");

        int a = scanner.nextInt();
        int a100;
        int a10;
        int a1;
        a100 = a / 100;
        a10 = a / 10 % 10;
        a1 = a % 10;
        if (a > 500) {
            System.out.println((a10 * 10 + a1 * 100 + a100));
        } else {
            System.out.println((a100 * 100 + a10 + a1 * 10));
        }
        scanner.close();
    }
}
