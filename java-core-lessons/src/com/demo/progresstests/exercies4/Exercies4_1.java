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

        int abc = scanner.nextInt();
        System.out.println((abc / 100) + " " + abc / 10 % 10 + " " + abc % 10);

        scanner.close();
    }
}
