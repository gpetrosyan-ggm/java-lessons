package com.demo.progresstests.exam2.exercies19.exercies198;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами.
 */

public class Exercies19_8 {
    void massive(int arr []){
        int min = 1;
        int max = 98;
        for (int i = 0; i<arr.length;i++){
            System.out.print((int) (Math.random() * (max - min + 1) + min) + " ");
        }

    }
}
