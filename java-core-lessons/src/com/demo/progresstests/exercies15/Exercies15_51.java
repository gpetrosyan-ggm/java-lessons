package com.demo.progresstests.exercies15;
/*
Игра в кости проходит по следующим правилам:
в каждом «круге» игры два игрока бросают каждый по два кубика, на гранях которых - цифры от 1 до 6.
Игра заканчивается, если хотя бы один из победителей набрал больше второй 100 - очков.
Если один из игроков набрал больше 100 очков, а второй - нет,
набравший более 100 объявляется победителем.
Если оба игрока набрали более 100 очков, объявляется ничья.
Напишите класс, реализующий модель этой игры и определяющий результат,
в соответствии с которым на экран выводится текстовое сообщение.
 */

public class Exercies15_51 {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int one = 0;
        int two = 0;

        while (true) {
            int a = (int) ((Math.random() * (max - min + 1) + min));
            int b = (int) ((Math.random() * (max - min + 1) + min));
            one += a;
            two += b;
            System.out.println(one + " - " + two);

            if (one > 100 && two > 100) {
                System.out.println("vochvoqi");
                break;
            }
            if (one > 100) {
                System.out.println("haxtec arajin netox@");
                break;
            }
            if (two > 100) {
                System.out.println("haxtec erkrord masnakic@");
                break;
            }
        }
        System.out.println();
    }
}
