package com.demo.progresstests.exercies16;
/*
В классе 35 учеников. В конце учебного года каждый ученик получает ведомость
с оценками по 8 предметам.
Напишите класс, который генерирует по 8 оценок для каждого ученика
и подсчитывает для него среднюю годовую оценку.
Для каждого ученика класс должен выводить на экран в одну строку оценки каждого ученика
и его среднюю годовую оценку.
После завершения вывода на экран оценок всех учеников класс должен
выводить в отдельной строке количество учеников, у которых среднегодовая оценка выше
 */

public class Exercies16_19 {
    public static void main(String[] args) {
        int min = 3;
        int max = 5;

        double c = 0;
        for (int i = 1; i < 36; i++) {
            double b = 0;
            System.out.println();
            System.out.print(i + " -> ");

            for (int j = 1; j < 9; j++) {

                int a = (int) (Math.random() * (max - min + 1) + min);
                System.out.print(a + " ; ");
                b += a;
            }
            System.out.print(" = " + b / 8);
            if (b / 8 >= 4) {
                c = b;
                System.out.print(" barcr gnahatak eni ");
            }

        }


    }
}
