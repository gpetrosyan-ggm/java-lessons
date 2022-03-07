package com.demo.progresstests.exercies11;
/*
Напишите класс, который вначале принимает с клавиатуры целое положительное
число (в переменную х), которое будет количеством членов в арифметической прогрессии.
Первый член прогрессии равен прогрессии равна 7, а разница между соседними членами 4.
Затем класс выводит на экран в строку серию из х членов этой прогрессии.
Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания
вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Exercies11_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan amboxj tiv");
        int x = scanner.nextInt();

        System.out.print("START ");
        for (int i = 7; i <= 4 * (x + 1); i += 4) {
            System.out.print(" " + i);
        }
        System.out.print(" Finish");
    }
}
