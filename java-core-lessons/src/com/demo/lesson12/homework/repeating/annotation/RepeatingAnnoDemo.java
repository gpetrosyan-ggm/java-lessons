package com.demo.lesson12.homework.repeating.annotation;

import com.demo.lesson12.classroom.annotations.repeat.RepeatAnnotationTest;
import com.demo.lesson12.classroom.annotations.repeat.RepeatableAnnotation;
import com.demo.lesson12.classroom.annotations.repeat.RepeatedAnnotation;

import java.lang.reflect.Field;

public class RepeatingAnnoDemo {
    public static void main(String[] args) throws IllegalAccessException {
        RepeatingAnno  test = new RepeatingAnno ();

        annotationTest (test);
    }

    private static void annotationTest(RepeatingAnno  test) throws IllegalAccessException {
        Class<?> clazz = test.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " : " + field.get(test));
            if (field.isAnnotationPresent(RepeatAnno.class)) {
                RepeatAnno fa = field.getAnnotation(RepeatAnno.class);
                for (RepeatableAnno ra : fa.value()) {
                    System.out.println(field.getName() + ": str -> " + ra.name() + "; i -> " + ra.age());
                }
            }
        }
    }
}
