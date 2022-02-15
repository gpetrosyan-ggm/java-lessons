package com.demo.lesson5.examples;

public class ForBookExample {
    public static void main(String[] args){
        simpleForBook();
        simpleForBook1();
        simpleForBook2();
        simpleForBook3();
        simpleForBook4();
        simpleForBook5();
        simpleForBook6();
        simpleForBook7();
        simpleForBook8();
        simpleForBook9();
        simpleForBook9();

    }

    private static void simpleForBook(){
        int n;
        for (n = 10; n> 0; n--)
            System.out.println("tick " + n);
    }
    private static void simpleForBook1(){
        for (int n = 10; n > 10; n--){
            System.out.println("tick " + n);
        }
    }
    private static void simpleForBook2(){
        int num;
        boolean isPrime;
        num = 14;                          // num = 14; henцmtaf if-i mej, miangamic payman@ chi bavarari u
        if (num < 2) isPrime = false;     //  kkatari else
        else  isPrime = true;
        for (int i = 2; i <= num/i; i++){
            if ((num % i)  == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("prottoe hillo");
        else System.out.println("ne prottoe hillo");
    }
    private static void simpleForBook3(){
               for (int a = 1, b = 4; a < b; a++){
            System.out.println("a = "  + a);
            System.out.println("b = "  + b);
            b--;
        }
    }
    private static void simpleForBook4(){
              for (int a =1, b = 4; a < b; a++, b--){
            System.out.println("a = "  + a);
            System.out.println("b = "  + b);
        }
    }
    private static void simpleForBook5(){
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums){
            System.out.println( + x);
            sum += x;
        }
        System.out.println( + sum);
    }
    private static void simpleForBook6(){
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums){
            System.out.println( + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println( + sum);
    }
    private static void simpleForBook7(){
        int sum = 0;
        int nums[][] = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums [i][j] = (i + 1) * (j + 1);
        for(int x[] : nums){
            for (int y : x){
                System.out.println( + y);
                sum += y;
            }
        }
        System.out.println( + sum);
    }
    private static void simpleForBook8(){
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        for (int x : nums){
            if (x == val){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("areq@ gtnvac e");
    }
    private static void simpleForBook9(){
        for (int i = 0; i < 10; i++){
            for (int j = i; j< 10; j++)
                System.out.print(".");
                System.out.println();

        }
    }

}
