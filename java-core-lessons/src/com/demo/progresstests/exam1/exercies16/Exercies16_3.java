package com.demo.progresstests.exam1.exercies16;
/*
Напишите класс, который выводит на экран построчно таблицу умножения:
в первой строке - умножение чисел от 1 до 9 на 1,
во второй - умножение на 2, и так далее до умножения чисел от 1 до 9 на 12.
 */

public class Exercies16_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            System.out.print(i + " - ");

            for (int j = 1; j < 10; j++) {
                int a = i * j;
                System.out.print(" : " + a);
            }
            System.out.println();
        }
    }
}
