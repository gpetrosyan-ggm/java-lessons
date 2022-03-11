package com.demo.progresstests.exercies11;
/*
Напишите класс, который выполняет следующие действия:
1. Принимает с клавиатуры два целых числа.
2. Создает и выводит на экран 20 случайных чисел в диапазоне от первого,
   только что введенного с клавиатуры, значения, - до второго значения,
   также введенного с клавиатуры перед этим. Можно исходить из предположения,
   что первое из вводимых чисел всегда меньше второго.

Например, если с клавиатуры были введены значения -8 и 17,
то класс создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти значения).
 */

import java.util.Scanner;

public class Exercies11_2 {
    public static void main(String[] args) {
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("kamayakan tiv");
        int a = scanner.nextInt();

        System.out.println("grel tiv naxordic mec");
        int b = scanner.nextInt();

        int d = a + 20;
        for (int i = a; i < d; i++) {
            c = (int) (Math.random() * (a - b + 1) + b);
            System.out.println(c);

        }
        scanner.close();

    }
}
