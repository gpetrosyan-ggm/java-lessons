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
        int a100 = a / 100 * 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        System.out.println(a100 + "+" + a10 + "+" + a1);
    }
}
