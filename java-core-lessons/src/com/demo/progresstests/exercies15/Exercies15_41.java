package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры два целых положительных числа х и у.
Класс преобразует большее из них - в меньшее следующим образом:
• если преобразуемое число - нечетное, оно уменьшается на 1;
• если преобразуемое число - четное, его делят на два.
Класс должен выполнить преобразование большего числа к меньшему,
указывая все промежуточные значения; следует указать и общее количество выполненных преобразований.
 */

import java.util.Scanner;

public class Exercies15_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number1");
        int num1 = scanner.nextInt();

        System.out.println("number2");
        int num2 = scanner.nextInt();
        int max;
        int min;
        int count = 0;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        if (max % 2 != 0) {
            while (max > min) {
                System.out.print(max-- + " ");
                max--;
                count++;
            }

        } else {

            while (max > min) {
                System.out.print(max + " ");
                max /= 2;
                count++;
            }
        }
        System.out.println();
        System.out.println(count + " qanak");
    }
}
