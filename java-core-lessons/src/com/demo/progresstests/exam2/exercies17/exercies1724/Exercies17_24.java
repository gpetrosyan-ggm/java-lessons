package com.demo.progresstests.exam2.exercies17.exercies1724;
/*
Напишите метод, который принимает в качестве параметров два параметра линейной функции
(а и Ь, для уравнения у=ах+Ь), а также координаты точки на плоскости (х и у).
Метод возвращает значение true, если точка лежит на графике функции;
в ином случае метод возвращает значение false.
 */

public class Exercies17_24 {
    public boolean linearFunctionCoordinates(int a, int b, int x, int y){

        return y == a*x + b;
    }
}
