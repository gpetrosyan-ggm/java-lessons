package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры целое число и
выводит на экран одно из следующих сообщений:
Положительное, или Отрицательное, или Ноль, - в зависимости от значения числа.
 */

import java.util.Scanner;

public class Exercies6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" amboxjakan tiv ..");

        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("bacasakan");
        }
        if (a == 0) {
            System.out.println("ZRO");
        }
        if (a > 0) {
            System.out.println("drakan");
        }
        scanner.close();
    }
}
