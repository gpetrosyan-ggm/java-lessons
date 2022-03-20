package com.demo.progresstests.exercies9;
/*
Напишите класс, который принимает с клавиатуры два положительных числа - двузначное
и четырехзначное - и проверяет, сколько раз двузначное число фигурирует
как «внутреннее» по отношению к четырехзначному.
 */

import java.util.Scanner;

public class Exercies9_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("erknish tiv");
        int a = scanner.nextInt();

        System.out.println("qaranish tiv");
        int b = scanner.nextInt();

        int b1 = b % 100;
        int b2 = (b / 10) % 100;
        int b3 = b / 100;
        int x = 0;

        if (a == b1) {
            x++;
        }
        if (a == b2) {
            x++;
        }
        if (a == b3) {
            x++;
        }
        System.out.println("X = " + x);

        scanner.close();
    }
}
