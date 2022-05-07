package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число х.
Класс должен найти наименьшее целое положительное двузначное число, сумма цифр которого равна х.
Если такого двузначного числа не существует,
следует вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies15_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int x = scanner.nextInt();
        int i = 10;
        while (true) {

            int i10 = i / 10;
            int i1 = i % 10;
            int ii = i10 + i1;
            if (ii == x) {
                System.out.println("bingo");
                break;
            }
            i++;
            if (i > 99) {
                System.out.println("aydpisi erknish tiv chka");
                break;
            }
        }
    }
}
