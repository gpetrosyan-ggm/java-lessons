package com.demo.progresstests.exam1.exercies2;
/*
2.11
Напишите класс, который принимает с клавиатуры два целых числа и
выводит на экран следующие значения (каждое в отдельной строке):
сумму введенных чисел, их произведение, разницу между первым и вторым,
разницу между вторым и первым.
 */

import java.util.Scanner;

public class Exercies2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq dzer tiv@ ");

        int a = scanner.nextInt();
        System.out.println(" Dzer erkrord tiv@ xndrem ");

        int b = scanner.nextInt();
        System.out.println("tvyal tveri gumar@ " + (a + b));
        System.out.println("irenc artadryal@   " + (a * b)); //произведение haskacel em artadryal@
        System.out.println("1-ic hanac 2-rd@   " + (a - b));
        System.out.println("2-ic hanac 1-in@   " + (b - a));
        scanner.close();
    }
}
