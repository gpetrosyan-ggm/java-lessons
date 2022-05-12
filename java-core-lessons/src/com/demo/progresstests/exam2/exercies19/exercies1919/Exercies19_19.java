package com.demo.progresstests.exam2.exercies19.exercies1919;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
положительными случайными двузначными числами так, чтобы они образовывали
возрастающую последовательность (каждый элемент больше предыдущего).
 */
// Sensey gtel em amena idealakan karj lucum@, bayc unem hetevyal harc@, es hima zarani mi hat el aradzin payman petqa
// nshem vor arr[0] element@ poqr lini 99-arr.lenghtic, qani vor randma u henc arajin element@ kara @nduni 99 u dranic
// heto lucum chunena, erkrodn el petqa nshem vor lengt@ poqr kam havasar lini 89-ic, vor ardyunqum es stanam erknish;
// vonc anem vor ete hankarc inq@ @ngni haverj cikli mej break lini u zroyic sksi
// haskanum im paragayum @ndamena petqa lucum tam, bayc vor xor@ nayum em es xndir@ shat lurj mtacelu texiqa talis u
// ahavor bard lucuma
import java.util.Arrays;

public class Exercies19_19 {
    void massiv(int[] arr) {
        int min = 10;
        int max = 99;
        arr[0] = (int) (Math.random() * (max - min + 1) + min);

        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
            if (arr[i] <= arr[i - 1]) {
                i -= 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
