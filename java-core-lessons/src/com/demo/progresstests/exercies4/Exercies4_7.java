package com.demo.progresstests.exercies4;
/*
Назовем «степенью четности» числа количество четных цифр в нем. Например, для числа 4612
степень четности равна 3 (в его составе три четных цифры - 4, 6 и 2).
Напишите класс, который принимает с клавиатуры положительное
четырехзначное число, а затем вычисляет и выводит на экран его «степень четности».
 */

import java.util.Scanner;

public class Exercies4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qaranish tiv ...");

        int a = scanner.nextInt();
        int a1000 = a / 1000;
        int a100 = a / 100 % 10;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        int i = 0;
        int i1000 = 0;
        int i100 = 0;
        int i10 = 0;
        int i1 = 0;
        if (i == 0) {
            if (a1000 % 2 == 0) {
                System.out.println("arajin tiv@ zuyg e " + a1000);
                 i1000 = 1;
            } else ;
            if (a100 % 2 == 0) {
                System.out.println("erkrord tiv@ zuyg e " + a100);
                 i100 = 1;
            } else ;
            if (a10 % 2 == 0) {
                System.out.println("errord tiv@ zuyg e " + a10);
                i10 = 1;
            } else ;
            if (a1 % 2 == 0) {
                System.out.println("chorord tiv@ zuyg e " + a1);
                 i1 = 1;
            }
            System.out.println(" zuyg tvanshanneri qanak@ klini " + (i1000 + i100 + i10 + i1));
            scanner.close();
        }
    }
}
