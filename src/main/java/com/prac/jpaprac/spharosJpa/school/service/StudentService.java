package com.prac.jpaprac.spharosJpa.school.service;

import com.prac.jpaprac.spharosJpa.school.domain.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getStudents();
    Optional<Student> getStudent(Long id);
    Student createStudent(Student student);
    String deleteStudent(Long id);
}
