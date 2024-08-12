package com.myapp.crud.service;

import java.util.List;
import java.util.Optional;

import com.myapp.crud.entity.StudentResult;

public interface StudentResultService {
	
	List<StudentResult> getAllStudentResult();
	
	Optional<StudentResult> getStudentResultById(int id);
	
	void createStudentResult(StudentResult studentresult);
	
	void updateStudentResult(int id , StudentResult updateStudentResult);
	
	void deleteStudentResult(int id);
}
