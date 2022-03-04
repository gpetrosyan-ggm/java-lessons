package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры две пары целых
ненулевых чисел: первая пара является числителем и знаменателем одной дроби,
вторая пара - числителем и знаменателем другой дроби.
Класс должен проверить, равны ли эти дроби друг другу, и вывести на
экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-ini hamarich@");

        int a1 = scanner.nextInt();
        System.out.println("1-i haytarar@, vor@ 0 che");

        int b1 = scanner.nextInt();
        System.out.println("2-i hamarich@");

        int a2 = scanner.nextInt();
        System.out.println("2-i haytarar");

        int b2 = scanner.nextInt();
        if (a1 / b1 == a2 / b2) {
            System.out.println("kotorakner@ havasar en");
        } else {
            System.out.println("kotorakner@ !=");
        }
    }
}
