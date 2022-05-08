package com.demo.progresstests.exam2.exercies17.exercies173;
/*
17.3
Дан метод:

public static int what (int а, int b){
    while (а != b) {
        if (а > b) {
            а = а - Ь;
        } else {
            Ь = Ь - а;
        }
    }
    return a;
}

1. Какое значение возвращает метод, если его вызов выглядит следующим образом:
   x = what(7,3)? Обоснуйте свой ответ.

   // (a != b) && (a > b), hetevabar kashxati  a = a - b, a = 7 - 3 = 4;
   // return 4

2. Какое значение возвращает метод, если его вызов выглядит следующим образом:
   x = what(14,35)? Обоснуйте свой ответ.

   // (a != b) && (a < b), hetevabar kashxati elsen, b = b-a, usti a-n kmna anpopox;
   // return 14;

3. Приведите пример параметров, для которых метод будет возвращать значение 2.

   // cankacac b-i arjeqi depqum a-n b-ic mec lini 2-ov, a = b + 2;

4. Как изменятся ответы на пункты 1 и 2,
   если в методе вместо return а; будет записано return Ь;? Обоснуйте свой ответ.

   // 1-in depqum qani vor (a != b) && (a > b), kpopoxvi a-n isk b-n kmna anpopox;
   // return 3;

   // 2-rd depqum qani vor // (a != b) && (a < b), hetevabar kashxati elsen, b = b-a = 35 - 14 = 21;
   // return 21;

 */

public class Exercies17_3 {
}
