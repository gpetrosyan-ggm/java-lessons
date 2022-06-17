package com.demo.lesson9.examples.books;

public class FixedStack implements IntStack{
    @Override
    public void push(int item) {
        if (tos == stck.length -1){
            System.out.println("stck zapolnen");
        }else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
       if (tos<0){
           System.out.println("stack lracvac chi");
           return 0;
       }else {

           return stck[tos--];
       }
    }
    private int stck[];
    private int tos;

   FixedStack(int size){
       stck = new int[size];
       tos-=1;
   }
}
