package com.iltech.studentSystem.service;

import com.iltech.studentSystem.entities.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
