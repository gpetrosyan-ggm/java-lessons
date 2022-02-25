package com.demo.extra.random.classroom;

public class RandomDemo {

    public static void main(String[] args) {
        // 0 = 10 + 0 * 100 = 10
        // 0.999 = 10 + 0.999 * 100 = 10 + 99 = 109 - (10-1) = 100

        // min = nerqevi sahman, max = verevi sahman, r = patahakan tiv 0-0.9999999
        // (int)((r * (max - min + 1) + min))

        boolean r10 = false;
        boolean r100 = false;
        while (true) {
            int r = randomNumber(10, 100);

            if (r < 10 || r > 100) {
                throw new RuntimeException();
            }

            if (r == 10) {
                r10 = true;
                System.out.println(r);
            }
            if (r == 100) {
                r100 = true;
                System.out.println(r);
            }
            if (r10 && r100) {
                break;
            }
        }
    }

    // 0 - 1, 0.45878556
    // (int)((r * (max - min + 1) + min))
    private static int randomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min + 1) + min));
    }

}
