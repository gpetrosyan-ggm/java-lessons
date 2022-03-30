package com.demo.progresstests.exercies15;
/*
Дан фрагмент класса:

int a=reader.nextInt();
int b=reader.nextInt();
int c=reader.nextInt();
while (а % b != О) {
    а += с;
    System.out.print(a + "; ");
}

1. Постройте таблицу трассировки и укажите, что будет выведено на экран,
   если с клавиатуры были введены следующие значения: 27, 7, 5.

2. Постройте таблицу трассировки и укажите, что будет выведено на экран,
   если с клавиатуры были введены следующие значения: 20, 5, 8.

3. Приведите пример значений, вводимых с клавиатуры,
   для которых цикл в данном фрагменте не выполняется ни разу.

4. Есть ли значения переменных а, Ь, с, для которых цикл никогда не завершится?
   Если да - приведите пример, если нет - объясните, почему.

5. Приведите пример значений, вводимых с клавиатуры,
   для которых цикл в данном фрагменте будет выполняться ровно три раза.

6. Что в общем случае выполняет приведенный фрагмент?
 */

public class Exercies15_1 {
// 1.
// a=27;       27%7!=0      32%7!=0    37%7!=0   42%7=0
// b=7;        a=27+5       32+5=37    37+5=42   cikl@ kpakvi
// c=5         total 32 ;  total 37    total 42


//2.
//    a=20;       20%5=0
//    b=5;
//    c=8;        total "vochinch chi tpi"

//3.
//orinak 2.  cankacac depq erb a%b=0;
//a=10;         10%2=0
//b=2;
//c=3;          total "vochinch chi tpi"

//    4.
//    ayo hnaravor e anverj cikl ete b=1, b-i aysinqn 1-@ handisanum e anverj bazmutyan bajanarar, cikli nersum
//    a+=c misht kbajanvi b-in anmnacord;
//    tarberak 2, erb a-n bajanvum e b-in anmnacord isk c=0; isk et depqum a+=c misht kmna anpopox havar a,
//    vorn el anmnacord bajanvur er b-in

//5.
//    henc arajin isk orinak@, cikl@ katarvel e 3 angam, kam ayl orinak
//    a= 13;     13%4!=0     14%4!=0      15%4!=0      16%4=0
//    b=4;       a=13+1       a=15         a=16
//    c=1;         14          15           16          cikl@ avartvec

//    6.
//    generiruet, stexcum e patahakan 3 amboxjakan tiv u stugum, ete arajin tiv@ anmnacord chi bajanvum e 2-rd tvi vra, apa
//    1-in tvin avelacnum e 3-rd tiv@ u tpum (isk ete anmnacord bajanvec, voch mi gorcoxutyun chi anum, chi mtnum cikl),
//    aynuhetev stacvac ardyunq@ noric hamematum paymani het, aysinqn stacvac tiv@ ete noric anmnacord chi bajanvum 2-rd
//    tvin apa katarum e ver@ nshvac gorcoxutyun@ aynqan jamanak minjev stacvac popoxakan@ anmnacord kbajanvi 2-rd tvi vra
//    u chi bavararvi cikli paymanin, cikl@ kpakvi

}
