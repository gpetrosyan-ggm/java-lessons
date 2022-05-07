package com.demo.progresstests.exam1.exercies12;
/*
Серия случайных чисел называется «уравновешенной», если количество положительных и
отрицательных чисел в серии - одинаково.
Напишите класс, который генерирует серию из 30 случайных целых чисел из диапазона
от -20 до 20 и проверяет, является ли серия «уравновешенной».
 */

public class Exercies12_14 {
    public static void main(String[] args) {
        int b = 0;
        int min = -20;
        int max = 20;
        for (int i = 0; i < 30; i++) {
            int a = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(a);
            if (a >= 0) {
                b++;
            }
        }
        if (b == 15) {
            System.out.println("«уравновешенной»");
        } else {
            System.out.println("che pust tvec");
        }
    }
}
