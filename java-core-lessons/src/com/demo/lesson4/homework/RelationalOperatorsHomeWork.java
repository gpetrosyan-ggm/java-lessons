package com.demo.lesson4.homework;

public class RelationalOperatorsHomeWork {

    public static void main(String[] args) {
        System.out.println("=========== RELATIONAL OPERATIONS ===========");
        simpleDemo(5, 3);
        simpleDemo(2, -5);
        System.out.println();
    }

    /**
     * 1. Use equal to(==) operation and print the result
     * 2. Use not equal to(!=) operation and print the result
     * 3. Use greater than(>) operation and print the result
     * 4. Use less than(<) operation and print the result
     * 5. Use greater than or equal to (>=) operation and print the result
     * 6. Use less than or equal to(<=) operation and print the result
     *
     * @param n the first number value
     * @param m the second number value
     */
    private static void simpleDemo(int n, int m) {
        System.out.println();
        System.out.println("EQUAL TO(==)- " + (n == m));

        System.out.println("EQUAL TO(!=)- "  + (n != m));
        System.out.println("EQUAL TO(!=)- "  + (m != n));

        System.out.println("LESS THAN(<)- "  + (n < m)); // ste ete m-in tam m += 4, sax texer@ klini m=7 u m=-1
        System.out.println("LESS THAN(<)- "  + (m < n));  // tenc chem uzum, uzum em menak stex poxem u verj

        System.out.println("GREATER THAN(>)- "  + (n > m));
        System.out.println("GREATER THAN(>)- "  + (m > n));

        System.out.println("GREATER THAN OR EQUAL TO(>=)- "  + (n >= m));
        System.out.println("GREATER THAN OR EQUAL TO(>=)- "  + (m >= n));

        System.out.println("LESS THAN OR EQUAL TO(<=)- "  + (n <= m));
        System.out.println("LESS THAN OR EQUAL TO(<=)- "  + (m <= n));

        // es vonc anem vor inch vor havasarman mej m_in inch vor ban veragrem orinak m *= 2
        // u da mna menak et havasarman mej, dranic heto grvac m-erin chveragri im naxkin veragrac@

    }

}
