package com.demo.progresstests.exam2.exercies17.exercies1729;

/*
Напишите метод, который принимает в качестве параметра целое положительное число N.
Метод возвращает общее количество делителей для всех чисел из диапазона N ... 2N.
 */
// Sensey es xndir@ haskanum em senc, @ntrel es tiv orinak 4, 4-ic mingev 8, bolor tveri bajanarneri qanak@
// aysinqn 4,5,6,7,8 tveric vor@ qani tvi vra e bajanvum, 4-@ bajanvum e 1,2 u 4-i, uni 3 bajanarar, 5-@ 1-@ u 5-@,
// u tenc minjev verj, karam bacarem 1-i vra u inqn ira vra bajanvelu pah@, tenc em anum vor shat mec tiv chstanam
public class Exercies17_29 {
    int divisors(int n) {
        int count = 0;
        for (int i = n; i <= 2 * n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    System.out.println(i + " - " + j);
                }
            }
        }
        return count;
    }
}
