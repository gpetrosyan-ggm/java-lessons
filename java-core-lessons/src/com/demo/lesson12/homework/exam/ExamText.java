package com.demo.lesson12.homework.exam;

public class ExamText {
    private static void intArr(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int a : arr) {
            if (min > a) {
                min = a;
            }
            if (max < a) {
                max = a;
            }
            sum += a;
        }

        System.out.println("amenamec  4 elementneri gumar = " + (sum - min));
        System.out.println("amenapoqr 4 elementneri gumar = " + (sum - max));
    }

    public static void main(String[] args) {
        intArr(new int[]{1, 3, 4, 2, 5});
    }
}
