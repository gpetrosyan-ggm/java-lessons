package com.demo.progresstests.exam2.exercies17.exercies1740;
/*
Напишите метод, который получает следующие параметры:
координаты центра круга, радиус круга и координаты некой точки.
Метод должен проверить, находится ли данная точка внутри круга.
 */

public class Exercies17_40 {
    public void circle(int x, int y, int radius, int dotX, int dotY){
        double distance;
        distance = Math.sqrt((dotX - x)*(dotX - x)+ (dotY - y)*(dotY - y));
        if (distance <=radius){
            System.out.println("ket@ gtnvum e shrjanagci nersum");
        }else {
            System.out.println("ket@ chi gtnvum nersum");
        }
    }
}
