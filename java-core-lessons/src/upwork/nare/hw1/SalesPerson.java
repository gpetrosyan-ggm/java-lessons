package upwork.nare.hw1;

public class SalesPerson extends Employee {

    private String[] customerAccounts;

    public SalesPerson(String name, String surname, int id) {
        super(name, surname, id);
    }

    @Override
    public void doWork() {
        System.out.println("I work as a SalesPerson");

    }


    public void runProductDemo() {
        System.out.println("I run the product demo!");
    }


}
