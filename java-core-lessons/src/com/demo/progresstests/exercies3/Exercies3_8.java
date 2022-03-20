package com.demo.progresstests.exercies3;
/*
Компания по продаже минеральной воды проводит конкурс «Балл подкрышкой»:
на внутренней стороне пробок, которыми закрыты бутылки, выпускаемые компанией,
напечатаны призовые баллы. Есть пробки, «равные» 10 баллам, есть - 100, есть - 1000.
Напишите класс, который принимает с клавиатуры три числа,
означающие количество пробок каждого типа, собранных Васей, и выводит
на экран общее количество баллов, которые Вася получил.
 */

import java.util.Scanner;

public class Exercies3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 balanocneri qanak@ ...");

        int a10 = scanner.nextInt();
        System.out.println(" 100 balanoci qanak@ ..");

        int a100 = scanner.nextInt();
        System.out.println(" 1000 balanoci qanak@ ...");

        int a1000 = scanner.nextInt();
        System.out.println("vasyan itogum havaqec " + (a10 * 10 + a100 * 1000 + a1000 * 1000));

        scanner.close();
    }
}
