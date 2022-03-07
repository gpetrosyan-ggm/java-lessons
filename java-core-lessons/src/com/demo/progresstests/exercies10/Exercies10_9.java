package com.demo.progresstests.exercies10;
/*
Напишите класс, который генерирует и выводит на экран случайное число
из диапазона от 250 до 746, а затем в отдельных строках, - наименьшую и наибольшую
из цифр этого числа.
Класс также должен проверить, были ли в генерированном числе одинаковые цифры,
и вывести на экран соответствующее текстовое сообщение.
 */

public class Exercies10_9 {
    public static void main(String[] args) {
        int min = 250;
        int max = 746;
        int a;
        a = (int) (Math.random() * (min - max + 1) + max);
        System.out.println(a);
        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        if (a100 >= a10 && a100 >= a1) {
            System.out.println("amena mec tiv@ " + a100);
        } else if (a10 > a100 && a10 >= a1) {
            System.out.println("amena mec tiv@ " + a10);
        } else {
            System.out.println("amena mec tiv@ " + a1);
        }
        if (a100 <= a10 && a100 <= a1) {
            System.out.println("amena poqr tiv@ " + a100);
        } else if (a10 < 100 && a10 <= a1) {
            System.out.println("amena poqr tiv@ " + a10);
        } else {
            System.out.println("amena poqr tiv@ " + a1);
        }
        if (a100 == a10 || a100 == a1 || a10 == a1) {
            System.out.println("kan havasar tver");
        }
    }
}
