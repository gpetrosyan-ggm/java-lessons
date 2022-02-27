package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран два новых числа
(каждое в отдельное строке): число, больше введенного с клавиатуры на 6,
и число, меньше введенного с клавиатуры на 12.
 */

import java.util.Scanner;

public class Exercies2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dzer na@ntreli tiv@ ... ");
        int a = scanner.nextInt();

        System.out.println("tarberak 1. " + (a + 6));
        System.out.println("tarberak 2. " + (a - 12));
        scanner.close();

    }
}
