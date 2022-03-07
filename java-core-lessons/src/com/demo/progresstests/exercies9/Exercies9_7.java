package com.demo.progresstests.exercies9;
/*
Напишите класс, который принимает с клавиатуры два числа, которые должны быть
значениями двух углов в треугольнике. Класс должен определять, о каком из следующих типов
треугольников идет речь: остроугольный, тупоугольный, прямоугольный, равнобедренный,
равносторонний (возможно, что треугольник относится сразу к двум типам).
В случае если введенные с клавиатуры данные (или хотя бы одно из
них) не могут быть углами треугольника, следует вывести на экран сообщение Ошибочные данные.
 */

import java.util.Scanner;

public class Exercies9_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("erankyan ankyun");
        int a = scanner.nextInt();

        System.out.println("2-rd ankyun@ ");
        int b = scanner.nextInt();

        int c = 180 - a - b;

        if ((a + b) <= 180 && a != 0 && b != 0 && c != 0) {

            if (a > 90 || b > 90 || c > 90) {
                System.out.println("butankyun erankyuni");
            }
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("uxxankyun erankyun");
            }else {
                System.out.println("surankyun erankyun");
            }
            if (a == b && a == c) {
                System.out.println("havasarakoxm erankyun");
            }
        } else {
            System.out.println("@ntrvac tver@ chen karox handisanal erankyan ankyunner");
        }
        scanner.close();

    }
}
