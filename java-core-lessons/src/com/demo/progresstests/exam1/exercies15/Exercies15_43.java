package com.demo.progresstests.exam1.exercies15;
/*
Наибольший общий делитель (НОД) двух целых положительных чисел можно определить
при помощи следующего метода: большее число уменьшается на значение меньшего до тех пор,
пока числа не оказываются равными.
Напишите класс, который принимает с клавиатуры два целых положительных числа
и определяет их НОД описанным методом.
 */

import java.util.Scanner;

public class Exercies15_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number1");
        int num1 = scanner.nextInt();

        System.out.println("number2");
        int num2 = scanner.nextInt();

        int max;
        int min;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        while (max > min) {
            max--;
        }
        for (int i = max - 1; i > 0; i--) { //inadu (min-1)-ic em sksum vor henc min tiv@ chhamarvi bajanarar, ayl iranic poqr tiv@
            if (max % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
