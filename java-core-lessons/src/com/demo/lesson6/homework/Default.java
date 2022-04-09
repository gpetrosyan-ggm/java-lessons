package com.demo.lesson6.homework;

public class Default {

    public String republic;
    public String capital;
    public int population;
    public int emigration;

    public Default(String republic, String capital, int population, int emigration) {
        this.republic = republic;
        this.capital = capital;
        this.population = population;
        this.emigration = emigration;

    }

    public void world() {
        System.out.println("erkir " + republic);
        System.out.println("mayraqaxaq " + capital);
        System.out.println("bnakchutyun " + population);
        System.out.println("artagaxt@ " + emigration);
    }
}
