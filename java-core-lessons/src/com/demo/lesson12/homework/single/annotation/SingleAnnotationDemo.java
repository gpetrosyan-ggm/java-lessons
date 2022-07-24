package com.demo.lesson12.homework.single.annotation;

import com.demo.lesson12.classroom.annotations.general.FirstAnnotation;

import java.lang.reflect.Field;

public class SingleAnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException {
        SingleAnnotationTest test = new  SingleAnnotationTest();
        test.setName("Arnold");
        test.setSrName("Martirosyan");
        SingleAnnotation(test);
    }

    private static void SingleAnnotation(SingleAnnotationTest test) throws IllegalAccessException {
        Class<?> clazz = test.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " : " + field.get(test));
            if (field.isAnnotationPresent(SingleAnnotation.class)) {
                SingleAnnotation fa = field.getAnnotation(SingleAnnotation.class);
                System.out.println(field.getName() + " : " + fa.value());
            }
        }
    }
}
