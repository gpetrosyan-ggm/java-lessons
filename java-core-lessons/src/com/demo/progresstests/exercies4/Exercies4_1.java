package com.demo.progresstests.exercies4;
/*
Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
и выводит на экран его цифры, разделенные знаком «пробел».
 */

import java.util.Scanner;

public class Exercies4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel eranish drakan tiv ...");

        int a = scanner.nextInt();
        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        System.out.println(a100 + " " + a10 + " " + a1);

        scanner.close();
    }
}
