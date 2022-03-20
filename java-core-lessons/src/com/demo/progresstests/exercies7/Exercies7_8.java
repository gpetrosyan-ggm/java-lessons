package com.demo.progresstests.exercies7;

import java.util.Scanner;

/*
Напишите класс, который принимает с клавиатуры три числа:
два первых должны быть длинами сторон катетов прямоугольного треугольника,
а третье - длиной гипотенузы. Программа должна проверить,
соответствуют ли введенные значения этому требованию.
Внимание: допустимо предположить, что все вводимые числа - положительные.
 */
// a*a + b*b = c*c
public class Exercies7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("uxxankyun erankyan ejeric mek@");

        int a = scanner.nextInt();
        System.out.println("uxxankyun erankyan myus ej@");

        int b = scanner.nextInt();
        System.out.println("nerqnadziq@");

        int c = scanner.nextInt();
        if ((a * a + b * b) == (c * c)) {
            System.out.println("erankyan bolor koxmer@ chisht en @ntrvac");
        } else {
            System.out.println("krkin porcir erankyan koxmer@ sxal es @ntrel");
        }
        scanner.close();
    }
}
