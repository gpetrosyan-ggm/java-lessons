package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры два целых положительных числа:
N и М (неизвестно, какое из введенных чисел больше).
Класс должен вывести на экран все целые числа между наименьшим
и наибольшим значениями, введенными с клавиатуры.
 */

import java.util.Scanner;

public class Exercies11_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        System.out.println("eli drakan");
        int b = scanner.nextInt();
        int k = a < b ? a : b;
        int c = k + 1;
// kbacatres tenarniyi vaxt vonc grem, i<b || i<a - poxaren mi hat payman, i< ?, vor chisht lini
        for (int i = c; i < b || i < a; i++) {
            k++;
            System.out.println(i + " ");


        }
    }
}
