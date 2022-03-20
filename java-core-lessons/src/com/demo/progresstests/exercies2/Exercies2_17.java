package com.demo.progresstests.exercies2;
/*
2.17
Напишите класс, который принимает с клавиатуры два целых числа,
образующих ответ на вопрос «который час?» (первое - часы, второе - минуты,
например, 15 и 42) и выводит на экран следующие значения
(каждое в отдельной строке): сколько секунд прошло с полуночи до
«данного момента» и сколько минут прошло за это же время,
а также сколько минут осталось до полуночи.
 */

import java.util.Scanner;

public class Exercies2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tvyal orva vor jamn e ...");
        int jam = scanner.nextInt();

        System.out.println("tvyal jami vor errord ropen ...");
        int rope = scanner.nextInt();

        System.out.println("tvyal orva mej ancel e " + (jam * 60 + rope) * 60 + " varkyan");
        System.out.println(" tvyal orum ancel e " + (jam * 60 + rope) + " rope");
        System.out.println("orva avartin mnacel e " + ((24 * 60 * 60) - (jam * 60 + rope) * 60) + " varkyan");
        System.out.println("orva avartin mnacel e " + ((24 * 60) - (jam * 60 + rope)) + " rope");

        scanner.close();
    }
}
