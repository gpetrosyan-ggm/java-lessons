package com.demo.progresstests.exercies9;
/*
Определим «текстовую форму оценки» следующим образом:
1 или 2 - «неудовлетворительно»,
3 - «удовлетворительно»,
4 - «хорошо»,
5 - «ОТЛИЧНО».
Напишите класс, который принимает с клавиатуры целое число и, если оно соответствует оценке,
выводит на экран соответствующую «текстовую форму оценки». В случае если число
не является оценкой, следует вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("gnahatakan");
        int a = scanner.nextInt();

        if (a > 0 && a <= 5) {

            if (a == 1 || a == 2) {
                System.out.println("anbavarar");

            } else if (a == 3) {
                System.out.println("bavarar");

            } else if (a == 4) {
                System.out.println("lav");

            } else {
                System.out.println("gerazanc");
            }
        } else {
            System.out.println("mer vaxtov tenc gnahatakan chkar");
        }
        scanner.close();
    }
}
