package com.demo.progresstests.exam1.exercies7;
/*
Напишите класс, который принимает с клавиатуры два числа и проверяет,
равны они друг другу или нет.
 */
// chi asum tpi, bayc es ktpem vor tenanq havasar en irar te che

import java.util.Scanner;

public class Exercies7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel tiv");

        int a = scanner.nextInt();
        System.out.println("eli tiv");

        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b");
        }
        scanner.close();
    }
}
