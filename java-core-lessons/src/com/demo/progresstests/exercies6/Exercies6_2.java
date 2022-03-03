package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры целое число и, если
оно равно нулю, выводит на экран сообщение Ноль.
 */

import java.util.Scanner;

public class Exercies6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel amboxjakan tiv ..");

        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("ZRO");
        }
        scanner.close();
    }
}
