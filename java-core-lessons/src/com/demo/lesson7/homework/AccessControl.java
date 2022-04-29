package com.demo.lesson7.homework;

public class AccessControl {
    public String name;
    protected String surname;
    String patronymic;
    private long income;
    public static int yearOfBirth;
    public static final String NATIONALITI;

    static {
        yearOfBirth = 1987;
        CV5();
        CV4();
        NATIONALITI = "ARMENIA";
    }

    public void CV() {
        System.out.println(name + " " + surname + " " + patronymic + " " + income + " " + NATIONALITI);
    }

    protected void CV1() {
        System.out.println(name + " " + surname + " " + patronymic + " " + income);
    }

    void CV2() {
        System.out.println(name + " " + surname + " " + patronymic + " " + income);
    }

    private void CV3() {
        System.out.println(name + " " + surname + " " + patronymic + " " + income);
    }

    private static void CV4() {
        System.out.println(yearOfBirth);
    }

    public static void CV5() {
        System.out.println(yearOfBirth);
    }

    @Override
    public String toString() {
        return "AccessControl{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", patronymic='" + patronymic + '\'' +
               ", income=" + income +
               '}';
    }
}
