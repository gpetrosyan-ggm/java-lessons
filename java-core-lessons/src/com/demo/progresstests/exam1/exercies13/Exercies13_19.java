package com.demo.progresstests.exam1.exercies13;

/*
Напишите класс, который выводит на экран все двузначные числа,
равные утроенному произведению его цифр.
Класс также должен подсчитывать (и выводить на экран с соответствующим текстовым сообщением)
количество и сумму этих чисел.
 */
//сумму этих чисел. noric nuyn patker@
public class Exercies13_19 {
    public static void main(String[] args) {
        int j = 0;
        int c = 0;
        for (int i = 10; i < 100; i++) {
            int i10 = i / 10;
            int i1 = i % 10;
            int i3 = i10 * i1 * 3;

            if (i == i3) {
                c++;
                j = j + i;
                System.out.println(" i = " + i);
            }
        }
        System.out.println("gumar@ = " + j);
        System.out.println(" qanak@ " + c);
    }
}
