package com.demo.lesson5.classroom;

public class IfSelectionStatementDemo {

    // if(paymant) {logika}

    // if(paymant) {logika}
    // else {logika} // partadir chi else blok@

    // if(paymant) {logika}
    // else if(paymant) {logika} // partadir chi else if blok@
    // else {logika} // partadir chi else blok@

    public static void main(String[] args) {
        ifSimpleDemo("Gonch", 1_500_000, 70_000);
        System.out.println();

        ifSimpleDemo("Karen", 250_000, 120_000);
        System.out.println();

        ifSimpleDemo("Ashot", 500_000, 200_000);
        System.out.println();

        ifSecondDemo(250_000);
        ifSecondDemo(1_250_000);

    }

    private static void ifSimpleDemo(String name, double salary, double otherCosts) {
        int mult = 0;
        double income = salary - otherCosts;

        if (salary > 400_000 && income > 300_000) {
            if (salary > 500_000) {
                System.out.println("Bonus -2%");
            }
            if (salary > 1000_000) {
                System.out.println("Bonus -5%");
                if (otherCosts < 80_000) {
                    System.out.println("Bonus -5% + VISA CARD");
                }
            }
            System.out.println("*8");
            mult = 8;
        } else if (salary > 300_000 && income > 150_000) {
            System.out.println("*5");
            mult = 5;
        } else if (salary > 200_000 && otherCosts < 100_000) {
            System.out.println("*3");
            mult = 3;
        } else {
            System.out.println("Could not give an credit with income: " + (salary - otherCosts));
        }

        double credit = income * mult;
        System.out.println(income + " * " + mult + " = " + credit);
        System.out.println(name + ": Credit -> " + credit);
    }

    private static void ifSecondDemo(double salary) {
        int bonus = 0;

        if (salary > 100_000) {
            ++bonus; // bonus = bonus + 1;
        }
        if (salary > 200_000) {
            ++bonus;
        }
        if (salary > 500_000) {
            bonus += 2;
        }
        if (salary > 1_000_000) {
            bonus += 3;
        }

        System.out.println("Bonus: " + bonus);
    }

}
