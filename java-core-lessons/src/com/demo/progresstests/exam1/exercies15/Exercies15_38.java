package com.demo.progresstests.exam1.exercies15;

/*
Напишите класс, который находит наибольшее положительное двузначное число,
которое делится на произведение своих цифр.
 */
public class Exercies15_38 {
    public static void main(String[] args) {
        int i = 99;
        while (true) {

            int i1 = i % 10;
            int i10 = i / 10;
            int ii = i1 * i10;

            if (ii != 0 && i % ii == 0) {
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}
