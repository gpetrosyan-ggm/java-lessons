package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры число и выводит на
экран обратное ему значение.
 */

import java.util.Scanner;

public class Exercies2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq tiv...");

        int i = scanner.nextInt();
        System.out.println("hakarak tiv@ klini " + (-i));
        scanner.close();
    }
}
