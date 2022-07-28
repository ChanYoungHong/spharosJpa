package com.prac.jpaprac.spharosJpa.school.repo;

import com.prac.jpaprac.spharosJpa.school.domain.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAll();
}
