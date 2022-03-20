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
        while (num1!=0) {
            num1 /= 10;
            count++;
        }
        for (int i = 1; i <=count; i++) {
            if (num % 10 == a) {
                quantity++;
                System.out.println(a + "tiv@ gtnvum e " + i + "_rd texum ");
            }
            num /= 10;
        }
        System.out.println(quantity);
        scanner.close();
    }
}
