package com.demo.progresstests.exam1.exercies13;
/*
По правилам банка, на вклад ежемесячно начисляется определенная сумма,
которая зависит от ежемесячного процента на вклад.
Например, на вкладе в через месяц будет сумма 10000 рублей с месячным процентом 10% 11000 рублей
(1000 плюс 10% от 1000), а еще месяц - 12100 (11000 плюс 10% от 11000).
Напишите класс, который принимает с клавиатуры три значения:
• сумму на вкладе;
• месячный процент;
• количество месяцев, в течение которых начисляются проценты на вклад.
Класс подсчитает и выведет на экран итоговую сумму на вкладе.
 */

import java.util.Scanner;

public class Exercies13_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("gumar");
        int gumar = scanner.nextInt();

        System.out.println("tokos");
        int tokos = scanner.nextInt();

        System.out.println("amis");
        int amis = scanner.nextInt();

        for (int i = 1; i <= amis; i++) {

            gumar = gumar + gumar * tokos / 100;
        }
        System.out.println(gumar);
        scanner.close();
    }
}
