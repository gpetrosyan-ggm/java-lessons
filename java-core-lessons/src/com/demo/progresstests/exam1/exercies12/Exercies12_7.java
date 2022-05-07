package com.demo.progresstests.exam1.exercies12;
/*
Напишите класс, который принимает с клавиатуры целое число х,
а затем - серию из 29 дополнительных целых чисел (вводимых с клавиатуры).
Класс должен определить, сколько чисел в серии были равны значению переменной х,
а сколько - были меньше значения переменной х.
 */

import java.util.Scanner;

public class Exercies12_7 {
    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int x = scanner.nextInt();
        for (int i = 0; i < 29; i++) {
            System.out.println("tiv");
            int a = scanner.nextInt();
            if (a == x) {
                b++;
            }
            if (a < x) {
                c++;
            }

        }
        System.out.println("irar havasar en " + b + " aveli poqr " + c);
    }
}
