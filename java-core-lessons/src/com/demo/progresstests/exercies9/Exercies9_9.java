package com.demo.progresstests.exercies9;
/*
Напишите класс, который принимает с клавиатуры коэффициенты а и b линейного уравнения
(уравнения первой степени его, -а * х + Ь = О) и решает его, - то есть выводит на экран
или корень (корни) уравнения, или соответствующее смыслу текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("grel tiv");
        int a = scanner.nextInt();

        System.out.println("eli tiv");
        int b = scanner.nextInt();

        if (a == 0 && b !=0){
            System.out.println("havasarum@ armat chuni");

        }else if (a==0 && b==0){
            System.out.println(" x - patkanum e anverj bazmutyan@ ");

        }else {
            System.out.println("X = " + (-b/a));
        }
        scanner.close();
    }
}
     // x-@ verevum chem veragrel u haytararel, qani vor ete a = 0 tanq error ktar
     // bayc che vor a=0 u b =0, x-@ patkanum e ansahmanutyunic plyus ansahmanutyun