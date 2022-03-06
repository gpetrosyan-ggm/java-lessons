package com.demo.progresstests.exercies10;
/*
Напишите класс, который принимает с клавиатуры целое число и затем
генерирует («придумывает>>) случайное число из следующего диапазона:
 • «центром диапазона» является введенное с клавиатуры число;
 • количество чисел в диапазоне равно 11.
Класс должен определять, «угадал» ли компьютер введенное число и выводить на экран
одно из сообщений (в зависимости от соотношения введенного и «придуманного» чисел):
 • угадал - если числа совпали;
 • слишком большое - если «придуманное» компьютером число больше введенного с клавиатуры;
 • слишком маленькое - если «придуманное» компьютером число меньше введенного с клавиатуры.
 */

import java.util.Scanner;

public class Exercies10_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("amboxjakan tiv ");

        int a = scanner.nextInt();
        int min = a - 5;
        int max = a + 5;
        int a1;

        a1 = (int) (Math.random() * (min - max + 1) + max);
        System.out.println(a1);

        if (a == a1) {
            System.out.println("gushakecir");

        } else if (a > a1) {
            System.out.println("mec e");

        } else {
            System.out.println("shat poqr e");
        }
    }
}
