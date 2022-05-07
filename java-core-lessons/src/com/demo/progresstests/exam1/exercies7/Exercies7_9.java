package com.demo.progresstests.exam1.exercies7;
/*
Напишите программу, которая принимает с клавиатуры число и превращает его в положительное,
если оно отрицательное либо в ноль во всех остальных случаях.
 */

import java.util.Scanner;

public class Exercies7_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel tiv ");

        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println(-a);
        } else {
            System.out.println(a - a);
        }
        scanner.close();
    }
}
