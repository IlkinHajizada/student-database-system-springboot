package com.iltech.studentSystem.controller;

import com.iltech.studentSystem.entities.Student;
import com.iltech.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student saveOneStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/getallstudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
