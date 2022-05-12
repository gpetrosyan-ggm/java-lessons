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
   // cikl@ noric kfra a>b, kmtni a = a-b = 4 - 3 = 1;
   //1!=3, kmtni cikl kashxati else-n; b = b-a = 3 - 1 = 2;
   // 1 != 2; kmtni cikl, kashxati elsen, b = b - a = 2 -1 = 1;
   // a == b; cikl@ kpakvi, kveradarcni 1;
   // return 1;

2. Какое значение возвращает метод, если его вызов выглядит следующим образом:
   x = what(14,35)? Обоснуйте свой ответ.

   // (a != b) && (a < b), hetevabar kashxati elsen, b = b-a = 35 - 14 = 21;
   //14 != 21 u b>a, kmtni else b = 21 - 14 = 7;
   // 14 != 7 u a>b a = a - b = 14 - 7 = 7;
   // a == b; cikl@ kpakvi u kveradarcni a = 7;
   // return 7;

3. Приведите пример параметров, для которых метод будет возвращать значение 2.

   // cankacac b-i arjeqi depqum a-n b-ic mec lini 2-ov, a = b + 2;

4. Как изменятся ответы на пункты 1 и 2,
   если в методе вместо return а; будет записано return Ь;? Обоснуйте свой ответ.

   // te arajin depqum ev te 2-rdi depqum kveradarcni b = a arjeq@, qani vor cikl@ pakvum e miayn ayn depqum erb a==b;
   // usti veradrcvox arjeq@ eyakan chi a e te b
   // 1. return b = 1;
   // 2. return b = 7

 */

public class Exercies17_3 {

}
