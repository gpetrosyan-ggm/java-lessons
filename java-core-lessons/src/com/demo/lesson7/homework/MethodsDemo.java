package com.demo.lesson7.homework;

public class MethodsDemo {
    public static void main(String[] args) {
        Methods add1 = new Methods();
        double m = add1.add(12, 34);
        double n = add1.multi(24, 56, 8);
        double b = add1.sub(m, n);
        System.out.println(b);

        System.out.println(add1.sub(add1.add(12, 34),add1.multi(24, 56, 8) ));
    }
}
