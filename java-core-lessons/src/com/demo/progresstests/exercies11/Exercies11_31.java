package com.demo.progresstests.exercies11;
/*
Напишите класс, который:
• сначала вводит с клавиатуры целое положительное двузначное число;
• затем выводит на экран (в строку с пробелами) четырехзначные целые положительные числа,
  в которых предварительно введенное двузначное число является «внутренней» частью
  (как, например, 23 для 1523, или 6237, или 4230).
 */
// es el luceci ancaci beracs orinakov

import java.util.Scanner;

public class Exercies11_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("erknish tiv");
        int a = scanner.nextInt();

        for (int i = 10; i <= 99; i++) {
            System.out.print((i * 100 + a) + " ");
        }
    }
}
