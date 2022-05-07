package com.demo.progresstests.exam1.exercies15;
/*
На прогулочном пароходе есть определенное количество мест для взрослых
и определенное количество мест для детей.
Напишите класс, который принимает с клавиатуры два целых положительных числа:
количество мест для взрослых и количество мест для детей.
Затем класс должен принять пары целых чисел: первое число в паре - количество билетов для взрослых,
второе - количество билетов для детей, которое покупает очередная группа.
Продажа билетов заканчивается либо когда очередная пара содержит хотя бы одно
неположительное значение, либо когда нет возможности выполнить очередной заказ.
Класс должен вывести на экран следующую итоговую информацию:
• число групп, купивших билеты;
• количество взрослых и количество детей на пароходе;
• количество непроданных взрослых и детских мест.
 */

import java.util.Scanner;

public class Exercies15_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("seatAdults");
        int seatAdults = scanner.nextInt();

        System.out.println("seatChild");
        int seatChild = scanner.nextInt();
        int group = 0;
        int adults = 0;
        int child = 0;

        while (true) {
            System.out.println("tisketAdults");
            int tisketAdults = scanner.nextInt();
            if (tisketAdults < 0) {
                break;
            }
            adults += tisketAdults;

            if (adults > seatAdults) {
                adults -= tisketAdults;
                break;
            }

            System.out.println("tisketChild");
            int tisketChild = scanner.nextInt();
            if (tisketChild < 0) {
                break;
            }
            child += tisketChild;

            if (child > seatChild) {
                child -= tisketChild;
                break;
            }
            group++;
        }
        System.out.println(group + " grupa e gnel kruizin masnakcelu hamar");
        System.out.println(adults + " mec " + child + " poren en kayfavat linum navov ");
        System.out.println((seatAdults - adults) + "meci toms u " + (seatChild - child) + " poqri toms chi vajarvel");
        scanner.close();
    }
}
