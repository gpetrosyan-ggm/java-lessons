package com.demo.lesson3.homework;

public class ArraysHomeWork {

    public static void main(String[] args) {
        oneDimensionalArraySimpleDemo();
        oneDimensionalArrayDemo(5, 4);
        oneDimensionalArrayDemo(3, 0);

        multiDimensionalArraySimpleDemo();
        multiDimensionalArrayDemo(4, 5, 1, 1);
        multiDimensionalArrayDemo(3, 3, 2, 2);

        // TODO uncomment it and fill with your values
        // oneDimensionalArrayDemo();
        // oneDimensionalArrayDemo();
        // multiDimensionalArrayDemo();
        // multiDimensionalArrayDemo();
    }

    /**
     * 1. Declare One-Dimensional Array (int or double).
     * 2. Fill it with values.
     * 3. Print the array.
     * <p>
     * 1. Declare One-Dimensional Array with initialization.
     * 2. Print the array
     */
    private static void oneDimensionalArraySimpleDemo() {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        printArray(a);
    }

    /**
     * 1. Declare One-Dimensional Array (int or double) using @param size as size of array.
     * 2. Fill it with values.
     * 3. Print element with @param index.
     *
     * @param size  the size of new array
     * @param index the index of element which need to print
     */
    private static void oneDimensionalArrayDemo(int size, int index) {
        int[] a = new int[size];
        a[0] = 1;
        a[1] = 2;
        System.out.println(a[index]);
    }

    /**
     * 1. Declare Multi-Dimensional Array (int or double).
     * 2. Fill it with values.
     * 3. Print the array.
     * <p>
     * 1. Declare Multi-Dimensional Array with initialization.
     * 2. Print the array
     */
    private static void multiDimensionalArraySimpleDemo() {
        int[][] i = {
                {2, 3, 8, 18, -1},
                {91, 87, 1, 7, 22},
                {-8, 13, 99, 0, 44},
                {7, 6, 5, 4, 3},
                };
        double[][] j = new double[4][3];
        j[1][2] = 5;
        j[1][1] = 12 % 5 - .7;

        printArray(i);
        printArray(j);
    }

    /**
     * 1. Declare Two-Dimensional Array (int or double) using @param size as size of array.
     * 2. Fill it with values.
     * 3. Print element with @param iIndex, jIndex.
     *
     * @param iSize  the size of parent array
     * @param jSize  the size of sub array
     * @param iIndex the index of parent element which need to print
     * @param jIndex the index of sub element which need to print
     */
    private static void multiDimensionalArrayDemo(int iSize, int jSize, int iIndex, int jIndex) {
        double[][] j = new double[iSize][jSize];
        j[iIndex][jIndex] = 5 * iSize - jSize;
        System.out.println(j[iIndex][jIndex]);
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

    private static void printArray(double[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + "-" + j + ":  " + arr[i][j]);
            }
        }
    }

}
