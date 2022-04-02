package com.demo.lesson6.classroom;

public class RectangularDemo {

    public static void main(String[] args) {
        Rectangular rec1 = new Rectangular(10, 20, "T1");
        rec1.max = 15;
        rec1.min = 5;

        Rectangular rec2 = new Rectangular(15, 25, "T2");

//        rec2.pageA = 15;
//        rec2.pageB = 25;
//        rec2.name = "T2";

        System.out.println(rec1);
        System.out.println(rec2);

        System.out.println(rec1.getMax(50));
        System.out.println(rec1.getMin(1));
    }

}
