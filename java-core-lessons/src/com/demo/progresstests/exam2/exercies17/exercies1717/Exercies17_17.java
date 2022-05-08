package com.demo.progresstests.exam2.exercies17.exercies1717;
/*
Напишите метод, который получает в качестве параметра целое число большее или равное 10.
Метод возвращает число без его крайней левой цифры.
Например, для параметра 1234 метод вернет 234, а для параметра 104 -4.
 */

public class Exercies17_17 {
    void withoutLeftNumber(int num) {
        int count = 1;
        int num1 = num;
        while (num1 > 9) {
            count *= 10;
            num1 /= 10;
        }
        System.out.println(num % count);
    }
}
