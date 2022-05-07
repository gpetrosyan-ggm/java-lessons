package com.demo.progresstests.exam1.exercies12;
/*
Для того чтобы проверить утверждение «орел и решка, при подбрасывании монеты,
выпадают примерно одинаковое количество раз», ученик подбросил монету сначала 10,
потом 100, потом 1000 раз. В каждой серии он записывал,
сколько раз выпадала «решка», сколько- «орел».
Напишите класс, который моделирует эти три серии и для каждой подсчитывает количество
выпадений «орла» и количество выпадений «решки», и выводит на экран абсолютное
и относительное значение разницы между этими количествами.
 */

// выводит на экран абсолютное и относительное значение разницы между этими количествами.
// sensey es moment@ chjogi
public class Exercies12_13 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1;
        int reshka10 = 0;
        int oryol10 = 0;
        int reshka100 = 0;
        int oryol100 = 0;
        int reshka1000 = 0;
        int oryol1000 = 0;

        for (int i = 1; i <= 10; i++) {

            int a = (int) (Math.random() * (max - min + 1) + min);
            if (a == 1) {
                reshka10++;

            } else {
                oryol10++;
            }
        }
        System.out.println("oryol10     " + oryol10 + " - " + reshka10 + "     reshka10");

        for (int i = 1; i <= 100; i++) {

            int b = (int) (Math.random() * (max - min + 1) + min);
            if (b == 1) {
                reshka100++;

            } else {
                oryol100++;
            }
        }
        System.out.println("oryol100   " + oryol100 + " - " + reshka100 + "   reshka100");
        for (int i = 1; i <= 1000; i++) {

            int b = (int) (Math.random() * (max - min + 1) + min);
            if (b == 1) {
                reshka1000++;

            } else {
                oryol1000++;
            }

        }
        System.out.println("oryol1000 " + oryol1000 + " - " + reshka1000 + " reshka1000");
    }
}
