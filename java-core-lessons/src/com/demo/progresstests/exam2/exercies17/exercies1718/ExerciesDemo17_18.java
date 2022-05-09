package com.demo.progresstests.exam2.exercies17.exercies1718;

import java.util.Scanner;

public class ExerciesDemo17_18 {
    public static void main(String[] args) {
        Exercies17_18 exercies17_18 = new Exercies17_18();
        Scanner scanner = new Scanner(System.in);
        System.out.println("tiv eranish");
        int num1 = scanner.nextInt();
        System.out.println("eranish tiv");
        int num2 = scanner.nextInt();
        exercies17_18.threeDigit(num1, num2);
        System.out.println("kamayakan tiv");
        int num3 = scanner.nextInt();
        System.out.println("kamayakn tiv");
        int num4 = scanner.nextInt();
        exercies17_18.exchange(num3, num4);
    }
}
