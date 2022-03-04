package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
какая из его двух цифр является большей.
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
Не следует выводить на экран никакого сообщения, если число составлено из одинаковых цифр.
 */

import java.util.Scanner;

public class Exercies8_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erknish drakan");

        int a = scanner.nextInt();
        if (a / 10 > a % 10) {
            System.out.println("tasnavor@ mec e miavoric");
        }
        if (a / 10 < a % 10) {
            System.out.println("miavor@ mec e tasnavoric");
        }
        scanner.close();
    }
}
