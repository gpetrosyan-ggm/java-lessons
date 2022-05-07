package com.demo.progresstests.exam1.exercies3;
/*
Для пересчета суммы в одной валюте - в сумму в другой валюте
(например, между суммой в рублях и этой же суммой, но в евро)
используется так называемый «банковский курс»: числовой коэффициент,
показывающий, чему равна единица одной валюты в единицах другой.
Напишите класс, который принимает с клавиатуры два числа:
первое - сумму в одной валюте (например, в долларах),
и второе - «банковский курс».
Класс должен подсчитать и вывести на экран сумму во второй валюте.
 */

import java.util.Scanner;

public class Exercies3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grpanumt parunakutyun@ ...");

        double mani = scanner.nextDouble();
        System.out.println("nax@ntreli kurs ...");

        double valuta = scanner.nextDouble();
        System.out.println("dzer poxarjeq@ kkazmi " + (mani * valuta));
    }
}
