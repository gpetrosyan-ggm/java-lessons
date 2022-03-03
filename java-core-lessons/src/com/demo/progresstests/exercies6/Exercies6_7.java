package com.demo.progresstests.exercies6;
/*
Напишите программу (класс), которая принимает с клавиатуры двузначное число и проверяет,
что больше: само это число или произведение его цифр.
 */

import java.util.Scanner;

public class Exercies6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erknish tiv");

        int a = scanner.nextInt();
        int a10 = a / 10;
        int a1 = a % 10;
        if (a > a10 * a1) {
            System.out.println("qo tiv@ mec e artadryalic");
        }
        if (a < a10 * a1) {
            System.out.println("artadryal@ mec e qo tiv@ ");
        }
        scanner.close();
    }
}
