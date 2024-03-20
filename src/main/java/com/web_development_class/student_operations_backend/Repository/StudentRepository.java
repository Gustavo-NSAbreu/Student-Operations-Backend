package com.web_development_class.student_operations_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_development_class.student_operations_backend.Domain.Entity.Student;
import com.web_development_class.student_operations_backend.Domain.Entity.StudentId;

public interface StudentRepository extends JpaRepository<Student, StudentId>{}
