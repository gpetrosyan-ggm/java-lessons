package com.demo.progresstests.exam2.exercies19.exercies1914;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так, чтобы цифра десятков каждого элемента
массива была равна цифре единиц следующего элемента.
 */

public class Exercies19_14 {
    void massive(int arr[]){
        int min = 10;
        int max = 99;
        int count = 1;
        int a = (int) (Math.random() * (max - min + 1) + min);
        System.out.print(a + " ");
        int a1 = a/10;
        for (int i = 0;;){
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            int arr1 = arr[i]%10;
            if (a1==arr1){
                System.out.print(arr[i] + " ");
                a1 = arr[i]/10;
                count++;
            }
            if (count==arr.length){
                break;
            }
        }
    }
}
