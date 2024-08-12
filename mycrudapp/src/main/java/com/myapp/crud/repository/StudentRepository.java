package com.myapp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.myapp.crud.entity.Student;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
    @Query("SELECT s FROM Student s WHERE s.Name = :name")
    List<Student> findByName(@Param("name") String name);
}
