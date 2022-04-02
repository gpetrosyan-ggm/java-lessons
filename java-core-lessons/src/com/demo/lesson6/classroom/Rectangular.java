package com.demo.lesson6.classroom;

public class Rectangular {

    public int pageA;

    public int pageB;

    public String name;

    public int max;

    public int min;

    public int perimeter;

    public double diagonal;

//    public Rectangular() {
//    }

    public Rectangular(int pageA, int pageB, String name) {
        this.pageA = pageA;
        this.pageB = pageB;
        this.name = name;
        this.diagonal = diagonal();
        this.perimeter = perimeter();
    }

//    public Rectangular(int a, int b, String n, int max) {
//        pageA = a;
//        pageB = b;
//        name = n;
//    }

//
//    public Rectangular(int a, int b, int min, String n) {
//        pageA = a;
//        pageB = b;
//        name = n;
//    }

    public int perimeter() {
        int perimeter = 2 * pageA + 2 * pageB;
        return perimeter;
    }

    // Math.pow = astichan barcracnel
    // Math.sqrt = qarakusi armat
    public double diagonal() {
        double diagonalPow = Math.pow(pageA, 2) + Math.pow(pageB, 2);
        return Math.sqrt(diagonalPow);
    }

    public int getMax(int max) {
        return this.max > max ? this.max : max;
    }

    public int getMin(int min) {
        return this.min < min ? this.min : min;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
               "pageA=" + pageA +
               ", pageB=" + pageB +
               ", name='" + name + '\'' +
               ", max=" + max +
               ", min=" + min +
               ", perimeter=" + perimeter +
               ", diagonal=" + diagonal +
               '}';
    }

}
