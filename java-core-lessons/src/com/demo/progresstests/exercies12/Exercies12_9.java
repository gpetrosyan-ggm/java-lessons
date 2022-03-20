package com.demo.progresstests.exercies12;
/*
Определим как «красивое» целое положительное трехзначное число Х,
для которого выполняется следующее условие:
сумма квадратов первой и последней цифр равна квадрату средней цифры.
Напишите класс, который выводит на экран все «красивые» числа и их количество.
 */

public class Exercies12_9 {
    public static void main(String[] args) {
        int a = 0;


        for (int i = 100; i <= 999; i++) {

            int i100 = i / 100;
            int i10 = i / 10 % 10;
            int i1 = i % 10;
            int b = (i100 + i1) * (i100 + i1);
            int c = i10 * i10;

            if (b == c) {
                a++;
                System.out.println(i);
            }
        }
        System.out.println("gexecik tveri qanak@ " + a);
    }
}
