package com.demo.progresstests.exercies11;
/*
Напишите класс, который читает два целых положительных числа в переменных А и В и проверяет,
действительно ли А меньше, чем В.
Если да, - класс должен вывести на экран А последовательных чисел,начиная с числа В,
если нет, - класс должен вывести на экран В последовательных чисел, начиная с числа А.
 */
//stex ete asuma stugi ardyoq a<b; partadir petqa if-ov stugum anem te tenarniov karam grem?
// if te tenari, misht xndrica kaxvac.

import java.util.Scanner;

public class Exercies11_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();

       if (a<b){
           for (int i = b; i>a; i--){
               b--;
               System.out.println(b);

           }
       }else if (a>b){
           for (int i = a; i>b; i--){
               a--;
               System.out.println(a);

           }
       }

    }
}
