package com.demo.extra.array.classroom;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        simple3Demo();
    }

    private static void simpleDemo() {
        int[] asd1 = new int[5];
        int[] asd2 = {1, 2, 5, 6};
        // Index - [0][1][2][3][4]
        System.out.println(asd1.length + ": " + Arrays.toString(asd1));
        System.out.println(asd2.length + ": " + Arrays.toString(asd2));

        int a2 = asd2[2];
        System.out.println("A2: " + a2);

        asd2[3] = 11;
        System.out.println("A3: " + asd2[3]);

        for (int a : asd2) {
            System.out.println(a);
        }
        for (int i = 0; i < asd2.length; i++) {
            System.out.println(asd2[i]);
        }

        int i = 0;
        while (i < asd2.length) {
            System.out.println(asd2[i]);
            i++;
        }
    }

    private static void array2Demo() {
        int[][] asd1 = new int[2][];

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] c = {0, 10};
        int[][] asd2 = {a, b, c};
        // [ [ [][][][] ] [ [][][][][] ] [ [][] ]][]
        // [[0, 0], [0, 0]]

        asd2[0][2] = 12;
//        System.out.println(asd2[0][2]);
//        System.out.println(Arrays.toString(a));

        for (int i = 0; i < asd2.length; i++) {
            System.out.println(Arrays.toString(asd2[i]));
            for (int j = 0; j < asd2[i].length; j++) {
                System.out.println(asd2[i][j]);
            }
        }

    }

    private static void simple3Demo() {
        int[][][] asd3 = {
                {{1, 2}, {5, 6}, {0, 1, 5, 6}},
                {{12, 15}, {48, 56, 89}}
        };

        asd3[1][1][1] = 41;

        for (int i = 0; i < asd3.length; i++) {
            System.out.println(Arrays.deepToString(asd3[i]));
            for (int j = 0; j < asd3[i].length; j++) {
                System.out.println(Arrays.toString(asd3[i][j]));
                for (int k = 0; k < asd3[i][j].length; k++) {
                    System.out.println(asd3[i][j][k]);

                }
            }
        }
    }


}
