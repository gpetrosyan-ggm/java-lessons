package com.demo.lesson9.examples.books;

public class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        for (int i = 0; i<5; i++){
            fixedStack.push(i);
        }
        for (int i = 0; i<8; i++){
            fixedStack2.push(i);
        }
        System.out.println("stack-i elementner");

        for (int i = 0; i<5; i++){
            System.out.println(fixedStack.pop());
        }
        System.out.println("myus@");

        for (int i = 0; i<8; i++){
            System.out.println(fixedStack2.pop());
        }
    }


}
