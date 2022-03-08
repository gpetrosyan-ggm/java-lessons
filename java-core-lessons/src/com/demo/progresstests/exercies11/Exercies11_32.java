package com.demo.progresstests.exercies11;
/*
Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное число
  (нет необходимости проверять соответствие введенного значения этому условию); //pah, yani minjev et stugum eyi, grox@ es em
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
        for (int i = 1000; i <= 9999; i++) {
            int i1000 = i / 1000;
            int i100 = i / 100 % 10;
            int i10 = i / 10 % 10;
            int i1 = i % 10;
            if (i1000 + i100 == a && i10 + i1 == a) {
                System.out.println(i + " ");
            }
        }
    }
}
