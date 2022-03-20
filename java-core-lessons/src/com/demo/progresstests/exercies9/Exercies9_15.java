package com.demo.progresstests.exercies9;
/*
Определим следующие периоды в течение суток:
утро - с 6 (включая) до 10 (не включая) часов, // stex jam@ 10-@ dursa trnum
день - с 10 (не включая) до 18 (включая},   // stex @ndgrkum em
вечер - с 18 (не включая) до 22 (включая},
ночь - с 22 (не включая) до 6 часов следующего дня (не включая).
Напишите класс, который принимает с клавиатуры целое число, которое должно указывать
на определенный час в сутках, и выводит на экран сообщение, к какому периоду в сутках
этот час относится. В случае если введенное значение не позволяет выполнить
указанное действие, следует вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        if (a >= 0 && a <= 24) {

            if (a >= 6 && a < 10) {
                System.out.println("aravot");

            } else if (a >= 10 && a <= 18) {
                System.out.println("cerek");

            } else if (a > 18 && a <= 22) {
                System.out.println("ereko");

            } else {
                System.out.println("gisher");
            }

        } else {
            System.out.println("suten chuni nman jam");
        }
        scanner.close();
    }
}
