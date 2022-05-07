package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
является ли в нем первая цифра (десятков) больше второй (единиц).
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erknish drakan tiv");

        int a = scanner.nextInt();
        int a10 = a / 10;
        int a1 = a % 10;
        if (a10 > a1) {
            System.out.println("tasnavor@ mec e mianishic");
        } else {
            System.out.println("tasnavor@ poqr e mianishic");
        }
        scanner.close();
    }
}
