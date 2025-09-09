package edu.ccrm.service;

import edu.ccrm.domain.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    private final List<Course> courses = new ArrayList<>();
    @Override public void addCourse(Course course) { courses.add(course); }
    @Override public List<Course> listCourses() { return courses; }
}

