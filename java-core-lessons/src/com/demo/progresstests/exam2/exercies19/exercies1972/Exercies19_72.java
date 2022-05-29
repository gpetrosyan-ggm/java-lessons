package com.demo.progresstests.exam2.exercies19.exercies1972;

import java.util.Arrays;

public class Exercies19_72 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 1, 2, 2, 6};
        // 1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7
        Arrays.sort(arr);
        int[] newArr = new int[7];

        newArr[0] = arr[0];
        for (int i = 1, k = 1; i < newArr.length; k++) {
            if (arr[k] == arr[k - 1]) {
                continue;
            }
            newArr[i++] = arr[k];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }


}
