package com.demo.progresstests.exercies7;
/*
Напишите класс, который принимает с клавиатуры два числа,
первое из которых - количество учеников в классе,
а второе - количество стульев в классной комнате.
Программа должна проверить, всем ли ученикам будет, где сесть.
 */

import java.util.Scanner;

public class Exercies7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ashakertneri tiv@  ");

        int a = scanner.nextInt();
        System.out.println("atorneri qanak ");

        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println("dzec ashakertner@ khajaxen dproc");
        } else {
            System.out.println("ancanq heravar das@ntaci");
        }
        scanner.close();
    }
}
