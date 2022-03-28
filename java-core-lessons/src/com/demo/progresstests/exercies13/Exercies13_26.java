package com.demo.progresstests.exercies13;
/*
Напишите класс, который принимает с клавиатуры две пары целых чисел:
• первая пара - значение и порядковый номер одного члена арифметической прогрессии;
• вторая пара - значение и порядковый номер другого члена этой же прогрессии.
Класс должен вывести на экран все члены этой арифметической прогрессии,
расположенные между двумя введенными.
В случае если речь идет о двух соседних членах,
на экран следует вывести соответствующее текстовое сообщение.
 */
//An = A1 + D(n-1), An-@ n-rd andamn e, D-n progresiayi qayl@

import java.util.Scanner;

public class Exercies13_26 {
    public static void main(String[] args) {
        int x;
        int y;
        int d;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" progresiayi andam ");
        int a = scanner.nextInt();
        System.out.println(" progresiayi andami hamar@ ");
        int n1 = scanner.nextInt();

        System.out.println(" progresiayi andam ");
        int b = scanner.nextInt();
        System.out.println(" progresiayi andami hamar@ ");
        int n2 = scanner.nextInt();

        if (a < b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        d = (y - x) / (n2 - n1);

        for (int i = x + d; i < y; i += d) {
            System.out.print(" " + i);
        }
        scanner.close();
    }
}
