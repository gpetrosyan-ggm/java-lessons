package com.demo.progresstests.exam2.exercies17.exercies1734;
/*
Напишите метод, который принимает в качестве параметра положительное целое число
и возвращает число с противоположным порядком цифр.
Например, для параметра 123 метод возвратит 321, для параметра 120 метод вернет 21.
 */

public class Exercies17_34 {
    int opposite(int num) {
        int coun = 1;
        int x = 0;
        int num1 = num;
        while (num > 9) {
            num /= 10;
            coun *= 10;
        }
        while (num1 > 0) {
            x += num1 % 10 * coun;
            num1 /= 10;
            coun /= 10;
        }
        return x;
    }
}
