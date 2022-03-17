package upwork.nare.hw1;

public class Accountant extends Employee {

    public Accountant(String name, String surname, int id) {
        super(name, surname, id);
    }

    @Override
    public void doWork() {
        System.out.println("I work as an Accountant");

    }
}
