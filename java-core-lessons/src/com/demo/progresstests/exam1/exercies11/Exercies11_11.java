package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который выводит на экран в строку положительные
двузначные числа, делящиеся на 5 (в убывающем порядке). Числа должны отделяться друг от друга
знаком «пробел». Перед началом и после окончания вывода серии чисел на экран вывода
следует вывести текстовые сообщения (по выбору).
 */

public class Exercies11_11 {
    public static void main(String[] args) {
        System.out.print("START ");

        for (int i = 99; i >= 10; i--) {
            if (i % 5 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.print(" FINISH");
    }
}
