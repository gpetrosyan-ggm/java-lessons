package com.demo.lesson12.book.example;

import java.lang.reflect.Method;

@MyAnno(str = "annotaciayi orinak", val = 100)
public class Meta {
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("metod@ gtnvac che");
        }
    }

    public static void main(String[] args) {

        myMeth();
    }
}
