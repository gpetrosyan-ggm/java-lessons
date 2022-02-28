package com.demo.progresstests.exercies3;
/*
Напишите класс, который принимает с клавиатуры целое число и
выводит на экран (в одной строке) три следующих за ним целых числа так,
чтобы разница между каждым числом и следующим за ним составляла
Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.
 */

import java.util.Scanner;

public class Exercies3_6 {
    public static void main(String[] args) {
        //   Scanner scanner =new Scanner(System.in);
        //   System.out.println("xndrem kamayakan tiv ..");

        //   int i = scanner.nextInt();
        //   for (int j = 1; j < 4; j ++){
        //       System.out.println(" hajord tver@ "+ (i + j) );
        //   }
        //   scanner.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" tiv ");

        int i = scanner.nextInt();
        System.out.println(" ardyunq@ kstacvi " + (i + 3) + " ; " + (i + 2 * 3) + " ; " + (i + 3 * 3));
    }
}
