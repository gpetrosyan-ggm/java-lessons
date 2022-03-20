package com.demo.progresstests.exercies15;
/*
Последовательность Фибоначчи определяется как серия чисел,
в которой первый и второй члены равны 1, а любой член, начиная с третьего,
равен сумме двух предыдущих членов.
Напишите класс, который принимает с клавиатуры целое положительное число и проверяет,
является ли оно членом последовательности Фибоначчи.
 */

import java.util.Scanner;

public class Exercies15_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num=scanner.nextInt();
        int fib0=0;
        int fib1=1;

        while (true){
            int fib2=fib0+fib1;
            if (fib2>num){
                System.out.println(num+ " chi handisanum fibi andam");
                break;
            }
            if (fib2==num){
                System.out.println(num + " tiv@ FIBONACII andam e");
                break;
            }else {
                fib0=fib1;
                fib1=fib2;
            }
        }
        scanner.close();
    }
}
