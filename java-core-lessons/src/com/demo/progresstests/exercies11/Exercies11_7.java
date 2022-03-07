package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран в строку все положительные двузначные числа
(в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
а после окончания вывода чисел (тоже в отдельной строке)- слово Финиш.
 */

public class Exercies11_7 {
    public static void main(String[] args) {
 System.out.print("START");
    for (int i = 10; i < 100; i+=2) {



        System.out.print(i+ " ");
    }
    System.out.print("FINISH");
}

        }


