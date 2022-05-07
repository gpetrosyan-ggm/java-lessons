package com.demo.progresstests.exam1.exercies3;
/*
Подрабатывая в течение года, Вася собрал себе определенную сумму на
поездку за границу, а родители добавили ему от себя еще некоторую сумму.
Напишите класс, который принимает с клавиатуры три значения:
первое - сумма в рублях, заработанная Васей,
второе - сумма в рублях, которую ему дали родители,
третье - курс рубля по отношению к евро.
Класс должен подсчитать и вывести на экран сумму в евро, которая
имеется у Васи для поездки за границу.
 */

import java.util.Scanner;

public class Exercies3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vasyayi ashxatac gumar@ rublov ...");

        double nameVasya = scanner.nextDouble();
        System.out.println("Vasyain cnoxneri tvac gumar@ ...");

        double nameFader = scanner.nextDouble();
        System.out.println("1 euro valyutan rublov ..");

        double nameEuro = scanner.nextDouble();
        System.out.println("Vasyan ardyunqum unu " + (nameVasya + nameFader) / nameEuro + "EURO");

        scanner.close();
    }
}
