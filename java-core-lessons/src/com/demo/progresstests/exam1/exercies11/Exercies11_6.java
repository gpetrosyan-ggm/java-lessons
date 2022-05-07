package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который выводит на экран (в одну строку) 19 случайных чисел
из диапазона «однозначные числа». Каждое значение, равное О,
следует вывести на экран «В окружении» (вплотную к числу, перед ним и после него)
символов «%» (процент).
 */

public class Exercies11_6 {
    public static void main(String[] args) {
        int min = 0;
        int max = 9;

        for (int i = 0; i < 19; i++) {

            int a = (int) (Math.random() * (min - max + 1) + max);

            if (a == 0) {
                System.out.print("#" + a + "#");

            } else {
                System.out.print(" " + a);
            }

        }

    }
}
