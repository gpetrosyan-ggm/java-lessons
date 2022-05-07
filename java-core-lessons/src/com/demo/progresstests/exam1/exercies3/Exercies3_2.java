package com.demo.progresstests.exam1.exercies3;
/*
Во многих странах для измерения небольших размеров используется не только единица длины «сантиметр»,
но и такая единица, как «дюйм>> (1дюйм=2.54 сантиметра).
Напишите класс, который принимает с клавиатуры значение, равное размеру в сантиметрах,
и затем подсчитывает и выводит на экран это же значение, но в дюймах.
 */

import java.util.Scanner;

public class Exercies3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel chaps@ @st sm-i ...");

        double r = scanner.nextDouble();
        System.out.println("duymov klini " + r / 2.54);
    }
}
