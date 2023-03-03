package com.example.student.Service;

import com.example.student.model.Student;

import java.util.List;

public interface StudentService {


    public List<Student> getAllStudents();

    void addStudent(Student student);

    void deletStudentById(Long id);
}
