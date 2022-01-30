package com.demo.lesson3.homework;

public class TypesHomeWork {

    private static int z = 5;

    public static void main(String[] args) {
        castExample();
        toCelsius(50);
        toCelsius(30);
        toFahrenheit(10);
        toFahrenheit(15);
        factorial(5);
        factorial(10);
        fibonacciSequence(10);
        fibonacciSequence(20);
        typeExample();
        scopeAndLifetimeExample();
    }

    /**
     * declare per type and print it
     * <p>
     * byte
     * short
     * int
     * long
     * <p>
     * char
     * <p>toFahrenheit(double celsius)
     * float
     * double
     * <p>
     * boolean
     */
    private static void typeExample() {
        byte b = -17;
        byte y = 25;
        System.out.println(b + " " + y);

        short s = 12_004, h = -64;
        System.out.println(s + " " + h);

        int i = 127_873_942, n = 84_845;
        System.out.println(i + "  " + n);

        long l = 846_940_943, o = -89_237;
        System.out.println(l + "   " + o);

        char ch1, ch2;
        ch1 = 'X';
        ch2 = 'Y';
        System.out.println(ch1 + "   " + ch2);

        double d = 73.65, u = -.67;
        System.out.println(d + "  " + u);
    }

    /**
     * Преобразование и приведение типов
     * short -> byte : հասկանալ ոնց է անցնում ու ոնց է արդյունքը ստանում
     */
    private static void castExample() {
        byte b;
        short s = 12_674;
        int i = 98_762;
        double d = 40_367_854_001.754;
        System.out.println("\npoxakerpum short  byte.");
        b = (byte) s;
        System.out.println("s u b" + s + "" + b);

        System.out.println("\npoxakerpum int byte");
        b = (byte) i;
        System.out.println(" i u b " + i + "" + b);
        b = (byte) d;
        System.out.println("d u b " + d + " " + b);
        s = (short) i;
        System.out.println("i u s " + i + "" + s);
        s = (short) d;
        System.out.println("d u s " + d + " " + s);
        i = (int) d;
        System.out.println("d u i " + d + "" + i);

        //int-i u shorti ancum@ byte-in texi e unenum heteval kerp
        // int ic hanvum e 256 * K, vortex kan drakan amboxakan tiv e, xi 256?
        // byeti diapazon@ -128_ic 127 e, ir mej parunakum e 256 tiv zron neraral,
        // isk inti u longe_i ancum@ shorti hanvum e 65_536 minev khattnvi short-i tiruyt,
        // short-i tiruyt@ kazmum e -32768_ic 32767, vor@ parunakum e 65536 nih, neraran zron
    }

    /**
     * Область видимости и срок действия переменных
     */
    private static void scopeAndLifetimeExample() {

        // 1. use class variables
        System.out.println(z);

        // 2. use method variables
        // ay es mek@ chem jogum inch anem
        int j = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(" " + i);
            System.out.println(" " + ++j);
        }
    }

    /**
     * Convert celsius to fahrenheit
     */
    private static void toFahrenheit(double celsius) {
        // °F = (°C × 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " celsius " + " = " + fahrenheit + " fahrenheit");
    }

    /**
     * Convert fahrenheit to celsius
     */
    private static void toCelsius(double fahrenheit) {
        // °C = (°F − 32) x 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " fahrenheit " + " = " + celsius + " celsius");
    }

    /**
     * Числа Фибоначчи
     * <p>
     * {@url} https://futurenow.com.ua/ru/chto-takoe-chysla-fybonachchy-zolotoe-sechenye/
     */
    private static void fibonacciSequence(int n) {
        // Fn = Fn−1 + Fn−2

        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i < n; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);

            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * Факториал
     * <p>
     * {@url} https://skysmart.ru/articles/mathematic/chto-takoe-faktorial-chisla
     */
    private static void factorial(int num) {
        // n!=1⋅2⋅3⋅...⋅(n−2)⋅(n−1)⋅n

        int originNum = num;
        int fac = 1;
        for (int i = num; i > 0; i--) {
            fac *= num--;
        }
        System.out.println(originNum + " factorial = " + fac);
    }

}

// System.out.println("a: " + a);
