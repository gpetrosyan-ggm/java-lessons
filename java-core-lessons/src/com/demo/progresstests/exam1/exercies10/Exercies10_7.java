package com.demo.progresstests.exam1.exercies10;
/*
Напишите класс, который повторяет предыдущее задание, но предоставляет игроку получить,
если он того захочет, еще и четвертую карту. Это, например, можно сделать через
ввод с клавиатуры значения, и, если введено значение 1 (единица), то это означает
согласие игрока на получение четвертой карты.
 */

import java.util.Scanner;

public class Exercies10_7 {
    public static void main(String[] args) {
        int min = 2;
        int max = 11;
        int a;
        int a4 = 0;

        int a1 = (int) (Math.random() * (min - max + 1) + max);
        int a2 = (int) (Math.random() * (min - max + 1) + max);
        int a3 = (int) (Math.random() * (min - max + 1) + max);
        Scanner scanner = new Scanner(System.in);
        System.out.println("4-rd kart cankanum eq, sexmeq 1 hakarak tepqum kamayakn ayl");

        int b = scanner.nextInt();
        if (b == 1) {
            System.out.println("dzer 4-rd qart@");
            a4 = (int) (Math.random() * (min - max + 1) + max);
            System.out.println(a4);
        }
        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4);
        a = a1 + a2 + a3 + a4;
        if (a < 21) {
            System.out.println(a + " недобор ");
        } else if (a == 21) {
            System.out.println(a + " «очко»");
        } else {
            System.out.println(a + " перебор");
        }

    }
}
