package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который выводит на экран в строку все положительные двузначные числа
(в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
а после окончания вывода чисел (тоже в отдельной строке)- слово Финиш.
 */

public class Exercies11_7 {
    public static void main(String[] args) {
        System.out.println("START ");

        for (int i = 10; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" FINISH");
    }

}


