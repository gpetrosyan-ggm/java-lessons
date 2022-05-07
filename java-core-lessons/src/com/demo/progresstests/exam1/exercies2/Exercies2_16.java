package com.demo.progresstests.exam1.exercies2;
/*
Напишите класс, который принимает с клавиатуры целое число,
представляющее собой расстояние в единицах, принятых на флоте - в кабельтовых.
После этого следует вывести на экран это же расстояние в метрах и километрах.
Известно, что 1 кабельтов = 185.2 метра.
 */

import java.util.Scanner;

public class Exercies2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nsheq heravorutyun kabeltov");

        double kabelt = scanner.nextDouble();
        System.out.println("heravorutyun@ metrov klini " + (kabelt * 185.2) + " metr");
        System.out.println("tvyal heravorutyn@ kilometrov" + (kabelt * 185.2 / 1000) + " km ");

        scanner.close();
    }
}
