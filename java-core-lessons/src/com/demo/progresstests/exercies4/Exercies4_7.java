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

        int abcd = scanner.nextInt();
        if ((abcd / 1000) % 2 == 0) {
            System.out.println("arajin tiv@ zuyg e " + abcd / 1000);
        } else ;
        if (((abcd - ((abcd / 1000) * 1000)) / 100) % 2 == 0) {
            System.out.println("erkrord tiv@ zuyg e " + ((abcd - ((abcd / 1000) * 1000)) / 100));
        } else ;
        if (((abcd - (abcd / 1000) * 1000) - (((abcd - (abcd / 1000) * 1000) / 100) * 100)) / 10 % 2 == 0) {
            System.out.println("errord tiv@ zuyg e " +
                               ((abcd - (abcd / 1000) * 1000) - (((abcd - (abcd / 1000) * 1000) / 100) * 100)) / 10);
        } else ;
        if ((abcd % abcd / 10) == 0) {
            System.out.println("chorord tiv@ zuyg e " + (abcd % (abcd / 10)));
        }
        scanner.close();
    }
}
