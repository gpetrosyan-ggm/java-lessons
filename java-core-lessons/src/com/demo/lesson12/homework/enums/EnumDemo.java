package com.demo.lesson12.homework.enums;

public class EnumDemo {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    private static void demo1() {
        Studying studying = Studying.INCOMPLETE_SECONDARY_EDUCATION;
        if (studying == Studying.INCOMPLETE_SECONDARY_EDUCATION) {
            System.out.println(studying);
        }
    }

    private static void demo2() {
        University university = University.PERFECTLY;
        switch (university) {
            case PERFECTLY:
                System.out.println("gerazancik");
                break;
            case AVERAGE_RATING:
                System.out.println("harvacain");
                break;
            case SATISFACTORY_RATING:
                System.out.println("mijak");
                break;
            case UNSATISFACTORY_RATING:
                System.out.println("likvid");
                break;
        }
    }

    private static void demo3() {
        Technique[] technique = Technique.values();
        for (Technique techniques : technique) {
            System.out.println(techniques + " " + techniques.ordinal());

        }

        Technique techniqueTV = Technique.TV;
        Technique techniqueMixer = Technique.MIXER;
        Technique techniqueFridge = Technique.FRIDGE;

        System.out.println("TV - " + techniqueTV.getCount());
        System.out.println("TV - " + techniqueTV.getPowerUnit());
        System.out.println("TV - " + techniqueTV.getChannel());

        System.out.println("Mixer - " + techniqueMixer.getCount());
        System.out.println("Mixer - " + techniqueMixer.getPowerUnit());


        System.out.println("Fridge - " + techniqueFridge.getCount());
        System.out.println("Fridge - " + techniqueFridge.getPowerUnit());
        System.out.println("Fridge - " + techniqueFridge.getVolume());


    }
}
