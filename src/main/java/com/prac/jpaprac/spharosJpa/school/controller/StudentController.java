package com.prac.jpaprac.spharosJpa.school.controller;

import com.prac.jpaprac.spharosJpa.school.domain.Student;
import com.prac.jpaprac.spharosJpa.school.service.StudentService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(
        StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public Optional<Student> getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }

}
