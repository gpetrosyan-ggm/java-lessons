package com.demo.lesson5.classroom;

public class SwitchSelectionStatementDemo {


    /*
    String s = "A";
    switch(s) {
        case "B":  // "A" == "B"
            logicka
            break;
        case "A":  // "A" == "A"
            logicka
            break;
        default:            // partadir chi
            logicka
    }
    * */
    public static void main(String[] args) {
//        switchSimpleDemo("B");
//        System.out.println();
//        switchSimpleDemo("A");
//        System.out.println();
//        switchSimpleDemo("C");
//        System.out.println();
//        switchSimpleDemo("W");
//
//        System.out.println();
//        groupSimpleDemo(1);
//        groupSimpleDemo(5);
//        groupSimpleDemo(9);

        switchParentDemo();
    }

    private static void switchParentDemo() {
        double zexch = switchDemo(Type.ANTIC);
        if (zexch > 50) {
            System.out.println(" +5 nver + Bonus cart");
        } else if (zexch > 20) {
            System.out.println(" +1 nver + Bonus cart");
        } else if (zexch > 10) {
            System.out.println(" +1 nver");
        } else {
            // <= 10
            System.out.println(" coffee");
        }
    }

    private static double switchDemo(Type type) {
//        double zexch = 0; // tokosov
//        if (type == Type.NEW) {
//            zexch = 5;
//            System.out.println("The product is new");
//        } else if (type == Type.USED) {
//            zexch = 20;
//            System.out.println("The product is used");
//        } else if (type == Type.BROKE) {
//            zexch = 50;
//            System.out.println("The product is broken");
//        } else if (type == Type.ANTIC) {
//            zexch = 80;
//            System.out.println("The product is antic");
//        } else {
//            throw new UnsupportedOperationException("Unsupported type: " + type);
//        }

        double zexch = 0; // tokosov
        switch (type) {
            case NEW:
                zexch = 5;
                System.out.println("The product is new");
                break;
            case USED:
                zexch = 20;
                System.out.println("The product is used");
                break;
            case BROKE:
                zexch = 50;
                System.out.println("The product is broken");
                break;
            case ANTIC:
                zexch = 80;
                System.out.println("The product is antic");
                break;
            default:
                throw new UnsupportedOperationException("Unsupported type: " + type);

        }
        return zexch;
    }

    private static void switchSimpleDemo(String s) {
//        switch (s) {
//            case "W":  // "A" == "W"
//                System.out.println("W chosen");
//            default:            // partadir chi
//                System.out.println(s + ": No chosen");
//            case "B":  // "A" == "B"
//                System.out.println("B chosen");
//                break;
//            case "A":  // "A" == "A"
//                System.out.println("A chosen");
//        }

//        switch (s) {
//            case "A" -> System.out.println("A chosen");
//            case "B" -> System.out.println("B chosen");
//            case "W" -> System.out.println("W chosen");
//            default -> System.out.println(s + ": No chosen");
//        }

        switch (s) {
            case "A":
                System.out.println("A chosen");
                break;
            case "B":
                System.out.println("B chosen");
                break;
            case "W":
                System.out.println("W chosen");
                break;
            default:
                System.out.println(s + ": No chosen");
        }
        System.out.println("Out switch");
    }

    private static void groupSimpleDemo(int month) {
        System.out.print(month + " -> ");

        switch (month) {
            case 1:
            case 2:
            case 12:
                switch (month) {
                    case 1:
                        System.out.println("Hunvar");
                        break;
                    case 2:
                        System.out.println("Petrvar");
                        break;
                    case 12:
                        System.out.println("Dektember");
                        break;
                }
                System.out.println("Zmer");
                break;
            case 0:
            case 3:
            case 4:
            case 5:
                // 0, 3, 4, 5 .    3, 4, !3 && !4 = 5
                printMonth(month);
                System.out.println("Garun");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Amar");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Ashun");
                break;
        }
        System.out.println("Season found");
    }

    private static void printMonth(int month) {
        if (month == 3) {
            System.out.println("Mart");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("Mayis");
        } else {
            System.out.println("garnan amis chi");
        }
    }

}