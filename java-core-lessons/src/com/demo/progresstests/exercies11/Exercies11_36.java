package com.demo.progresstests.exercies11;
/*
Напишите класс, который читает два целых положительных числа в переменных А и В и проверяет,
действительно ли А меньше, чем В.
Если да, - класс должен вывести на экран А последовательных чисел,начиная с числа В,
если нет, - класс должен вывести на экран В последовательных чисел, начиная с числа А.
 */

import java.util.Scanner;

public class Exercies11_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();
        if (a < b) {
            for (int i = b; i >= a; b--) {
                System.out.println(i + " ");
            }
        } else {
            for (int i = a; i >= b; a--) {
                System.out.println(i + " ");
            }
        }

    }
}
