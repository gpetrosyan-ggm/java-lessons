package com.demo.lesson7.classroom;

// public
// private
// protected
//  (default)

public class Phone {
    public static String country;

    public String mark;
    protected String name;
    private double originalAmount;
    double price;

    static {
        country = "China";
        printAAA();
    }

    void infoDefault() {
        System.out.println("Default info");
    }

    protected void infoProtected() {
        System.out.println("Default info");
    }

    public void info() {
        System.out.println("Super puper phone");
    }

    private void devInfo() {
        System.out.println("For developers");
    }

    public static void printAAA() {
        System.out.println("AAA");
    }

    @Override
    public String toString() {
        return "Phone{" +
               "mark='" + mark + '\'' +
               ", name='" + name + '\'' +
               ", originalAmount=" + originalAmount +
               ", price=" + price +
               ", country=" + country +
               '}';
    }
}
