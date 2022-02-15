package com.demo.lesson5.homework;

public class ForHomeWork {

    public static void main(String[] args) {
        printOddNumbers(100);
        printEvenNumbers(50);
        simpleWhileToForConvertDemo();
        printEvenAndOddNumbersIf(25);
    }

    /**
     * Write simple for example (գրել պարզ for օրինակ)
     */
    private static void simpleForDemo(int num) {
        for (int i = 0, j = 25; i < j; i++, j--) {
            System.out.println(i + ":" + j);
        }
    }

    /**
     * Write simple while to for example (գրել պարզ while֊ից for կոնվետեր օրինակ)
     */
    private static void simpleWhileToForConvertDemo() {
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("finish");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("AVART");

    }

    /**
     * Print Odd numbers (տպել կենտ թվերը)
     *
     * @param num input value
     */
    private static void printOddNumbers(int num) {
        for (int i = 1; i < num; i += 2) {
            System.out.println(i);
        }
        System.out.println("AVART");
    }

    /**
     * Print even numbers (տպել զույգ թվերը)
     *
     * @param num input value
     */
    private static void printEvenNumbers(int num) {
        for (int i = 0; i < num; i += 2) {
            System.out.println(i);
        }
        System.out.println("AVART");
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
    private static void printEvenAndOddNumbersIf(int num) {
        // TODO սխալա տպում կենտի ու զույգերի տեղը։ j փոփոխականի կարիք չկա եստեղ
        for (int i = 0, j = 0; i < num; i++, j = i % 2) {
            if (j != 0) {
                System.out.println(i + "even");
            } else {
                System.out.println(i + "odd");
            }
        }
    }


    /**
     * Print simple array (տպել պարզ array 2 ձևով)
     * for( ; ; )
     * foreach
     */
    // TODO սխալա ու անհասկանալի լուծումը։
    private static void printArrayDemo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            for (int a : arr) {
                System.out.println(a);
            }
        }
    }

    /**
     * Print simple array (տպել պարզ array 2 ձևով)
     * for( ; ; )
     * foreach
     */
    private static void printArrayDemo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + "" + j + arr[i][j]); // TODO arr-ի դիմացի + նշանի ի՞մաստը
            }
        }
        for (int[] a : arr) {
            for (int b : a) {
                System.out.println(b);
            }
        }

    }


    /**
     * Print simple array (տպել պարզ array 2 ձևով)
     * for( ; ; )
     * foreach
     */
    private static void printArrayDemo(int[][][] arr) {
        // TODO init֊ի մասը սխալա գրած
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                for (int k = j; k < arr[i][j].length; k++) {
                    System.out.println(i +  j +   k + +arr[i][j][k]);  // TODO arr֊ի, j֊ի ու k֊ի դիմացի + նշանի ի՞մաստը
                }
            }
        }
        System.out.println();

        for (int[][] a : arr) {
            for (int[] b : a) {
                for (int c : b) {
                    System.out.println(c);
                }
            }

        }

    }

}
