package com.demo.lesson9.homework;

public interface Delivery {
    int Service(Object object);

    default String Information(String info){
        System.out.println("q. Erevan, Monte Melqonyan 12, kontakt +374 99 099 099");
        info = "q. Erevan, Monte Melqonyan 12, kontakt +374 99 099 099";
        return info;
    }



}
