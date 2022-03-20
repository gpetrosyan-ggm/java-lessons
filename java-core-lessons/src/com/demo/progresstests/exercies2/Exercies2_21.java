package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры два строковых значения:
ваше имя и вашу фамилию. Класс должен вывести на экран сообщение 'Вас зовут', а рядом с ним
(через пробел) ваше имя и фамилию, введенные с клавиатуры.
 */

import java.util.Scanner;

public class Exercies2_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dzer anun@...");
        String name = scanner.nextLine();

        System.out.println("Dzer azganun@ ...");
        String lastname = scanner.nextLine();

        System.out.println(" Dzer anunn e " + name + " " + lastname );
        scanner.close();
    }
}
