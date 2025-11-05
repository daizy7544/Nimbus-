package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = ctx.getBean(Student.class);
        student.printInfo();
        ctx.close();
    }
}
