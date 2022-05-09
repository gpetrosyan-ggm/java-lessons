package com.demo.progresstests.exam2.exercies17.exercies1710;
/*
Напишите метод, который принимает в качестве параметров целое число
и возвращает сумму его цифр.
 */
// es uxaki chshtman hamar em harcnum, nman paragayum henc skzbic petqa bacardzak arjeq vercnem te che?
public class Exercies17_10 {
    public int amount(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
