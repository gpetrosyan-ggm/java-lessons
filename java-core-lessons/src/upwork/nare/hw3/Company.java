package upwork.nare.hw3;

import upwork.nare.hw2.LinkedList;

public class Company {

    private LinkedList<Employee> employees;
    private Executive executive;
    private int size;
    private ArrayDeque<Employee> top10performers;

    public Company() {
        employees = new LinkedList<>();
        top10performers = new ArrayDeque<>(10);
    }

    public void setExecutive(Executive executive) {
        this.executive = executive;
    }

    public void addTopPerformer(Employee employee) {
        if(top10performers.size() == 10) {
            top10performers.popFront();
        }
        top10performers.pushBack(employee);
    }


    public void addTopPerformerEnhanced(Employee employee) {
        if(top10performers.size() < 10) {
            top10performers.pushBack(employee);
            return;
        } else {
            Employee lowest = top10performers.front();
            int minIndex = 0;
            for (int i = 1; i < top10performers.size(); i++) {
                if (top10performers.elementAt(i).getPerformanceScore() < lowest.getPerformanceScore()) {
                    lowest = top10performers.elementAt(i);
                    minIndex = i;
                }
            }
            if (minIndex != 0) {
                top10performers.swap(lowest, top10performers.front());
            }
            top10performers.popFront();
            top10performers.pushBack(employee);
        }
    }


    public boolean hireEmployee(Employee employee, Manager manager) {
        boolean result = executive.confirmHiring(employee);
        employees.addLast(employee);
        manager.addToDirectReports(employee);
        return result;
    }


    public Employee[] getTeam(Manager manager) {
        Employee[] employees = new Employee[this.employees.size()];
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

    }


}
