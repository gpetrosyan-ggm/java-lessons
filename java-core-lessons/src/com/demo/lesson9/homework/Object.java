package com.demo.lesson9.homework;

public class Object {
    String order = "araqman cucak";
    int timeDelivery = 35;
    String contactPhone = "099 15 15 15";


    public Object() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Object{");
        sb.append("tipe='").append(order).append('\'');
        sb.append(", when=").append(timeDelivery);
        sb.append(", contactInformation='").append(contactPhone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
