package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран все положительные двузначные числа
(выберите самостоятельно - в возрастающем или убывающем порядке),
произведение цифр которых является тоже двузначным числом.
 */

public class Exercies11_24 {
    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {

            int i10 = i / 10;
            int i1 = i % 10;
            int ii = i10 * i1;

            if (ii >= 10 && ii <= 99) {
                System.out.println(i);
            }
        }
    }
}
