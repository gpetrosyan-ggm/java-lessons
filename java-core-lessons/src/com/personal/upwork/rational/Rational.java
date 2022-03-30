package com.personal.upwork.rational;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rational {

    private long numerator;
    private long denominator;

    public Rational() {
        numerator = 1;
        denominator = 2;
    }

    public Rational(long numerator, long denominator) {
        long g = gcm(numerator, denominator);
        this.numerator = numerator / g;
        this.denominator = denominator / g;

    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational r) {
        long num = numerator * r.denominator + r.numerator * denominator;
        long denom = denominator * r.denominator;
        return new Rational(num, denom);
    }

    public Rational subtract(Rational r) {
        long num = numerator * r.denominator - r.numerator * denominator;
        long denom = denominator * r.denominator;
        return new Rational(num, denom);
    }

    public Rational multiply(Rational r) {
        long num = numerator * r.numerator;
        long denom = denominator * r.denominator;
        return new Rational(num, denom);
    }

    public Rational divide(Rational r) {
        long num = numerator * r.denominator;
        long denom = denominator * r.numerator;
        return new Rational(num, denom);
    }

    public String floatPointForm(int precision) {
        double result = (double) this.numerator / this.denominator;
        return BigDecimal.valueOf(result).setScale(precision, RoundingMode.HALF_DOWN).toString();
    }

    public static String floatPointForm(Rational r, int precision) {
        double result = (double) r.numerator / r.denominator;
        return BigDecimal.valueOf(result).setScale(precision, RoundingMode.HALF_DOWN).toString();
    }

    // reduce fraction
    public static long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b);
    }

    public static String asFraction(long a, long b) {
        long gcm = gcm(a, b);
        return (a / gcm) + "/" + (b / gcm);
    }
    //

    @Override
    public String toString() {
        return "(" + numerator + "/" + denominator + ")";
    }

}