package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры два целых положительных числа
и затем выводит на экран:
    • разницу между первым и вторым, - в случае если первое больше второго;
    • разницу между вторым и первым, - в случае если второе больше первого;
    • произведение введенных значений, - в случае если они равны.
 */

import java.util.Scanner;

public class Exercies8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kamayakan tiv  ");

        int a = scanner.nextInt();
        System.out.println("eli tiv..");

        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b " + (a - b));
        }
        if (b > a) {
            System.out.println("b > a " + (b - a));
        }
        if (a == b) {
            System.out.println("a = b " + (a * b));
        }
        scanner.close();
    }
}
