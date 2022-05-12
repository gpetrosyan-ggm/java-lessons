package com.demo.progresstests.exam2.exercies17.exercies178;
/*
Напишите метод, который принимает в качестве параметра число и
возвращает:
• -1 - в случае если число отрицательное;
• - в случае если число равно О;
• 1 - в случае если число положительное.
 */
// Sensey mer es paragayum eyakan chi dataType-@ incha int te double, bayc ete lurj logika greluc lines,
// int gres te double

public class Exercies17_8 {

    public int number(double num){
        int num1;
        if (num < 0){
            num1 = -1;
        }else if (num == 0){
            num1 = 0;
        }else {
            num1 = 1;
        }
        return  num1;

    }
}
