package com.demo.progresstests.exam2.exercies19.exercies198;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его положительными
случайными двузначными числами.
 */

import java.util.Arrays;

public class Exercies19_8 {
    void massive(int arr []){
        int min = 10;
        int max = 98;
        for (int i = 0; i<arr.length;i++){
            arr[i] = random(max,min);
        }
        System.out.println(Arrays.toString(arr));
    }
    int random(int max, int min){
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
