package com.demo.progresstests.exam2.exercies19.exercies1955;

/*
Напишите метод, который принимает в качестве параметра массив целых чисел А
и возвращает новый массив В, состоящий только из элементов массива А,
находящихся на четных местах (в ячейках с четными номерами).
 */
// (в ячейках с четными номерами) -  es pah@ nenc em haskanum vor massivum kenterrordner@, 1, 2, 3, 4 - nkati uni 2, 4
public class Exercies19_55 {
    int[] massive(int[] arr) {
        int[] evenНumber = new int[arr.length / 2];
        int a = 0;
        for (int i = 1; i < arr.length; i += 2) {

            evenНumber[a] = arr[i];
            a++;
        }
        return evenНumber;
    }
}
