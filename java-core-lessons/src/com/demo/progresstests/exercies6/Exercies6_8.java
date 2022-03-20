package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры два целых числа и,
если оба имеют одинаковый знак, на экран выводится сообщение
Один и тот же знак, а если разный, то на экран выводится сообщение
Разные знаки. Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
 */


import java.util.Scanner;

public class Exercies6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" grel amboxjakan tiv ");

        int a = scanner.nextInt();
        System.out.println("eli kamayakan amboxjakan tiv ");

        int b = scanner.nextInt();
        if (a * b > 0) {
            System.out.println("mievnuyn nshani en");
        }
        if (a * b < 0) {
            System.out.println("tarber nshani en");
        }
        if (a == 0 || b == 0) {
            System.out.println("Некорректно");

        }
        scanner.close();
    }
}
