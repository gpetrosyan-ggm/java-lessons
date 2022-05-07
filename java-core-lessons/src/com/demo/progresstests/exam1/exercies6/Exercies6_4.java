package com.demo.progresstests.exam1.exercies6;
/*
Напишите класс, который принимает с клавиатуры целое положительное число и,
если оно как минимум трехзначное и положительное, уменьшает его на 1.
 */

import java.util.Scanner;

public class Exercies6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("drakan amboxjakan tiv ..");

        int a = scanner.nextInt();
        if (a >= 100) {
            System.out.println(a - 1);
        }
        scanner.close();
    }
}
