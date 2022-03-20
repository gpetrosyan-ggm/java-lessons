package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число (для переменной х)
и выводит на экран серию значений: х, х*x, х*x*x, •••  до тех пор,
пока очередное значение остается меньше 1000
 */
//Sensey esi vonc vor Araya
import java.util.Scanner;

public class Exercies15_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int num1=num;
        int count=0;
        while (true){
            if (num1==0){
                break;
            }
            num1/=10;
            count++;
        }
        for (int i = 1; i<num; i++){
            if (i==1){
                System.out.println(num);
            }else {


                // x*=x;
                num *= num;
                System.out.println(num);
            }
        }
    }
}
