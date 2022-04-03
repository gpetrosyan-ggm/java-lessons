package com.demo.lesson6.homework;

public class Calqulator {

    public int num1;
    public int num2;
    public int add;
    public int subtract;
    public int multiply;
    public double divide;

    public Calqulator(int num1, int num2) {
        this.num2 = num2;
        this.num1 = num1;
        this.add = add();
        this.subtract = subtract();
        this.multiply = multiply();
        this.divide = divide();
    }

    public Calqulator() {

    }

    public int add() {
        int add = num1 + num2;
        return add;
    }

    public int subtract() {
        int subtract = num1 - num2;
        return subtract;
    }

    public int multiply() {
        int multiply = num1 * num2;
        return multiply;
    }

    public double divide() {
        double divide = (double) num1 / num2;
        return divide;
    }

    public String toString() {
        return " num1 = " + num1 +
               ", num2 = " + num2 +
               ", add = " + add +
               ", subtract = " + subtract +
               ", multiply = " + multiply +
               ", divide = " + divide;

    }
}
