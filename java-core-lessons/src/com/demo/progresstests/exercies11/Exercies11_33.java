package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры два целых положительных числа:
N и М (можно считать, что M<N).
Класс должен вывести на экран серию М+(М+ 1)+(М+2)+ ... +N.
 */
// tvabanakan progresiayi banadzevn e S=(a1+an)*n/2

import java.util.Scanner;

public class Exercies11_33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("grel tiv");
        int n = scanner.nextInt();

        System.out.println("naxordic aveli poqr tiv");
        int m = scanner.nextInt();


       int a = (m + n) * (n - m + 1) / 2;
       System.out.println(a + " ");
            // es xndir@ menak senc kareca lucem, banadzev@ grim u fsyo
    }
}

