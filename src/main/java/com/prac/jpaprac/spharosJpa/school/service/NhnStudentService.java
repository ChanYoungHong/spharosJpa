package com.prac.jpaprac.spharosJpa.school.service;

import com.prac.jpaprac.spharosJpa.school.domain.Student;
import com.prac.jpaprac.spharosJpa.school.repo.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhnStudentService implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public NhnStudentService(
        StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Long id) {
//        return studentRepository.deleteById(id);

        return null;
    }
}
