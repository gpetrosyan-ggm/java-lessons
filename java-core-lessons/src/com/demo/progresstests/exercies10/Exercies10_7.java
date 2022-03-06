package com.demo.progresstests.exercies10;
/*
Напишите класс, который повторяет предыдущее задание, но предоставляет игроку получить,
если он того захочет, еще и четвертую карту. Это, например, можно сделать через
ввод с клавиатуры значения, и, если введено значение 1 (единица), то это означает
согласие игрока на получение четвертой карты.
 */

public class Exercies10_7 {
    public static void main(String[] args) {
        int min = 1;
        int max = 11;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        //int a= a1 +a2+a3+a4;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                a1 = (int) (Math.random() * (min - max + 1) + max);
            } else if (i == 1) {
                a2 = (int) (Math.random() * (min - max + 1) + max);
            } else {
                a3 = (int) (Math.random() * (min - max + 1) + max);
            }
        }
        System.out.println(a1 + " " + a2 + " " + a3);
        if (a1 == 1 || a2 == 1 || a3 == 3) {
            System.out.println("dzez trvum e evs mek qart ");
            a4 = (int) (Math.random() * (min - max + 1) + max);
        }
        // verum vor haytararum u veragrum en a-n, inq@ misht zro e, vonc anem
        int a = a1 + a2 + a3 + a4;

        if (a < 21) {
            System.out.println(a + " недобор ");
        } else if (a == 21) {
            System.out.println(a + " «очко»");
        } else {
            System.out.println(a + " перебор");
        }
    }

}
