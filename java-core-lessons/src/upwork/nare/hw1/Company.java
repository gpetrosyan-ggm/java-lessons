package upwork.nare.hw1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Company {

    private Employee[] employees;
    private Executive executive;
    private int size;

    public Company() {
        employees = new Employee[10];
    }

    public void setExecutive(Executive executive) {
        this.executive = executive;
    }

    private void addEmployee(Employee employee) {
        if(size == employees.length) {
            Employee[] newArr = new Employee[employees.length * 2];
            for(int i = 0; i < employees.length; i++) {
                newArr[i] = employees[i];
            }
            employees = newArr;
        }
        employees[size] = employee;
        size++;
    }

    public boolean hireEmployee(Employee employee, Manager manager) {
        boolean result = executive.confirmHiring(employee);
        addEmployee(employee);
        manager.addToDirectReports(employee);
        return result;
    }


    public Employee[] getTeam(Manager manager) {
        Employee[] employees = new Employee[this.employees.length];
        int lastIndex = 0;
        if(manager.getDirectReportsSize() == 0) {
            return new Employee[]{(Employee) manager};
        }
        Employee[] current = manager.getDirectReports();
        for(int i = 0; i < current.length; i++) {
            if(current[i] != null) {
                employees[lastIndex++] = current[i];
                if (current[i] instanceof Manager) {
                    Manager subManager = (Manager) current[i];
                    Employee[] subEmployees = getTeam(subManager);
                    for (int j = 0; j < subEmployees.length; j++) {
                        if (subEmployees[j] != null) {
                            employees[lastIndex++] = subEmployees[j];
                        }
                    }
                }
            }
        }
        return employees;
    }



    public static void main(String[] args) {

        Executive executive = new Executive("John", "Green", 0);
        FinanceManager financeManager = new FinanceManager("Anna", "Brown", 1);
        SWManager swManager0 = new SWManager("Eric", "Andrews", 2);
        SWManager swManager1 = new SWManager("Emma", "Stone", 3);
        SWEngineer swEngineer0 = new SWEngineer("Carl", "Houston" ,4);
        SWEngineer swEngineer1 = new SWEngineer("Emily", "Watson", 5);
        SWEngineer swEngineer2 = new SWEngineer("Daniel", "Alexander", 6);
        SWEngineer swEngineer3 = new SWEngineer("Neil", "Cole", 7);
        SWEngineer swEngineer4 = new SWEngineer("Liam", "Johnson", 8);
        SWEngineer swEngineer5 = new SWEngineer("Mary", "Robertson", 9);
        Accountant accountant0 = new Accountant("Cole", "Cruise", 10);
        Accountant accountant1 = new Accountant("David", "Collen", 11);
        Company company = new Company();

        company.setExecutive(executive);
        company.hireEmployee(financeManager, executive);
        company.hireEmployee(swManager0, executive);
        company.hireEmployee(swManager1, executive);
        company.hireEmployee(swEngineer0, swManager0);
        company.hireEmployee(swEngineer1, swManager0);
        company.hireEmployee(swEngineer2, swManager0);
        company.hireEmployee(swEngineer3, swManager1);
        company.hireEmployee(swEngineer4, swManager1);
        company.hireEmployee(swEngineer5, swManager1);
        company.hireEmployee(accountant0, financeManager);
        company.hireEmployee(accountant1, financeManager);

        Employee[] employeesTree = company.getTeam(executive);

        JsonParser jsonParser = new JsonParser("C:\\Users\\lharutyunyan\\Desktop\\Data Structures Spring 2022\\DS_Project\\src\\HW_1\\EmployeeJson.json");
        ArrayList<Employee> employees = jsonParser.getEmployees();

        for(Employee employee: employees) {
            System.out.println(employee.toString());
        }

    }


}
