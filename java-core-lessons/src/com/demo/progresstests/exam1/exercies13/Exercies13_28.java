package com.demo.progresstests.exam1.exercies13;
/*
Производственный участок выпускает стальные шарики, диаметр которых должен
быть равен 24 миллиметрам (допустимое отклонение не более 2 миллиметров), а вес - 74 граммам
(допустимое отклонение не более 3 грамм).
Напишите класс, который принимает данные 120 шариков, для каждого из них определяет,
соответствуют ли его параметры указанным стандартам, и выводит на экран
для каждого шарика соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies13_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 121; i++) {
            System.out.println(); // uxaki tox bac toxi cikl@ skseluc araj

            System.out.println("shari tramagic");
            int a = scanner.nextInt();

            System.out.println("shari qash@");
            int b = scanner.nextInt();

            if (a >= 22 && a <= 26) {
                if (b >= 71 && b <= 77) {
                    System.out.println("shar@ hamapatasxanum e paymannerin ");
                } else {
                    System.out.println("qash@ chi hamapatasxanum ");
                }
            } else {
                System.out.println("tramagic@ chi hamapatasxanum ");
            }
        }
        scanner.close();
    }
}
