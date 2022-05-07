package com.demo.progresstests.exam1.exercies5;
/*
Дано логическое выражение:
(z > x) || (x < O) && ( z - y > 9)
Чему равно значение этого выражения для следующих значений переменных:
x=-2; y=5; z=l3?
 */

public class Exercies5_3 {
    public static void main(String[] args) {
        Exeries53(-2, 5, 13);
        Exeries54(-2, 5, 13);

    }
    public static void Exeries53(int x, int y, int z){
        boolean b;
        b = (z>x)|| (x < 0) && (z - y > 9);
        System.out.println(b);
    }
    /*
    Дано логическое выражение:
((z > x) || (x < O)) && (z - y > 9)
Чему равно значение этого выражения для следующих значений переменных:
х=-2; y=5; z=13?
     */

    public static void Exeries54(int x, int y, int z){
        boolean b;
        b = ((z>x)|| (x < 0)) && (z - y > 9);
        System.out.println(b);
    }
}
