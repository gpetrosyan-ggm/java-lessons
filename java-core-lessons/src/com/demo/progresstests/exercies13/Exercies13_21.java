package com.demo.progresstests.exercies13;
/*
Напишите класс, который выводит на экран все двузначные числа, у которых удвоенная сумма цифр
равна их произведению.
Класс также должен подсчитывать (и выводить на экран с соответствующим текстовым сообщением)
количество и сумму этих чисел.
 */

public class Exercies13_21 {
    public static void main(String[] args) {
        int j = 0;
        int c = 0;

        for (int i = 10; i < 100; i++) {

            int i10 = i / 10;
            int i1 = i % 10;
            int ii = (i10 + i1) * 2;
            if (i10 * i1 == ii) {
                j = j + i;
                c++;
                System.out.println("i = " + i);
            }
        }
        System.out.println("gumar " + j);
        System.out.println("qanal " + c);


    }
}
