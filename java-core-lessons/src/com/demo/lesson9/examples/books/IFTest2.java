package com.demo.lesson9.examples.books;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack dynStack = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        for (int i = 0; i <12 ; i++) {
            dynStack.push(i);

        }
        for (int i = 0; i < 20; i++) {
            dynStack2.push(i);
        }
        System.out.println("stok@ dynStack-um");

        for (int i = 0; i <12 ; i++) {
            System.out.println(dynStack.pop());

        }
        System.out.println("2-rdum");

        for (int i = 0; i < 20; i++) {
            System.out.println(dynStack2.pop());
        }
     }
}
