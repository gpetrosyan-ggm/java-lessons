package com.demo.progresstests.exercies9;
/*
Напишите класс, который принимает с клавиатуры четырехзначное число,
которое должно определять некоторый год в период с 16 по 20 века включительно.
Класс должен вывести на экран либо сообщение, к которому веку из указанного диапазона
относится введенное значение, либо текстовое сообщение, что введенное значение
не является одним из годов из указанного диапазона.
 */


import java.util.Scanner;

public class Exercies9_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qaranish drakan");
        int a = scanner.nextInt();

        if (a > 1500 && a <= 2000) {
            if (a > 1500 && a <= 1600) {
                System.out.println(a + " - 16 dar");

            } else if (a > 1600 && a <= 1700) {
                System.out.println(a + " - 17 dar");

            } else if (a > 1700 && a <= 1800) {
                System.out.println(a + " - 18 dar");

            } else if (a > 1800 && a <= 1900) {
                System.out.println(a + " - 19 dar");

            } else {
                System.out.println(a + " - 20 dar");
            }
        } else {
            System.out.println(" chi patkanum 16-ic 20-rd darin");
        }
        scanner.close();
    }
}
