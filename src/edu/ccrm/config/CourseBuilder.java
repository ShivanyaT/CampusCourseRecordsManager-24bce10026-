package edu.ccrm.config;

import edu.ccrm.domain.*;

public class CourseBuilder {
    private String code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Semester semester;
    private String department;

    public CourseBuilder setCode(String code) { this.code = code; return this; }
    public CourseBuilder setTitle(String title) { this.title = title; return this; }
    public CourseBuilder setCredits(int credits) { this.credits = credits; return this; }
    public CourseBuilder setInstructor(Instructor i) { this.instructor = i; return this; }
    public CourseBuilder setSemester(Semester s) { this.semester = s; return this; }
    public CourseBuilder setDepartment(String d) { this.department = d; return this; }

    public Course build() { return new Course(code, title, credits, instructor, semester, department); }
}

