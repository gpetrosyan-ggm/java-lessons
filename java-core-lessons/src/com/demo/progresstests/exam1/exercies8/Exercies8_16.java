package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры положительное целое число
и выводит на экран ближайшее к нему «крутлое число».
Например, для введенного значения 433 выводится на экран 430,
а для 56 выводится 60.
 */

import java.util.Scanner;

public class Exercies8_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel drakan tiv");

        int a = scanner.nextInt();
        int a1 = a % 10;
        if (a1 >= 5) {
            System.out.println(a1 * 10 + 10);
        } else {
            System.out.println(a1 * 10);
        }
        scanner.close();
    }
}
