package com.example.di;

public class Student {
    private final String name;
    private Course course;

    public Student(String name) { this.name = name; }

    // setter injection
    public void setCourse(Course course) { this.course = course; }

    public void printInfo() {
        System.out.println("Student: " + name + ", Course: " + (course != null ? course.getName() : "none"));
    }
}
