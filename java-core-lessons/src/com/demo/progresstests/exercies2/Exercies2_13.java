package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры три целых числа,
каждое из которых представляет собой размер одной из сторон паралелепипеда
и выводит на экран следующие значения (каждое - в отдельной строке): объем,
площадь каждой из граней, общую площадь и общий периметр.
 */

import java.util.Scanner;

public class Exercies2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" zugaheranisti himqi mi koxm@ a = ");

        int a = scanner.nextInt();
        System.out.println(" zugaheranisti himqi myus koxm@ b = ");

        int b = scanner.nextInt();
        System.out.println(" zugaheranisti bardzrutyun@ c = ");

        int c = scanner.nextInt();
        System.out.println("zugaheranisti caval@  V = " + (a * b * c));
        System.out.println(
                "zugaheranisti koxmeri makeresner@ S1 = " + (a * b) + ";" + "  S2 + " + (a * c) + ";" + "  S3 = " +
                (b * c));
        System.out.println("zugaheranisti @ndhanur makeres@ S = " + (2 * (a * b) + 2 * (a * c) + 2 * (b * c)));
        System.out.println("zugaheranisti paragic@ klini P = " + 4 * (a + b + c));
        scanner.close();
    }
}
