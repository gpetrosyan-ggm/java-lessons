package com.personal.upwork.nare.hw1;

public class SWManager extends SWEngineer implements Manager {

    private Employee[] directReports;
    private int size;

    public SWManager(String name, String surname, int id) {
        super(name, surname, id);
        directReports = new Employee[10];
    }

    public int getDirectReportsSize() {
        return size;
    }

    @Override
    public void doWork() {
        System.out.println("I work as a SWManager");
    }

    public void mentorEmployee() {
        System.out.println("I am a mentor!");
    }

    public void distributeTasks() {
        System.out.println("I distribute tasks!");
    }


    @Override
    public void evaluateEmployee() {

    }

    @Override
    public void reviewSalary() {

    }

    @Override
    public Employee[] getDirectReports() {
        return directReports;
    }

    @Override
    public void addToDirectReports(Employee employee) {
        if(size == directReports.length) {
            Employee[] newArr = new Employee[directReports.length * 2];
            for(int i = 0; i < directReports.length; i++) {
                newArr[i] = directReports[i];
            }
            directReports = newArr;
        }
        directReports[size] = employee;
        size++;
    }
}
