package com.demo.lesson6.homework;

public class DefaultDemo {
    public static void main(String[] args) {
        Default world = new Default();

        world.republic = " Armenia ";
        world.capital = " Erevan ";
        world.population = 2_000_000;
        world.emigration = 1_000_000;

        System.out.println("erki " + world.republic);
        System.out.println("mayraqaxaq " + world.capital);
        System.out.println("bnakchutyun " + world.population);
        System.out.println("artadaxt " + world.emigration);
    }
}
