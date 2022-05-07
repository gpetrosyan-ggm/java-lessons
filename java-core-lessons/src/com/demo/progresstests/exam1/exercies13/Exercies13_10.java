package com.demo.progresstests.exam1.exercies13;
/*
Для проверки уровня загрязненности в реке было выполнено 50 измерений,
каждое из которых содержало информацию о том, в какой день недели было произведено измерение,
и каким был уровень загрязнения (по 10-балльной шкале).
Напишите класс, принимающий с клавиатуры данные 50 измерений (каждое измерение - два числа:
первое - день недели, второе - уровень загрязнения) и выводящий на экран:
• сообщение Опасно! - для дней, когда уровень загрязнения составлял 7 или более единиц;
• сообщение Спокойный вторник - для вторников, в которые уровень загрязнения
  составлял менее 5 единиц.
 */

import java.util.Scanner;

public class Exercies13_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {

            System.out.println("tiv");
            int a = scanner.nextInt();

            System.out.println("shabatva or");
            int b = scanner.nextInt();

            if (a >= 7) {
                System.out.println(" vtangavor or" + a);
            } else if (a < 5 && b == 2) {
                System.out.println("ereqshabtin hangist e" + a);
            }
        }
        scanner.close();
    }
}
