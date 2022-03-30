package com.demo.progresstests.exercies14;
/*
В соревнованиях по бегу принимали участие 150 учеников школы.
Напишите класс, который принимает с клавиатуры время, показанное в соревнованиях каждым
из учеников, и выводит на экран наилучший результат, а также порядковый номер победителя
(можно предположить, что есть только один победитель).
 */

import java.util.Scanner;

public class Exercies14_2 {
    public static void main(String[] args) {
        int j = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-i jamanak@");
        int a = scanner.nextInt();

        for (int i = 2; i <= 150; i++) {

            System.out.println(i + "-i jamanak@");
            int b = scanner.nextInt();

            if (b < a) {
                a = b;
                j = i;
            }
        }
        System.out.println(j + "hamari tak handes ekox@ hamarvum e haxtox u ir cucanishn e" + a);
        scanner.close();
    }
}
