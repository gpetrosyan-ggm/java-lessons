package com.demo.progresstests.exercies8;

import java.util.Scanner;

public class Exercies8_25_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish tiv");

        int a = scanner.nextInt();
        int a100;
        int a10;
        int a1;
        a100 = a / 100;
        a10 = a / 10 % 10;
        a1 = a % 10;
        if (a % 2 == 0) {
            int k1 = a100 % 2 == 0 ? (a100 + 1) : (a100 - 1);
            int k2 = a10%2 ==0 ? (a10 + 1) : (a10-1);
            int k3 = a1%2==0 ? (a1+1) : (a1-1);
            System.out.println((a100 * 100 + a10 * 10 + a1));
        }else {
            int k1 = a100 % 2 == 1 ? (a100 + 1) : (a100 - 1);
            int k2 = a10%2 ==1 ? (a10 + 1) : (a10-1);
            int k3 = a1%2==1 ? (a1+1) : (a1-1);
            System.out.println((a100 * 100 + a10 * 10 + a1));
        }
        scanner.close();
    }
}
