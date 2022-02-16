package com.demo.lesson5.classroom;

// break, continue and return
public class JumpStatementsDemo {

    public static void main(String[] args) {
        // break - switch, loop (for, while), goto
        // continue - loop (for, while), goto
        returnSimpleDemo();
        System.out.println("MAIN");
    }

    private static void returnSimpleDemo() {
        int a = 5;
        System.out.println("BEFORE");
        if (a == 5) {
            return;
        }
        System.out.println("AFTER");
    }

    private static void continueSimpleDemo() {
        asd:
        for (int i = 0; i <= 5; i++) {
            if (i >= 1 && i <= 3) {
                continue asd;
            }
            System.out.println(i);
        }
        System.out.println("FINISHED FOR");

        int i = -1;
        int[] arr = {1, 2, 0, 4, 0, 6, 0, 8, 9, 10};
        while (i < 9) {
            i++;
            if (arr[i] == 0 || arr[i] % 2 == 1) {
                continue;
            }

            System.out.println(arr[i]);
        }
    }

    private static void simpleBreakDemo1() {
        int a = 5;
        switch (a) {
            case 5:
                switch (a) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    default:
                        System.out.println("Zero");
                }
                System.out.println("NESTED SWITCH");
        }
        System.out.println("FINISHED SWITCH");
    }

    private static void simpleBreakDemo2() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " - " + j);
                if (j == 3) {
                    break;
                }
            }
            if (i == 5) {
                break;
            }
            System.out.println("I: " + i);
        }
        System.out.println("FINISHED FOR");

        int count = 0;
        asd:
        while (true) {
            System.out.println(++count);

            if (count == 5) {
                break asd;
            }
        }
        System.out.println("FINISHED WHILE");
    }

    private static void breakGotoDemo() {
        asd:
        for (int i = 0; i < 20; i++) {
            System.out.println("I: " + i);
            for (int j = 0; j < 5; j++) {

                if (i == 3) {
                    break asd;
                }

                System.out.println("J: " + j);
            }
        }
        System.out.println("FINISHED FOR");


//        int a = 5;
//        a:
//        {
//            b:
//            {
//                c:
//                {
//                    if(a == 5) {
//                        break b;
//                    }
//                    System.out.println("C FINISHED");
//                }
//                System.out.println("B FINISHED");
//            }
//            System.out.println("A FINISHED");
//        }

    }

}
