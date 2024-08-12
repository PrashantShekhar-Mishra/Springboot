package com.myapp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.crud.entity.StudentResult;

public interface StudentResultRepository extends JpaRepository<StudentResult,Integer> {

}