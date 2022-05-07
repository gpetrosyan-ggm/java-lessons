package com.demo.progresstests.exam1.exercies12;
/*
Напишите класс, который принимает для каждого из 1234 учеников района дату его рождения
(день, месяц, год). Класс должен подсчитать и вывести на экран число детей,
родившихся зимой, весной, летом и осенью.
 */

// chgitem chisht em te sxal, fantaziayis em xod tvel
public class Exercies12_12 {
    public static void main(String[] args) {
        int min = 1;
        int max = 12;
        int dzmer = 0;
        int garun = 0;
        int amar = 0;
        int ashun = 0;

        for (int i = 1; i <= 1234; i++) {

            int a = (int) (Math.random() * (max - min + 1) + min);
            if (a < 2 || a == 12) {
                dzmer++;

            } else if (a <= 5) {
                garun++;
            } else if (a <= 8) {
                amar++;
            } else {
                ashun++;
            }
        }
        System.out.println("dzmer " + dzmer);
        System.out.println("garun " + garun);
        System.out.println("amar " + amar);
        System.out.println("ashun " + ashun);
    }
}
