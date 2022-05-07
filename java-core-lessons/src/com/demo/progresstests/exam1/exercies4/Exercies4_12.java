package com.demo.progresstests.exam1.exercies4;
/*
Назовем «обменом» операцию, при которой два числа «обмениваются» своими правыми цифрами.
Напишите класс, который принимает с клавиатуры два трехзначных
положительных числа и совершает над ними операцию «обмена».
 */

import java.util.Scanner;

public class Exercies4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel eranish tiv ..");

        int a = scanner.nextInt();
        System.out.println(" grel eli eranish tiv ..");

        int b = scanner.nextInt();
        int a12 = a / 10;
        int a3 = a % 10;
        int b12 = b / 10;
        int b3 = b % 10;
        System.out.println((a12 * 10 + b3) + "  " + (b12 * 10 + a3));

        scanner.close();
    }
}
