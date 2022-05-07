package com.demo.progresstests.exam1.exercies9;
/*
Напишите класс, который принимает с клавиатуры два положительных
числа, которые должны быть длинами двух смежных сторон прямоугольника или квадрата.
Класс должен определить, к какой из указанных двух фигур относятся введенные значения сторон.
 */

import java.util.Scanner;

public class Exercies9_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        System.out.println("eli drakan tiv");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("qarakusi");

        } else {
            System.out.println("uxxankyun");
        }
        scanner.close();
    }
}
