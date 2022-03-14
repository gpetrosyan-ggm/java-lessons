package com.demo.progresstests.exercies13;
/*
Школа организовала распродажу в пользу стариков. На распродаже продавались билеты двух видов:
• обычный билет участника распродажи;
• билет с правом посещения концерта.
Тот, кто приобрел более 10 обычных билетов участника, получал дополнительно
еще один такой же - бесплатно.    // stex chi sheshtum vor yuraqanchyur 10 hati hamar lracucich, ayl 10-ic aveli hamar 1 hat, ov 10-ic shat arav 1 hat em talu
Напишите класс, который для каждого из 200 участников распродажи будет принимать
в качестве ввода количество билетов каждого вида,
приобретенных данным участником (два положительных целых числа).
Класс подсчитает и напечатает в качестве вывода число проданных билетов каждого вида,
а также число обычных билетов, выданных бесплатно.
 */
// Run chem tvel, 400 hat tiv u enter minjev sexmem luys@ kbacvi
import java.util.Scanner;

public class Exercies13_13 {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        int e = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 200; i++) {
            System.out.println("sovorakan toms");
            int a = scanner.nextInt();

            System.out.println("hamergov toms ");
            int b = scanner.nextInt();

            d = d + a;
            e = e + b;

            if (a >= 10) {
                c++;
            }
        }
        System.out.println("sovorak tomseric vajarvel e " + d + " nver trvel " + c);
        System.out.println("hamergov tomser@ vajarvel e " + e);
        scanner.close();
    }
}
