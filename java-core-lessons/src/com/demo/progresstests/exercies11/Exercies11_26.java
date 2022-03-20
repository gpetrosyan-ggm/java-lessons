package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран все целые трехзначные
числа (и положительные, и отрицательные), соответствующие следующему требованию:
эти числа делятся без остатка на сумму собственных цифр.
 */

public class Exercies11_26 {
    public static void main(String[] args) {
        for (int i = 100; i<=999;i++){

            int i100=i/100;
            int i10=i/10%10;
            int i1=i%10;
            int ii = i100+i10+i1;

            if (i%ii==0){
                System.out.println(i+" " + (-i)); // karayi nuyn@ naev minusov greyi, kamel ete petq errun@ plus u minus
                                                  // irar koxq chberi 2 hat println tam +i u arandzin (-i)
            }
        }
    }
}
