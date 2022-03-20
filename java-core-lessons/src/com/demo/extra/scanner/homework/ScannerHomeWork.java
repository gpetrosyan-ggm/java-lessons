package com.demo.extra.scanner.homework;

import java.util.Scanner;

public class ScannerHomeWork {

    public static void main(String[] args) {
        simple1Demo();
        simple2Demo();

    }

    /**
     * Ստեղնաշարից 2 հատ թիվ ստացիր և տպիր դրանց
     * 1. գումարը
     * 2. հանումը
     * 3. բաժանումը
     * 4. բազմապատկումը
     */
    private static void simple1Demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tpi mek tiv: i = ...");
        int i = scanner.nextInt();

        System.out.println("Hapa Mi Ayl Tiv El Tpi j = ...");
        int j = scanner.nextInt();

        System.out.println("ayd tveri gumar@ (i + j)  = ..." + (i + j));
        int gumar = scanner.nextInt();

        System.out.println("Tarberutyun@ (i - j) = ..." + (i - j));
        int hanum = scanner.nextInt();

        System.out.println("Haraberutyun ( i / j) =  ... " + (i / j));
        double bajanum = scanner.nextDouble();

        System.out.println("Artadryal@  (i * j) =..." + (i * j));
        int artadryal = scanner.nextInt();

        scanner.close();


    }

    /**
     * Ստեղնաշարից մարդու անունը, ազգանունը և տարիքը
     * Ստուգիր եթե տարիքը 18-ից փոքրա, ասա ՛Դեռ փոքր ես նման բաների համար՛, հակառակ դեպքում
     * ասա ՛Ապրիս, լավ էլ մեծ ես, կարաս շարունակես՛
     */
    private static void simple2Demo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What Is Your Name...");
        String name = scanner.nextLine();

        System.out.println("What Is Your Family...");
        String family = scanner.nextLine();

        System.out.println("How Old Are You...");
        int old = scanner.nextInt();
        if (old < 18) {
            System.out.println("Դեռ փոքր ես նման բաների համար");
        } else if (old >= 18) {
            System.out.println("Ապրիս, լավ էլ մեծ ես, կարաս շարունակես");
        }
        scanner.close();
    }

}
