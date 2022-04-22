package com.demo.lesson7.homework;

public class ConstructorTvDemo {
    public static void main(String[] args) {
        ConstructorTv tv = new ConstructorTv("KOREA", "SAMSUNG");
        System.out.println(tv.info());

        ConstructorTv tv1 = new ConstructorTv("KOREA", "SAMSUNG", 120);
        System.out.println(tv1.info());

        ConstructorTv tv2 = new ConstructorTv("KOREA", 120, "SAMSUNG");
        System.out.println(tv2.info());


    }

}
