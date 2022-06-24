package com.demo.lesson10.homework;

import java.util.Scanner;

public class ExceptionYearMonthDayDemo {
    public static void main(String[] args) {

        ValidationYearMonthDey validation = new Validation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the YEAR");
        int year = scanner.nextInt();

        while (year < 1970 || year > 2030) {

            validation.validationYear(year);
            System.out.println("enter the YEAR");
            year = scanner.nextInt();
        }

        System.out.println("enter the mount");
        int month = scanner.nextInt();
        while (month < 1 || month > 12) {
            validation.validationMount(year);
            System.out.println("enter the mount");
            month = scanner.nextInt();
        }


        System.out.println("enter the day");
        int dey = scanner.nextInt();


        while (dey < 0 || dey > 31) {
            validation.validationDey(dey);
            System.out.println("enter the day");
            dey = scanner.nextInt();
        }
        switch (month) {
            case 4, 6, 9, 11:
                while (dey == 31) {

                    System.out.println("there is no day in the month of" + month + " " + dey);
                    dey = scanner.nextInt();
                    validation.validationDey(dey);


                }

        }
        switch (month) {
            case 2:
                while (dey > 28) {
                    System.out.println("there is no day in the februar of" + dey);
                    dey = scanner.nextInt();
                    validation.validationDey(dey);
                }
        }
        System.out.println("duq @ntrel eq " + year + " tvakani " + month + " amsva " + dey + "-rd or@");
        scanner.close();
    }

}
