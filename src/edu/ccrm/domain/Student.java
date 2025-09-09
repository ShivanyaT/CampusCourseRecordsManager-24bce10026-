package edu.ccrm.domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String regNo;
    private boolean active;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String fullName, String email, String regNo) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.active = true;
    }

    @Override
    public void printProfile() {
        System.out.println("Student: " + regNo + " - " + getFullName());
    }

    public void enrollCourse(Course course) { enrolledCourses.add(course); }

    @Override
    public String toString() {
        return "Student{" + regNo + ", " + getFullName() + "}";
    }
}
