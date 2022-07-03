package com.demo.lesson12.classroom.enums;

public class EnumDemo {

    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        demo5();
    }

    private static void demo5() {
        int compare = Answers.NO.compareTo(Answers.UNKNOWN);
        System.out.println(compare);
    }

    private static void demo4() {
        Answers[] answers = Answers.values();
        for (Answers answer : answers) {
            System.out.println(answer + " " + answer.ordinal());
        }
    }

    private static void demo3() {
        System.out.println(Answers.NO.getName());
    }

    public static void demo2() {
        Answers[] answers = Answers.values();
        for (Answers answer : answers) {
            System.out.println(answer);
        }

        Answers answersYes = Answers.valueOf("YES");
        System.out.println(answersYes);

    }

    private static void demo1() {
        Answers answers = Answers.NO;
        HumanSexEnum humanSex = HumanSexEnum.MALE;
        System.out.println(answers);
        System.out.println(humanSex);

        if (answers == Answers.NO) {
            System.out.println("Equals");
        }

        if (answers.equals(Answers.NO)) {
            System.out.println("Equals");
        }

        switch (answers) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
        }
    }


}
