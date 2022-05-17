package com.demo.progresstests.exam2.exercies19.exercies1915;
/*
Напишите метод, который получает в качестве параметра массив и дополнительный параметр S.
Метод сначала заполняет четные ячейки массива двузначными положительными случайными числами.
Затем нечетные ячейки метод заполняет так, чтобы сумма значений в нечетной ячейке
и в предшествующей ей четной ячейке была равна S. Каким условиям должен отвечать
параметр S для того, чтобы задача имела решение?
 */
// s parametri argument@ vhpetq e poqr lini randmov lracvox massivi elementic u mec chlini 198-ic, vor 2
// amena mec erknish tveri gumaric chlini mec

import java.util.Arrays;

public class Exercies19_15 {
    void massive(int arr[], int s) {
        int min = 10;
        int max = 99;
        if (s <= 198 && s > 10) {

            for (int i = 0; i < arr.length; i += 2) {
                arr[i] = randomVal(max, min);
                while (s < arr[i] || (s - arr[i]) >= 100) {
                    arr[i] = randomVal(max, min);
                }

                if (i <= arr.length - 2) {
                    arr[i + 1] = s - arr[i];
                }
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("@ntrvac S parametr@ chi hamapatasxanum xndri paymanin");
        }
    }

    int randomVal(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
