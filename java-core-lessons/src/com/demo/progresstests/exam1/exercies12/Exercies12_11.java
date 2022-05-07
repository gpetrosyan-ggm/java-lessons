package com.demo.progresstests.exam1.exercies12;
/*
Для того чтобы определить, сколько учеников готовы поехать на экскурсию, в школе провели опрос.
Каждый из 200 учеников отметил в опроснике:
«1»- если он готов поехать на экскурсию,
«О» - если не готов.
Напишите класс, который принимает с клавиатуры ответы учеников и определяет количество учеников,
готовых поехать на экскурсию. Кроме того, класс должен определить,
поедет ли на экскурсию большинство участвовавших в опросе учеников или нет.
 */

import java.util.Scanner;

public class Exercies12_11 {
    public static void main(String[] args) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 200; i++) {
            System.out.println("1 -gnum es te 0 - ches gnum");
            int a = scanner.nextInt();
            if (a == 1) {
                b++;
            }
        }
        System.out.println("ekskursia gnacox ashakertneri qanak@ " + b);
        if (b > 100) {
            System.out.println("mecamasnutyun@ meknum e");
        } else {
            System.out.println("mecamasnutyun@ chi meknum ");
        }
    }
}
