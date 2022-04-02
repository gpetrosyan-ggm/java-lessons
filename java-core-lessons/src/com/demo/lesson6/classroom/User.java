package com.demo.lesson6.classroom;

import java.time.LocalDateTime;

public class User {

    public static void main(String[] args) {
        User user = new User();
        user.weight = 100;
        user.firstName = "Harry";
        user.lastName = "Potter";
        user.salary = 500;

        String fullName = user.fullName(user.firstName, user.lastName);
        int yearlySalary = user.calculateYearSalary(user.salary);

        System.out.println(fullName);
        System.out.println(yearlySalary);
    }

    public String fullName(String fName, String lName) {
        return fName + ", " + lName;
    }

    public int calculateYearSalary(int salary) {
        return 12 * salary;
    }

    String firstName;

    String lastName;

    int weight;

    int salary;

    LocalDateTime birthDate;

    Car car;

}
