package com.demo.progresstests.exam2.exercies19.exercies1920;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так,
чтобы значения элементов в массиве не повторялись.
 */

import java.util.Arrays;

public class Exercies19_20 {
    void massive(int[] arr) {
        int min = 10;
        int max = 99;
      int val =-1;
        for (int i = 0; i < arr.length; i++) {
          val = randomVal(max, min, val);
           arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
   private int randomVal(int max, int min, int val){
        int randomVal = (int) (Math.random() * (max - min + 1) + min);
        while (randomVal == val){
            randomVal = (int) (Math.random() * (max - min + 1) + min);
        }
        return randomVal;
    }

}
