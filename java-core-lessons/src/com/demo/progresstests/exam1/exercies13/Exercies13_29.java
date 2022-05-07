package com.demo.progresstests.exam1.exercies13;
/*
В школе решено создать два специализированных класса: физико-математический
и физико-информационный. Ученик, желающий поступить в один из этих классов,
должен иметь среднюю оценку (по 10-балльной системе) не менее  7.
В случае, когда его оценка по математике выше оценки по информатике,
его зачисляют в физико-математический класс; при ином соотношении этих оценок
его зачисляют в физико-информационный класс.
Напишите класс, который принимает с клавиатуры оценки по математике и информатике 40 желающих
учиться в одном из этих специализированных классов.
Для каждого из кандидатов следует определить: может ли он быть зачислен в один из классов,
и если да, - то в какой.
По результатам проверки данных каждого кандидата следует вывести
на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies13_29 {
    public static void main(String[] args) {
        int mijin;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 41; i++) {
            System.out.println();

            System.out.println("matemi gnahatakan@");
            int matematika = scanner.nextInt();

            System.out.println("informatika gnahatakan@");
            int informatika = scanner.nextInt();

            mijin = (matematika + informatika) / 2;

            if (mijin >= 7) {

                if (matematika >= informatika) {

                    System.out.println("SHNORHAVOR EM DUQ @NDUNVEL EQ MATEMI FAKULTET@");
                } else {

                    System.out.println("informatikayi fakultet es @ndunvel");
                }
            } else {

                System.out.println("es inch baradi gyada durs ekar");
            }
        }
        scanner.close();
    }
}
