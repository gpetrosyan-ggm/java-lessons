package com.demo.progresstests.exam2.exercies19.exercies197;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его случайными
числами в диапазоне О...99.
 */

public class Exercies19_7 {
    void massiv(int arr[]){
        int max = 99;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((int) (Math.random() * (max - min + 1) + min) + " ");
        }

    }
}
