package com.demo.progresstests.exercies4;
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
        System.out.println((a - a % (a / 10) + b % (b / 10)) + "  " + (b - b % (b / 10) + a % (a / 10)));

        scanner.close();
    }
}
