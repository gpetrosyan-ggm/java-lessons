package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран в строку положительные
трехзначные числа, заканчивающиеся на 7 (в возрастающем порядке).
Числа должны отделяться друг от друга знаком «пробел».
Перед началом и после окончания вывода серии чисел на экран вывода следует
вывести текстовые сообщения (по выбору)
 */

public class Exercies11_9 {
    public static void main(String[] args) {
        System.out.print("START ");
        for (int i = 100; i < 999; i++) {
            if (i % 10 == 7) {
                System.out.print(" " + i);
            }
        }
        System.out.print(" finish ");
    }
}
