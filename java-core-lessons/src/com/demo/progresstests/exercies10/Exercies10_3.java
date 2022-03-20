package com.demo.progresstests.exercies10;
/*
Напишите класс, который генерирует и выводит на экран 2 случайных
целых числа из диапазона «однозначные» (включая и положительные, и отрицательные).
После этого в отдельной строке класс должен вывести наибольшее
из этих двух чисел - с соответствующим текстовым сообщением, и в еще
одной строке наименьшее из этих двух чисел, тоже с соответствующим текстовым сообщением.
 */

public class Exercies10_3 {
    public static void main(String[] args) {
        int min = -9;
        int max = 9;

        int a1 = (int) (Math.random() * (max - min + 1) + min);
        int a2 = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(a1 + " " + a2);

        if (a1 > a2) {
            System.out.println("aveli mec e " + a1);
            System.out.println("aveli poqr e " + a2);

        } else if (a1 < a2) {

            System.out.println("aveli mec e " + a2);
            System.out.println("aveli poqr e " + a1);

        } else {

            System.out.println(" havasar en");
        }
    }
}

