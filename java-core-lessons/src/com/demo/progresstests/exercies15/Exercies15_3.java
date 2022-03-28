package com.demo.progresstests.exercies15;
/*
Дан фрагмент класса:  (Math.abs - Возвращает абсолютное значение значения int.)

int a = Math.abs(reader.nextInt());
int b = Math.abs(reader.nextInt());
while (а > О || Ь > О) {
    System.out.print(a % 10 + b % 10);
    а = а / 10;
    Ь = Ь / 10;
}

1. Постройте таблицу трассировки и укажите,·что будет выведено на экран,
если с клавиатуры были введены следующие значения: 99 и 698.

2. Постройте таблицу трассировки и укажите, что будет выведено на экран,
   если с клавиатуры были введены следующие значения: 153 и 5.

3. Приведите пример вводимых с клавиатуры значений,
   для кото рых цикл будет выполняться три раза,
   причем на экран каждый раз будет выводиться одно и то же число.

4. Приведите пример вводимых с клавиатуры значений,
   для которых цикл будет выполняться три раза,
   причем на экран будут выводиться числа 7, 8 и 9.
 */

public class Exercies15_3 {

    // 1.
    // a=99;     total = 9+8=17    total= 9+9 = 9     total= 0+6=0   cikli avart
    // b=698     a=9; b = 69;     a=0; b = 6;        a=0; b=0;


    //2.
    //a=153;   total= 3+0=3      total = 5+0=5          total = 0+0=0  cikli avart
    //b=5;     a=15; b=0;        a=1; b=0;               a=0; b=0;


    //3.
    // cikl@ kkatarvi 3 angam ete a kam b popoxakanneric gone mek@ drakan eranish e u myus@ drakan eranish kam aveli poqr
    //amena parz orinak@ vor ardyunq@ misht lini nuyn tiv@ da erb tveric mek@ eranish e u ir andamner@ mievnuyn tivn en,
    // isk myus tiv@ naxordi pes eranish kam 0; orinak a={111, 222, 333, 444 ... 999}; b = a-i et tiruyti arjeq || a=0

    //orinak
    //a=555;     total = 5+1=6       total = 5+1=6      total = 5+1=6      cikli avart
    //b=111;     a=55; b= 11;          a=5;  b=1;            a=0; b=0;

    //4.
    //amena parz u hasarak dasakan orinak

    //a=987;    total 7+0 = 7        total 8+0=8  total 9+0=0   cikli avart
    //b=0       a=98; b = 0;        a=9; b=0;       a=0;b=0

    // kam kara (a=980, b =7) || (a=907, b = 80) || (a=900,b=87) || a+b=987
}
