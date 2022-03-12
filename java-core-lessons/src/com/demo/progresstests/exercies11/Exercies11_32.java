package com.demo.progresstests.exercies11;
/*
Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное число
  (нет необходимости проверять соответствие введенного значения этому условию);
• затем выводит на экран четырехзначные целые положительные числа,
  в которых и сумма двух первых цифр, и сумма двух последних цифр равны сумме
  цифр двузначного числа, введенного с клавиатуры.
 */

import java.util.Scanner;

public class Exercies11_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("erknish tiv");
        int a = scanner.nextInt();
        int a1 = a / 10;
        int a10 = a % 10;
        int a2 = a1 + a10;

        for (int i = 1000; i <= 9999; i++) {

            int i1000 = i / 1000;
            int i100 = i / 100 % 10;
            int i2 = i1000 + i100;

            int i10 = i / 10 % 10;
            int i1 = i % 10;
            int i3 = i10 + i1;

            if (i2 == a2 && i3 == a2) {
                System.out.println(i + " ");
            }
        }
    }
}
