package com.demo.progresstests.exercies8;
/*
Четырехзначное число называется «парно-симметричным», если две его первых цифры
и две его последних цифры образуют одинаковые числа (например - 5252).
Напишите класс, который принимает с клавиатуры четырехзначное положительное число
и определяет, является ли оно «парно-симметричным».
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qaranish drakan");

        int a = scanner.nextInt();
        int a10 = a / 100;
        int a1 = a % 100;
        if (a10 == a1) {
            System.out.println("krknaki simetrik ");
        } else {
            System.out.println("chi hamapatasxanum");
        }
        scanner.close();
    }
}
