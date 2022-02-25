package com.demo.extra.random.homework;

public class RandomHomeWork {

    public static void main(String[] args) {
        simple1Demo();
        simple2Demo();

    }

    /**
     * Պատահական 5 հատ թիվ տպել 500-1000 սահմաներում
     */
    private static void simple1Demo() {
        int min = 500;
        int max = 1000;
        for(int i = 0; i < 5; i++) {
            System.out.println(Math.random() * (max - min + 1) + min);
        }
    }




    /**
     * Պատահական 5 հատ թիվ տպել -100 ֊ +100 սահմաներում
     */
    private static void simple2Demo() {
        int min = - 100;
        int max = 100;
        for (int i = 0; i < 5; i++){
            System.out.println(Math.random() * (max - min + 1) + min);
        }

    }

}
