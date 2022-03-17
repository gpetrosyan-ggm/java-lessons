package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 999.
Класс должен подсчитать, сколько значений было введено с клавиатуры (не считая значения 999),
и вывести эту информацию на экран.
 */

import java.util.Scanner;

public class Exercies15_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int c=0;

        while (true){
            System.out.println("tiv");
            int a = scanner.nextInt();
            if (a==999){
                break;
            }else {
                c++;
            }
        }
        System.out.println(c);
        scanner.close();
    }
}
