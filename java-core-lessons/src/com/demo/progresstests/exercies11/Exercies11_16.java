package com.demo.progresstests.exercies11;
/*
Напишите класс, который вначале принимает с клавиатуры целое положительное
число (в переменную х). Затем класс выводит на экран в строку все целые числа из диапазона
-x ... x (не включая крайние значения диапазона).
Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Exercies11_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int x = scanner.nextInt();
        System.out.print("START ");
        for (int i = 1 - x; i < x; i++) {
            System.out.print(" " + i);
        }
        System.out.print(" FINISH");
    }
}
