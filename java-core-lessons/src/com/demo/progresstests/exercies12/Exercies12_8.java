package com.demo.progresstests.exercies12;
/*
Напишите класс, который выводит на экран все целые положительные двузначные числа,
в которых разница между первой (число десятков) и последней (число единиц)
цифрами не превышает 3.
Класс должен также подсчитать количество этих чисел и вывести результат на экран
вместе с соответствующим текстовым сообщением.
 */

public class Exercies12_8 {
    public static void main(String[] args) {
        int a = 0;

        for ( int i = 10; i <= 99; i++) {
            int i10 = i / 10;
            int i1 = i % 10;
            if (i10 - i1 <= 3) ;
            a++;
            System.out.println(i);
        }
        System.out.println( " qanak@ " +a);
    }
}
