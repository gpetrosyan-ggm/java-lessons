package com.demo.lesson7.homework;
//Javan tuyl e talis class-um stexcel mievnuyn anvamb mekic aveli metodner, vorn el kochvum em metodi Overloding, sakayn
//tvyal metodneri parametrner@ petq e tarberven iraric, kam metodner@ petq e unenan tarber qanakutyamb parapetrer, kam el
//mievnum qanakutyamb paramerneri depqum dran DataType petq e linen tarber

public class Home {


    void citizen(String city) {
        System.out.println("citin - " + city);
    }

    void citizen(String city, String street) {
        System.out.println("city - " + city + ", street - " + street);
    }

    void citizen(String street, int house, int flat) {
        System.out.println("street - " + street + ", hous - " + house + ", flat - " + flat);
    }
//Overloading constructors - ashxatum e metodi Overloading skzbunqov, ayn nuynpes karox e mievnuyn class-um parunakvel
//mekic avelin, sakayn tarber qanakutyamb parametrer unenan kam el parametrneri ham@nkman depqum, Data Type-@ linen
//tarber

    String city;
    String street;
    int house;
    int flat;

    public Home(){

    }
    public Home(String city, String stret) {
        this.city = city;
        this.street = stret;
    }

    public Home(String street, int house, int flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Home(int flat, int house, String street) {
        this.flat = flat;
        this.house = house;
        this.street = street;
    }
}
