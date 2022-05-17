package com.demo.progresstests.exam2.exercies19.exercies1918;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так, чтобы они образовывали неубывающую
последовательность (каждый элемент не меньше предыдущего)
 */

import java.util.Arrays;

public class Exercies19_18 {
   void massive(int [] arr){
       int min = 10;
       int max = 99;

       for (int i =0;i<arr.length;i++){
           arr[i] = randomVal(max,min);
       }
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
   }
   int randomVal(int max, int min){
       return (int)(Math.random() * (max - min + 1) + min);
   }

}
