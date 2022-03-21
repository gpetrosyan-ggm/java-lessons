package com.demo.progresstests.exercies16;

/*
Напишите класс, который выводит на экран:
в первой строке все четные двузначные числа,
во второй строке - двузначные числа, делящиеся на 3 без остатка,
в третьей строке - двузначные числа, делящиеся на 4 без остатка,
и так далее.
 */
// Sensey raz chgitem toxum vonc tpem, senc em tpel, kam el petqa 3 arandzin cikler sarqem
public class Exercies16_4 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            System.out.println(i + " zuyg e ");

            if (i % 3 == 0) {
                System.out.println(i + " 3-i bajanara ");
            }
            if (i % 4 == 0) {
                System.out.println(i + " 4-i bajanarn e");
            }

        }
    }
}
