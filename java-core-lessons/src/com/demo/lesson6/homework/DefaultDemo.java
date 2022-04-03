package com.demo.lesson6.homework;

public class DefaultDemo {
    public static void main(String[] args) {
        Default world = new Default();

        world.Republic = " Armenia ";
        world.Capital = " Erevan ";
        world.Population = 2_000_000;
        world.Emigration = 1_000_000;

        System.out.println("erki " + world.Republic);
        System.out.println("mayraqaxaq " + world.Capital);
        System.out.println("bnakchutyun " + world.Population);
        System.out.println("artadaxt " + world.Emigration);
    }
}
