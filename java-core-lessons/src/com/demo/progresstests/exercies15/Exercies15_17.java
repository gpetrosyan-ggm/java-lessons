package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положитель N и цифру D.
Класс должен проверить, есть ли внутри N цифра D, и вывести на экран соответствующее сообщение.
 */
// Sensey hl@ nay senc chishta, inadu if-er@ komment em arel u senc sarqel, wile(true) poxel em if-i meji paymanov

import java.util.Scanner;

public class Exercies15_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        System.out.println("number");
        int num = scanner.nextInt();

        System.out.println("number 1");
        int num1 = scanner.nextInt();
        int num3 = num; // es popoxakan@ haytararel em uxaki tpelu hamar, qani vor num-@ poxvuma amen qaylin
        int num4 = num1;
        while (num4 != 0) {

            // if (num1 != 0) {
            c *= 10;
            num4 /= 10;
            // } else {
            //     break;
            //   }
        }
        while (num > 9) {
            if (num % c == num1) {
                System.out.println("bingo");
                break;
            }
            num /= 10;
            // if (num == 0) {
            //   System.out.println(num3 + "_um chka " + num4 + " tiv@");
            //  break;
            //  }
        }

        scanner.close();
    }
}
