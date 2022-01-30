package com.demo.lesson3.homework;

public class TypesHomeWork {

    public static void main(String[] args) {
        castExample();
        toCelsius();
        toFahrenheit();
        factorial();
        fibonacciSequence();
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
    byte b = -17, y = 25;
        System.out.println(b+ " " +y);
    short s = 12_004,  h = -64;
        System.out.println(s+ " " +  h);
    int i = 127_873_942,  n = 84_845;
        System.out.println(i+  "  " +n);
    long l = 846_940_943, o = -89_237;
        System.out.println(l+  "   "  + o);
        char ch1, ch2;
        ch1 = 'X';
        ch2 = 'Y';
        System.out.println(ch1 + "   " + ch2);
     double d = 73.65,   u = -.67;
        System.out.println(d+  "  "  +u);

    }

    /**
     * Преобразование и приведение типов
     * short -> byte : հասկանալ ոնց է անցնում ու ոնց է արդյունքը ստանում
     */
    private static void castExample() {
        byte b = 52;
        short s = 12_674;
        int i = 98_762;
        double d = 40_367_854_001.754;
        System.out.println("\npoxakerpum short  byte.");
        b = (byte) s;
        System.out.println("s u b"  +s+ "" +b);

        System.out.println("\npoxakerpum int byte");
        b = (byte) i;
        System.out.println(" i u b "  + i + ""  +b);
        b = (byte) d;
        System.out.println("d u b "  +d+ " " +b );
        s = (short) i;
        System.out.println("i u s "  + i + "" +s);
        s = (short) d;
        System.out.println("d u s "  + d + " " +s);
        i = (int) d;
        System.out.println("d u i "  + d +  "" + i);

//int-i u shorti ancum@ byte-in texi e unenum heteval kerp
        // int ic hanvum e 256 * K, vortex kan drakan amboxakan tiv e, xi 256?
        // byeti diapazon@ -128_ic 127 e, ir mej parunakum e 256 tiv zron neraral,
        // isk inti u longe_i ancum@ shorti hanvum e 65_536 minev khattnvi short-i tiruyt,
        // short-i tiruyt@ kazmum e -32768_ic 32767, vor@ parunakum e 65536 nih, neraran zron


        // 1. Автоматическое преобразование типов։ օրինակներ


        // 2. Приведение несовместимых типов։ օրինակներ
    }

    /**
     * Область видимости и срок действия переменных
     *
     */
    private static void scopeAndLifetimeExample() {

        // 1. use class variables
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(" "  +i);
        }
        // 2. use method variables

    }

    /**
     * Convert celsius to fahrenheit
     *
     */
    private static void toFahrenheit() {
     int c = 31;
     double k;
        double      a = 273.15;

        System.out.println(    k = (a - c)  );
        // vonc areci chkareca nenc anem vor patasxanum stavver k =
    }

    /**
     * Convert fahrenheit to celsius
     *
     */
    private static void toCelsius() {
    double c;
    double k = 253;
        double a = 273.15;

        System.out.println(c = (a - k));

    }

    /**
     * Числа Фибоначчи
     * <p>
     * {@url} https://futurenow.com.ua/ru/chto-takoe-chysla-fybonachchy-zolotoe-sechenye/
     *
     */
    private static void fibonacciSequence() {
        int i = 0;
        i = i ++;
        int i1 = i + i++;
        System.out.println(""   +i1);
        int i2 = (i1 + i++);
        System.out.println(""  +i1);
        // es fibanachiii ter@ taxem, imast@ hakkanum em,
        // skuuma 0 heto 1, veriin erku tver@ gumaruma irar, ttanum 1, heto et verjin 2 tverna gumarum irar stanum2,
        // 2+1=3, 3+2=5, 5+3=8 u tenцharunak, hajord tiv@ ttacvum e tval tvin gumarac naxord tiv@,
        // 0,1,2,3,5,8,13,21,34, .....
    }

    /**
     * Факториал
     * <p>
     * {@url} https://skysmart.ru/articles/mathematic/chto-takoe-faktorial-chisla
     *
     */
    private static void factorial() {
int i = 5;
i = i * (i - 1) * (i - 2) * (i -3) * (i - 4);


        System.out.println(" 5! "  +i );
    }

}

// System.out.println("a: " + a);
