package com.demo.progresstests.exam1.exercies3;
/*
Во многих странах для измерения небольших размеров используется не только единица длины «сантиметр»,
но и такая единица, как «дюйм>> (1дюйм=2.54 сантиметра).
Напишите класс, который принимает с клавиатуры значение, равное размеру в дюймах,
и затем подсчитывает и выводит на экран это же значение, но в сантиметрах.
 */

import java.util.Scanner;

public class Exercies3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chaps@ @st duymi ...");

        double d = scanner.nextDouble();
        System.out.println("@st sm klini " + (d * 2.54));

        scanner.close();
    }
}
