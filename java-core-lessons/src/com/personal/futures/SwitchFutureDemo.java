package com.personal.futures;

import java.util.List;
import java.util.Random;

public class SwitchFutureDemo {

    public static void main(String[] args) {
        System.out.println(demo("Cabernet Sauvignon"));
        System.out.println(demo("Riesling"));
        System.out.println(demo("Riesling aa"));
    }

    private static String demo(String wine) {
        return switch (wine) {
            case "Cabernet Sauvignon" -> "Lamb chops";
            case "Gewurztraminer" -> "Feta cheese";
            case "Riesling" -> "Feta cheese";
            case "Champange" -> "Salty popcorn";
            default -> {
                List<String> defaultChoices = List.of("Fresh bread", "Cackers", "Coffee");
                yield defaultChoices.get(new Random().nextInt(defaultChoices.size()));
            }
        };
    }


}
