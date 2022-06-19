package com.demo.lesson9.homework.tnayin;

import com.demo.lesson8.homework.notification.TelegramProvider;
import com.personal.upwork.nare.hw2.Person;

public class PersoneDemo {

    public static void main(String[] args) {
        Car bmw = new BMW();
        Car toyota = new Toyota();
        Car opel = new Opel();
        Home house = new House();
        Home flat = new Flat();
        Home countryHouse = new CountryHouse();
        Work programmer = new Programmer();
        Work taxiDriver = new TaxiDriver();
        Work worker = new Worker();

        Persone persone1 = new Persone(house, bmw, programmer);
        Persone persone2 = new Persone(flat, toyota, taxiDriver);
        Persone persone3 = new Persone(countryHouse, opel, worker);

        persone1.personInfo();
        persone2.personInfo();
        persone3.personInfo();

    }


}
