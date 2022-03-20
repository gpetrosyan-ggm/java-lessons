package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем генерирует случайную цифру.
Класс должен определить, встречается ли во введенном с клавиатуры числе сгенерированная цифра,
и вывести на экран соответствующее сообщение.
 */

import java.util.Scanner;

public class Exercies15_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        int min = 0;
        int max = 100;
        int a = (int) ((Math.random() * (max - min + 1) + min));
        System.out.println(a);

        int b = a;
        int coefficient = 1;

        while (b!=0) {
          //  if (b == 0) {
            //    break;
          //  }
            coefficient *= 10;
            b /= 10;
        }
        while (true) {

            if (num % coefficient == a) {
                System.out.println("bingo");
                break;
            }
            num = num / coefficient;

            if (num < a) {
                System.out.println("chk");
                break;
            }
        }
        scanner.close();
    }
}
