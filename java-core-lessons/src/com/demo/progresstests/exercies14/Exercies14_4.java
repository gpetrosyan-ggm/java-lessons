package com.demo.progresstests.exercies14;

/*
Напишите класс, который генерирует серию из 50 случайных целых чисел из диапазона от -40 до +40,
и определяет наибольшее из положительных значений в сгенерированной серии, а также наименьшее из
отрицательных значений в сгенерированной серии.
В случае если одно из нужных значений невозможно определить (почему?},
следует вывести на экран соответствующее текстовое сообщение.
 */
public class Exercies14_4 {
    public static void main(String[] args) {
        int start = -40;
        int and = 40;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 2; i < 51; i++) {
            int num = (int) (Math.random() * (and - start + 1) + start);
            System.out.println(i + " : " + num);

            if (num == 0) {
                continue;
            }

            if (num > 0 && num > max) {
                max = num;
            } else if (num < 0 && num < min) {
                min = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("Max chi gtel");
        } else {
            System.out.println("amena mec drakan tiv@ " + max);
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("Min chi gtel");
        } else {
            System.out.println("amena poqr bacasakan tiv@ " + min);
        }
    }

}
