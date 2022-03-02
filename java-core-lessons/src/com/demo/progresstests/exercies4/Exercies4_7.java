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
        if ((a / 1000) % 2 == 0) {
            System.out.println("arajin tiv@ zuyg e " + a / 1000);
        } else ;
        if ((a/100 % 10) % 2 == 0) {
            System.out.println("erkrord tiv@ zuyg e " + a/100%10);
        } else ;
        if ((a/10%10) % 2 == 0) {
            System.out.println("errord tiv@ zuyg e " + a/10%10);
        } else ;
        if ((a%10)%2 == 0) {
            System.out.println("chorord tiv@ zuyg e " + a%10);
        }
        scanner.close();
    }
}
