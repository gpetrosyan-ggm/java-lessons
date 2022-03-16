package com.demo.progresstests.exercies14;

/*
Напишите класс, который генерирует серию из 50 случайных целых чисел из диапазона от -40 до +40,
и определяет наибольшее из положительных значений в сгенерированной серии, а также наименьшее из
отрицательных значений в сгенерированной серии.
В случае если одно из нужных значений невозможно определить (почему?},
следует вывести на экран соответствующее текстовое сообщение.
 */
// paymanneric mek@ chi katarvi ete random@ voroshi bolor tver@ tpi drakan kam bolorn el bacasakan
// orinak karanq muxlojutyun anenq u start@ kan end@ tanq 0;
public class Exercies14_4 {
    public static void main(String[] args) {
        int start = -40;
        int and = 40;
        int c;

        int a = (int) (Math.random() * (and - start + 1) + start);
        System.out.println("1 : " + a);
        c = a;

        for (int i = 2; i < 51; i++) {

            int b = (int) (Math.random() * (and - start + 1) + start);
            System.out.println(i + " : " + b);
            if (b != 0) { // es xndir@ shat cuning areci minjev es lucum@ gta, RUN tvi u 4 hat 0 gta, vorosheci if mtcnem
                if (b > c) {
                    c = b;
                } else if (b < a) {
                    a = b;
                }
            }
        }
        // if (c < 0) {
        //     System.out.println("amena mec drakan tiv@ bacakayum e");
        // } else {
        //     System.out.println("amena mec drakan tiv@ " + c);
        // }
        // if (a > 0) {
        //     System.out.println("amena poqr bacasakan tiv@ bacakayum e");
        // } else {
        //     System.out.println("amena poqr bacasakan tic@ " + a);
        // }
        // skzbum senc eyi grel, bayc heto erb sax glux@ greci prca, hat ar hat noric sax stugeci u xndir@ kardaluc heto
        // mi hat poqr nuans gta,
        // В случае если одно из нужных значений невозможно определить (почему?) следует вывести на экран соответствующее текстовое сообщение.
        // chi asum konkret vor@ chi voroshvum, dra hamar el greci senc, if u else krjatelov

        if (a > 0 && c < 0) {
            System.out.println("paymanneric mek@ chi katarvum");
        } else {
            System.out.println("amena poqr bacasakan tiv@ " + a);
            System.out.println("amena mec drakan tiv@ " + c);
        }
    }
}
