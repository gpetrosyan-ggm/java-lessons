package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который читает два целых положительных числа в переменных А и В и проверяет,
действительно ли А меньше, чем В.
Если да, - класс должен вывести на экран А последовательных чисел,начиная с числа В, A < B -> B - A
если нет, - класс должен вывести на экран В последовательных чисел, начиная с числа А. A > B - > A - B
 */

import java.util.Scanner;

public class Exercies11_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();

        int start;
        int end;
        if (a <= b) {
            start = b;
            end = a;
        } else {
            start = a;
            end = b;
        }

        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }

    }

}
