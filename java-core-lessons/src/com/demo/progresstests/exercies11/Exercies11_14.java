package com.demo.progresstests.exercies11;
/*
Напишите класс, который вначале принимает с клавиатуры целое положительное
число (в переменную х). Затем класс выводит на экран в строку серию из 17 целых
положительных чисел, отвечающую следующим условиям:
1. серия начинается с числа, меньшего х на 10;
2. каждое число в серии (начиная со второго) меньше предыдущего на 6.

Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания
вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Exercies11_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int x = scanner.nextInt();

        System.out.print("START ");
        int i = x - 10;
        int x1 = x - 10 - 17 * 6;
        for (; i > x1; i -= 6) {
            System.out.print(" " + i);

        }
        System.out.print(" FINISH");
    }
}
