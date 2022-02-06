package com.demo.lesson4.homework;

public class FormulasHomeWork {

    public static void main(String[] args) {
        squareSum(3, 5);
        squareOfDifference(7, 9);
        differenceOfSquares(6, 4);
        differenceOfCubes(7, 2);
        sumOfCubes(5, 3);
        sumCube(8, 9);
        differenceCube(4, 6);
    }

    /**
     * Квадрат суммы
     * (a + b)2 = a2 + 2ab + b2
     *
     * @param a the first int value
     * @param b the second int value
     */
    private static void squareSum(int a, int b) {
        System.out.println("(a + b) qar");
      int  c1 = a * a + 2 * a * b + b * b;
      System.out.println(" c1 = "  + c1 );
      // tarberak 2

        int c2 = (a + b) * (a + b);
        System.out.println("c2 =  "  + c2);
        // tarberak 3
        int c3 =(2 * a * b) + (b *= b) + (a *= a);
        System.out.println(" c3 = "  +c3);
        // pastoren tvyal havasarman mej ete gumarelineri tex@ poxem ardyunq@ kpoxvi
        // ete skzbum grem a *= a, dranic heto havasrman mej grvac a-n haskanum e a qarakusi



    }

    /**
     * Квадрат разности
     * (a - b)2 = a2 - 2ab + b2
     *
     * @param a the first int value
     * @param b the second int value
     */
    private static void squareOfDifference(int a, int b) {
        System.out.println(" (a - b) qar");
        int d1 = a * a - 2 * a * b + b * b;
        System.out.println(" d1 = "  + d1 );
        int d2 = (a - b) * (a - b);
        System.out.println(" d2 = "  + d2);
        int d3 = -2 * a * b + (a *= a) + (b *= b);
        System.out.println(" d3 = "  + d3);

    }

    /**
     * Разность квадратов
     * a2 - b2 = (a + b)(a - b)
     *
     * @param a the first int value
     * @param b the second int value
     */
    private static void differenceOfSquares(int a, int b) {
        System.out.println("a qar - b qar");
        int b1 = a * a - b * b;
        System.out.println(" b1 = "  + b1);
        int b2 = (a + b) * (a - b);
        System.out.println(" b2 = "  + b2);
        int b3 = (a *=a) - (b *= b);
        System.out.println(" b3 = "  + b3);
        // es en haskaca vor a *=a -n greluc partadir petq e pakagceri mej gres
        // ete iranic baci eli gorcoxutyun ka tvyal havasarman mej

    }

    /**
     * Разность кубов
     * a3 - b3 = (a - b)·(a2 + ab + b2)
     *
     * @param a the first int value
     * @param b the second int value
     */
    private static void differenceOfCubes(int a, int b) {
        System.out.println("a xor - b xor");
        int k1 = (a - b) * (a * a + a * b + b * b);
        System.out.println(" k1 = "  + k1);
        int k2 = a * a * a - b * b * b;
        System.out.println(" k2 = " + k2);
        // sran 3-rd tarberak chgka a *= a tarberakov, xoranard chem kara
        // ete 4 astichan liner et karayi, mi hat veragreyi ira qarakusun heto eli noriv qarakusi barcracneyi

    }

    /**
     * Сумма кубов
     * a3 + b3 = (a - b)(a2 -ab + b2)
     *
     * @param a the first int value
     * @param b the second int value
     */
    // stex voch te (a - b) * ..., ayl a+b,
    private static void sumOfCubes(int a, int b) {
        System.out.println("a xor + b xor");
        int m1 = a * a * a + b * b * b;
        System.out.println(" m1 ="  + m1);
        int m2 = (a + b) * ((-a * b) + (a *= a) + (b *= b));
        System.out.println(" m2 = "  + m2);

    }

    /**
     * Куб суммы
     * (a + b)3 = a3 + b3 + 3ab(a + b)
     *
     * @param a the first int value
     * @param b the second int value
     */
    private static void sumCube(int a, int b) {
        System.out.println("(a + b) xor");
        int l1 = (a + b) * (a + b) * (a + b);
        System.out.println(" l1 ="  + l1);
        int l2 = a * a * a + 3 * a * b * (a + b) + b * b * b;
        System.out.println(" l2 = "  + l2);

    }

    /**
     * Куб разности
     * (a - b)3 = a3 - b3 - 3ab(a - b)
     *
     * @param a the first int value
     * @param b the second int value
     */
    private static void differenceCube(int a, int b) {
        System.out.println("(a - b) xor");
        int z1 = (a - b) * (a -b) * (a -b);
        System.out.println(" z1 = "  + z1);
        int z2 = a * a * a - 3 * a * b * (a -b) - b * b * b;
        System.out.println(" z2 = "  + z2);

    }

}
