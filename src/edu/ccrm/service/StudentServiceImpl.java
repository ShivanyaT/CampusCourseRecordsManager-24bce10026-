package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final List<Student> students = new ArrayList<>();
    @Override public void addStudent(Student student) { students.add(student); }
    @Override public List<Student> listStudents() { return students; }
}

