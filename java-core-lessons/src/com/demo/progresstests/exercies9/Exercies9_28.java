package com.demo.progresstests.exercies9;
/*
Напишите класс, который принимает с клавиатуры два целых положительных числа,
которые должны представлять числитель (первое) и знаменатель(второе) дроби.
В случае если введенные значения образуют правильную дробь,
следует вывести на экран соответствующее текстовое сообщение.
В случае если введенные значения образуют неправильную дробь,
следует вывести ее на экран в виде смешанной дроби.
 */

import java.util.Scanner;

public class Exercies9_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("amboxjakan drakan tiv");
        int a = scanner.nextInt();

        System.out.println("amboxjakan drakan tiv");
        int b = scanner.nextInt();

        int a1 = a / b;
        int a2 = a1 * b;
        int a3 = a - a2;

        if (a < b) {
            System.out.println("kotorak@ liarjeq e");
        } else {

            System.out.println(a1 + " " + a3 + "/" + b);
        }
        scanner.close();
    }
}
