package com.personal.upwork.nare.hw1;

public class SWEngineer extends Employee {

    private String title;

    public SWEngineer(String name, String surname, int id) {
        super(name, surname, id);
    }

    @Override
    public void doWork() {
        System.out.println("I work as a SWEngineer");
    }

    public void doCoding() {
        System.out.println("I am coding!");
    }

}
