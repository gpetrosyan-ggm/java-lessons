package com.demo.lesson9.examples.books;

public class DynStack implements IntStack {

    private int steck[];
    private int tos;

    @Override
    public void push(int item) {
        if (tos == steck.length - 1) {
            int temp[] = new int[steck.length * 2];

            for (int i = 0; i < steck.length; i++) {
                temp[i] = steck[i];
                steck = temp;
                steck[++tos] = item;
            }
        } else {
            steck[++tos] = item;
        }

    }

    @Override
    public int pop() {
        if (tos<0) {
            System.out.println("stok ne zagrujen");
            return 0;
        }else {
            return steck[tos--];
        }
    }

    DynStack(int size) {
        steck = new int[size];
        tos = -1;
    }
}
