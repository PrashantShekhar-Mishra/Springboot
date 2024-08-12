package com.myapp.crud.service;

import com.myapp.crud.entity.Student;
import com.myapp.crud.entity.StudentName;
import com.myapp.crud.exception.NotFoundException;
import com.myapp.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
    private StudentRepository studentRepository;
    
//    public StudentServiceImpl(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id)
        		.orElseThrow(() -> new NotFoundException(String.format("Student not found with id: %s",id)));
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }
    
    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }
    

    @Override
    public Student updateStudent(int id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id)
            .orElseThrow(() -> new NotFoundException("Student not found with id: " + id));
        
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setPercent(updatedStudent.getPercent());
        existingStudent.setBranch(updatedStudent.getBranch());
        
        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
