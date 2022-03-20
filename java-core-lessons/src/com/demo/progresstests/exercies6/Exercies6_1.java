package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры целое число и, если оно положительное,
увеличивает его вдвое. Класс должен выводить на экран новое значение.
 */

import java.util.Scanner;

public class Exercies6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kamayakan amboxjakan tiv ");

        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a * 2);
        }
        scanner.close();
    }
}
