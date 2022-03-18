package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положитель N и цифру D.
Класс должен проверить, есть ли внутри N цифра D, и вывести на экран соответствующее сообщение.
 */
// Sensey xndir@ chi asum gri N tiv u D tvanish u stugi, N-um Dtvanish ka te che?
// xndir@ tenc em haskacel, ete sxal em haskacel kxndreyi aseir incha asum
import java.util.Scanner;

public class Exercies15_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        System.out.println("number 1");
        int num1 = scanner.nextInt();
        int num3 = num; // es popoxakan@ haytararel em uxaki tpelu hamar, qani vor num-@ poxvuma amen qaylin

        while (true) {

            if (num % 10 == num1) {
                System.out.println(num3 + "_um ka " + num1 + " tiv@");
                break;
            }
            num /= 10;
            if (num == 0) {
                System.out.println(num3 + "_um chka " + num1 + " tiv@");
                break;
            }
        }
        scanner.close();
    }
}
