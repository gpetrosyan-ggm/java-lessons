package com.demo.progresstests.exercies12;
/*
Напишите класс, который принимает с клавиатуры следующие данные:
• радиус окружности;
• 15 пар координат точек на плоскости.
Класс должен вывести на экран количество точек, лежащих внутри окружности и количество точек,
лежащих на окружности.
 */

// if (x*x + y*y <= R*R) лежим в круге, включая окружность

import java.util.Scanner;

public class Exercies12_19 {

    public static void main(String[] args) {
        int countIn = 0;
        int countOut = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Grel shrjanagci sharavix@....");
        double r = scanner.nextDouble();

        for (int i = 0; i < 15; i++) {
            System.out.println("Grel cankacac kordinatner (x, y)....");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x * x + y * y <= r * r) {
                System.out.println(x + " / " + y + " - shrjanagci nersum e");
                countIn++;
            } else {
                System.out.println(x + " / " + y + " - shrjanagcic durs e");
                countOut++;
            }
        }

        System.out.println("IN: " + countIn);
        System.out.println("OUT: " + countOut);
    }

}
