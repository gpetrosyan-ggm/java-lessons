package com.demo.progresstests.exam1.exercies9;
/*
Напишите класс, который принимает с клавиатуры три положительных числа и
проверяет, могут ли они являться длинами сторон треугольника.
По результатам проверки следует вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        System.out.println("drakan tiv");
        int b = scanner.nextInt();

        System.out.println("drakan tiv");
        int c = scanner.nextInt();

        int p = a + b + c;

        if (p == 180 && a != 0 && b != 0 && c != 0) {
            System.out.println("erankyan koxmer@ chisht en @ntrvac");
        } else {
            System.out.println("erankyan koxmer chen handisanum ");
        }
        scanner.close();
    }
}
