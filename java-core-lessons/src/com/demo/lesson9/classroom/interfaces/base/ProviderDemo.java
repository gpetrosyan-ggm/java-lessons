package com.demo.lesson9.classroom.interfaces.base;


import com.demo.lesson9.homework.*;
import com.demo.lesson9.homework.Object;

public class ProviderDemo {
    public static void main(String[] args) {
        Object object = new Object();
       Delivery viber = new ProviderViber();
       Delivery telegram = new ProviderTelegram();
       Delivery watsApp = new ProviderWatsApp();
       viber.Service(object);
       telegram.Service(object);
       watsApp.Service(object);


    }

}
