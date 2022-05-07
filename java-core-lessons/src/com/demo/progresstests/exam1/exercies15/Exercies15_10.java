package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры число для переменной Х,
а затем дополнительную серию чисел, каждое из которых используется для уменьшения значения
переменной Х. Ввод чисел должен производиться до тех пор,
пока значение переменной Х остается положительным.
 */

import java.util.Scanner;

public class Exercies15_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int x = scanner.nextInt();

        while (x > 0) {
            int a = scanner.nextInt();
            int tmpX = x - a;
            if (tmpX < 0) {
                break;
            }
            System.out.printf("%s - %s = %s \n Hajod tiv@ ... ", x, a, tmpX);
            x = tmpX;
        }
        scanner.close();
    }
}
