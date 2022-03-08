package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем выводит на экран все целые положительные двузначные числа,
сумма цифр которых равна введенному с клавиатуры значению.
 */

import java.util.Scanner;

public class Exercies11_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int x = scanner.nextInt();

        for (int i = 10; i <= 99; i++) {
            int a10 = i / 10;
            int a1 = i % 10;
            if (a10 + a1 == x) {
                System.out.println(a10 * 10 + a1);
            }else {
                System.out.println("urish tiv porci");
            }
        }

    }
}
