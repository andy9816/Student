package com.example.student.controller;

import com.example.student.Service.StudentService;
import com.example.student.Service.StudentServiceImpl;
import com.example.student.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentServiceImpl studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping(value = "{studentId}")
    public void deleteStudentById(@RequestBody Long studentId){
        studentService.deletStudentById(studentId);
    }
}
