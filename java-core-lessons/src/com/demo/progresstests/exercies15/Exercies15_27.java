package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число,
а затем генерирует случайную цифру.
Класс должен определить, встречается ли во введенном с клавиатуры числе сгенерированная цифра
(сколько раз и на каких позициях), и вывести на экран соответствующую информацию.
 */
//Sensey mianish tiv em random@ tpum, vor pozician el gtnem, aysinqn vor errordn e

import java.util.Scanner;

public class Exercies15_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        int min = 0;
        int max = 10;
        int a = (int) ((Math.random() * (max - min + 1) + min));
        System.out.println(a);
        int count = 0;
        int num1 = num;
        int quantity = 0;
        while (true) {
            if (num1 == 0) {
                break;
            }
            num1 /= 10;
            count++;
        }
        for (int i = count; i > 0; i--) {
            if (num % 10 == a) {
                quantity++;
                System.out.println(a + "tiv@ gtnvum e " + i + "_rd texum " + quantity + " angam");
            }
            num /= 10;
        }
        scanner.close();
    }
}
