package com.demo.progresstests.exam2.exercies17.exercies176;
/*
Дан метод:

static int doSomething (int num) {
    int s, n, temp;
    s = O;
    n = O;
    temp = num;
    while(temp > O) {
        s = s + (temp % 2);
        temp = temp / 10;
        n = n + 1;
    }
    return n - s;
}

1. Что будет выведено на экран, если вызов метода выглядит следующим образом:
   System.out.println(doSomething(1274))? Обоснуйте свой ответ.

   //    while(temp > O) {
   //        s = s + (temp % 2);
   //        temp = temp / 10;
   //        n = n + 1;
   //    }
   //    return n - s;

      while(1274 > O) {
        s = s + (temp % 2) = 0
        temp = temp / 10 = 127
        n = n + 1 = 1
    }
    while(127 > O) {
        s = 0 + (temp % 2) = 1
        temp = temp / 10 = 12
        n = 1 + 1 = 2
    }
    while(12 > O) {
        s = 1 + (temp % 2) = 1
        temp = temp / 10 = 1
        n = 2 + 1 = 3
    } while(1 > O) {
        s = 1 + (temp % 2) = 2
        temp = temp / 10 = 0
        n = 3 + 1 = 4
    }
    while(0!>0) cikl@ avartvec
    return n - s = 4 - 2 = 2

2. Приведите пример параметров, для которых метод будет возвращать значение 3.
   // orinak ver@ nshvac qaranish tvin avelacnenq verjic zuyg tvanish, vor temp % 2 = 0, aysinqn s-@ mna anpopox,
   // isk while-@ mek cikl avel kani, vori ardyunqum n-@ kavelana 1-ov
   // 1274x, x = {0,2,4,6,8} -> 12740, 12742 .... 12748;
   // return n- s = 5 - 2 = 3
 */

public class Exercies17_6 {
}
