package com.demo.progresstests.exam2.exercies19.exercies196;
/*
Напишите метод, который получает в качестве параметра массив и выводит на экран содержащиеся
в нем значения в одну строку через пробел между значениями.
 */

import java.util.Arrays;

public class Exercies19_6 {
   static void masiv(int [] arr) {

      for (int i=0; i<arr.length;i++){
          System.out.print(arr[i]+" ");

      }
    }
}
