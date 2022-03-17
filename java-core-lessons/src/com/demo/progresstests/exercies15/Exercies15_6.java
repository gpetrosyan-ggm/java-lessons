package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры числа, пока небудет введено значение 999.
Класс должен подсчитать, сколько значений было введено с клавиатуры,
чему равна сумма этих значений (не считая значения 999), и вывести эту информацию на экран.
 */

import java.util.Scanner;

public class Exercies15_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("tiv");
            int a = scanner.nextInt();
            if (a == 999) {
                break;
            }
            count++;
            sum += a;
        }
        System.out.println(count + " " + sum);
        scanner.close();
    }
}
