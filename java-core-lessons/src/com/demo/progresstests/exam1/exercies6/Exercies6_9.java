package com.demo.progresstests.exam1.exercies6;
/*
Напишите класс, который принимает с клавиатуры три значения (а, Ь и с),
являющиеся коэффициентами квадратного уравнения.
Класс должен определить, имеется ли у этого уравнения хотя бы один
корень (решение), и вывести на экран соответствующее текстовое сообщение.
 */
// D = b*b - 4ac >= 0

import java.util.Scanner;

public class Exercies6_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tiv gri, vor@ havasar che 0");

        int a = scanner.nextInt();
        System.out.println("eli tiv");

        int b = scanner.nextInt();
        System.out.println("noric tiv");

        int c = scanner.nextInt();
        if ((b * b - 4 * a * c) < 0) {
            System.out.println("lucum chuni");
        }
        if ((b * b - 4 * a * c) >= 0) {
            System.out.println("qarakusi havasarum@ uni gone mek lucum");
        }
        scanner.close();
    }
}

