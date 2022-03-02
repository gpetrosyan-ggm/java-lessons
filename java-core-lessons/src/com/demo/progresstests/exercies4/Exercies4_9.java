package com.demo.progresstests.exercies4;
/*
Назовем «линейным сдвигом числа влево» операцию, при которой его цифры перемещаются на одну
позицию влево (единицы - на место десятков, десятки - на место сотен,
сотни - на место тысяч и так далее)
при этом первая цифра удаляется из числа, а на место единиц записывается ноль.
Например, из числа 1234 после такой операции получается число 2340.
Напишите класс, который принимает с клавиатуры трехзначное число
и строит новое число, полученное «линейным сдвигом влево».
 */

import java.util.Scanner;

public class Exercies4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel eranish drakan tiv ");

        int a = scanner.nextInt();
        System.out.println(a % 1000 * 10);

        scanner.close();
    }
}
