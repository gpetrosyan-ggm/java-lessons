package com.demo.progresstests.exam1.exercies9;
/*
Напишите класс, который принимает с клавиатуры трехзначное число и проверяет,
на какое число из составляющих его цифр оно делится (без остатка).
Следует учесть возможность того, что одной из цифр в проверяемом числе может быть и О.
 */

import java.util.Scanner;

public class Exercies9_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eranis");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;

        if (a % a100 == 0) {
            System.out.println("haryuravori vra bajanvum e anmnacord");
        }

        if (a10 == 0) {
            System.out.println("tasnordakan@ 0 e");
        } else if (a % a10 == 0) {
            System.out.println("tasnavori vra kajanvum e anmnacord");
        }

        if (a1 == 0) {
            System.out.println("miavor@ 0 e");
        } else if (a % a1 == 0) {
            System.out.println("miavori vra bajanvum e anmnacord");

        }
        if (a10 != 0 && a1 != 0 && a % a100 != 0 && a % a10 != 0 && a % a1 != 0) {
            System.out.println("nisheric voch meki vra chi bajanvum anmnacord");
        }
        scanner.close();
    }
}
