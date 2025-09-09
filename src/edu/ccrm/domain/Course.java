package edu.ccrm.domain;

public class Course {
    private String code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Semester semester;
    private String department;

    public Course(String code, String title, int credits, Instructor instructor, Semester semester, String department) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
        this.department = department;
    }

    @Override
    public String toString() {
        return code + " - " + title + " (" + credits + " credits)";
    }
}


