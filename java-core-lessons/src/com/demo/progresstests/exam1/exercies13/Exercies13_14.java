package com.demo.progresstests.exam1.exercies13;
/*
Напишите класс, который принимает с клавиатуры двузначное положительное целое число Х,
составленное из разных цифр, и возвращает сумму однозначных чисел,
заключенных между цифрами этого числа Х (включая сами цифры, из которых составлено число Х).
Например, и для числа 52, и для числа 25 будет возвращено значение 14 (2 + 3 + 4 + 5 = 14).
 */

import java.util.Scanner;

public class Exercies13_14 {
    public static void main(String[] args) {
        int mec;
        int poqr;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("erknish tiv");
        int a = scanner.nextInt();

        int a10 = a / 10;
        int a1 = a % 10;
        if (a10 > a1) {
            mec = a10;
            poqr = a1;

        } else {
            mec = a1;
            poqr = a10;
        }
        for (int i = poqr; i <= mec; i++) {
            b = b + i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(+b);
    }
}
