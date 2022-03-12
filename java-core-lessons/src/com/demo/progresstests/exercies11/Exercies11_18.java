package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем выводит на экран все целые положительные трехзначные числа,
сумма цифр которых равна введенному с клавиатуры значению.
 */

import java.util.Scanner;

public class Exercies11_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 100; i <= 999; i++) {

            int i100 = i / 100;
            int i10 = i / 10 % 10;
            int i1 = i % 10;

            if (a == i100 + i10 + i1) {
                System.out.println(i);
            }
        }
    }
}
