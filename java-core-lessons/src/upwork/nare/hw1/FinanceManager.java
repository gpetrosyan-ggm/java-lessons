package upwork.nare.hw1;

public class FinanceManager extends Accountant implements Manager {

    private Employee[] directReports;
    private int size;

    public FinanceManager(String name, String surname, int id) {
        super(name, surname, id);
        directReports = new Employee[10];
    }

    @Override
    public void doWork() {
        System.out.println("I work as a Finance Manager");
    }

    public void createCompanyBudget() {
        System.out.println("I create company budget!");
    }

    @Override
    public void evaluateEmployee() {

    }

    @Override
    public void reviewSalary() {

    }

    public int getDirectReportsSize() {
        return size;
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
