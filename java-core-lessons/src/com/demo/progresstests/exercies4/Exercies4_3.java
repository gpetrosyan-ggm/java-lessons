package com.demo.progresstests.exercies4;
/*
Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
и выводит его на экран в «полном виде»: например, для числа 364 это будет выглядеть
как 300+60+4.
 */

import java.util.Scanner;

public class Exercies4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" eranish drakan tiv ...");

        int a = scanner.nextInt();
        System.out.println((a / 100 * 100) + "+" + ((a - a / 100 * 100) - a % (a / 10)) + "+" + a % (a / 10));
    }
}
