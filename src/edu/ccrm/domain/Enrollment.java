package edu.ccrm.domain;

public class Enrollment {
    private Student student;
    private Course course;
    private Grade grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void assignGrade(Grade g) { this.grade = g; }
}
