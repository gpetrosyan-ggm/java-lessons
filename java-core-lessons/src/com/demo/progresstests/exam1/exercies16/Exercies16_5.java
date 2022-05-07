package com.demo.progresstests.exam1.exercies16;
/*
Старинная задача: сколько можно купить быков и коров на 100 рублей,
если плата за быка 10 рублей, за корову - 5 рублей (во всех вариантах).
Напишите класс, который выводит на экран все возможные варианты
решения задачи.
 */

public class Exercies16_5 {
    public static void main(String[] args) {

        for (int cow = 0; cow < 21; cow++) {

            for (int bull = 0; bull < 11; bull++) {

                int sum = (cow * 5) + (bull * 10);
                if (sum == 100) {
                    System.out.println(cow + " -kov " + bull + " -cul");
                }

            }
        }
    }
}
