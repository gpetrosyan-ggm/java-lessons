package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который вначале принимает с клавиатуры целое положительное
число (в переменную х). Затем класс выводит на экран в 17 строку серию из
целых положительных чисел, отвечающую следующим условиям:
1. серия начинается с числа, большего х на 1
2. каждое число в серии (начиная со второго) больше предьщущего на 1

Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Exercies11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int x = scanner.nextInt();

        System.out.print("START ");
        int x1 = x + 18;

        for (int i = x + 1; i < x1; i++) {
            System.out.print(" " + i);
        }
        System.out.print(" Finish");
    }

}
