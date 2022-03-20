package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и строит из него число с обратным порядком цифр.
Новое значение следует вывести на экран.
 */

import java.util.Scanner;

public class Exercies15_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        do {
            if (num%10==0){
             num/=10;
             continue;
            }
        }
        while (num>0);
            System.out.print(num%10);
            num/=10;


//        int num1 = num;
//        int num2=num;
//        int count = 0;
//        while (num%10==0){
//            num/=10;
//        }
//        while (num1!=0){
//            count++;
//            num1/=10;
//        }
//        while (true){
//            if (count==1) {
//                System.out.println(num);
//                break;
//            }
//            if (count==2){
//                int num2_1=num2%10;
//                int num2_2=num2/10;
//                int num22 = num2_1*10+num2_2;
//                System.out.println(num22);
//                break;
//            }
//            if (count==3){
//                int num3_1 = num3%10;
//
//            }
//        }
    }
}
