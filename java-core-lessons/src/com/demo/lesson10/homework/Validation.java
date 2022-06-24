package com.demo.lesson10.homework;

import java.util.logging.ConsoleHandler;

public class Validation implements ValidationYearMonthDey {
    @Override
    public void validationYear(int year) {

        try {
            if (year <1970 || year>2030) {
                throw new Exception("choose from the range 1970 - 2030");
            }
        } catch (ValidationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    @Override
    public void validationMount(int month) {
        try {
            if (month > 12) {
                throw new Exception("chi hamapatasxanum, krkin porcir");
            }
        } catch (ValidationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void validationDey(int dey) {
        try {
            if (dey > 31) {
                throw new Exception("chi hamapatasxanum, krkin porcir");
            }
        } catch (ValidationException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
