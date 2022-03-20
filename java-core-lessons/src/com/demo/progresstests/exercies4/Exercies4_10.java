package com.demo.progresstests.exercies4;
/*
Назовем «сдвигом числа влево по кругу» операцию, при которой его цифры перемещаются на одну
позицию влево (единицы - на место десятков, десятки - на место сотен,
сотни - на место тысяч и так далее) - при этом первая цифра перемещается на место единиц.
Например, из числа 1234 получается число 2341.
Напишите класс, который принимает с клавиатуры трехзначное число
и строит новое число, полученное «сдвигом влево по кругу».
 */

import java.util.Scanner;

public class Exercies4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel ereanish tiv..");

        int a = scanner.nextInt();
        int a1 = a % 100;
        int a100 = a / 100;
        System.out.println(a1 * 10 + a100);

        scanner.close();
    }
}
