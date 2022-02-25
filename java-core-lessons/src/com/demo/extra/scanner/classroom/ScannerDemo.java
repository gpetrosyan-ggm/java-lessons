package com.demo.extra.scanner.classroom;

import java.util.Scanner;

public class ScannerDemo {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        scanner.close();
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Your Name...");
        String name = scanner.nextLine();

        System.out.println("Type your age...");
        int age = scanner.nextInt();

        System.out.println("Type your weight...");
        double weight = scanner.nextDouble();

        System.out.println("Hello " + name + ", your are " + age + " years old and your weight is " + weight);

        scanner.close();
    }

    // Ստուգումա եկացած դատաի թայփը
    //        while (true) {
//            if (scanner.hasNextInt()) {
//                break;
//            }
//            scanner.next();
//            System.out.println("Invalid Input: Type your age...");
//        }

}
