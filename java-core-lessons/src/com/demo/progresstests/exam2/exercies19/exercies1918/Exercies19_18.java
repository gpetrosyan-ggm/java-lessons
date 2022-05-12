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
       int count = 1;
       int a = (int) (Math.random() * (max - min + 1) + min);
       System.out.println(a);
       while (true){
           int b = (int) (Math.random() * (max - min + 1) + min);
           if (b>=a){
              a=b;
               System.out.print(a + " ");
               count++;
           }

           if (count==arr.length){
               break;
           }


       }
   }

}
