package com.demo.progresstests.exam1.exercies14;
/*
В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное
в соревнованиях каждым из учеников, и выводит на экран наилучший результат.
 */

import java.util.Scanner;

public class Exercies14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-i jamanak@");
        int a = scanner.nextInt();

        for (int i = 2; i <= 150; i++) {

            System.out.println(i + "-i jamanak@");
            int b = scanner.nextInt();

            if (b < a) {
                a = b;
            }
        }
        System.out.println(a);
        scanner.close();
    }
}
