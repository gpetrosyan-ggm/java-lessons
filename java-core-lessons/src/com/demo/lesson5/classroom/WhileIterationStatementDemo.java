package com.demo.lesson5.classroom;

// while
// do wile
public class WhileIterationStatementDemo {

    public static void main(String[] args) {
        simpleWhileDemo();
        simpleWhileDemo2();
        simpleDoWileDemo();
    }

    private static void simpleDoWileDemo() {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("FINISH: " + i);
    }

    private static void simpleWhileDemo2() {
        System.out.println("START");

        int i = 10;
        int j = 25;

        while (++i < --j) {
            //
        }

        System.out.println("I: " + i);
        System.out.println("J: " + j);
        System.out.println("FINISH");
    }

    private static void simpleWhileDemo() {
        boolean b = false; // x < 5
        int count = 0;
        while (b) {
            count++;
            System.out.println(count + ": IN");
            if (count == 10) {
                b = false;
            }
        }
        System.out.println("Finish");
    }

}
