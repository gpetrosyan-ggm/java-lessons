package com.demo.progresstests.exam2.exercies19.exercies1942;

import java.util.Arrays;

public class ExerciesDemo19_42 {
    public static void main(String[] args) {
        Exercies19_42 exercies19_42 = new Exercies19_42();
        System.out.println(Arrays.toString(exercies19_42.masive(new int[]{1, 2, 5}, new int[]{2, 4, 6})));
        System.out.println(Arrays.toString(exercies19_42.masive(new int[]{1, 3, 5}, new int[]{2, 3})));

        System.out.println(Arrays.toString(exercies19_42.masive2(new int[]{1, 2, 5}, new int[]{2, 4, 6})));
        System.out.println(Arrays.toString(exercies19_42.masive2(new int[]{1, 3, 5}, new int[]{2, 3})));
    }
}
