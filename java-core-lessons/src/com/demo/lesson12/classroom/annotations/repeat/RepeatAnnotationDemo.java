package com.demo.lesson12.classroom.annotations.repeat;

import java.lang.reflect.Field;

public class RepeatAnnotationDemo {

    public static void main(String[] args) throws IllegalAccessException {
        RepeatAnnotationTest test = new RepeatAnnotationTest();

        annotationTest(test);
    }

    private static void annotationTest(RepeatAnnotationTest test) throws IllegalAccessException {
        Class<?> clazz = test.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " : " + field.get(test));
            if (field.isAnnotationPresent(RepeatedAnnotation.class)) {
                RepeatedAnnotation fa = field.getAnnotation(RepeatedAnnotation.class);
                for (RepeatableAnnotation ra : fa.value()) {
                    System.out.println(field.getName() + ": str -> " + ra.name() + "; i -> " + ra.age() + "; type -> " +
                                       ra.type());
                }
            }
        }
    }

}
