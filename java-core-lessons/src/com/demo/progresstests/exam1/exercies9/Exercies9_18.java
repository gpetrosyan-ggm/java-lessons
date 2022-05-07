package com.demo.progresstests.exam1.exercies9;
/*
Напишите класс, который принимает с клавиатуры промежуток времени, выраженный в секундах,
и выводит на экран его же, но выраженный в минутах и секундах.
Если промежуток времени превышает час, то надо не производить пересчет,
а просто вывести на экран текстовое сообщение Расчет не производится.
 */

import java.util.Scanner;

public class Exercies9_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();
        int rope = a / 60;

        if (a > 0 && a < 3600) {
            System.out.println(rope + " rope " + a % 60 + " varkyan");

        } else {
            System.out.println("hashvark@ chi katarvum");
        }
        scanner.close();
    }
}
