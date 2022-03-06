package com.demo.progresstests.exercies10;

/*
Как известно, при игре в «двадцать одно» («очко») у каждой карты есть
численное значение.
Напишите класс, который «выбрасывает три карты» (генерирует три случайных
числа - в каких пределах?) и определяет,
какой из вариантов (недобор, перебор, «очко») реализовался.
 */
// es ochko xaxacac chkam, im imanalov 21 petqa havaqes, dra hamar em 21 grel
public class Exercies10_6 {
    public static void main(String[] args) {
        int min = 2;
        int max = 11;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a = a1 + a2 + a3;   // haytararel u veragrel em, bac ete nergevum a em dnum 0 e stanum
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                a1 = (int) (Math.random() * (min - max + 1) + max);
            } else if (i == 1) {
                a2 = (int) (Math.random() * (min - max + 1) + max);
            } else {
                a3 = (int) (Math.random() * (min - max + 1) + max);
            }
        }
        System.out.println(a1 + " " + a2 + " " + a3);
        if (a < 21) {
            System.out.println((a1 + a2 + a3) + " недобор ");
        } else if (a == 21) {
            System.out.println((a1 + a2 + a3) + " «очко»");
        } else {
            System.out.println((a1 + a2 + a3) + " перебор");
        }
    }


}
