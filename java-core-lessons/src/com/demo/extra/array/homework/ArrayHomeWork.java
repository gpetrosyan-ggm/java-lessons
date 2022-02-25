package com.demo.extra.array.homework;

import java.util.Arrays;

public class ArrayHomeWork {

    public static void main(String[] args) {
        simple1Demo();
        simple2Demo();
        simpleDemo3();

    }

    /**
     * Հայտարարել պարզ մասիվ, լցնել արժեքներով և տպել
     */
    private static void simple1Demo() {
        int [] a = {1, 3, 5, 7,9};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ":  " + a[i]);
        }

    }


    /**
     * Հայտարարել պարզ մասիվ (2-ական), լցնել արժեքներով և տպել
     */
    private static void simple2Demo() {

        int [][] arr =new int [5][];
        int [] b = {0, 1, 2, 3, 4};
        int [] c = {5, 6, 7, 8, 9};
        int [][] a = {b, c};
        for (int i = 0; i < a.length; i++) {
           // System.out.println(" " + a[i]);
           for (int j = 0; j < a[i].length; j++) {
              System.out.println( i + " - " + a[i][j]);
            }
        }

    }
    // es mekn el es em avelacrel
    private static void simpleDemo3(){
        int[][][] a ={
                {{0, 6, 7},{5, 8},{2, 3}},
                {{-15, -25, 35}, {- 11, -22, 33}},
                {{17, 71},{26, 62}},
        } ;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                for (int k = 0; k < a[i][j].length; k++){
                    System.out.println(i + "  " + j + "  " + k + "  " + a[i][j][k]);
                }
            }
        }
    }

}
