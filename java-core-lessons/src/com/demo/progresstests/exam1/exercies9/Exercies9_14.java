package com.demo.progresstests.exam1.exercies9;
/*
Напишите класс, который принимает с клавиатуры целое число, которое должно означать
порядковый номер месяца. В случае если полученное значение действительно
соответствует порядковому номеру одного из месяцев, следует вывести сезон
(лето, осень, зима, весна), к которому относится месяц.
В случае если введенное значение не является порядковым номером месяца,
следует вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        if (a >= 1 && a <= 12) {
            if (a == 12 || a == 1 || a == 2) {
                System.out.println("dzmer");

            } else if (a == 3 || a == 4 || a == 5) {
                System.out.println("garun");

            } else if (a == 6 || a == 7 || a == 8) {
                System.out.println("amar");

            } else {
                System.out.println("ashun");
            }
        } else {
            System.out.println("tarva nman amis goyutyun chuni");
        }
        scanner.close();
    }
}
