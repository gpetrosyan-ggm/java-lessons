package com.demo.progresstests.exam1.exercies13;

/*
Напишите класс, который выводит на экран все двузначные числа, у которых куб суммы его цифр
равен квадрату самого числа.
Класс также должен подсчитывать (и выводить на экран с соответствующим текстовым сообщением)
количество и сумму этих чисел.
 */
// сумму этих чисел qani vor chem haskanum te konkret vor tveri heta, uremn gumarelu em bolor en tver@ irar voronq bavararum en paymanin
public class Exercies13_18 {
    public static void main(String[] args) {
        int c = 0;
        int j = 0;
        for (int i = 10; i < 100; i++) {
            int i10 = i / 10;
            int i1 = i % 10;

            int i3 = (i10 + i1) * (i10 + i1) * (i10 + i1);
            int i2 = i * i;

            if (i2 == i3) {
                c++;
                j = j +i;
                System.out.println("i = " +i);
            }

        }
        System.out.println( " ayd tveri gumar@ klini " + j);
        System.out.println("nmanatip tvi qanak@ " + c);

    }
}
