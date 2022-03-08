package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры целое число а затем выводит на экран
все степени двойки от N, 1 до N включительно.
 */

import java.util.Scanner;

public class Exercies11_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i *=2) {

            System.out.println(i);
        }
    }
}
