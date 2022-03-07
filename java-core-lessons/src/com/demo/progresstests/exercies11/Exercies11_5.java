package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран (в одну строку) 20 случайных чисел
из диапазона 27... 73. Перед каждым значением, делящимся на 3 без остатка,
следует вывести (вплотную к числу) символ «#» (решетка).
 */

public class Exercies11_5 {
    public static void main(String[] args) {
        int min = 27;
        int max = 73;

        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * (min - max + 1) + max);
            if (a % 3 == 0) {
                System.out.print("# " + a+ " ");
            } else {
                System.out.print(a + "  ");
            }
        }
    }
}
