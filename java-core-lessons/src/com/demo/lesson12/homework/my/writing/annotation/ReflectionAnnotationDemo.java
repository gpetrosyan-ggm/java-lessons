package com.demo.lesson12.homework.my.writing.annotation;

import java.lang.reflect.Field;

public class ReflectionAnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException {
        ReflectionAnnotation reflectionAnnotation = new ReflectionAnnotation();
        reflectionAnnotation.setName("Arni");
        reflectionAnnotation.setSrName("Martirosyan");
        annotationTest(reflectionAnnotation);
    }

    private static void annotationTest(ReflectionAnnotation reflectionAnnotation) throws IllegalAccessException {
        Class clazz = reflectionAnnotation.getClass();
        Field[] filds = clazz.getDeclaredFields();
        for (Field fild : filds) {
            fild.setAccessible(true);
            System.out.println(fild.getName() + " : " + fild.get(reflectionAnnotation));
            if (fild.isAnnotationPresent(MyWritingAnnotation.class)) {
                MyWritingAnnotation myWritingAnnotation = fild.getAnnotation(MyWritingAnnotation.class);
                System.out.println(
                        fild.getName() + " " + myWritingAnnotation.age() + " " + myWritingAnnotation.months());
            }
        }
    }
}
