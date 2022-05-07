package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры два целых числа.
Класс должен определить, мoгут ли эти числа быть числителем (первое)
и знаменателем (второе) дроби.
В случае если числа выражают неправильную дробь, следует вывести
на экран соответствующую ей правильную сложную дробь,
а во всех остальных случаях - текстовое сообщение Подсчет не производится.
Например, если с клавиатуры введены значения 7 и 12 - на экран выводится
сообщение Подсчет не производится; если введены 12 и 7, то на экран выводится 1 5/7
 */

import java.util.Scanner;

public class Exercies8_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("drakan amboxjakan tiv ..");

        int a = scanner.nextInt();
        System.out.println("drakan amboxjakan tiv ..");

        double b = scanner.nextDouble();
        if (a < b) {
            System.out.println("kotorak@ liarjeq e");
        } else {
            System.out.println(a / b);
        }
        scanner.close();
    }
}
