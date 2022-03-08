package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран положительные двузначные числа,
заканчивающиеся на цифру 7 (начиная с наименьшего).
 */

public class Exercies11_20 {
    public static void main(String[] args) {
        for (int i = 10; i<=99;i++){

            if (i%10==7){
                System.out.println(i);
            }
        }
    }
}
