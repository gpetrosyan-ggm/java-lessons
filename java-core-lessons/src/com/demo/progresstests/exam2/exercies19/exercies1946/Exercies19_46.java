package com.demo.progresstests.exam2.exercies19.exercies1946;

import java.util.Arrays;

/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и дополнительное целое число К. Если К положительное, метод производит К правых сдвигов,
если К отрицательное, - метод производит К левых сдвигов.

 */
public class Exercies19_46 {
    void massive(int[] arr, int k) {
        int[] shift = new int[arr.length];


        if (k<0) {
            while (k <= -arr.length) {
                k += arr.length;
            }
            k = Math.abs(k);
            int a = 0;
            for (int i = k; i<arr.length; i++){
                shift[a] = arr[i];
                a++;
            }
            for (int i = 0; i<k;i++){
                shift[k + i] = arr[i];
            }

        }else{

        while (k>=arr.length){
            k-=arr.length;
        }
        if (k >= 0) {

            int a = 0;
            for (int i = k; i < arr.length; i++) {
                shift[i] = arr[a];
                a++;
            }
            for (int i = 0; i < k; i++) {
                shift[ i] = arr[i+k];
            }
        }

        }
        System.out.println(Arrays.toString(shift));
    }
}
