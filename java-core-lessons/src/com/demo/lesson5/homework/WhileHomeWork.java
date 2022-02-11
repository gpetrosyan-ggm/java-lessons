package com.demo.lesson5.homework;

public class WhileHomeWork {

    public static void main(String[] args) {
//        simpleWhileDemo();
//        simpleDoWhileDemo();

//        printOddNumbers(100);
//        printEvenNumbers(100);
        printEvenAndOddNumbers(100);

    }

    /**
     * Write simple while example (գրել պարզ while օրինակ)
     */
    private static void simpleWhileDemo() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("finish");

    }

    /**
     * Write simple do while example (գրել պարզ do-while օրինակ)
     */
    private static void simpleDoWhileDemo() {
        int i = 10;
        int j = 20;
        do {
            i += 2;
            j--;
        } while (j > i);
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
    }

    /**
     * Print Odd numbers (տպել կենտ թվերը)
     *
     * @param num input value
     */
    private static void printOddNumbers(int num) {
        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("finish");
    }

    /**
     * Print even numbers (տպել զույգ թվերը)
     *
     * @param num input value
     */
    private static void printEvenNumbers(int num) {
        int i = 2;
        while (i <= num) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("finish");
    }

    /**
     * Print even and odd numbers (տպել զույգ և կենտ թվերը)
     * step = 1 (i++) (քայլը = 1)
     * %
     * 55 % 2 = 1
     * 6 % 2 = 0
     * example (օրինակ)
     * 1 ֊ odd
     * 2 ֊ even
     * 3 ֊ odd
     * 4 ֊ even
     *
     * @param num input value
     */
    private static void printEvenAndOddNumbers(int num) {
        int i = 0;
        int j;

        // TODO  if (i < num) կարիք չկա, while֊ում ունես նույն պայմանը
        // TODO փորձի լուծես առանց 2 անգամ i++ օգտագործելով, կարաս if-ով կամ Ternary Operator-ով (exp1 ? exp2 : exp3).
        // Ternary Operator-ov chkareca lucem, if-@ dzel em idealakani, avartakan ashxatanqa
        while (i < num) {
            i++;
            j = i % 2;
            if (j != 0) {
                System.out.println(i + " % 2 =  " + j + "  - odd");
            } else {
                System.out.println(i + " % 2 =  " + j + "  - even");
            }

        }

    }



}
