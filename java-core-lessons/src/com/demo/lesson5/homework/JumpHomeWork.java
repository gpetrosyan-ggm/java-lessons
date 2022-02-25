package com.demo.lesson5.homework;

// TODO որոշ տեղեռ {} չես դրել, սխալ չի, բայց լավ կլիներ լիներ
public class JumpHomeWork {

    public static void main(String[] args) {
     //   breakSimpleDemo();
     //   breakSimpleDemo();
     //   breakNestedDemo();
     //   breakGotoDemo();
     //   continueSimpleDemo();
     //   continueNestedDemo();
     //  returnSimpleDemo();
     //   returnSimpleԼօօպDemo();
        continueGotoDemo();

    }

    /**
     * 1. Գրել պարզ for ցիկլ ու ինչ֊որ պայմանի դեպքում դուրս գալ ցիկից․
     * 2. Գրել պարզ while ցիկլ ու ինչ֊որ պայմանի դեպքում դուրս գալ ցիկից․
     */
    private static void breakSimpleDemo() {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break;
            System.out.println(" " + i);
        }
        System.out.println(" - ");
        int i = 0;
        while (i < 100){
            if(i == 10)break;
            i++;
            System.out.println( + i);
        }
    }

    /**
     * 1. Գրել 2 for ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում դուրս գալ ցիկից (որ ցիկլից որ հարմարա)․
     * 2. Գրել 2 while ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում դուրս գալ ցիկից (որ ցիկլից որ հարմարա)․
     */
    private static void breakNestedDemo() {
        for (int i = 0; i < 3; i++){
            System.out.println( + i);
            for (int j = 0; j < 10; j++){
                if (j == 6)break;
                System.out.println( + j);
            }
        }
        int i = 0;
        while (i < 10){
            i++;
            System.out.println(" i = " + i);
            int j = 0;
            while (j < 10){
                if (j == 4)break;
                j++;
                System.out.println(" j = "+ j);
            }
        }

    }

    /**
     * 1. Գրել 2 for ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում ներսի ցիկլում գրած,
     * դուրս գալ վերևի ցիկից․
     * 2. Գրել 2 while ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում ներսի ցիկլում գրած,
     * դուրս գալ վերևի ցիկից․
     */
    private static void breakGotoDemo() {
        perfect :
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 100; j++){
                if(i == 9)break perfect;
                System.out.println(" j = " +j);
            }
        }
        int count = 0;
        asd:
        while (true) {
            System.out.println(++count);

            if (count == 5) {
                break asd;
            }
        }

    }

    /**
     * 1. Գրել պարզ for ցիկլ ու ինչ֊որ պայմանի դեպքում բաց թողնել ցիկի տվյալ քայլը․
     * 2. Գրել պարզ while ցիկլ ու ինչ֊որ պայմանի դեպքում բաց թողնել ցիկի տվյալ քայլը․
     */
    private static void continueSimpleDemo() {
        for (int i = 0; i < 10; i++){
            if (i == 4 || i == 7) continue;
            System.out.println(" i = " + i);
        }
        int i = 0;
        while (i < 10){
            i++;
            if (i%2 != 0) continue;
            System.out.println( " i = "  + i);
        }

    }

    /**
     * 1. Գրել 2 for ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում
     * բաց թողնել ցիկի տվյալ քայլը (որ ցիկլում որ հարմարա)․
     * 2. Գրել 2 while ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում
     * բաց թողնել ցիկի տվյալ քայլը (որ ցիկլում որ հարմարա)․
     */
    private static void continueNestedDemo() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j += 2){
                if (i < j) continue;
                System.out.println( i+ " " + j + " ");

            }
        }
        int i = 0;
        int j = 0;
        while (i < 10){
            i++;
            System.out.println( + i);
            while (j < 10);
            if (j %3 !=0)continue;
            j++;
            System.out.println(" " + j);
        }

    }

    /**
     * 1. Գրել 2 for ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում ներսի ցիկլում գրած,
     * բաց թողնել վերևի ցիկի տվյալ քայլը․
     * 2. Գրել 2 while ցիկլ մեկը մյուսի ներսում ու ինչ֊որ պայմանի դեպքում ներսի ցիկլում գրած,
     * բաց թողնել վերևի ցիկի տվյալ քայլը․
     */
    // TODO սխալ ես հասկացել խնդիրը։ Գտնել ու դզել
    private static void continueGotoDemo() {
        persona :
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) {
                if ((i - j) == 2) {
                    continue persona;
                }

                System.out.println("j = " + j);
            }
        }
     //   int i = 0;
       // chelsea :
       // while (i < 10){
         //   i++;
           // System.out.println(" i = " + i);
         //   int j =0;
           // abc :
           // while (j < 7) {
             //   j++;
               // if (i == 3) break abc;
               // System.out.println(" j = " + j);
            //}

        //}

    }

    /**
     * 1. Գրել պարզ for (կամ while) ցիկլ ու ինչ֊որ պայմանի դեպքում դուրս գալ method֊ից
     */
    private static void returnSimpleԼօօպDemo() {
        for(int i = 0; i < 10; i +=2){
            System.out.println( " i = "  + i);
            if (i >= 8) return;
        }

    }

    /**
     * 1. Գրել պարզ method (տպել օրինակ ինչ֊որ բան, կամ հաշվարկել) ու ինչ֊որ պայմանի դեպքում դուրս գալ method֊ից
     */
    private static void returnSimpleDemo() {
        for(int i = 0; i < 100; ){
            for (int j = 17; j < 100; j++){
                i +=3;
                if (i >= j)return;
                System.out.println(i + " < "  + j);
            }
        }

    }

}
