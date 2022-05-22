package com.demo.progresstests.exam2.exercies19.exercies1949;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
является ли первый массив подмассивом второго.
 */
// es pahum chgitem ete erkusi erkarutyunnern el nuynn en, apa hamarvuma vor arajin@ erkrodi enta masna te ch,
// es @ndunum em vor ha;
// mekel haskacel em xndir@ senc vor ete arajini elementner@ orinak {1,2,3} e, isk erkrordin@ {3,4, 1,2,3, 5,6}
//uremn entamasiv e, aysinqn aysinqn arajini elementner@ ete hertakanutyamb erkrordum en

public class Exercies19_49 {
    void massive(int[] arr1, int[] arr2) {

        boolean verity = false;
        if (arr2.length >= arr1.length) {

            for (int i = 0; i < arr2.length; i++) {

                if (arr2[i] == arr1[0] && (arr2.length - i) >= arr1.length) {

                    for (int k = 1; k < (arr1.length); k++) {

                        if (arr2[i + k] == arr1[k]) {
                            verity = true;

                        } else {
                            verity = false;
                            break;
                        }
                    }
                }
            }
            if (verity == true) {
                System.out.println("entamas e");
            } else {
                System.out.println("Entamas che");
            }
        } else {
            System.out.println("arajin massivi erkarutyun@ mec e erkrorfinic");
        }
    }
}
