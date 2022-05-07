package com.demo.progresstests.exam1.exercies13;
/*
Трехзначное число называется «числом Армстронга», если куб суммы цифр числа равен самому числу.
Напишите класс, который выводит на экран все трехзначные «числа Армстронга».
Класс также должен подсчитывать (и выводить на экран с соответствующим текстовым сообщением)
количество и сумму этих чисел.
 */

public class Exercies13_20 {
    public static void main(String[] args) {
        int j = 0;
        int c = 0;

        for (int i = 100; i < 1000; i++) {

            int i100 = i / 100;
            int i10 = i / 10 % 10;
            int i1 = i % 10;
            int k = (i100 + i10 + i1) * (i100 + i10 + i1) * (i100 + i10 + i1);

            if (i == k) {

                j = j + i;
                c++;
                System.out.println("i = " + i);
            }
        }
        System.out.println("gumar@ " + j);
        System.out.println("qanak@ " + c);
    }

}
