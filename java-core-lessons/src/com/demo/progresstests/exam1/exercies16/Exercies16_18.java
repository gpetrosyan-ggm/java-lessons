package com.demo.progresstests.exam1.exercies16;
/*
Напишите класс, который выводит на экран все трехзначные числа,
для которых соблюдаются два условия:
• само число заканчивается на О;
• сумма нечетных делителей этого числа тоже заканчивается на О.
 */

public class Exercies16_18 {
    public static void main(String[] args) {
        for (int i = 100; i<1000; i+=10){
            int sum = 0;

            for (int j = 1; j<i; j+=2){
                if (i%j==0){
                    sum+=j;
                }
            }
           if (sum%10==0){
                System.out.println(i + " " + sum);
            }
        }
    }
}
