package com.demo.progresstests.exam1.exercies7;
/*
Дан фрагмент класса (программный блок):

    x=reader.nextlnt();
    а=х%100;
    if (х==а) System.out.print("Ok");
    else System.out.print("No");

Ответьте на вопросы в соответствии с исполнением этого фрагмента:
1. Какая информация будет выведена на экран, если с клавиатуры
    будет введено значение 165? Обоснуйте ответ.
    //
    ktpi NO, qani vor 165%100 = 65, vorn el ir hertin !=165

2. Какая информация будет выведена на экран, если с клавиатуры
    будет введено значение 5555? Обоснуйте ответ.
    //
    sa nuynpes kta NO, 5555%100=55; 55 !=5555

3. Приведите пример значения, вводимого с клавиатуры,
    для которого на экран будет выведена информация OK.
    //
    orinak 10, -45, 98
    10%100=10   (-45)%100=-45    98%100=98

4. Какими должны быть вводимые с клавиатуры значения, чтобы на
    экран выводилось сообщение Ok.
    //
    -99_ic minjev 99 @ngac mijakayqi tver@, qani vor ayd mijakayqi bolor tveri %100 havasar e henc ayd tvin
    80%100=80

 */

import java.util.Scanner;

public class Exercies7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tiv");

        int x = scanner.nextInt();
        int a = x % 100;
        if (a == x) {
            System.out.println("OK ");
        } else {
            System.out.println("NO ");
        }
    }
}
