package com.demo.progresstests.exercies14;
/*
Напишите класс, который генерирует серию из 50 случайных целых чисел из диапазона от -40 до +40,
и определяет наибольшее и наименьшее значение в сгенерированной серии.
 */

public class Exercies14_3 {
    public static void main(String[] args) {
        int start = -40;
        int and = 40;
        int c;

        int a = (int) (Math.random() * (and - start + 1) + start);
        System.out.println("1 : " + a);
        c = a;

        for (int i = 2; i < 51; i++) {

            int b = (int) (Math.random() * (and - start + 1) + start);
            System.out.println(i + " : " + b);

            if (b > c) {
                c = b;
            } else if (b < a) {
                a = b;
            }
        }
        System.out.println(c + " / " + a);
    }
}
