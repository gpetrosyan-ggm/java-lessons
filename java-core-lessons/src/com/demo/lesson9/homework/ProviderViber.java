package com.demo.lesson9.homework;

public class ProviderViber implements Delivery{
    @Override
    public int Service(Object object) {
        System.out.println(object);
        return 0;
    }

    @Override
    public String Information(String info) {
        System.out.println(info);
        return info;
    }
}
