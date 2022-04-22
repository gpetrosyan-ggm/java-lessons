package com.demo.lesson7.homework;

public class HomeDemo {

    public static void main(String[] args) {
        Home home = new Home();
        Home home1 = new Home("Abovyan", "xanuti koxqi shenq@");
        Home home2 = new Home("xanuti koxqi shenq", 24, 56);
        Home home3 = new Home(24, 56, "xanuti koxqi shenq");


        System.out.println();
        home.citizen("Ejmiatsin");
        home.citizen("Ejmiatsin", "Kirov");
        home.citizen("kirov", 12, 60);

    }

}
