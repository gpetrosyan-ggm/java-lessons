package com.demo.progresstests.exercies9;
/*
В кассе имеются купюры достоинством 100, 50 и 10 рублей.
Напишите класс, который принимает с клавиатуры целое число, выражающее сумму в рублях,
которую надо выплатить. Класс должен определить, каким минимальным набором купюр можно
выдать введенную с клавиатуры сумму и какими купюрами.
Если нет возможности выплатить указанную сумму, на экран следует
вывести соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inchqan karas mucves? ");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a50 = (a % 100) / 50;
        int a10 = (a % 100 - a50 * 50) / 10;

        if (a % 10 == 0) {
            System.out.println(a100 + " haryurnoc " + a50 + " hisunnoc " + a10 + " tasanoc");
        } else {
            System.out.println("tasanocic poqr pox chka mots");
        }
        scanner.close();

    }
}
