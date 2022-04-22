package com.demo.lesson7.classroom;

public class PhoneDemo2 {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.name = "S21";
        phone1.mark = "Samsung";
        phone1.price = 1200;
        phone1.info();
        System.out.println(phone1);

        Phone phone2 = new Phone();
        phone2.name = "M22";
        System.out.println(phone2);
    }

}
