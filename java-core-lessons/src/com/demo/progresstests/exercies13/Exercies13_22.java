package com.demo.progresstests.exercies13;
/*
Напишите класс, который создает серию из 20 случайных чисел из диапазона 30-49.
Числа в серии следует вывести на экран в одну строку следующим образом:
• перед значениями, которые меньше первого в серии, вывести знак «минус»;
• перед значениями, которые больше первого в серии, вывести знак «ПЛЮС».
 */

public class Exercies13_22 {
    public static void main(String[] args) {

        int start = 30;
        int finish = 49;

        int a = (int) (Math.random() * (finish - start + 1) + start);
        System.out.print(a + "   ");

        for (int i = 1; i < 20; i++) {

            int b = (int) (Math.random() * (finish - start + 1) + start);

            if (b < a) {
                System.out.print(" -" + b);
            } else if (b > a) {
                System.out.print(" +" + b);
            } else {
                System.out.print(" " + b);
            }
        }
    }
}
