package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное число;
• затем выводит на экран (в строку с пробелами) трехзначные целые положительные числа,
  в которых предварительно введенное двузначное число является «внутренней» частью
  (как, например, 23 для 123 или 623).
 */

import java.util.Scanner;

public class Exercies11_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan erknish tiv");
        int a = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            int c = i * 100 + a;
            System.out.print(c + " ");
        }
    }
}

