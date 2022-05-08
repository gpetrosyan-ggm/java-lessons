package com.demo.progresstests.exam2.exercies17.exercies174;
/*
Дан метод:

int what(int num, int d) {
    int g= О;
    if(num > 99) {
        num = num % 100;
    }
    if(num % 10 == d) {
        g++;
    }
    if (num / 10 == d) {
        g++;
    }
    return g;
}

1. Какое значение возвращает метод, если его вызов выглядит следующим образом:
   x = what(1235,3)? Обоснуйте свой ответ.

   //num > 99, usti num@ = 1235 % 100; num = 35;
   // if(num % 10 == d); 35 %10 = 5, vorn el ir hertin != d; usti g-n kmna anpopox 0;
   // if (num / 10 == d); 35 / 10 = 3, vorn el = d; g++ kashxati, g = 1;
   // return 1

2. Приведите пример параметров, для которых метод будет возвращать значение 2.

   // xydd, aysinqn qaranish tvi verji 2 tver@ linen 3, isk x u  y tver@ kamayakan, xy33;
   //kara num-@ lini cankacac kamayakan tiv, vori tvanshanneri qanak@ mec e 2-ic, bayc verji 2 tver@ linen dd <<33>>
   // if(num > 99) -> num = xy33 % 100 = 33;
   // if(num % 10 == d) -> num = 33 %10 = 3, vorn el ir hertin == d, usti g = 1;
   // if (num / 10 == d) -> num / 10 = 3, vorn el ir hertin == d, usti g-in klini 2;
   // return 2;

3. Приведите пример параметров, для которых метод будет возвращать значение О.

   // cankacac erknish u aveli nish unecox tveri bazmutyun, vori verji 2 tvanshaneric voch mek@ != d;
   // 237894392312 % 100 = 12; naxord xndirnerum vor @ndunem tvyal tiv@ kstacvi vor g = 0;

 */

public class Exercies17_4 {
}
