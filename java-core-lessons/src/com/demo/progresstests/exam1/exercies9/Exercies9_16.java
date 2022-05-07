package com.demo.progresstests.exam1.exercies9;
/*
Напишите класс, который принимает с клавиатуры три числа и проверяет, являются ли эти
числа длинами сторон одного и того же треугольника. По результатам проверки следует
вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        System.out.println("drakan tiv");
        int b = scanner.nextInt();

        System.out.println("drakan tiv");
        int c = scanner.nextInt();

        if ((a + b) > c && (a + c) > b && (c + b) > a) {
            System.out.println("erankyan koxmer en");
        } else {
            System.out.println("chi kara erankyan koxmer@ lini");
        }
        scanner.close();
    }
}
