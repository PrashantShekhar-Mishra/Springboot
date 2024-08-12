package com.myapp.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.crud.entity.StudentResult;
import com.myapp.crud.repository.StudentResultRepository;

@Service
public class StudentResultServiceImpl implements StudentResultService {
	@Autowired
	private StudentResultRepository studentResultRepository;

	@Override
	public List<StudentResult> getAllStudentResult() {
		return studentResultRepository.findAll();
	}

	@Override
	public Optional<StudentResult> getStudentResultById(int id) {
		// TODO Auto-generated method stub
		return studentResultRepository.findById(id);
	}

	@Override
	public void createStudentResult(StudentResult studentResult) {
		// TODO Auto-generated method stub
		studentResultRepository.save(studentResult);
		
	}

	@Override
	public void updateStudentResult(int id, StudentResult updateStudentResult) {
		// TODO Auto-generated method stub
		Optional<StudentResult> studentResult = studentResultRepository.findById(id);
		if (studentResult.isPresent()) {
			StudentResult existingStudentResult = studentResult.get();
			existingStudentResult.setMarks(updateStudentResult.getMarks());
			existingStudentResult.setExam(updateStudentResult.getExam());
			studentResultRepository.save(existingStudentResult);
		}
		
	}

	@Override
	public void deleteStudentResult(int id) {
		// TODO Auto-generated method stub
		studentResultRepository.deleteById(id);
		
	}

}
