package com.demo.progresstests.exercies11;
/*
Напишите класс, который вначале принимает с клавиатуры целое положительное число.
Затем класс выводит на экран в строку положительные трехзначные числа,
в которых последняя цифра такая же, как и последняя цифра в значении, введенном с клавиатуры.
Числа должны отделяться друг от друга знаком «пробел». Перед началом и после окончания
вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
 */

import java.util.Scanner;

public class Exercies11_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        int a1 = a % 10;
        for (int i = 100; i <= 999; i++) {
            int i1 = i % 10;      // stex arjer i1 haytararel u veragrel, te miangamic if(a1==i%10) : karas miangamic
            if (a1 == i1) {
                System.out.println(i);
            }
        }
    }
}
