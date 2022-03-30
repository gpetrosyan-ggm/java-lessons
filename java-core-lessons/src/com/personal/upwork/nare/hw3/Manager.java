package com.personal.upwork.nare.hw3;

public interface Manager {

    public void evaluateEmployee();

    public void reviewSalary();

    public Employee[] getDirectReports();

    public void addToDirectReports(Employee employee);

    public int getDirectReportsSize();

}
