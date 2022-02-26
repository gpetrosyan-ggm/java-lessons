package com.demo.lesson5.classroom;

import java.util.Arrays;

public class ForIterationStatementDemo {

    public static void main(String[] args) {
        simpleMultiArrayDemo2();
    }

    private static void simpleMultiArrayDemo2() {
        int[][][] arr = {
                {
                        {1, 2},
                        {0, 3, 4}
                },
                {
                        {1, 5, 6},
                        {0}
                },
                {
                        {7, 8, 9, 6}
                }
        };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[i][j].length; k++) {
//                    System.out.println(i + "-" + j + "-" + k + ":  " + arr[i][j][k]);
//                }
//            }
//        }
        for(int[][] a: arr) {
            for(int[] b: a ) {
                for(int k: b) {
                    System.out.println(k);
                }
            }
        }
    }

    private static void simpleMultiArrayDemo() {
        // [0][1][2][3][4]
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(i + "-" + j + ":  " + arr[i][j]);
//            }
//        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }

    private static void simpleForEachDemo() {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 8, 6};
//        for (int i = 0; i < arr.length /* = 9 */; i++) {
//            System.out.println(i + ": " + arr[i]);
//        }

        // foreach
        for (int a : arr) {
            System.out.println(a);
            a = 2;
            System.out.println(a);
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void simpleDemo() {
//        int i = 1;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        for( ; ; )

        for (int i = 1, j = 10; i <= 10 && j >= 0; i++, j--) {
            System.out.println(i + " : " + j);
        }
        System.out.println("FINISH");
    }

    private static void simpleDemo2() {
        int i = 1;
        int j = 10;
        for (; ; ) {
            if (i > 10) {
                break;
            }

            System.out.println(i + " : " + j);
            i++;
            j--;
        }
        System.out.println("FINISH");
    }

}
