package com.demo.progresstests.exam1.exercies4;
/*
Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
и выводит на экран его цифры, разделенные знаком «пробел», но в обратном порядке.
То есть для числа 415 будет выведено на экран 5 1 4.
 */

import java.util.Scanner;

public class Exercies4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" eranish drakan tiv ");

        int a = scanner.nextInt();
        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        System.out.println(a1 + " " + a10 + " " + a100);

        scanner.close();
    }
}
