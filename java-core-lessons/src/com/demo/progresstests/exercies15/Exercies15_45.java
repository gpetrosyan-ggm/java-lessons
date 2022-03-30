package com.demo.progresstests.exercies15;
/*
В инструкции по пользованию лифтом в торговом центре написано:
«Не более 6 человек или не более 450 кг». Перед входом в лифт установлен прибор,
который подсчитывает входящих в лифт и определяет вес до входа в лифт.
Прибор автоматически прекращает доступ к лифту,
если вход очередного человека может нарушить инструкцию.
Напишите класс, который принимает с клавиатуры значения,
каждое из которых - вес очередного человека, входящего в лифт.
Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
Класс должен выводить на экран следующую итоговую информацию:
• количество людей, вошедших в лифт;
• общий их вес;
• причина, по которой прекращен вход людей в лифт.
 */

import java.util.Scanner;

public class Exercies15_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int weightAll = 0;
        while (true) {
            System.out.println("weight");
            int weight = scanner.nextInt();
            count++;
            weightAll += weight;

            if (weightAll > 450 || count > 6) {

                System.out.println(" dzer mutqn argelvum e ");
                weightAll -= weight;
                count--;
                System.out.println(count + " drner@ pakvecin, sharjvecinq" + weightAll);
                break;
            }

        }
        scanner.close();
    }
}
