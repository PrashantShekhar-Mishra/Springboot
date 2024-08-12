package com.myapp.crud.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.crud.entity.StudentResult;
import com.myapp.crud.service.StudentResultService;

@RestController
public class StudentResultController {
	
	@Autowired
	private StudentResultService studentResultService;
	
	@GetMapping("/studentResult")
	public List<StudentResult> getAllStudentResult(){
		return studentResultService.getAllStudentResult();
	}
	
	@GetMapping("StudentResult/{id}")
	public Optional<StudentResult>getStudentResultById(@PathVariable int id){
		return studentResultService.getStudentResultById(id);
	}
	@PostMapping("/StudentResult")
	@ResponseStatus( code = HttpStatus.CREATED )
	public void createStudentResult(@RequestBody StudentResult studentResult){
		
		studentResultService.createStudentResult(studentResult);
	}
	
	@PutMapping("StudentResult/{id}")
	public void updateStudentResult(@PathVariable int id , @RequestBody StudentResult studentResult) {
		studentResultService.updateStudentResult(id, studentResult);
	}
	
	@DeleteMapping("/StudentResult/{id}")
	public void deleteStudentResult(@PathVariable int id){
		studentResultService.deleteStudentResult(id);
	}
	

	

}
