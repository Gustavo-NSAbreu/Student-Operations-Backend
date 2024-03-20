package com.web_development_class.student_operations_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_development_class.student_operations_backend.Domain.Entity.Student;
import com.web_development_class.student_operations_backend.Domain.Entity.StudentId;
import com.web_development_class.student_operations_backend.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> findAll() {
        List<Student> students = repository.findAll();
        return students;
    }

    public Student create(Student student) {
        return repository.save(student);
    }

    public Student update(Student updatedStudent, StudentId studentId) {
        Student student = repository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("Student not found"));
        student.update(updatedStudent);
        return repository.save(student);
    }

    public void delete(StudentId studentId) {
        repository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("Student not found"));
        repository.deleteById(studentId);
    }

}
