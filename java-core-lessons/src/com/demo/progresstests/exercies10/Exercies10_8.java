package com.demo.progresstests.exercies10;
/*
Два человека играют в кости по следующим правилам: в каждом раунде игры
(а она состоит из 10 раундов) каждый из участников бросает «кость»
(кубик, на гранях которого значения от 1 до 6).
В каждом раунде определяется победитель или фиксируется состояние «ничья»,
в зависимости от значения, которое выпало на кубике участника.
Напишите класс, который моделирует эту игру, указывая для каждого
раунда, кто из игроков набрал в этом раунде больше очков - или сообщая О СОСТОЯНИИ «НИЧЬЯ».
 */

public class Exercies10_8 {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int a;
        int b;

        for (int i = 1; i < 11; i++) {
            a = (int) (Math.random() * (min - max + 1) + max);
            System.out.println(i + " brosok");
            System.out.println(a);
            for (int j = 0; j < i; j = i) {
                b = (int) (Math.random() * (min - max + 1) + max);
                System.out.println(b);
                if (a == b) {
                    System.out.println("voch voqi");
                } else if (a > b) {
                    System.out.println("arajin gcox@ haxtec");
                } else {
                    System.out.println("erkrord gcox@ haxtec");
                }
            }

        }
    }
}
