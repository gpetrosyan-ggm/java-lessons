package com.demo.progresstests.exam1.exercies8;
/*
Назовем «степенью четности» числа количество четных цифр в его составе
(например, степень четности для 2346 равна 3).
Напишите класс, который принимает с клавиатуры трехзначное положительное число и определяет,
какова его «степень четностю>.
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish drakan");

        int a = scanner.nextInt();
        int a100 = a / 100 % 2;
        int a10 = (a / 10 % 10) % 2;
        int a1 = (a % 10) % 2;
        if (a100 == 0 || a10 == 0 || a1 == 0) {
            System.out.println("drakan tveri qanak@ " + (3 - a100 - a10 - a1));
        } else {
            System.out.println("tvanshani bolor tver@ bacasakan en");
        }

        scanner.close();
    }

}
