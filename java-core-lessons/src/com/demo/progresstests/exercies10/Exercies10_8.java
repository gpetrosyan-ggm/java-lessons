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
        int max = 7;  // poxel 6-ic 7 em sarqel vor 6 el tpi, te che random@ 6 chi tpum

        for (int i = 1; i < 11; i++) {
            System.out.println(); // zut tox em bac toxel vor irar havasarven
            System.out.println(i + " brosok");

            int a = (int) (Math.random() * (min - max + 1) + max);
            System.out.println(a);

            int b = (int) (Math.random() * (min - max + 1) + max);
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

