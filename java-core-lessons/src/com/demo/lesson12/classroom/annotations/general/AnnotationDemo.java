package com.demo.lesson12.classroom.annotations.general;

import java.lang.reflect.Field;

public class AnnotationDemo {

    public static void main(String[] args) throws IllegalAccessException {
        FirstAnnotationTest test = new FirstAnnotationTest();
        test.setName("Jon");
        test.setSrName("Travolta");

        annotationTest(test);
    }

    private static void annotationTest(FirstAnnotationTest test) throws IllegalAccessException {
        Class<?> clazz = test.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " : " + field.get(test));
            if (field.isAnnotationPresent(FirstAnnotation.class)) {
                FirstAnnotation fa = field.getAnnotation(FirstAnnotation.class);
                System.out.println(field.getName() + ": str -> " + fa.str() + "; i -> " + fa.i());
            }
        }
    }

}
