package com.manish.smartstudent.repository;

import com.manish.smartstudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}