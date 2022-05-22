package com.demo.progresstests.exam2.exercies19.exercies1954;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел А
и возвращает новый массив В, состоящий из элементов массива А, упорядоченных так,
чтобы все положительные элементы массива А находились в начале массива В,
все отрицательные - в конце, а все нулевые элементы - в середине.
 */
//Sensey stex vor chi sheshtum hertakanutyun, prost@ asuma drakan, zro u bacasakan, erkrord lucum@s chishta?
// te partadir arajin lucumsa chisht

import java.sql.Array;
import java.util.Arrays;

public class Exercies19_54 {
    int[] massive(int[] arr) {
        int[] orderly = new int[arr.length];
        int count = 0;
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                orderly[a] = arr[i];
                count++;
                a++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                orderly[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                orderly[count] = arr[i];
                count++;
            }
        }


        return orderly;
    }

    int[] massive2(int[] arr) {
        int[] orderly = new int[arr.length];

        Arrays.sort(arr);
        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            orderly[a - i] = arr[i];
        }
        return orderly;
    }
}

