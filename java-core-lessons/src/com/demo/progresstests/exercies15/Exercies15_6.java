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
        int c=0;
        int b=0;

        while (1>0){
            System.out.println("tiv");
            int a = scanner.nextInt();
            if (a==999){
                break;
            }else {
                c++;
                b+=a;
            }
        }
        System.out.println(c  +" " + b);
        scanner.close();
    }
}
