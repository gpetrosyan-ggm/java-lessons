package com.personal.upwork.nare.hw1;

public interface Manager {

    public void evaluateEmployee();

    public void reviewSalary();

    public Employee[] getDirectReports();

    public void addToDirectReports(Employee employee);

    public int getDirectReportsSize();

}
