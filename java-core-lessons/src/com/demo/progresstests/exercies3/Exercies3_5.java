package com.demo.progresstests.exercies3;
/*
Напишите класс, который принимает с клавиатуры три числа:
длины двух катетов и гипотенузы прямоугольного треугольника,
и выводит на экран площадь и периметр этого треугольника.
При решении следует предусмотреть возможность того,
что размеры сторон треугольника не выражаются целыми числами.
 */

import java.util.Scanner;

public class Exercies3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erankyan ejeric mek@ ..");

        double a = scanner.nextDouble();
        System.out.println("erankyan myus ej@ ..");

        double b = scanner.nextDouble();
        System.out.println(" erankyan nerqnadziq ..");

        double c = scanner.nextDouble();
        System.out.println(" erankyan makeres@ S = " + (a * b) / 2);
        System.out.println("erankyan paragic@ P = " + (a + b + c));

        scanner.close();
    }
}
