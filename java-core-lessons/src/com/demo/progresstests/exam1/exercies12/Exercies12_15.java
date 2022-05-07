package com.demo.progresstests.exam1.exercies12;
/*
Напишите класс, который принимает с клавиатуры целое положительное число Х и
выводит на экран все его делители (1 и само число Х не считать делителями).
Класс должен также подсчитать количество этих делителей и вывести результат на экран
вместе с соответствующим по смыслу текстовым сообщением.
 */

import java.util.Scanner;

public class Exercies12_15 {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("amboxjakan tiv");
        int x = scanner.nextInt();
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println(i + " ");
                a++;
            }
        }
        System.out.println(x + "-i bajanararneri qanak@ " + a);
    }
}
