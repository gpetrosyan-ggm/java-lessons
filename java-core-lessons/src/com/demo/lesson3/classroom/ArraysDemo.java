package com.demo.lesson3.classroom;

public class ArraysDemo {

    public static void main(String[] args) {
//        oneDimensionalDemo();
        multiDimensionalDemo();
    }

    // One Dimensional Array Demo
    private static void oneDimensionalDemo() {
        int[] a = new int[5];
        a[0] = 5;
        a[2] = 9;
        double[] b = {1.1, 2.2, 3.3};

        // access by index
        double x = b[1];
        System.out.println(x);
        System.out.println(b.length);

        printArray(a);
        printArray(b);
    }

    private static void multiDimensionalDemo() {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {5 * 2, 6 / 2, 8 - 4}
        };
        int[][] b = new int[5][5];
//        b[0] = new int[3];
//        b[2] = new int[5];

        b[0][2] = 5;
        b[1][4] = 2;

        printArray(a);
        printArray(b);

        int[][][] c = {
                {
                        {1, 2, 3},
                        {7, 8}
                },
                {
                        {8, 5, 73},
                        {1, 5}
                },
                };
        printArray(c);
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":  " + arr[i]);
        }
    }

    private static void printArray(double[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":  " + arr[i]);
        }
    }

    private static void printArray(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + "-" + j + ":  " + arr[i][j]);
            }
        }
    }

    private static void printArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(i + "-" + j + "-" + k + ":  " + arr[i][j][k]);
                }
            }
        }
    }

}
