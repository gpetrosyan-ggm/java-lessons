package com.demo.lesson5.examples;

public class BreakContinueReturnBook {
    public static void main(String[] args) {
        simplBreak();
        simplBreak2();
        simplBreak3();
        simplBreak4();
        simplBreak5();
        //  simplBreak6();
        simplContinume1();
        simplContinume2();
        simplReturn();
    }
    private static void simplBreak(){
        for (int i = 0; i < 100; i++) {
            if (i == 10) break;
            System.out.println("i = "  + i );
        }
        System.out.println("avart "  );
    }
    private static void simplBreak2(){
     int i = 0;
     while (i < 100){
         if (i == 10) break;
         System.out.println("i = "  + i);
         i++;
     }
        System.out.println(" avart ");
    }
    private static void simplBreak3(){
        for (int i = 0; i < 3; i ++){
            System.out.println(" ancum " + i + " : ");
            for(int j = 0; j < 100; j++){
                if (j == 10)break;
                System.out.println(j +  " ");
            }
            System.out.println();
        }
        System.out.println("avart");
    }
    private static void simplBreak4(){
        boolean t = true;
        first : {
            second : {
                third : {
                    System.out.println(" X ");
                    if(t) break second;
                    System.out.println(" Y ");
                }
                System.out.println(" Y ");
            }
            System.out.println(" F ");
        }
    }
    private static void simplBreak5(){
        outer : for (int i = 0; i < 3; i++){
            System.out.println(" ancum "  + i + " : " );
            for (int j = 0; j < 100; j++){
                if(j == 10) break outer;
                System.out.println(" "  + j);
            }
            System.out.println(" chi tpi ");
        }
        System.out.println(" avart ");
    }
   // private static void simplBreak6(){
   //     one : for (int i = 0; i < 5; i++) {
   //         System.out.println(" ancum " + i + " : ");
   //     }
   //         for (int j = 0; j < 100; j++){
   //             if (j == 10) break one;
   //             System.out.println(" "  +j);

   //     }
   // }
   private static void simplContinume1(){
        for (int i = 0; i < 10; i++){
            System.out.println(" " +i);
            if (i%2 == 0) continue;
            System.out.println(" " );
        }
   }
    private static void simplContinume2(){
        outer : for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (j > i){
                    System.out.println();
                    continue outer;
                }
                System.out.println( " "  + (i * j));
            }
        }
        System.out.println();
    }
    private static void simplReturn(){
        boolean t = true;
        System.out.println(" minch avart ");
        if (t) return;
        System.out.println(" chi tpi ");

    }
}
