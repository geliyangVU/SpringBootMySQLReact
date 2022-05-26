package com.GeliYang.studentsystem.service;

import com.GeliYang.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
