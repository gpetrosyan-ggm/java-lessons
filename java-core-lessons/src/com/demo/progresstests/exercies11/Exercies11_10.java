package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран в строку положительные четырехзначные числа,
заканчивающиеся на 00 (в убывающем порядке). Числа должны отделяться друг от друга
знаком «пробел». Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).
 */

public class Exercies11_10 {
    public static void main(String[] args) {
        System.out.print("START ");

        for (int i = 9999; i >= 1000; i--) {
            if (i % 100 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.print(" FINISH");
    }
}
