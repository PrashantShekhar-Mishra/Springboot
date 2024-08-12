package com.myapp.crud.service;

import com.myapp.crud.entity.Student;
import com.myapp.crud.entity.StudentName;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(int id);
    
    List<Student> findByName(String name);

    void createStudent(Student student);

    Student updateStudent(int id, Student updatedStudent);

    void deleteStudent(int id);
}
