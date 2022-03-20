package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры фамилию пассажира и город, в который он вылетает.
Класс должен построить строковую переменную, которая будет содержать сообщение
'Пассажир ... вылетает в ... '', в котором вместо многоточий будут фигурировать
фамилия пассажира и название города, в который он вылетает.
Эту строковую переменную следует вывести на экран.
 */

import java.util.Scanner;

public class Exercies2_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Dzer azganun@ ...");
        String lastName = scanner.nextLine();

        System.out.println(" vor qaxaq eq meknum ...");
        String sity = scanner.nextLine();

        System.out.println(" Hajaxord " + lastName + " meknum e " + sity);
        scanner.close();
    }
}
