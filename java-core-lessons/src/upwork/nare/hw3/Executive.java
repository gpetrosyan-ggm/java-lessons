package upwork.nare.hw3;

public class Executive extends Employee implements Manager {

    private Employee[] team;
    private int size;

    public Executive(String name, String surname, int id) {
        super(name, surname, id);
        team = new Employee[10];
    }

    @Override
    public void doWork() {
        System.out.println("I work as an Executive");
    }

//    @Override
//    public Employee[] getTeam(Employee directReport) {
//        return new Employee[0];
//    }

    @Override
    public void evaluateEmployee() {

    }

    @Override
    public void reviewSalary() {

    }

    @Override
    public Employee[] getDirectReports() {
        return team;
    }

    public int getDirectReportsSize() {
        return size;
    }

    @Override
    public void addToDirectReports(Employee employee) {
        if(size == team.length) {
            Employee[] newArr = new Employee[team.length * 2];
            for(int i = 0; i < team.length; i++) {
                newArr[i] = team[i];
            }
            team = newArr;
        }
        team[size] = employee;
        size++;
    }


    public boolean confirmHiring(Employee employee) {
        return employee != null;
    }

    public boolean confirmFiring(Employee employee) {
        return employee != null;
    }

    public boolean confirmCompanyBudget() {
        return true;
    }

}
