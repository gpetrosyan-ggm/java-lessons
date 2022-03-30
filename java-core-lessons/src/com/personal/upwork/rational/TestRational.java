package com.personal.upwork.rational;

import java.util.Scanner;

public class TestRational {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rational a;
        Rational b;

        System.out.println("Enter numerator for the first rational number: ");
        long numa = input.nextLong();
        System.out.println("Enter a non-zero denominator for the first rational number: ");
        long denoma = input.nextLong();
        System.out.println("Enter a numerator for the second rational number: ");
        long numb = input.nextLong();
        System.out.println("Enter a non-zero denominator for the second rational number: ");
        long denomb = input.nextLong();

        a = new Rational(numa, denoma);
        b = new Rational(numb, denomb);
        String aFraction = Rational.asFraction(a.getNumerator(), a.getDenominator());
        String bFraction = Rational.asFraction(b.getNumerator(), b.getDenominator());

        System.out.println("First rational number is: " + a);
        System.out.println("Second rational number is: " + b);

        Rational rAdd = a.add(b);
        String rAddFraction = Rational.asFraction(rAdd.getNumerator(), rAdd.getDenominator());
        System.out.println("\n---------------- Addition -----------------");
        System.out.printf("The result of %s + %s is %s", aFraction, bFraction, rAddFraction);

        Rational rSubtract = a.subtract(b);
        String rSubtractFraction = Rational.asFraction(rSubtract.getNumerator(), rSubtract.getDenominator());
        System.out.println("\n---------------- Subtraction -----------------");
        System.out.printf("The result of %s - %s is %s", aFraction, bFraction, rSubtractFraction);

        Rational rMultiply = a.multiply(b);
        String rMultiplyFraction = Rational.asFraction(rMultiply.getNumerator(), rMultiply.getDenominator());
        System.out.println("\n---------------- Multiplication -----------------");
        System.out.printf("The result of %s * %s is %s", aFraction, bFraction, rMultiplyFraction);

        Rational rDivide = a.divide(b);
        String rDivideFraction = Rational.asFraction(rDivide.getNumerator(), rDivide.getDenominator());
        System.out.println("\n---------------- Division -----------------");
        System.out.printf("The result of %s / %s is %s", aFraction, bFraction, rDivideFraction);

        // Return a String representation of a Rational number in floating-point format.
        // Providing formatting capabilities that enable the user of the class to specify the
        // number of digits of precision to the right of the decimal point.

        System.out.println("\nA String representation of a Rational number in floating-point format.");
        System.out.print("Specify the number of digits of precision to the right of the decimal point: ");
        int precision = input.nextInt();
        System.out.println("Number of digits of precision is: " + a);
        String aPrec = Rational.floatPointForm(a, precision);
        String bPrec = Rational.floatPointForm(b, precision);

        System.out.println("\n---------------- Addition -----------------");
        System.out.printf("The Addition result of %s plus %s is %s",
                          aPrec,
                          bPrec,
                          Rational.floatPointForm(rAdd, precision));

        System.out.println("\n---------------- Subtraction -----------------");
        System.out.printf("The Subtraction result of %s minus %s is %s",
                          aPrec,
                          bPrec,
                          Rational.floatPointForm(rSubtract, precision));

        System.out.println("\n---------------- Multiplication -----------------");
        System.out.printf(
                "The Multiplication result of %s multiplied by %s is %s",
                aPrec,
                bPrec,
                Rational.floatPointForm(rMultiply, precision));

        System.out.println("\n---------------- Division -----------------");
        System.out.printf("The Division result of %s divided by %s is %s",
                          aPrec,
                          bPrec,
                          Rational.floatPointForm(rDivide, precision));

    }

}
