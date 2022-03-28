package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем генерирует случайную цифру.
Класс должен определить, встречается ли во введенном с клавиатуры числе сгенерированная цифра
(сколько раз и на каких позициях), и вывести на экран соответствующую информацию.
 */

import java.util.Scanner;

public class Exercies15_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        int min = 0;
        int max = 100;
        int a = (int) ((Math.random() * (max - min + 1) + min));
        System.out.println(a);

        int coefficient = 1;
        int aTmp = a;
        while (aTmp != 0) {
            coefficient *= 10;
            aTmp /= 10;
        }

        int index = 0;
        int quantity = 0;
        while (num > 0) {
            if (num % coefficient == a) {
                quantity++;
                System.out.println(a + "tiv@ gtnvum e " + index + "_rd texum ");
            }
            index++;
            num /= 10;
        }

        if (quantity == 0) {
            System.out.println("Chi gtel");
        } else {
            System.out.println("Gtnvel e " + quantity + " angam.");
        }

        scanner.close();
    }
}
