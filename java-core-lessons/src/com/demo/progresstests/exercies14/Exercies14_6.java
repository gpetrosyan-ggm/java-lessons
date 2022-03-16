package com.demo.progresstests.exercies14;
/*
Напишите класс, который принимает с клавиатуры серию из 27 целых чисел и сравнивает два значения:
среднее арифметическое максимума и минимума, и среднее арифметическое всех значений серии.
 */

import java.util.Scanner;

public class Exercies14_6 {
    public static void main(String[] args) {
        double k;
        double mijin;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" tiv ");
        int a = scanner.nextInt();

       double c = a;
        double gumar = a;  // Sensey double em haytararel vor aveli stuyg stanam patasxan@, bayc mi hat harc unem
        //ete verevum haytararem double gumar isk stex veragrem a; xiya ardyunq@ stacvum
        // orinak 11.0, kotorakain mas@ xiya shprtum durs, xndrum em zangov bacatres

        for (int i = 1; i < 27; i++) {
            System.out.println(" tiv ");
            int b = scanner.nextInt();
            gumar = gumar + b;

            if (b > c) {
                c = b;
            } else if (b < a) {
                a = b;
            }
        }
        k = (c + a) / 2;
        mijin = gumar / 27;

        if (mijin > k) {
            System.out.println("bolor tveri mijin@ aveli mec e " + mijin + " > " + k);
        } else if (mijin < k) {
            System.out.println("amena meci u amena poqri mijnn aveli mec e " + mijin + " < " + k);
        } else {
            System.out.println("havasar en " + mijin + " = " + k);
        }
    }
}
