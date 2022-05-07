package com.demo.progresstests.exam1.exercies7;
/*
Напишите класс, который принимает с клавиатуры два различных числа.
Класс должен вывести на экран эти числа в порядке возрастания в одной строке,
а в другой - их же, но в порядке убывания.
 */

import java.util.Scanner;

public class Exercies7_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" tiv ..");

        int a = scanner.nextInt();
        System.out.println("mi hat el urish tiv");

        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(b + "  " + a);
            System.out.println(a + "  " + b);
        } else {
            System.out.println(a + "  " + b);
            System.out.println(b + "  " + a);
        }
        scanner.close();
    }
}
